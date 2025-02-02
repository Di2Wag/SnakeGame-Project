package snake;

import com.codeforall.online.simplegraphics.graphics.Color;
import com.codeforall.online.simplegraphics.graphics.Rectangle;
import com.codeforall.online.simplegraphics.keyboard.KeyboardEvent;
import com.codeforall.online.simplegraphics.pictures.Picture;
import field.Field;


public class Snake {

    private Picture snakePicture;
    private Field field;
    private int cellSize = 24;
    private int gameUnits;
    private int bodyXCord[];
    private int bodyYCord[];
    private int bodyParts = 0;
    private Rectangle body[];
    private int xToSpawn;
    private int yToSpawn;

    private int col;
    private int row;



    public Snake(Field field) {
        this.field = field;
        this.col=(int)(Math.random()*field.getCols());
        this.row=(int)(Math.random()*field.getRows());
        gameUnits = (field.getCols()* field.getRows()) / cellSize;
        bodyXCord = new int [gameUnits];
        bodyYCord = new int [gameUnits];
        body = new Rectangle[gameUnits];
        bodyXCord[0] = col;
        bodyYCord[0] = row;
        this.snakePicture = new Picture(field.columnToX(col),field.rowToY(row),"resources/snake (1).png");
        snakePicture.draw();
    }

    public void moveRight() {
        System.out.println(field.getCols());
        System.out.println(col);

        if (col+1 < field.getCols()) {
            col++;
            snakePicture.translate(cellSize, 0);
            bodyXCord[0] = col;
            repaintBody();
        }

    }

    public void moveLeft(){
        if(col-1>=0){
            col--;
            snakePicture.translate(-cellSize,0);
            bodyXCord[0] = col;
            repaintBody();
        }
    }

    public void moveDown(){
        System.out.println("row: " + row);
        System.out.println("field rows:" + field.getRows());
        if(row+1 < field.getRows()){
            row++;
            snakePicture.translate(0,cellSize);
            bodyYCord[0] = row;
            repaintBody();
        }
    }

    public void moveUp() {
        if(row-1>=0){
            row--;
            snakePicture.translate(0,-cellSize);
            bodyYCord[0] = row;
            repaintBody();
        }
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

    public void growSnake(int direction) {

        bodyParts++;

        if(direction == KeyboardEvent.KEY_UP){
            xToSpawn = field.columnToX(col);
            yToSpawn = field.rowToY(row)+cellSize*bodyParts;
        }
        if(direction == KeyboardEvent.KEY_DOWN){
            xToSpawn = field.columnToX(col);
            yToSpawn = field.rowToY(row)-cellSize*bodyParts;
        }
        if(direction == KeyboardEvent.KEY_LEFT){
            xToSpawn = field.columnToX(col)+cellSize*bodyParts;
            yToSpawn = field.rowToY(row);
        }
        if(direction == KeyboardEvent.KEY_RIGHT){
            xToSpawn = field.columnToX(col)-cellSize*bodyParts;
            yToSpawn = field.rowToY(row);
        }

        body[bodyParts] = new Rectangle(xToSpawn, yToSpawn, field.getCellSize(), field.getCellSize());
        body[bodyParts].fill();
        body[bodyParts].setColor(Color.GREEN);
        bodyXCord[bodyParts] = field.columnToX(col);
        bodyYCord[bodyParts] = field.rowToY(row);

    }

    public void repaintBody(){

        for(int i=1; i<=bodyParts; i++){
            body[i].delete();
            body[i] = new Rectangle(bodyXCord[i-1]*cellSize, bodyYCord[i-1]*cellSize, cellSize, cellSize);
            body[i].fill();
            body[i].setColor(Color.GREEN);
        }
    }
}




