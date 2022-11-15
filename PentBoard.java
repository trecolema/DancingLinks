package Pentomino.src;

import java.util.ArrayList;

import java.util.Collections;
public class PentBoard {

    public ArrayList<ArrayList<Integer>> matrix = new ArrayList<ArrayList<Integer>>(); //matrix to be solved by dlx
    int numRows; // number of rows
    int numCols;// number of columns 
    int position1 = 0, position2 = 0, position3 = 0, position4 = 0, position5 = 0; //generate all postions for (x,y) in tiles.shapes

    public PentBoard(int rows){ // creating the pentonimo board

        if(rows == 3){
            numRows = 3;
            numCols = 20;
        }
        if(rows == 4){
            numRows = 4;
            numCols = 15;
        }
        if(rows == 5){
            numRows = 5;
            numCols = 12;
        }
        if(rows == 6){
            numRows = 6;
            numCols = 10;
        }

    }

//look for legal positions, placing binAry representation of legal shapes into set of set (matrix) to be solved by dlx
    public void placeShapes(){
        //loop through all shapes, all orintations, all rows, all columns 
        for(int i = 0; i < Tiles.shapes.length; i++){
            for(int j = 0; j < Tiles.shapes[i].length; j++){
                for(int rows = 0; rows < numRows; rows++){
                    for(int cols = 0; cols < numCols; cols++){
                        if(isLegal(Tiles.shapes[i][j], rows, cols)){ // checking if shape is in legal position

                            ArrayList<Integer> link = new ArrayList<Integer>(Collections.nCopies(72,0));
                            //creating the binary set, and placing legal shape in to the set to be solved by DLX
                            link.set(i, 1);
                            link.set(12+position1, 1);
                            link.set(12+position2, 1);
                            link.set(12+position3, 1);
                            link.set(12+position4, 1);
                            link.set(12+position5, 1);
                            //System.out.println(link); //uncommenting this will print the set

                            matrix.add(link);
                        }
                    }
                }
            }            
        }
    }
    public boolean isLegal(int[] arr, int row, int col){

        //coordinate pairs besides the row and col that we are currently at
        int[] XYpos = new int[4];
        int counter = 0; // keeping track of what positions are filled in array
        for(int i = 0; i < arr.length; i+= 2){
            int yCoord = row + arr[i]; //x coordinate 
            int xCoord = col + arr[i+1]; //y coordinate
            // seeing if the position is in bounds
            if(xCoord < 0 || xCoord >= numCols || yCoord < 0 || yCoord >= numRows){
                return false;
            }
            XYpos[counter] = (xCoord) + (numCols * yCoord); // encoding the position
            counter++;
            //XYpos.set(XYcount++, ((xCoord) + (numCols * yCoord))); //all xy pairs fit into the board
            //System.out.println(XYcount);
        }
        
        //generating the postions of the shape
        position1 = (numCols*row + col);
        position2 = XYpos[0];
        position3 = XYpos[1];
        position4 = XYpos[2];
        position5 = XYpos[3];


        //position is legal
        return true;
    }

}
