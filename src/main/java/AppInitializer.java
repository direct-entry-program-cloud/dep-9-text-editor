import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.paint.Color;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

import java.io.IOException;
import java.net.URL;

public class AppInitializer extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws IOException {

        URL splashResource = this.getClass().getResource("view/splashScreenForm.fxml");
        Parent splashContainer = FXMLLoader.load(splashResource);
        Scene splashScene = new Scene(splashContainer);
        splashScene.setFill(Color.TRANSPARENT);
        primaryStage.initStyle(StageStyle.TRANSPARENT);
        primaryStage.setScene(splashScene);
        primaryStage.show();
        primaryStage.centerOnScreen();



    }
}
