import com.codeforall.online.simplegraphics.pictures.Picture;
import field.Field;
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

        Snake snake = new Snake(field, new Picture(initialPosCols,initialPosRows,"resources/snake.png"));

        MyKeyboard keyboard = new MyKeyboard();
        keyboard.setSnake(snake);
        keyboard.init();



        /*Game game;
        game = new Game();
        Picture picture = new Picture(10,10, "resources/Grass 1050x750.png");
        picture.draw();

        game.setSnakePicture(picture);

        game.gameInit();


    }*/


    }
}