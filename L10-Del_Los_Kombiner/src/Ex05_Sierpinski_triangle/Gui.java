package Ex05_Sierpinski_triangle;

import javafx.application.Application;
import javafx.geometry.HPos;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.*;
import javafx.scene.paint.Paint;
import javafx.scene.shape.Polygon;
import javafx.stage.Stage;
import javafx.scene.paint.Color;

import java.awt.*;

public class Gui extends Application {

    @Override
    public void start(Stage stage) {
        stage.setTitle("Sierpinski Triangle");
        GridPane pane = new GridPane();
        this.initContent(pane);
        Scene scene = new Scene(pane);
        stage.setScene(scene);
        stage.show();

    }

    // -------------------------------------------------------------------------

    private final double drawPaneHeight = 700;
    private final double drawPaneWidth = 700;
    Label lblorder = new Label("Order: 0");
    private final double startX = 20;
    private final double startY = drawPaneHeight - startX;
    private final double length = drawPaneWidth - (startX*2);

    private void initContent(GridPane pane) {
        // show or hide grid lines
        pane.setGridLinesVisible(false);

        // set padding of the pane
        pane.setPadding(new Insets(20));
        // set horizontal gap between components
        pane.setHgap(10);
        // set vertical gap between components
        pane.setVgap(10);

        Pane drawPane = new Pane();
        drawPane.setPrefSize(drawPaneWidth, drawPaneHeight);
        drawPane.setBackground(new Background(new BackgroundFill(Color.WHITE, CornerRadii.EMPTY, Insets.EMPTY)));
        pane.add(drawPane, 0,0,1,2);
        this.draw(drawPane, 20,drawPaneHeight - 20, drawPaneWidth-40, 0, 0);

        Button btnDecrease = new Button("<--");
        btnDecrease.setPrefWidth(50);
        pane.add(btnDecrease, 0, 2);
        GridPane.setHalignment(btnDecrease, HPos.CENTER);
        GridPane.setMargin(btnDecrease,new Insets(0,150,0,0));


        pane.add(lblorder, 0,2);
        GridPane.setHalignment(lblorder, HPos.CENTER);

        Button btnIncrease = new Button("-->");
        btnIncrease.setPrefWidth(50);
        pane.add(btnIncrease, 0, 2);
        GridPane.setHalignment(btnIncrease, HPos.CENTER);
        GridPane.setMargin(btnIncrease,new Insets(0,0,0,150));

        // connect a method to the button
        btnDecrease.setOnAction(event -> this.decreaseOrder(drawPane));
        btnIncrease.setOnAction(event -> this.increaseOrder(drawPane));
    }

    // -------------------------------------------------------------------------
    private void draw(Pane pane, double x, double y, double l, double depth, int order){
        if(depth == order){
            triangle(pane, x, y, l);
        } else {
            triangle(pane, x, y, l);
            draw(pane, x, y, l/2, depth + 1, order);
            draw(pane, x + l/4, y - Math.sin(Math.PI/3) * l/2, l/2, depth + 1, order);
            draw(pane, x + l/2, y, l/2, depth + 1, order);
        }
    }

    public void decreaseOrder(Pane pane){
        int order = Integer.parseInt(lblorder.getText().split(" ")[1]);
        if(order != 0){
            pane.getChildren().clear();
            order--;
            draw(pane, startX, startY, length, 0, order);
            lblorder.setText("Order: " + order);
        }
    }

    public void increaseOrder(Pane pane){
        int order = Integer.parseInt(lblorder.getText().split(" ")[1]);
        order++;
        pane.getChildren().clear();
        draw(pane, startX, startY, length, 0, order);
        lblorder.setText("Order: " + order);
    }

    public void triangle(Pane pane, double x, double y, double l){
        Polygon polygon = new Polygon(x, y,
                                            x + l/2, y-Math.sin(Math.PI/3) * l,
                                            x + l, y);
        polygon.setFill(Color.TRANSPARENT);
        polygon.setStroke(Color.BLACK);
        pane.getChildren().add(polygon);
    }



}