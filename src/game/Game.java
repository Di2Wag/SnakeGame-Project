package game;

import com.codeforall.online.simplegraphics.pictures.Picture;
import field.Field;
import fruits.Fruit;
import snake.Snake;

public class Game {

    private Field field;
    private Snake snake;
    private Fruit[] fruits;
    private Fruit fruit;


    public Game(Field field, Snake snake) {
        this.field = field;
        this.snake = snake;
        createFruits();
    }

    public void gameInit() {

        //Field field = new Field(70, 50);

        //snake = new Snake(snakePicture);

        //field.init();

        createFruits();

    }

    public void createFruits() {
        fruits = new Fruit[1];

        for (int i = 0; i < fruits.length; i++) {
            fruits[i] = new Fruit(field);
        }

    }

    public boolean checkCollisionWithFruits() {
        for (Fruit f : fruits) {
            if (snake.getRow() == f.getRow() && snake.getCol() == f.getCol()) {
                fruit = f;
                return true;
            }
        }

         return false;
    }

    public void deleteFruit () {
           for (int i = 0; i < fruits.length; i++) {
               if (snake.getRow() == fruits[i].getRow() && snake.getCol() == fruits[i].getCol()) {
                   fruit.getFruitPic().delete();
                   fruits[i] = new Fruit(field);

               }

           }

    }

}


