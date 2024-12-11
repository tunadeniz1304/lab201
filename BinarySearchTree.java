public class BinarySearchTree {
    public Node root;

    public void insert(String word) {
        if (root == null) {
            root = new Node(word);
            return;
        }
        
        Node temp = this.root;

        while(true) {
            if(temp.word.compareTo(word) == 0) {
                temp.count++;
                break;
            }
            else if(temp.word.compareTo(word) < 0) {
                if(temp.left == null) {
                    temp.left = new Node(word);
                    break;
                }
                temp = temp.left;

            }
            else {
                if(temp.right == null) {
                    temp.right = new Node(word);
                    break;
                }
                temp = temp.right;
            }
        }

    }

    public void printFreq() {
        printFreq(root);
    }

    public void printFreq(Node root) {
        if (root == null)
            return;
        printFreq(root.left);
        System.out.print(root.word +":" +root.count+"\n");
        printFreq(root.right);
    }

}

// string1.compareTo( string2 )