public class NodeTrie {
    boolean isWord;
    NodeTrie[] nextNode;

    public NodeTrie() {
        isWord = false;
        nextNode = new NodeTrie[256];
    }


    public boolean isWord() {
        return isWord;
    }

    public void setWord(boolean word) {
        isWord = word;
    }

    public NodeTrie[] getNextNode() {
        return nextNode;
    }

    public NodeTrie getChild(char c) {
        return nextNode[c];
    }

    public void setChild(char c, NodeTrie node) {
        nextNode[c] = node;
    }
}