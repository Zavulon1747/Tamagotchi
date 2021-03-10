package sample;

import javafx.animation.KeyFrame;
import javafx.animation.Timeline;
import javafx.application.Application;
import javafx.beans.binding.Bindings;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;
import javafx.stage.Stage;
import javafx.util.Duration;

import java.util.HashMap;
import java.util.Timer;
import java.util.TimerTask;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception{

        // Creating Grid
        GridPane grid = new GridPane();
        grid.setAlignment(Pos.CENTER);
        grid.setHgap(10);
        grid.setVgap(10);

        grid.setPadding(new Insets(25, 25, 25, 25));

        Tamagotchi tamagotchi = new Tamagotchi("p");


        Text tamagotchiNameTitle = new Text("Tamagotchi Name: "+tamagotchi.getName());
        tamagotchiNameTitle.setFont(Font.font(Font.getFontNames().get(1), FontWeight.NORMAL, 24));

        grid.add(tamagotchiNameTitle, 1, 0, 2, 1);

        TextField nameTF = new TextField();
        grid.add(nameTF, 1, 1);

        Button setNameButton = new Button("Apply");
        grid.add(setNameButton, 2, 1);


        // Stats

        Text statsTitle = new Text("Tamagotchi Stats");
        statsTitle.setFont(Font.font(Font.getFontNames().get(1), FontWeight.NORMAL, 20));

        grid.add(statsTitle, 1,3,2,1);


        Label statFullness = new Label("Fullness: "+tamagotchi.getStats().fullness+"/100");
        grid.add(statFullness, 0,4);

        Label statClearness = new Label("Clearness: "+tamagotchi.getStats().clearness+"/100");
        grid.add(statClearness, 1,4);

        Label statHappiness = new Label("Happiness: "+tamagotchi.getStats().happiness+"/100");
        grid.add(statHappiness, 2,4);

        Label statFatigue = new Label("Fatigue: "+tamagotchi.getStats().fatigue+"/100");
        grid.add(statFatigue, 3,4);

        Label statHealth = new Label("Health: "+tamagotchi.getStats().health+"/100");
        grid.add(statHealth, 4,4);



        Button feedPet = new Button("Feed");
        grid.add(feedPet, 0,5);

        Button cleanPet = new Button("Clean");
        grid.add(cleanPet, 1,5);

        Button petPet = new Button("Pet");
        grid.add(petPet, 2,5);

        Button sleepPet = new Button("Sleep");
        grid.add(sleepPet, 3,5);

        Button healPet = new Button("Heal");
        grid.add(healPet, 4,5);



        // Monolog

        Label messageLabel = new Label("");
        grid.add(messageLabel, 1, 6);



        // Timer

        HashMap<String, Integer> stayed = new HashMap<>();
        Timeline timeline = new Timeline(new KeyFrame(Duration.seconds(1), event ->
            {
                // Change values
                tamagotchi.getStats().health--;
                tamagotchi.getStats().happiness--;
                tamagotchi.getStats().clearness--;
                tamagotchi.getStats().fullness--;
                tamagotchi.getStats().fatigue++;

                // Update UI
                statFullness.setText("Fullness: "+tamagotchi.getStats().fullness+"/100");
                statClearness.setText("Clearness: "+tamagotchi.getStats().clearness+"/100");
                statHappiness.setText("Happiness: "+tamagotchi.getStats().happiness+"/100");
                statHealth.setText("Health: "+tamagotchi.getStats().health+"/100");
                statFatigue.setText("Fatigue: "+tamagotchi.getStats().fatigue+"/100");

                // Message module
                String lastMessage = messageLabel.getText();
                if (stayed.containsKey(lastMessage)) {
                    if (stayed.get(lastMessage) < 5) {
                        stayed.put(lastMessage, stayed.get(lastMessage)+1);
                    } else {
                        stayed.remove(lastMessage);
                        messageLabel.setText("");
                    }
                }
            }
        ));
        timeline.setCycleCount(Timeline.INDEFINITE);
        timeline.play();


        feedPet.setOnAction(event -> {
            tamagotchi.feedHim();
            messageLabel.setText("Thanks for feeding me!");
            stayed.put(messageLabel.getText(), 0);
        });


        setNameButton.setOnAction(event -> {
            tamagotchi.setName( nameTF.getText() );
            tamagotchiNameTitle.setText("Tamagotchi Name: "+tamagotchi.getName());
            nameTF.setText("");

            messageLabel.setText("You have renamed me! Now I am "+tamagotchi.getName());
            stayed.put(messageLabel.getText(), 0);
        });

        // Scene setup
        Scene scene = new Scene(grid, 720, 480, Color.LIGHTSLATEGRAY);
        primaryStage.setScene(scene);

        primaryStage.setTitle("sample.Tamagotchi app");
        primaryStage.show();

    }




    public static void main(String[] args) {
        Application.launch(args);
    }
}
