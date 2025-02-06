package game;

import com.codeforall.online.simplegraphics.graphics.Text;
import com.codeforall.online.simplegraphics.pictures.Picture;
import field.Field;
import fruits.Fruit;
import snake.Snake;

import java.io.IOException;


public class Game {

    private Field field;
    private Snake snake;
    private Fruit[] fruits;
    private Fruit fruit;
    private Direction direction;
    private int threadSleepUnits = 200;
    private int score = 0;
    private Text scoreDisplay;
    private Text highScoreDisplay;
    private int scoreToReach = 10;
    private String headDirectionPath;
    private int highestScore;
    private MyHighScore highScore;


    public Game(Field field, Snake snake) {
        scoreDisplay = new Text(10,30,"Score: " + score);
        scoreDisplay.draw();
        direction = Direction.DOWN;
        this.field = field;
        this.snake = snake;
        createFruits();
        highScore = new MyHighScore();
        highestScore = highScore.loadHighScore();
        highScoreDisplay = new Text(10,10,"High Score: " + highestScore);
        highScoreDisplay.draw();

    }

    public void createFruits() {
        fruits = new Fruit[1];

        for (int i = 0; i < fruits.length; i++) {
            fruits[i] = new Fruit(field);
        }

    }

    public boolean checkCollisionWithFruits() {
        for (Fruit f : fruits) {
            if (snake.getRow() == f.getRow() && snake.getCol() == f.getCol()) {
                fruit = f;
                return true;
            }
        }

         return false;
    }

    public void deleteFruit () {
           for (int i = 0; i < fruits.length; i++) {

               if (snake.getRow() == fruits[i].getRow() && snake.getCol() == fruits[i].getCol()) {
                   fruit.getFruitPic().delete();
                   updateScore(fruit.getFruitScore());
                   fruits[i] = new Fruit(field);
               }

           }

    }

    private void updateScore(int scoreToAdd){
        System.out.println("updates core");
        score += scoreToAdd;
        System.out.println(score);
        scoreDisplay.setText("Score: " + score);
        updateSpeed();
    }

    private void updateSpeed(){

        if(score > scoreToReach) {
            scoreToReach = scoreToReach*2;
            if(threadSleepUnits > 50) {
                threadSleepUnits = threadSleepUnits-50;
                System.out.println("thread: "+threadSleepUnits);
            }
        }

    }

    public void start() throws InterruptedException, IOException {

        while (!snake.isCrashed()){

            Thread.sleep(threadSleepUnits);

            moveInDirection();

        }


        if(score > highestScore) {
            highScore.saveHighScore(score);
        }

        Picture gameOverPic = new Picture(400,175,"resources/GameOver.png");
        gameOverPic.draw();

    }

    private void moveInDirection(){

        switch (direction) {

            case UP:
                snake.moveUp();
                break;
            case DOWN:
                snake.moveDown();
                break;
            case RIGHT:
                snake.moveRight();
                break;
            case LEFT:
                snake.moveLeft();
                break;

        }

        eatingFruitAndGrowing();

    }

    private void eatingFruitAndGrowing(){
        if(checkCollisionWithFruits()){
            snake.growSnake();
            deleteFruit();
        }
    }

    public void setDirection(Direction direction){
        this.direction = direction;
        setHeadDirectionPath();
        snake.redrawHead(headDirectionPath);
    }

    private void setHeadDirectionPath(){
        switch (direction){

            case UP:
                headDirectionPath = "resources/snake (3).png";
                break;

            case DOWN:
                headDirectionPath = "resources/snake (1).png";
                break;

            case RIGHT:
                headDirectionPath = "resources/snake (2).png";
                break;

            case LEFT:
                headDirectionPath = "resources/snake (4).png";
                break;
        }

    }


}


