public class Trie {
    NodeTrie root;

    // Constructor
    public Trie() {
        root = new NodeTrie();
    }

    // Method to insert a string into the Trie
    public void insert(String s) {

        // Set the current Node to be at the root
        // Make an array of letters that are of the string size to iterate
        NodeTrie current = root;
        Character[] letters = new Character[s.length()];

        // For each letter in the word
        // Set the letters array to be each index of i
        for (int i = 0; i < s.length(); i++) {
            letters[i] = s.charAt(i);

            // If the node doesn't have a child
            // Then create a new child with a size of 256
            // Then make current the child node to keep moving through the string
            if (current.getChild(letters[i]) == null) {
                current.setChild(letters[i], new NodeTrie());
            }
            current = current.getChild(letters[i]);
        }
        // Set the last letter as true to define the word
        current.setWord(true);
    }

    // Method to lookup whether a given string is in the Trie
    boolean lookup(String s) {
        NodeTrie current = root;
        Character[] letters = new Character[s.length()];

        // For each letter in the word
        for (int i = 0; i < s.length(); i++) {
            letters[i] = s.charAt(i);

            // If the child of the letter is undefined in the Trie
            // Then the word is incorrect, and you return false
            // Otherwise keep moving through the word
            if (current.getChild(letters[i]) == null) {
                return false;
            } else {
                current = current.getChild(letters[i]);
            }
        }
        return true;
    }

}
