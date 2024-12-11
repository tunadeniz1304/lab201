class Node {
    String word;
    int count;
    Node left, right;

    public Node(String value) {
        this.word = value;
        this.count = 1;
        this.left = null;
        this.right = null;
    }
}
