package prototypePattern.question;

import java.util.List;
import java.util.Map;

/**
 * @author thbelief
 * @date 2021/12/26 11:36 AM
 * @info
 */
public class ChoiceQuestion {
    private String mDesc;
    private Map<String, String> mChoices;
    private String mRightAnswers;

    public String getDesc() {
        return mDesc;
    }

    public void setDesc(String mDesc) {
        this.mDesc = mDesc;
    }

    public Map<String, String> getChoices() {
        return mChoices;
    }

    public void setChoices(Map<String, String> mChoices) {
        this.mChoices = mChoices;
    }

    public String getRightAnswers() {
        return mRightAnswers;
    }

    public void setRightAnswers(String mRightAnswers) {
        this.mRightAnswers = mRightAnswers;
    }

    public ChoiceQuestion() {
    }

    public ChoiceQuestion(String desc, Map<String, String> choices, String rightAnswers) {
        this.mDesc = desc;
        this.mChoices = choices;
        this.mRightAnswers = rightAnswers;
    }
}
