package codelearning;

/**
 * Created by Sunny on 17/8/25.
 */
public class JavaString {
    /**
     * 这个例子来源于 LeetCode 657
     *
     * 我当时的代码是: for(int i = 0; i < str.length() ; i ++)
     *      但是 显示比波(大多数的效率)峰慢
     *
     * learning point:
     *  1.str.toCharArray
     */
    public static void loopString(){
        String source = "test";
        for (char c : source.toCharArray()) {
            System.out.println(c);
        }
    }
}
