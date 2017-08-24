package distance;

import exception.DistanceException;

/**
 * Created by Sunny on 17/8/24.
 *
 * 起源:        https://leetcode.com/problems/hamming-distance/description/
 * 相关概念:    汉明距离(hamming-distance)
 * 一般化:      矢量距离
 */
public interface Vectorizable {
    Object distance(Vectorizable vectorizable) throws DistanceException;

    Object getValue();
}
