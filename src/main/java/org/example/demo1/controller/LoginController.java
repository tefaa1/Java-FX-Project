package org.example.demo1.controller;

import javafx.animation.PauseTransition;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.image.ImageView;
import javafx.util.Duration;

import java.net.URL;
import java.util.ResourceBundle;

public class LoginController implements Initializable {

    @FXML
    private ImageView Loading;

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        Loading.setVisible(false);
    }


    @FXML
    void LoginAction(ActionEvent event) {
        Loading.setVisible(true);
        PauseTransition pauseTransition = new PauseTransition();
        pauseTransition.setDuration(Duration.seconds(3));
        pauseTransition.setOnFinished(
                ev -> System.out.println("done")
        );
        pauseTransition.play();
    }
}
