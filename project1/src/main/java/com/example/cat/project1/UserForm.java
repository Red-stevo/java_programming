package com.example.cat.project1;

import com.sun.glass.ui.Menu;
import javafx.application.Application;
import javafx.event.Event;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.PasswordField;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.StackPane;
import javafx.scene.text.Text;
import javafx.stage.Stage;
import org.springframework.stereotype.Component;


import java.awt.*;
@Component
public class UserForm extends Application implements EventHandler {

    public static void main(String[] args) {
        launch();
    }

    @Override
    public void start(Stage stage) throws Exception {

        stage.setTitle("Great Window");
        stage.setFullScreen(true);
        StackPane stackPane = new StackPane();
        stackPane.getChildren().add(combineTheScenePeaces());
        Scene scene = new Scene(stackPane);

        stage.setScene(scene);
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
        hBox.getChildren().addAll(submit, reset,close);
        return hBox;
    }

    @Override
    public void handle(Event event) {
        if(event.getSource() == submit)
        {
            //end data to the database.
        } else if (event.getSource() == reset) {
            //reset data in the text-fields.
        }
        else
        {
            //exit the code.
        }
    }

    public VBox pageLayout()
    {
        VBox vBox = new VBox();

        Label heading = new Label("Register Form");

        vBox.getChildren().addAll(heading, simple("Name :"), simple("UserName : "), password("Password : "), password("Confirm Password : "), simple("Email"), simple("Phone NUmber : "), simple("Address : "));
        return vBox;
    }

    public HBox simple(String title)
    {
        HBox hBox = new HBox();

        Label label = new Label(title);
        TextField textField = new TextField();
        HBox.setMargin(label, new Insets(10));
        HBox.setMargin(textField, new Insets(10));

        hBox.getChildren().addAll(label, textField);
        return hBox;
    }

    public HBox password(String title)
    {
        HBox hBox = new HBox();

        Label label = new Label(title);
        TextField textField = new PasswordField();

        hBox.getChildren().addAll(label, textField);

        HBox.setMargin(label, new Insets(10));
        return hBox;
    }

    public  VBox combineTheScenePeaces()
    {
        VBox vBox = new VBox();
        vBox.getChildren().addAll(pageLayout(),pageLayout(),buttons());
        return vBox;
    }
}
