package data;

/**
 * Created by Sunny on 17/8/24.
 */
public class BinaryUtil {


    /**
     *  其他方法介绍 http://www.cnblogs.com/graphics/archive/2010/06/21/1752421.html
     *  计算 int value 二进制中1的个数
     * @param source
     * @return
     */
    //TODO 参数兼容
    public static int count1(int source){
        int c =0 ; // 计数器
        for (c =0; source > 0; source >>=1) // 循环移位
            c += source &1 ; // 如果当前位是1，则计数器加1
        return c ;
    }
}
