package sample;

import javafx.fxml.FXML;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

public class SelectArea {

    @FXML
    private ImageView UserImageView;
    @FXML
    private ImageView PokemonImageView;
    private Motor motor;

    public void receiveMotorInstance(Motor m)
    {
        this.motor = m;
    }

    public void receiveInitialData(String StartedPokemon, String gender)
    {
        Image PartPokemon = new Image("/Images/" + StartedPokemon + "Face.png");
        PokemonImageView.setImage(PartPokemon);
        Image UserGAvatar = new Image("/Images/" + gender + "Face.png");
        UserImageView.setImage(UserGAvatar);

    }
}
