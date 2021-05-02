package app.controllers;

import com.jfoenix.controls.JFXButton;
import javafx.animation.KeyFrame;
import javafx.animation.Timeline;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.util.Duration;

public class TimerMain {

    private int second = 0;
    private int userMin;

    public TimerMain(int userMin) {
        this.userMin = userMin;
    }

    public void timerStart (Label timer, JFXButton startButton) {

        int timeOfRun = userMin * 60;

        timer.setText(String.format("%d:00", userMin));

        startButton.setOnMouseClicked(mouseEvent -> {

            startButton.setText("Pause");

            Timeline timeline = new Timeline(new KeyFrame(Duration.seconds(1), event -> {

                switch (second) {
                    case 9, 8, 7, 6, 5, 4, 3, 2, 1 ->
                            timer.setText(String.format("%d:0%d", userMin, second));

                    case 0 -> {
                        userMin--;
                        second = 59;

                        timer.setText(String.format("%d:%d", userMin, second));
                    }

                    default -> timer.setText(String.format("%d:%d", userMin, second));
                }

                second--;
            }));


            if (userMin == 0) timeline.setCycleCount(second + 1);
            else timeline.setCycleCount(timeOfRun);

            timeline.setOnFinished(event -> timer.setText("kk"));
            timeline.play();
        });
    }

    private void timerPause(Timeline timeline) {
        timeline.pause();
    }
}

