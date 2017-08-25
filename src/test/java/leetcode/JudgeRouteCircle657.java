package leetcode;

import org.junit.Test;

/**
 * Created by Sunny on 17/8/25.
 * leetcode 657
 * 这个code 还有一个哥们看出了一点 ,不需要二维 为了判断是否回到原点 只需要记录在一个值里即可
 */
public class JudgeRouteCircle657 {

    @Test
    public void test(){
        boolean result = judgeCircle("UD");
        System.out.println(result);
    }

    public boolean judgeCircle(String moves) {
        boolean result = false;
        if(null != moves && !moves.isEmpty()){
            //最low的实现方式
            int x = 0;
            int y = 0;
            for(int i = 0; i< moves.length();i++){
                if(moves.charAt(i) == 'R'){
                    x++;
                } else if (moves.charAt(i) == 'L'){
                    x--;
                } else if (moves.charAt(i) == 'U'){
                    y++;
                } else if (moves.charAt(i) == 'D'){
                    y--;
                } else {
                    break;
                }
            }
            if(x==0 && y == 0){
                result = true;
            }
        }
        return result;
    }
}
