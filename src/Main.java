import com.codeforall.online.simplegraphics.pictures.Picture;
import field.Field;
import fruits.Fruit;
import game.Game;
import input.MyKeyboard;
import snake.Snake;


public class Main {

    public static void main(String[] args) {

        Field field = new Field(60,40);
        field.init();

        int initialPosCols = (field.getCols() * field.getCellSize()) / 2;
        int initialPosRows = (field.getRows() * field.getCellSize()) / 2;


        MyKeyboard keyboard = new MyKeyboard();
        Snake snake = new Snake(field);
        keyboard.setSnake(snake);
        keyboard.init();


        Game game =new Game(field, snake);
        keyboard.setGame(game);

    }


}