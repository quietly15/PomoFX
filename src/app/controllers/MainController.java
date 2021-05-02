package app.controllers;

import com.jfoenix.controls.JFXButton;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.image.ImageView;

import java.net.URL;
import java.util.ResourceBundle;

public class MainController implements Initializable {

    @FXML
    private Label timer;

    @FXML
    private Label pomodoroLabel;

    @FXML
    private ImageView settingsImage;

    @FXML
    private ImageView infoImage;

    @FXML
    private JFXButton startButton;

    @FXML
    private JFXButton resetButton;

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {

    }
}
