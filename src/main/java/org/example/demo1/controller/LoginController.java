package org.example.demo1.controller;

import javafx.animation.PauseTransition;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;
import javafx.util.Duration;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class LoginController implements Initializable {
    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        Loading.setVisible(false);
    }

    @FXML
    private ImageView Loading;

    @FXML
    private AnchorPane LoginPage;

    @FXML
    void GoToSignUp(ActionEvent event) throws IOException {
        LoginPage.getScene().getWindow().hide();

        Parent root = FXMLLoader.load(getClass().getResource("/fxml/SignUp.fxml"));
        Scene scene = new Scene(root,600,500);
        Stage stage = new Stage();
        stage.setScene(scene);
        stage.setResizable(false);
        stage.show();

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
