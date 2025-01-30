import com.codeforall.online.simplegraphics.pictures.Picture;
import field.Field;
import snake.Snake;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {

    public static void main(String[] args) {

        Game game;
        game = new Game();
        Picture picture = new Picture(0,0, "resources/Apple.png");

        game.setSnakePicture(picture);

        game.gameInit();


    }


}