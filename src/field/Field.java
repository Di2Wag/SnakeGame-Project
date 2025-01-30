package field;

import com.codeforall.online.simplegraphics.graphics.Canvas;
import com.codeforall.online.simplegraphics.graphics.Rectangle;
import com.codeforall.online.simplegraphics.pictures.Picture;


public class Field {

    public static final int PADDING = 10;
    private int cellSize = 15;
    private int cols;
    private int rows;


    public Field(int cols, int rows) {
        this.cols = cols;
        this.rows = rows;
    }

    public void init() {
        Rectangle field = new Rectangle((double)10.0F, (double)10.0F, (double)(this.cols * this.cellSize), (double)(this.rows * this.cellSize));
        field.draw();

        //background
        //Picture background = new Picture(PADDING,PADDING, "resources/Grass.jpg");
        //Canvas.getInstance().show(background);

    }

    public int getCellSize() {
        return this.cellSize;
    }

    public int getCols() {
        return this.cols;
    }

    public int getRows() {
        return this.rows;
    }

    public int rowToY(int row) {
        return 10 + this.cellSize * row;
    }

    public int columnToX(int column) {
        return 10 + this.cellSize * column;
    }

    public int getPadding() {
        return PADDING;
    }

}
