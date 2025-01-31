package snake;

import com.codeforall.online.simplegraphics.pictures.Picture;
import field.Field;


public class Snake {

private Picture snakePicture;
private Field field;
private int cellSize = 15;



    public Snake(Field field,Picture snakePicture) {
        this.field = field;
        this.snakePicture = snakePicture;
        snakePicture.draw();
    }

    public void moveRight() {
        if (snakePicture.getX() + cellSize < field.getCols() * cellSize) {
                snakePicture.translate(cellSize, 0);
        }

    }

    public void moveLeft(){
        if (snakePicture.getX() - cellSize >= field.getPadding()) {
            snakePicture.translate(-cellSize, 0);
        }
    }

    public void moveDown(){
        if (snakePicture.getY() + cellSize < field.getRows() * cellSize) {
            snakePicture.translate(0, cellSize);
        }
    }

    public void moveUp() {
        if (snakePicture.getY() - cellSize >= field.getPadding()) {
            snakePicture.translate(0, -cellSize);
        }
    }


}
