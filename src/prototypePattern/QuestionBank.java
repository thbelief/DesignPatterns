package prototypePattern;

import prototypePattern.question.AnswerQuestion;
import prototypePattern.question.ChoiceQuestion;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;

/**
 * @author thbelief
 * @date 2021/12/26 11:53 AM
 * @info
 */
public class QuestionBank implements Cloneable{
    private String mUserName;
    private String mNumber;
    private ArrayList<ChoiceQuestion> mChoices;
    private ArrayList<AnswerQuestion> mAnswers;

    public QuestionBank() {
        mChoices = new ArrayList<>();
        mAnswers = new ArrayList<>();
    }

    public QuestionBank appendChoices(ChoiceQuestion choiceQuestion) {
        mChoices.add(choiceQuestion);
        return this;
    }

    public QuestionBank appendAnswers(AnswerQuestion answerQuestion) {
        mAnswers.add(answerQuestion);
        return this;
    }

    public String getUserName() {
        return mUserName;
    }

    public void setUserName(String mUserName) {
        this.mUserName = mUserName;
    }

    public String getNumber() {
        return mNumber;
    }

    public void setNumber(String mNumber) {
        this.mNumber = mNumber;
    }

    @Override
    public Object clone() throws CloneNotSupportedException {
        QuestionBank questionBank = (QuestionBank) super.clone();
        questionBank.mChoices = (ArrayList<ChoiceQuestion>) mChoices.clone();
        questionBank.mAnswers = (ArrayList<AnswerQuestion>) mAnswers.clone();

        // 题目乱序
        Collections.shuffle(questionBank.mChoices);
        Collections.shuffle(questionBank.mAnswers);
        // 答案乱序
        List<ChoiceQuestion> choiceQuestionList = questionBank.mChoices;
        for (ChoiceQuestion question : choiceQuestionList) {
            Question random = QuestionRandomUtil.random(question.getChoices(), question.getRightAnswers());
            question.setChoices(random.getOptions());
            question.setRightAnswers(random.getAnswer());
        }
        return questionBank;
    }

    @Override
    public String toString() {

        StringBuilder detail = new StringBuilder("考生：" + mUserName + "\r\n" + "考号：" + mNumber + "\r\n" + "--------------------------------------------\r\n" + "一、选择题" + "\r\n\n");

        for (int idx = 0; idx < mChoices.size(); idx++) {
            detail.append("第").append(idx + 1).append("题：").append(mChoices.get(idx).getDesc()).append("\r\n");
            Map<String, String> option = mChoices.get(idx).getChoices();
            for (String key : option.keySet()) {
                detail.append(key).append("：").append(option.get(key)).append("\r\n");
                ;
            }
            detail.append("答案：").append(mChoices.get(idx).getRightAnswers()).append("\r\n\n");
        }

        detail.append("二、问答题" + "\r\n");

        for (int idx = 0; idx < mAnswers.size(); idx++) {
            detail.append("第").append(idx + 1).append("题：").append(mAnswers.get(idx).getDesc()).append("\r\n");
            detail.append("答案：").append(mAnswers.get(idx).getAnswer()).append("\r\n\n");
        }

        return detail.toString();
    }

}
