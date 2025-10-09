import java.util.ArrayList;

/**
 * Spell Check
 * A puzzle written by Zach Blick
 * for Adventures in Algorithms
 * At Menlo School in Atherton, CA
 * <p>
 * Completed by: Zander Deutch
 */

public class SpellCheck {


    /**
     * checkWords finds all words in text that are not present in dictionary
     *
     * @param text       The list of all words in the text.
     * @param dictionary The list of all accepted words.
     * @return String[] of all mispelled words in the order they appear in text. No duplicates.
     */
    public String[] checkWords(String[] text, String[] dictionary) {
        Trie game = new Trie();
        ArrayList<String> incorrect = new ArrayList<>();
        for(int i = 0; i < dictionary.length; i++) {
            game.insert(dictionary[i]);
        }

        for(int i = 0; i < text.length; i++) {
            if(!game.lookup(text[i])) {
                incorrect.add(text[i]);
            }
        }
        return incorrect.toArray(new String[0]);
    }
}

// Modulo to wrap around elements in my dictionary copy
//        int modulo = dictionary.length;
//        // new dictionary to store numerical value of each word
//        String[] newDictionary = new String[modulo];
//
//        // Arraylist to find incorrect words
//        ArrayList<String> incorrect = new ArrayList<String>();
//
//        // Go through each word in the dictionary
//        for (int i = 0; i < dictionary.length; i++) {
//            int word_sum = 0;
//            int pow_10 = 1;
//            // For each letter in the word
//            for (int j = dictionary[i].length() - 1; j > 0; j--) {
//                char c = dictionary[i].charAt(j);
//                int aasci = (int) c;
//                // Take the letter's aasci value and multiply it by the digit place it's in by base 10
//                // Then mod the value to wrap it around
//                word_sum = (word_sum + ((aasci * pow_10) % modulo)) % modulo;
//
//                // Increment your power factor for the next digit place
//                pow_10 = (pow_10 * 10) % modulo;
//            }
//
//            // Finally, add the words sum to the map
//            newDictionary[word_sum] = dictionary[i];
//        }
//
//        // Then for each word in text
//        for (int i = 0; i < text.length; i++) {
//            // Do the exact same as above
//            int word_sum = 0;
//            int pow_10 = 1;
//            for (int j = text[i].length() - 1; j > 0; j--) {
//                char c = text[i].charAt(j);
//                int aasci = (int) c;
//                word_sum = (word_sum + ((aasci * pow_10) % modulo)) % modulo;
//                pow_10 = (pow_10 * 10) % modulo;
//            }
//
//            // If the word doesn't exist or if it isn't the same as the word in the dictionary
//            // Add it to your incorrect words
//            if (newDictionary[word_sum] == null) {
//                incorrect.add(text[i]);
//            } else if (!text[i].equals(newDictionary[word_sum])) {
//                incorrect.add(text[i]);
//            }
//        }
//
//        // Return your arraylist as an array
//        return incorrect.toArray(new String[0]);

