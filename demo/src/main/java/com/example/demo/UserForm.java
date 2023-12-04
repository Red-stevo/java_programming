package com.example.demo;


import javafx.application.Application;
import javafx.event.Event;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
//import java.awt.*;
public class UserForm extends Application implements EventHandler {


    private  Stage mystage;
    Label label;
    TextField textField;
    public void run() {
        launch();
    }

    @Override
    public void start(Stage stage) throws Exception {

        stage.setTitle("Great Window");
        //stage.setFullScreen(true);
        stage.setMaximized(true);
        StackPane stackPane = new StackPane();
        stackPane.getChildren().add(combineTheScenePeaces());
        //Pane pane = new Pane(stackPane);
        Scene scene = new Scene(stackPane);
        mystage = stage;
        mystage.setScene(scene);
        stage.show();

    }

    Button submit,reset,close;
    //create the bottom buttons
    public HBox buttons(){
        HBox hBox = new HBox();
        submit = new Button("Submit");
        submit.setOnAction(this);
        close = new Button("Close");
        close.setOnAction(this);
        reset = new Button("Reset");
        reset.setOnAction(this);
        //reset.setBackground(Color.blue);
        hBox.setAlignment(Pos.CENTER);
        hBox.setSpacing(10.0);
        close.setMinWidth(200);
        reset.setMinWidth(200);
        submit.setMinWidth(200);

        HBox.getHgrow(submit);
        HBox.getHgrow(close);
        HBox.getHgrow(reset);


        hBox.getChildren().addAll(submit, reset,close);
        return hBox;
    }

    @Override
    public void handle(Event event) {
        if(event.getSource() == submit)
        {
            //end data to the database.
        } else if (event.getSource() == reset) {
            mystage.setTitle("Great Window");
            //stage.setFullScreen(true);
            mystage.setMaximized(true);
            StackPane stackPane = new StackPane();
            stackPane.getChildren().add(combineTheScenePeaces());
            //Pane pane = new Pane(stackPane);
            Scene scene = new Scene(stackPane);
            mystage.setScene(scene);
            mystage.show();
        }
        else
        {
            mystage.close();
        }
    }

    public VBox pageLayout()
    {
        VBox vBox = new VBox();

        Label heading = new Label("Register Form");
        //heading.setAlignment(Pos.CENTER);

        vBox.getChildren().addAll(heading, simple("Name :"), simple("UserName : "), password("Password : "), password("Confirm Password : "), simple("Email"), simple("Phone NUmber : "), simple("Address : "));
        vBox.setAlignment(Pos.CENTER_RIGHT);

        return vBox;
    }

    public HBox simple(String title)
    {
        HBox hBox = new HBox();

        label = new Label(title);
        textField = new TextField();
        HBox.setMargin(label, new Insets(10));
        HBox.setMargin(textField, new Insets(10));
        label.setAlignment(Pos.CENTER_RIGHT);
        label.setMinWidth(200);
        textField.setAlignment(Pos.CENTER_RIGHT);
        textField.setMinWidth(200);
        hBox.setSpacing(10.0);
        label.setMaxWidth(300);
        textField.setMaxWidth(300);
        HBox.getHgrow(textField);
        HBox.getHgrow(label);

        hBox.setAlignment(Pos.TOP_CENTER);
        hBox.getChildren().addAll(label, textField);
        return hBox;
    }

    public HBox password(String title)
    {
        HBox hBox = new HBox();

        label = new Label(title);
        textField = new PasswordField();
        HBox.setMargin(label, new Insets(10));
        HBox.setMargin(textField, new Insets(10));
        label.setAlignment(Pos.CENTER_RIGHT);
        label.setMinWidth(200);
        textField.setAlignment(Pos.CENTER_RIGHT);
        textField.setMinWidth(200);
        hBox.setSpacing(10.0);
        label.setMaxWidth(300);
        textField.setMaxWidth(300);
        HBox.getHgrow(textField);
        HBox.getHgrow(label);

        hBox.setAlignment(Pos.TOP_CENTER);
        hBox.getChildren().addAll(label, textField);
        return hBox;
    }

    public  VBox combineTheScenePeaces()
    {
        VBox vBox = new VBox();
        vBox.getChildren().addAll(pageLayout(),buttons());
        return vBox;
    }
}