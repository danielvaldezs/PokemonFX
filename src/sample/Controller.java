package sample;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.event.ActionEvent;
import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;



public class Controller {

    public Button PlayBT;
    private Motor motor;
    private Object MediaPlayer;


    public void receiveMotorInstance(Motor m) {
        this.motor = m;
    }

    public void PlayBT(ActionEvent event) {


//        motor.showPantalla_Inicial(event);
motor.showPantalla_Inicial(event);


    }

}
