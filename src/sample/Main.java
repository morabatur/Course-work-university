package sample;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Main extends Application {

    public static Stage homeStage;

    private  Parent root;
    @Override
    public void start(Stage primaryStage) throws Exception {
        homeStage = primaryStage;
        root = FXMLLoader.load(getClass().getResource("MainWindow.fxml"));
        primaryStage.setTitle("");
        primaryStage.setScene(new Scene(root, 600, 400));
        primaryStage.setResizable(false);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
