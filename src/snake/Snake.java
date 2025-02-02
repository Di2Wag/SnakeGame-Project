package snake;

import com.codeforall.online.simplegraphics.pictures.Picture;
import field.Field;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;


public class Snake {

    //private Picture snakePicture;
    private List<Picture> snakeBody;
    private Field field;
    private int cellSize = 24;

    private int col;
    private int row;



    public Snake(Field field) {
        this.field = field;
        this.col=(int)(Math.random()*field.getCols());
        this.row=(int)(Math.random()*field.getRows());

        snakeBody = new LinkedList<>();
        Picture snakeHead = new Picture(field.columnToX(col),field.rowToY(row),"resources/snake (1).png");
        snakeBody.add(snakeHead);
        snakeHead.draw();

        //this.snakePicture = new Picture(field.columnToX(col),field.rowToY(row),"resources/snake (1).png");
        //snakePicture.draw();
    }

    public void move(int colMovement, int rowMovement){
        int newCol = col + colMovement;
        int newRow = row + rowMovement;

        if(newCol >= 0 && newCol < field.getCols() && newRow >= 0 && newRow < field.getRows()) {
            col = newCol;
            row = newRow;

            for (int i = snakeBody.size() - 1; i > 0; i--) {
                Picture prevBodySegment = snakeBody.get(i-1);
                snakeBody.get(i).translate(prevBodySegment.getX() - snakeBody.get(i).getX(), prevBodySegment.getY()-snakeBody.get(i).getY());
            }

            snakeBody.get(0).translate(colMovement*cellSize, rowMovement*cellSize);
        }
    }

    public void moveRight() {
        move(1,0);
    }

    public void moveLeft(){
        move(-1,0);
    }

    public void moveDown(){
        move(0,1);
    }

    public void moveUp() {
        move(0,-1);
    }

    public void growSnake(){
        Picture snakeTail = snakeBody.get(snakeBody.size()-1);
        Picture snakeBodySegment = new Picture(snakeTail.getX(),snakeTail.getY(),"resources/shape.png");
        snakeBody.add(snakeBodySegment);
        snakeBodySegment.draw();
    }

    public int getCol() {
        return col;
    }

    public void setCol(int col) {
        this.col = col;
    }

    public int getRow() {
        return row;
    }

    public void setRow(int row) {
        this.row = row;
    }
}




