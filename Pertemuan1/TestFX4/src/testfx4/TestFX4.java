package testfx4;

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.stage.Stage;

public class TestFX4 extends Application {

    private String path;
    
    @Override
    public void start(Stage primaryStage) {
        Group root = new Group();
       /* String path = ;*/
        Image image1 = new Image (getClass().getResource(path).toString());

        Scene scene = new Scene(root, 300, 250);
       // root.getChildren().add(imageView);
        ImageView imageView = new ImageView(image1);
        imageView.setImage(image1);


        primaryStage.setTitle("Hello World!");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
    
}
