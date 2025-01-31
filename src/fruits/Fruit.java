package fruits;

import com.codeforall.online.simplegraphics.pictures.Picture;
import field.Field;

public class Fruit {

    private Picture fruitPic;
    private int col;
    private int row;
    private Field field;

    public Fruit(Field field){
        this.field = field;
        this.col=(int)(Math.random()*field.getCols());
        this.row=(int)(Math.random()*field.getRows());
        this.fruitPic = new Picture(field.columnToX(col),field.rowToY(row),"resources/berry.png");
        fruitPic.draw();
    }
}
