package graf.grafika1;

import javafx.application.Application;
import javafx.event.EventHandler;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.input.KeyEvent;
import javafx.scene.paint.Color;
import javafx.scene.transform.Translate;
import javafx.stage.Stage;

import java.io.IOException;
import java.util.List;

public class HelloApplication extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        FileReader reader = new FileReader();
        final List<Cube> cubeList = reader.getCubeList();
        Group root = new Group();
        Scene scene = new Scene(root, 700, 700);
        root.setTranslateX(scene.getWidth() / 2);
        root.setTranslateY(scene.getHeight() / 2);
        for (Cube cube : cubeList) {
            cube.addToScene(root);
        }
        stage.setScene(scene);
        stage.show();
        List<Cube> finalCubeList = cubeList;
        scene.setOnKeyPressed(new EventHandler<KeyEvent>() {
            @Override
            public void handle(KeyEvent event) {
                switch (event.getCode()) {
                    case W:
                        root.getChildren().clear();
                        for (Cube cube : cubeList) {
                            cube.moveForwards();
                            cube.addToScene(root);
                        }
                        stage.setScene(scene);
                        stage.show();
                        break;
                    case S:
                        root.getChildren().clear();
                        for (Cube cube : cubeList) {
                            cube.moveBackwards();
                            cube.addToScene(root);
                        }
                        stage.setScene(scene);
                        stage.show();
                        break;
                    case A:
                        root.getChildren().clear();
                        for (Cube cube : cubeList) {
                            cube.moveLeft();
                            cube.addToScene(root);
                        }
                        stage.setScene(scene);
                        stage.show();
                        break;
                    case D:
                        root.getChildren().clear();
                        for(Cube cube: cubeList){
                            cube.moveRight();
                            cube.addToScene(root);
                        }
                        stage.setScene(scene);
                        stage.show(); break;
                    case Q:
                        root.getChildren().clear();
                        for (Cube cube : cubeList) {
                            cube.moveDown();
                            cube.addToScene(root);
                        }
                        stage.setScene(scene);
                        stage.show();
                        break;
                    case E:
                        root.getChildren().clear();
                        for (Cube cube : cubeList) {
                            cube.moveUp();
                            cube.addToScene(root);
                        }
                        stage.setScene(scene);
                        stage.show();
                        break;
                    case TAB:
                        root.getChildren().clear();
                        for (Cube cube : cubeList) {
                            cube.scaleUP();
                            cube.addToScene(root);
                        }
                        stage.setScene(scene);
                        stage.show();
                        break;
                    case I:
                        root.getChildren().clear();
                        for (Cube cube : cubeList) {
                            cube.rotateZ();
                            cube.addToScene(root);
                        }
                        stage.setScene(scene);
                        stage.show();
                        break;
                    case K:
                        root.getChildren().clear();
                        for (Cube cube : cubeList) {
                            cube.rotateZBack();
                            cube.addToScene(root);
                        }
                        stage.setScene(scene);
                        stage.show();
                        break;
                    case J:
                        root.getChildren().clear();
                        for (Cube cube : cubeList) {
                            cube.rotateXBack();
                            cube.addToScene(root);
                        }
                        stage.setScene(scene);
                        stage.show();
                        break;
                    case L:
                        root.getChildren().clear();
                        for (Cube cube : cubeList) {
                            cube.rotateX();
                            cube.addToScene(root);
                        }
                        stage.setScene(scene);
                        stage.show();
                        break;
                    case U:
                        root.getChildren().clear();
                        for (Cube cube : cubeList) {
                            cube.rotateYBack();
                            cube.addToScene(root);
                        }
                        stage.setScene(scene);
                        stage.show();
                        break;
                    case O:
                        root.getChildren().clear();
                        for (Cube cube : cubeList) {
                            cube.rotateY();
                            cube.addToScene(root);
                        }
                        stage.setScene(scene);
                        stage.show();
                        break;
                }
            }
        });
        scene.setOnKeyReleased(new EventHandler<KeyEvent>() {
            @Override
            public void handle(KeyEvent event) {
                switch (event.getCode()) {
                    case TAB:
                        root.getChildren().clear();
                        for (Cube cube : cubeList) {
                            cube.scaleDown();
                            cube.addToScene(root);
                        }
                        stage.setScene(scene);
                        stage.show();
                        break;
                }
            }});
        scene.setFill(Color.web("#6C6D74"));
        stage.setTitle("Kamera");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}