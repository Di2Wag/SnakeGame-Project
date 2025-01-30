package snake;

import com.codeforall.online.simplegraphics.pictures.Picture;
import field.Field;


public class Snake {

private Picture snakePicture;
private Field field;


    public Snake(Picture snakePicture){
        this.snakePicture = snakePicture;
        snakePicture.draw();
    }

    public void moveRight(){
        snakePicture.translate(field.getCellSize(), 0);
    }

    public void moveLeft(){
        snakePicture.translate(-field.getCellSize(), 0);
    }

    public void moveDown(){
        snakePicture.translate(0, field.getCellSize());
    }

    public void moveUp(){
        snakePicture.translate(0, -field.getCellSize());
    }
}
