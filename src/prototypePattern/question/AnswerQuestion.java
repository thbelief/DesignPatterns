package prototypePattern.question;

/**
 * @author thbelief
 * @date 2021/12/26 11:41 AM
 * @info
 */
public class AnswerQuestion {
    private String mDesc;
    private String mAnswer;

    public AnswerQuestion() {

    }

    public AnswerQuestion(String desc, String answer) {
        this.mAnswer = answer;
        this.mDesc = desc;
    }

    public String getDesc() {
        return mDesc;
    }

    public void setDesc(String mDesc) {
        this.mDesc = mDesc;
    }

    public String getAnswer() {
        return mAnswer;
    }

    public void setAnswer(String mAnswer) {
        this.mAnswer = mAnswer;
    }
}
