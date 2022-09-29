//016_A[ ▶[ vsCode JAVA_JavaFX Extensions_프로그래밍 실습 ]_개발자_오세빈_

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;

import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;

import javafx.stage.Stage;

public class App extends Application {

    @Override
    public void start(Stage primaryStage) {

        Button btn = new Button();
        btn.setText("WATO, We Are The One !!!");

        btn.setOnAction(new EventHandler<ActionEvent>() {

            @Override
            public void handle(ActionEvent event) {
                System.out.println("Self-confidence is the first requisite to great undertakings");

            }

        });

        StackPane root = new StackPane();
        root.getChildren().add(btn);

        Scene scene = new Scene(root, 300, 250);

        primaryStage.setTitle("Java JAZZ!");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);

    }
}

// 저장 CTRL+S 후, CTRL+F5 실행 !
