package Pentomino.src;


import java.util.ArrayList;
import java.io.IOException;

public class Driver {
    
    public static void main(String[] args) throws IOException{

        PentBoard board = new PentBoard(3);
        board.placeShapes();
        ArrayList<ArrayList<Integer>> matrix = board.matrix;
        DLX dlx = new DLX(matrix.get(0).size(), matrix);
        dlx.run();
        System.out.println("# of 3 x 20 solutions: " + dlx.getNumberOfSolutions());

        // not sure why i can't print the set to a file
        /* 
        FileOutputStream fos  = new FileOutputStream("file.txt");
        ObjectOutputStream oos = new ObjectOutputStream(fos);
        oos.writeObject(matrix);
        oos.close();
        */

        board = new PentBoard(4);
        board.placeShapes();
        matrix = board.matrix;
        dlx = new DLX(matrix.get(0).size(), matrix);
        dlx.run();
        System.out.println("# of 4 x 15 solutions: " + dlx.getNumberOfSolutions());

        board = new PentBoard(5);
        board.placeShapes();
        matrix = board.matrix;
        dlx = new DLX(matrix.get(0).size(), matrix);
        dlx.run();
        System.out.println("# of 5 x 12 solutions: " + dlx.getNumberOfSolutions());

        board = new PentBoard(6);
        board.placeShapes();
        matrix = board.matrix;
        dlx = new DLX(matrix.get(0).size(), matrix);
        dlx.run();
        System.out.println("# of 6 x 10 solutions: " + dlx.getNumberOfSolutions());
    }
}
