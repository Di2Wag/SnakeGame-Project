import com.codeforall.online.simplegraphics.pictures.Picture;
import field.Field;
import snake.Snake;

public class Game {

    private Field field;
    private Snake snake;
    private Picture snakePicture;

    public void gameInit() {

        Field field = new Field(70, 50);

        snake = new Snake(snakePicture);

        field.init();


    }

    public void setSnakePicture(Picture snakePicture) {
        this.snakePicture = snakePicture;
    }

}
