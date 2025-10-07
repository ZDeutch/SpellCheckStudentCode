public class Node {
    boolean isWord;
    Node[] nextNode;

    public Node() {
        isWord = false;
        nextNode = new Node[256];

    }

    public boolean isWord() {
        return isWord;
    }

    public void setWord(boolean word) {
        isWord = word;
    }

    public Node[] getNextNode() {
        return nextNode;
    }

    public Node getChild(char c) {
        return nextNode[c];
    }

    public void setChild(char c, Node node) {
        nextNode[c] = node;
    }
}
