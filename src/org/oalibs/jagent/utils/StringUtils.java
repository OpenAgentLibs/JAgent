package org.oalibs.jagent.utils;

/**
 * User: Matt Balmer
 * Date: 8/8/13
 * Time: 11:42 PM
 */
public class StringUtils {

    /**
     * Checks to see if a String is composed entirely of a specific character
     * @param haystack
     * @param allowed
     * @return
     */
    public static boolean containsOnly(String haystack, String allowed) {
        boolean pass = true;
        for(int i = 0; i < haystack.length(); i++)
            if( !allowed.contains( ""+haystack.charAt(i) ) )
                pass = false;
        return pass;
    }
}
