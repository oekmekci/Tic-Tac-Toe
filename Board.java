/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package tictactoe;


public class Board {

    private Cell[][] board;
 public Cell testCell;
    public Board(int rows, int columns) {
        board = new Cell[rows][columns];
    }
   public void setCell(int row, int column, Cell cell) {
        board[row][column]=cell;
    }
    public Cell getCell(int row, int column) {
        return board[row][column];
    }
    public int getNumberOfRows() {
        return  board.length;
    }
    public int getNumberOfColumns() {
        return board[0].length;
    }
}

