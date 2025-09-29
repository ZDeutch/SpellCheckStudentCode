import com.sun.source.tree.ArrayAccessTree;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

/**
 * Spell Check
 * A puzzle written by Zach Blick
 * for Adventures in Algorithms
 * At Menlo School in Atherton, CA
 *
 * Completed by: Zander Deutch
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
        for(int i = 0; i < dictionary.length; i++) {
            int num_val = 0;
            int word_sum = 0;
            int pow_10 = 1;
            for(int j = dictionary[i].length() - 1; j > 0; j--) {
                char c = dictionary[i].charAt(j);
                int aasci = (int) c;
                word_sum += aasci * pow_10;
                pow_10 *= 10;
            }
        }
    }




//        HashSet<String> incorrect2 = new HashSet<>();
//
//        for(int i = 0; i < text.length; i++) {
//            int low = 0;
//            int high = dictionary.length - 1;
//            boolean found = false;
//            while(low <= high) {
//                int middle = (low + high) / 2;
//
//                int comparison = text[i].compareTo(dictionary[middle]);
//
//                if(comparison == 0) {
//                    found = true;
//                    break;
//
//                } else if(comparison > 0) {
//                    low = middle + 1;
//                } else {
//                    high = middle - 1;
//                }
//            }
//            if(!found) {
//                incorrect2.add(text[i]);
//            }
//        }
//        return incorrect2.toArray(new String[0]);
//    }
}
