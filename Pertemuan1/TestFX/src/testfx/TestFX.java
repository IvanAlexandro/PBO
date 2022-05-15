package testfx;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.paint.Color;
import javafx.stage.Stage;


public class TestFX extends Application {
    
    @Override
    public void start(Stage primaryStage) {
        Button btn = new Button();
        Button tombol = new Button();
        tombol.setText("Selamat malam");

        btn.setText("Say 'Hello World'");
        btn.setOnAction(new EventHandler<ActionEvent>() {
      
            @Override
            public void handle(ActionEvent event) {
                System.out.println("Hello World!");
            }
        });
        
        //StackPane root = new StackPane();
        //TilePane root = new TilePane();
        //VBox root = new VBox();
        //HBox root = new HBox();
        //AnchorPane root = new AnchorPane();
        Group root = new Group();
        root.getChildren().addAll(btn,tombol);
        tombol.setLayoutY(100);
        tombol.setLayoutX(200);
        Scene scene = new Scene(root, 700, 350, Color.rgb(255, 255, 20, 0.9));
        
        primaryStage.setTitle("Hello World!");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    
    public static void main(String[] args) {
        launch(args);
    }
    
}
