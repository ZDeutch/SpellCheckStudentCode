public class NodeTrie {

    // Checks whether this is the end node of a word
    boolean isWord;

    // Tracks the next Word
    NodeTrie[] nextNode;

    public NodeTrie() {
        isWord = false;
        // Initialize each node to be able to hold every possible AASCI value
        nextNode = new NodeTrie[256];
    }


    // Getters and setters

    public boolean isWord() {
        return isWord;
    }

    public void setWord(boolean word) {
        isWord = word;
    }

    public NodeTrie getChild(char c) {
        return nextNode[c];
    }

    // Set the next node as what is passed in
    public void setChild(char c, NodeTrie node) {
        nextNode[c] = node;
    }
}