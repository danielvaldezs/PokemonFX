package sample;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
public class Main extends Application {

    private Motor motor = new Motor();

    @Override
    public void start(Stage primaryStage) throws Exception{
        FXMLLoader loader = new FXMLLoader(getClass().getResource("sample.fxml"));
        Parent root = loader.load();
        Controller controller = loader.<Controller>getController();
        controller.receiveMotorInstance(motor);

        primaryStage.setTitle("Pokemon Final");
        primaryStage.setScene(new Scene(root, 570, 460));
        primaryStage.show();
    }


    public static void main(String[] args) {
        launch(args);
    }
}
