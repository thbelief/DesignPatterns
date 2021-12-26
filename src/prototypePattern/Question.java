package prototypePattern;

import java.util.Map;

/**
 * @author thbelief
 * @date 2021/12/26 11:44 AM
 * @info
 */
public class Question {
    Map<String, String> mOptions;
    String mAnswer;

    public Question() {
    }

    public Question(Map<String, String> options, String answer) {
        this.mAnswer = answer;
        this.mOptions = options;
    }

    public Map<String, String> getOptions() {
        return mOptions;
    }

    public void setOptions(Map<String, String> mOptions) {
        this.mOptions = mOptions;
    }

    public String getAnswer() {
        return mAnswer;
    }

    public void setAnswer(String mAnswer) {
        this.mAnswer = mAnswer;
    }
}
