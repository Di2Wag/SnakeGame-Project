package input;

import com.codeforall.online.simplegraphics.keyboard.Keyboard;
import com.codeforall.online.simplegraphics.keyboard.KeyboardEvent;
import com.codeforall.online.simplegraphics.keyboard.KeyboardEventType;
import com.codeforall.online.simplegraphics.keyboard.KeyboardHandler;
import snake.Snake;

public class MyKeyboard implements KeyboardHandler {
    @Override
    public void keyPressed(KeyboardEvent keyboardEvent) {

        Keyboard keyboard;
        Snake snake;


    /*
    public void setPikachu(Pikachu pikachu){
        this.pikachu=pikachu;
    }*/

        public void init(){
            keyboard = new Keyboard(this);

            KeyboardEvent right = new KeyboardEvent();
            right.setKey(KeyboardEvent.KEY_D);
            right.setKeyboardEventType(KeyboardEventType.KEY_PRESSED);

            KeyboardEvent left = new KeyboardEvent();
            left.setKey(KeyboardEvent.KEY_A);
            left.setKeyboardEventType(KeyboardEventType.KEY_PRESSED);

            keyboard.addEventListener(right);
            keyboard.addEventListener(left);
        }

        @Override
        public void keyPressed(KeyboardEvent keyboardEvent) {

            if(keyboardEvent.getKey() == KeyboardEvent.KEY_RIGHT){
                snake.moveRight();
            }

            if(keyboardEvent.getKey() == KeyboardEvent.KEY_LEFT){
                snake.moveLeft();
            }

            if(keyboardEvent.getKey() == KeyboardEvent.KEY_UP){
                snake.moveUp();

            if(keyboardEvent.getKey() == KeyboardEvent.KEY_DOWN){
                snake.moveDown();

    }

    @Override
    public void keyReleased(KeyboardEvent keyboardEvent) {

    }
}
