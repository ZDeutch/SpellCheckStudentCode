public class Trie {
    Node root;

    public Trie() {
        root = new Node();
    }

    public void insert(String s) {
        Node current = root;
        Character[] letters = new Character[s.length()];

        for (int i = 0; i < s.length(); i++) {
            letters[i] = s.charAt(i);

            if (current.getChild(letters[i]) == null) {
                current.setChild(letters[i], new Node());
            }
            current = current.getChild(letters[i]);
        }
        current.setWord(true);
    }

    boolean lookup(String s) {
        Node current = root;
        Character[] letters = new Character[s.length()];


        for (int i = 0; i < s.length(); i++) {
            letters[i] = s.charAt(i);

            if (current.getChild(letters[i]) == null) {
                return false;
            } else {
                current = current.getChild(letters[i]);
            }
        }
        return true;
    }

}
