public class TST {
    NodeTST root;

    public TST() {
        root = new NodeTST('m');
    }

    public void insert(String s) {
        NodeTST temp = root;
        for (int i = 0; i < s.length(); i++) {
            while (s.charAt(i) != temp.getCurrent()) {
                if (s.charAt(i) < temp.getCurrent()) {
                    if (temp.getLeft() == null) {
                        temp.setLeft(s.charAt(i));
                    }
                    temp = temp.getLeft();
                } else {
                    if (temp.getRight() == null) {
                        temp.setRight(s.charAt(i));
                    }
                    temp = temp.getRight();
                }
            }

            if (temp.getMiddle() == null) {
                temp.setMiddle(s.charAt(i));
            }
            temp.setWord(true);
        }
    }
    
    public boolean find(String s) {
        NodeTST temp = root;
        
        for(int i = 0; i < s.length(); i++) {
            while(s.charAt(i) != temp.getCurrent()) {
                if(s.charAt(i) > temp.getCurrent()) {
                    if(temp.getRight() == null) {
                        return false;
                    }
                    temp = temp.getRight();
                } else if(s.charAt(i) < temp.getCurrent()) {
                    if(temp.getLeft() == null) {
                        return false;
                    }
                    temp = temp.getLeft();
                }
            }
            if(temp.getMiddle() == null) {
                return false;
            } 
            temp = temp.getMiddle();
        }
        return true;
    }


}
