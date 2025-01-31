import com.codeforall.online.simplegraphics.pictures.Picture;
import field.Field;
import fruits.Fruit;
import snake.Snake;

public class Game {

    private Field field;
    private Snake snake;
    private Fruit[] fruits;

    public Game(Field field,Snake snake){
        this.field=field;
        this.snake=snake;
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

    public void checkCollision(){

    }


}