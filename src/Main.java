import com.codeforall.online.simplegraphics.pictures.Picture;
import field.Field;
import fruits.Fruit;
import game.Game;
import input.MyKeyboard;
import snake.Snake;


public class Main {

    public static void main(String[] args) throws InterruptedException {

        Field field = new Field(60,40);
        field.init();

        MyKeyboard keyboard = new MyKeyboard();
        Snake snake = new Snake(field);
        keyboard.setSnake(snake);
        keyboard.init();

        Game game =new Game(field, snake);
        keyboard.setGame(game);

        game.start();


    }


}