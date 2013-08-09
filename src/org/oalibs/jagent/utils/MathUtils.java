package org.oalibs.jagent.utils;

/**
 * User: Matt Balmer
 * Date: 8/9/13
 * Time: 12:21 AM
 */
public class MathUtils {

    /**
     * Checks the passed value against upper and lower limits. If lower, sets equal to lower limit. If higher, sets equal to upper limit.
     * @param val value to be checked
     * @param bot lower limit
     * @param top upper limit
     * @return limited value
     */
    public static int limit(int val, int bot, int top) {
        return val < bot ? bot : val > top ? top : val;
    }
}