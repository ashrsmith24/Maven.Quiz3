package rocks.zipcode.io.quiz3.fundamentals;

/**
 * @author leon on 09/12/2018.
 */
public class VowelUtils {
    public static Boolean hasVowels(String word) {
       // get char array
        char[] characters = word.toCharArray();
        for (int i = 0; i < characters.length; i++) {
            char character = characters[i];
            if(isVowel(character)){
                return true;
            }
        }

        return false;
    }

    public static Integer getIndexOfFirstVowel(String word) {
        // made array, i had to change the strings to a char array
        char[] characters = word.toCharArray();
        // for loop
        for (int i = 0; i < characters.length; i++) {
            char character = characters[i];
            if(isVowel(character)){
                return i;
            }
        }

        return null;
    }


    public static Boolean startsWithVowel(String word) {
       // made array, i had to change the strings to a char array
        char[] characters = word.toCharArray();
      // get the first char
        char firstChar = characters[0];
// return it
        return isVowel(firstChar);
    }

    public static Boolean isVowel(Character character) {
        //made a new array that holds characters
        Character[] vowels = new Character[]{'a', 'e', 'i', 'o', 'u'};
       // for loop
        for (int i = 0; i < vowels.length; i++) {
            Character vowel = vowels[i];

            if (character.toString().equalsIgnoreCase(vowel.toString())) {
                return true;

            }
        }
        return false;
    }
}
