package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

public class Pantalla_Inicial {

    @FXML
    private ImageView UserImageView;
    @FXML
    private RadioButton MaleGenderRB;
    @FXML
    private RadioButton FemaleGenderRB;
    @FXML
    private RadioButton SquirtleRB;
    @FXML
    private RadioButton CharmenderRB;
    @FXML
    private  RadioButton BulbasaurRB;
    @FXML
    private TextField UserNameTxtField;
    @FXML
    private ImageView SquirtleIView;
    private Motor motor;



    public void setFemaleUserImage(ActionEvent actionEvent)
    {
        Image girl = new Image ("/Images/FemaleUser.png");
        UserImageView.setImage(girl);
        MaleGenderRB.setSelected(false);
    }

    public void setMaleUserImage(ActionEvent actionEvent)
    {
        Image boy = new Image("/Images/MaleUser.png");
        UserImageView.setImage(boy);
        FemaleGenderRB.setSelected(false);
    }

    public void SquirtleSelectedRB(ActionEvent actionEvent)
    {
        CharmenderRB.setSelected(false);
        BulbasaurRB.setSelected(false);
    }

    public void CharmenderSelectedRB(ActionEvent actionEvent)
    {
        SquirtleRB.setSelected(false);
        BulbasaurRB.setSelected(false);
    }

    public void BulbasaurSelectedRB(ActionEvent actionEvent)
    {
        CharmenderRB.setSelected(false);
        SquirtleRB.setSelected(false);
    }

    public void StartGameBT(ActionEvent event)
    {
        String UserName = UserNameTxtField.getText();
        String gender = "";
        if(MaleGenderRB.isSelected())
        {
            gender = "MaleUser";
        }
        else
        {
            gender ="FemaleUser";
        }
        String StartedPokemon = "";
        if (BulbasaurRB.isSelected())
        {
            StartedPokemon = "Bulbasaur";
        }
        if(CharmenderRB.isSelected())
        {
            StartedPokemon = "Charmender";
        }
        else
        {
            StartedPokemon = "Squirtle";
        }
        motor.setStartingData(UserName,gender,StartedPokemon);
        motor.showSelectArea(event);

    }
    public void receiveMotorInstance(Motor m)
    {
        this.motor = m;
    }
    //public void

}
