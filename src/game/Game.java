package game;

import com.codeforall.online.simplegraphics.pictures.Picture;
import field.Field;
import fruits.Fruit;
import snake.Snake;

public class Game {

    private Field field;
    private  Snake snake;
    private Fruit[] fruits;
    private  Fruit fruit;


    public Game(Field field,Snake snake, Fruit fruit) {
        this.field=field;
        this.snake=snake;
        this.fruit=fruit;
    }

    public void gameInit() {

        //Field field = new Field(70, 50);

        //snake = new Snake(snakePicture);

        //field.init();

        createFruits();

    }

    public void createFruits(){
        fruits = new Fruit[20];

        for (int i = 0; i < fruits.length; i++) {
            fruits[i] = new Fruit(field);
        }

    }

    public  boolean checkCollisionWithFruits(){
        if (snake.getRow() == fruit.getRow() && snake.getCol() == fruit.getCol()) {
            return true;
        }
        return false;}

    public void deleteFruit (){
        if (checkCollisionWithFruits() == true) {
            Picture fruitPic = fruit.getFruitPic();
            fruitPic.delete();
        }
    }




    }


