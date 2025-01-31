import com.codeforall.online.simplegraphics.pictures.Picture;
import field.Field;
import fruits.Fruit;
import game.Game;
import input.MyKeyboard;
import snake.Snake;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {

    public static void main(String[] args) {

        Field field = new Field(70,50);
        field.init();

        int initialPosCols = (field.getCols() * field.getCellSize()) / 2;
        int initialPosRows = (field.getRows() * field.getCellSize()) / 2;


        MyKeyboard keyboard = new MyKeyboard();
        Snake snake = new Snake(field);
        keyboard.setSnake(snake);
        keyboard.init();

        Fruit fruit =new Fruit(field);

        Game game =new Game(field, snake, fruit);
        keyboard.setGame(game);




        /*game.Game game;
        game = new game.Game();
        Picture picture = new Picture(10,10, "resources/Grass 1050x750.png");
        picture.draw();

        game.setSnakePicture(picture);

        game.gameInit();


    }*/


    }
}