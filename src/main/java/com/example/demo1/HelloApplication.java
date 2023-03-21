package com.example.demo1;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXMLLoader;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.image.ImageView;
import javafx.scene.input.KeyCode;
import javafx.scene.input.MouseButton;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Rectangle;
import javafx.scene.text.Text;
import javafx.stage.Stage;

import java.io.IOException;

public class HelloApplication extends Application {
    private CirclePane circlePane = new CirclePane();//CirclePane Class is in Bottom of the Program
    //Below Objects are used in Listener Program
    private Circle circle = new Circle(60);
    private Rectangle rectangle = new Rectangle(120, 120);
    private StackPane pane = new StackPane();
    @Override
    public void start(Stage primaryStage) throws IOException {
        //Action Based Event Handling
        /*
        HBox pane = new HBox(10);
        pane.setAlignment(Pos.CENTER);
        Button btOK = new Button("OK");
        Button btCancel = new Button("Cancel");
        OKHandlerClass handler1 = new OKHandlerClass();
        btOK.setOnAction(handler1);
        CancelHandlerClass handler2 = new CancelHandlerClass();
        btCancel.setOnAction(handler2);
        pane.getChildren().addAll(btOK, btCancel);

        Scene scene = new Scene(pane);
        primaryStage.setTitle("HandleEvent");
        primaryStage.setScene(scene);
        primaryStage.show();
         */

        //Using Functions in Handling Events
        /*
        HBox hBox = new HBox();
        hBox.setSpacing(10);
        hBox.setAlignment(Pos.CENTER);
        Button btEnlarge = new Button("Enlarge");
        Button btShrink = new Button("Shrink");
        hBox.getChildren().add(btEnlarge);
        hBox.getChildren().add(btShrink);

        btEnlarge.setOnAction(new EnlargeHandler());
        btShrink.setOnAction(new ShrinkHandler());
        BorderPane borderPane = new BorderPane();
        borderPane.setCenter(circlePane);//Object is Created before this class
        borderPane.setBottom(hBox);
        BorderPane.setAlignment(hBox, Pos.CENTER);

        Scene scene1 = new Scene(borderPane, 200, 150);
        Stage stage = new Stage();
        stage.setTitle("ControlCircle");
        stage.setScene(scene1);
        stage.show();
        */

        //In above program we used inner class to handle event but now we are going to use anonymous inner class(special kind of inner class)
        /*
        HBox hBox = new HBox();
        hBox.setSpacing(10);
        hBox.setAlignment(Pos.CENTER);
        Button btEnlarge = new Button("Enlarge");
        Button btShrink = new Button("Shrink");
        hBox.getChildren().add(btEnlarge);
        hBox.getChildren().add(btShrink);

        btEnlarge.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent e) {
                circlePane.enlarge();
            }
        });

        btShrink.setOnAction(new EventHandler<ActionEvent>() {
        @Override
        public void handle(ActionEvent e) {
            circlePane.shrink();
        }
        });

        BorderPane borderPane = new BorderPane();
        borderPane.setCenter(circlePane);//Object is Created before this class
        borderPane.setBottom(hBox);
        BorderPane.setAlignment(hBox, Pos.CENTER);

        Scene scene1 = new Scene(borderPane, 200, 150);
        Stage stage = new Stage();
        stage.setTitle("ControlCircle");
        stage.setScene(scene1);
        stage.show();
         */

        //Same above program is replaces anonymous inner class with Lambda expression
        /*
        HBox hBox = new HBox();
        hBox.setSpacing(10);
        hBox.setAlignment(Pos.CENTER);
        Button btEnlarge = new Button("Enlarge");
        Button btShrink = new Button("Shrink");
        hBox.getChildren().add(btEnlarge);
        hBox.getChildren().add(btShrink);

        btEnlarge.setOnAction(e -> { //expression before can be in many ways
                circlePane.enlarge(); //like e,(e),(ActionEvent e)
                                        // after arrow it can be like this e -> without curely braces
            }
        );

        btShrink.setOnAction(e -> {
                circlePane.shrink();
            });

        BorderPane borderPane = new BorderPane();
        borderPane.setCenter(circlePane);//Object is Created before this class
        borderPane.setBottom(hBox);
        BorderPane.setAlignment(hBox, Pos.CENTER);

        Scene scene1 = new Scene(borderPane, 200, 150);
        Stage stage = new Stage();
        stage.setTitle("ControlCircle");
        stage.setScene(scene1);
        stage.show();
        */

        //MouseEvent Handling
        /*
        Pane pane = new Pane();
        Text text = new Text(20, 20, "Programming is fun");
        pane.getChildren().addAll(text);
        text.setOnMouseDragged(e ->{
                text.setX(e.getX());
                text.setY(e.getY());
        });

        // Create a scene and place it in the stage
        Scene scene = new Scene(pane, 300, 100);
        primaryStage.setTitle("MouseEvent"); // Set the stage title
        primaryStage.setScene(scene); // Place the scene in the stage
        primaryStage.show();
        */

        //KeyEvent Handling
        /*
        Pane pane = new Pane();
        Text text = new Text(20, 20, "A");

        pane.getChildren().add(text);
        text.setOnKeyPressed(e ->{
                switch (e.getCode()) {
            case DOWN: text.setY(text.getY() + 10); break;
            case UP: text.setY(text.getY() - 10); break;
            case LEFT: text.setX(text.getX() - 10); break;
            case RIGHT: text.setX(text.getX() + 10); break;
            default:
                if (e.getText().length() > 0)
                    text.setText(e.getText());
                }
                });

        Scene scene = new Scene(pane,100,100);
        primaryStage.setTitle("KeyEvent");
        primaryStage.setScene(scene);
        primaryStage.show();
        text.requestFocus();
         */

        //Above Circle program with Key and Mouse Event Handling
        /*
        HBox hBox = new HBox();
        hBox.setSpacing(10);
        hBox.setAlignment(Pos.CENTER);
        Button btEnlarge = new Button("Enlarge");
        Button btShrink = new Button("Shrink");
        hBox.getChildren().add(btEnlarge);
        hBox.getChildren().add(btShrink);

        btEnlarge.setOnAction(e -> circlePane.enlarge());
        btShrink.setOnAction(e -> circlePane.shrink());

        BorderPane borderPane = new BorderPane();
        borderPane.setCenter(circlePane);
        borderPane.setBottom(hBox);
        BorderPane.setAlignment(hBox, Pos.CENTER);

        Scene scene = new Scene(borderPane, 200, 150);
        primaryStage.setTitle("ControlCircle");
        primaryStage.setScene(scene);
        primaryStage.show();

        borderPane.requestFocus();

        circlePane.setOnMouseClicked(e -> {
            if (e.getButton() == MouseButton.PRIMARY) {
                CirclePane.enlarge();
            } else if (e.getButton() == MouseButton.SECONDARY) {
                circlePane.shrink();
            }
        });

        scene.setOnKeyPressed(e -> {

            if (e.getCode() == KeyCode.UP) {
                circlePane.enlarge();
            } else if (e.getCode() == KeyCode.DOWN) {
                circlePane.shrink();
            }
        });
        */

        //n instance of Observable is known as an observable object, which contains the
        //addListener(InvalidationListener listener) method for adding a listener.
        //ov is observable value which listens on height and width property of pane
        //if ov changes by lambda expression a function is called
        /*
        circle.setFill(Color.GRAY);
        rectangle.setFill(Color.WHITE);
        rectangle.setStroke(Color.BLACK);
        pane.getChildren().addAll(rectangle, circle);
        Scene scene = new Scene(pane, 140, 140);
        primaryStage.setTitle("ResizableCircleRectangle");
        primaryStage.setScene(scene);
        primaryStage.show();

        pane.widthProperty().addListener(ov -> resize());
        pane.heightProperty().addListener(ov -> resize());
        */
        Pane pane = new Pane();

        // Add an image view and add it to pane
        ImageView imageView = new ImageView("");
        pane.getChildren().add(imageView);
    }
    private void resize() {
        .
        double length = Math.min(pane.getWidth(), pane.getHeight());
        circle.setRadius(length / 2 - 15);
        rectangle.setWidth(length - 30);
        rectangle.setHeight(length - 30);
    }


