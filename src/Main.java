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

        Snake snake = new Snake(new Picture(10,10,"resources/snake.png"));

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