/*
 * This program was written by Kyle Martin on 7/22/2021 for Java Programming Principles 2 during Summer Session 2
 * at Southwestern College, Kansas.
 *
 * IMPORTANT: Normally I would not place a bunch of comments in my code describing what my code is doing as I like to
 * have code that is written in a manner to be understandable while reading it. Though, do to the grading rubric I will
 * explain my code.
 *
 * This program was created to fix a error in sudo code
 * See Chapter 12 Find the Error Question 5.
 */

import javafx.application.Application;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.stage.Stage;

public class QuestionFive extends Application {
    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage stage) throws Exception {
        Image image = new Image("file:HotAirBalloon.png"); // added for context not apart of exercise
        ImageView myImageView = new ImageView(image); // added for context not apart of exercise
        myImageView.setFitWidth(100); // corrected error to setFitWidth
        myImageView.setFitHeight(100); // corrected error to setFitHeight
    }
}
