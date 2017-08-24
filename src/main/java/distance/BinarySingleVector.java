package distance;

import data.Binary;
import exception.DistanceException;

/**
 * Created by Sunny on 17/8/24.
 * <p>
 * 这个类 用来解决 https://leetcode.com/problems/hamming-distance/description/ 问题
 */
public class BinarySingleVector extends AbstractSingleVector<Integer> {

    public BinarySingleVector(Integer value) {
        this.valueHolder = value;
    }

    @Override
    public Integer distance(Vectorizable vectorizable) throws DistanceException {
        Integer result = null;
        if (vectorizable instanceof BinarySingleVector) {
            if (null == this.valueHolder || null == vectorizable.getValue()) {
                throw new DistanceException("the 2 objects to compute distance are one null at least");
            } else {
                //the right code to compute the hamming-distance with binary code
                //here found that two Integer ^ equal to Integer parseTo BinaryCode and ^
                //beside we don't need to worry about the leck of high position code for some value:default zero
                //TODO
                Integer compareValue = ((BinarySingleVector) vectorizable).getValue();
                int temp = valueHolder ^ compareValue;
                //than the aim si to how many 1 in temp's binary code
                result = Binary.count1(temp);
            }
        } else {
            throw new DistanceException(String.format("can not compute BinarySingleVector and s% type's distance", vectorizable.getClass().getTypeName()));
        }
        return result;
    }

    /**
     * 这里 返回值 允许不一致 恰好可以 让 valueHolder变得优雅
     *
     * @return
     */
    @Override
    public Integer getValue() {
        return valueHolder;
    }
}
