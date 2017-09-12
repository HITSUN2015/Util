package leetcode;

import java.util.AbstractList;
import java.util.List;

/**
 * Created by Sunny on 17/9/11.
 */
public class FizzBuzz {

    /**
     *
     * 最快的解放;最另类的解法
     *
     import java.util.*;
     */
    private class solussion{
        class Solution {

            private int size = 0;

            private final List<String> fizzbuzzList = new AbstractList<String>() {
                @Override
                public String get(int index) {
                    final int i = index + 1;
                    return i % 15 == 0 ? "FizzBuzz"
                            : i % 5 == 0 ? "Buzz"
                            : i % 3 == 0 ? "Fizz"
                            : String.valueOf(i);
                }

                @Override
                public int size() {
                    return Solution.this.size;
                }
            };

            public List<String> fizzBuzz(int n){
                this.size = n;
                return fizzbuzzList;
            }
    }
}


