package snake;

import com.codeforall.online.simplegraphics.pictures.Picture;
import field.Field;


public class Snake {

private Picture snakePicture;
private Field field;
private int cellSize = 15;



    public Snake(Picture snakePicture) {
        this.snakePicture = snakePicture;
        snakePicture.draw();
    }

    public void moveRight(){
        if (col < field.getCols() - 1) {
            col++;
            snakePicture.translate(field.getCellSize(), 0);
        }
        //snakePicture.translate(cellSize, 0);
    }

    public void moveLeft(){
        snakePicture.translate(-cellSize, 0);
    }

    public void moveDown(){
        snakePicture.translate(0, cellSize);
    }

    public void moveUp(){
        snakePicture.translate(0, -cellSize);
    }


}
