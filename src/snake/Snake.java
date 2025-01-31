package snake;

import com.codeforall.online.simplegraphics.pictures.Picture;
import field.Field;


public class Snake {

    private Picture snakePicture;
    private Field field;
    private int cellSize = 15;

    private int col;
    private int row;



    public Snake(Field field) {
        this.field = field;
        this.col=(int)(Math.random()*field.getCols());
        this.row=(int)(Math.random()*field.getRows());
        this.snakePicture = new Picture(field.columnToX(col),field.rowToY(row),"resources/snake.png");
        snakePicture.draw();
    }

    public void moveRight() {
        System.out.println(field.getCols());
        System.out.println(col);

        if (col+1 < field.getCols()) {
            col++;
            snakePicture.translate(cellSize, 0);
        }
    }

    public void moveLeft(){
        if(col-1>=0){
            col--;
            snakePicture.translate(-cellSize,0);
        }
    }

    public void moveDown(){
        System.out.println("row: " + row);
        System.out.println("field rows:" + field.getRows());
        if(row+1 < field.getRows()){
            row++;
            snakePicture.translate(0,cellSize);
        }
    }

    public void moveUp() {
        if(row-1>=0){
            row--;
            snakePicture.translate(0,-cellSize);
        }
    }


}




