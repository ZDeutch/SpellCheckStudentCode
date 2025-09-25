import com.sun.source.tree.ArrayAccessTree;

import java.util.ArrayList;

/**
 * Spell Check
 * A puzzle written by Zach Blick
 * for Adventures in Algorithms
 * At Menlo School in Atherton, CA
 *
 * Completed by: [YOUR NAME HERE]
 * */

public class SpellCheck {


    /**
     * checkWords finds all words in text that are not present in dictionary
     *
     * @param text The list of all words in the text.
     * @param dictionary The list of all accepted words.
     * @return String[] of all mispelled words in the order they appear in text. No duplicates.
     */
    public String[] checkWords(String[] text, String[] dictionary) {
        ArrayList<String> incorrect = new ArrayList<String>();

        for(int i = 0; i < text.length; i++) {
            int low = 0;
            int high = dictionary.length - 1;
            boolean found = false;
            while(low <= high) {
                int middle = (low + high) / 2;

                int comparison = text[i].compareTo(dictionary[middle]);

                if(comparison == 0) {
                    found = true;
                    break;

                } else if(comparison > 0) {
                    low = middle + 1;
                } else {
                    high = middle - 1;
                }
            }
            if(!found) {
                if(!incorrect.contains(text[i])) {
                    incorrect.add(text[i]);
                }
            }
        }
        String[] incorrectArray = incorrect.toArray(new String[0]);
        return incorrectArray;
    }
}
