package rocks.zipcode.io.quiz3.fundamentals;

/**
 * @author leon on 09/12/2018.
 */
public class PigLatinGenerator {
    public String translate(String str) {
        char a = 'a', e = 'e' , o = 'o',u = 'u';

        int start = 0;
        int firstVowel = 0;
        for (int i = 0; i < str.length(); i++) {
            char c = Character.toLowerCase(str.charAt(i));
            if (c == a || c == e || c == i || c == o || c == u) {
                firstVowel = i;
                break;
            }
        }
        if (start != firstVowel) {
            String startString = str.substring(firstVowel);
            String endString = str.substring(start, firstVowel) + "ay";
            return startString + endString;
        }
        return str;
    }
}


