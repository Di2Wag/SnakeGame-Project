package input;

import com.codeforall.online.simplegraphics.keyboard.Keyboard;
import com.codeforall.online.simplegraphics.keyboard.KeyboardEvent;
import com.codeforall.online.simplegraphics.keyboard.KeyboardEventType;
import com.codeforall.online.simplegraphics.keyboard.KeyboardHandler;
import com.codeforall.online.simplegraphics.pictures.Picture;
import snake.Snake;

public class MyKeyboard implements KeyboardHandler {

    private Keyboard keyboard;
    private Snake snake;

    public void setSnake(Snake snake) {
        this.snake = snake;
    }


    public void init() {
        keyboard = new Keyboard(this);

        KeyboardEvent right = new KeyboardEvent();
        right.setKey(KeyboardEvent.KEY_RIGHT);
        right.setKeyboardEventType(KeyboardEventType.KEY_PRESSED);

        KeyboardEvent left = new KeyboardEvent();
        left.setKey(KeyboardEvent.KEY_LEFT);
        left.setKeyboardEventType(KeyboardEventType.KEY_PRESSED);

        KeyboardEvent up = new KeyboardEvent();
        up.setKey(KeyboardEvent.KEY_UP);
        up.setKeyboardEventType(KeyboardEventType.KEY_PRESSED);

        KeyboardEvent down = new KeyboardEvent();
        down.setKey(KeyboardEvent.KEY_DOWN);
        down.setKeyboardEventType(KeyboardEventType.KEY_PRESSED);

        keyboard.addEventListener(right);
        keyboard.addEventListener(left);
        keyboard.addEventListener(up);
        keyboard.addEventListener(down);
    }

    @Override
    public void keyPressed(KeyboardEvent keyboardEvent) {

        if (keyboardEvent.getKey() == KeyboardEvent.KEY_RIGHT) {
            snake.moveRight();
            System.out.println("right");
        }

        if (keyboardEvent.getKey() == KeyboardEvent.KEY_LEFT) {
            snake.moveLeft();
            System.out.println("left");
        }

        if (keyboardEvent.getKey() == KeyboardEvent.KEY_UP) {
            snake.moveUp();
            System.out.println("up");
        }

        if (keyboardEvent.getKey() == KeyboardEvent.KEY_DOWN) {
            snake.moveDown();
            System.out.println("down");
        }


        }


    @Override
    public void keyReleased (KeyboardEvent keyboardEvent){

    }


}