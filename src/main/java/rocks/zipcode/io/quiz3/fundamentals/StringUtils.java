package rocks.zipcode.io.quiz3.fundamentals;

import java.util.ArrayList;
import java.util.List;

/**
 * @author leon on 09/12/2018.
 */
public class StringUtils {
    public static String capitalizeNthCharacter(String str, Integer indexToCapitalize) {
        return null;
    }

    public static Boolean isCharacterAtIndex(String baseString, Character characterToCheckFor, Integer indexOfString) {
        return null;
    }

    public static String[] getAllSubStrings(String string) {
//        String[] subStr = new String[0];
//
//        for (int i = 0; i < string.length(); i++) {
//            for (int i1 = i; i1 < string.length(); i1++) {
//                subStr[i] = string + string.charAt(i1);
//            }
//        }
//        return subStr;
        return null;

    }

    public static Integer getNumberOfSubStrings(String input) {
        int n = input.length();
        return (n * (n + 1) / 2) - 1;

    }
}