    //Handlers are defined inside becoz they use object created and used inside HelloApplication class
class EnlargeHandler implements EventHandler<ActionEvent> {
@Override
public void handle(ActionEvent e) {
            circlePane.enlarge();
          }
}
class ShrinkHandler implements EventHandler<ActionEvent> {
    @Override
    public void handle(ActionEvent e) {
        circlePane.shrink();
    }
}
public static void main(String[] args) {
    launch();
}
    }//END OF HelloApplication Class

class OKHandlerClass implements EventHandler<ActionEvent> {
@Override
public void handle(ActionEvent e)
{
    System.out.println("OK button clicked");
}
    }

class CancelHandlerClass implements EventHandler<ActionEvent> {
@Override
public void handle(ActionEvent e)
{
    System.out.println("Cancel button clicked");
}
    }

class CirclePane extends StackPane {
private static Circle circle = new Circle(50);

public CirclePane()
{
    getChildren().add(circle);
    circle.setStroke(Color.BLACK);
    circle.setFill(Color.WHITE);

}
public static void enlarge()
{
    circle.setRadius(circle.getRadius() + 2);
}

public void shrink()
{
    double s = (circle.getRadius() > 2) ? (circle.getRadius() - 2) : (circle.getRadius());
    circle.setRadius(s);
}

    }
