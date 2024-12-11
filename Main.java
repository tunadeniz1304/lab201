import java.io.*;
import java.util.Scanner;

class Main {
    static String[] readTextFile(String filePath) {
        try {
            File myObj = new File(filePath);
            Scanner myReader = new Scanner(myObj);
            String data = myReader.nextLine();
            myReader.close();
            return data.split(" ");
        } catch (Exception e) {
            return null;
        }
    }

    public static void main(String[] args) {
        String[] words = readTextFile("input1.txt");
        BinarySearchTree bst = new BinarySearchTree();

        for (int i = 0; i < words.length; ++i) {
            bst.insert(words[i]);
        }
        

        bst.printFreq();
    }
}