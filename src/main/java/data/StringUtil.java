package data;

/**
 * Created by Sunny on 17/8/25.
 */
public class StringUtil {
    /**
     * 统计 source 中 每个字符出现的次数
     * 这个方法 来源于 leetcode 657 题中要求 两组对应的字母出现的次数一致
     * 这里是用字符的ascII 数值 直接做了数组的角标
     * @return
     */
    public static int[] statisticsCharNum(String source, Character maxASIIChar) throws IllegalArgumentException{
        if (null == source) {
            throw new IllegalArgumentException("source is null");
        }
        if (maxASIIChar == null) {
            maxASIIChar = 128;//TODO 128我看是最大的了 是吧?
        }
        final int[] result = new int[maxASIIChar];

        for (char c : source.toCharArray()) {
            result[c]++;
        }
        return result;
    }
}
