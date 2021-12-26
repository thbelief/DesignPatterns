package prototypePattern;

import java.util.*;

/**
 * @author thbelief
 * @date 2021/12/26 11:49 AM
 * @info 随机选项
 */
public class QuestionRandomUtil {
    static public Question random(Map<String, String> option, String key) {
        Set<String> keySet = option.keySet();
        ArrayList<String> keyList = new ArrayList<String>(keySet);
        Collections.shuffle(keyList);
        HashMap<String, String> optionNew = new HashMap<String, String>();
        int idx = 0;
        String keyNew = "";
        for (String next : keySet) {
            String randomKey = keyList.get(idx++);
            if (key.equals(next)) {
                keyNew = randomKey;
            }
            optionNew.put(randomKey, option.get(next));
        }
        return new Question(optionNew, keyNew);
    }
}
