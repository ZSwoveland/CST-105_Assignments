import java.util.ArrayList;

import javafx.application.*;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.stage.*;
import javafx.scene.*;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.control.SelectionMode;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;

//Zachary Swoveland
//5/5/18
//CST-105
//This is my own work, Zachary Swoveland
//Revised 5/13/18
//Revised 5/20/18
public class NFL_Draft extends Application {

	ListView<String> Player;
	ListView<String> Roster;
	ListView<String> Position;

	public static void main(String[] args) {
		launch(args);
	}

	public void start(Stage mainStage) {
		//Set up JavaFx for majority of the program
		BorderPane homePane = new BorderPane();
		BorderPane managePane = new BorderPane();
		Scene homeScene = new Scene(homePane, 500, 500);
		mainStage.setTitle("NFL Draft Helper");
		homeScene.getStylesheets().add("GCU.css");
		mainStage.setScene(homeScene);
		mainStage.getIcons().add(new Image("/Icon/NFL.jpg"));
		mainStage.show();
		Scene managerScene = new Scene(managePane, 500, 500);
		managerScene.getStylesheets().add("GCU.css");
		VBox top = new VBox(5);
		Label welcome = new Label("Welcome to NFL Player Draft CEO Edition!");
		TextField search1 = new TextField();
		search1.setPromptText("Type any Text related to player stats, position, or name to Search");
		Button goButton1 = new Button("Search");
		Label selection = new Label("Select a player that you are considering to have on your team.");
		top.getChildren().addAll(welcome, search1, goButton1, selection);
		homePane.setPadding(new Insets(10, 10, 10, 10));
		homePane.setTop(top);
		homePane.setCenter(Players());
		HBox bottom = new HBox(5);
		bottom.setPadding(new Insets(10,10,10,10));
		Button exit = new Button("Exit");
		Button add = new Button("Add to Roster");
		Button nextScene = new Button("Go to Roster");
		exit.setOnAction(e -> mainStage.close());
		nextScene.setOnAction(e -> mainStage.setScene(managerScene));
		goButton1.setOnAction(e -> Search(search1));
		add.setOnAction(e -> {
			Add();
		});
		bottom.getChildren().addAll(nextScene, add, exit);
		homePane.setBottom(bottom);

		VBox topp = new VBox(5);
		Label manager = new Label("Welcome to your Roster!");
		Label deletion = new Label("Select a player that you want to remove from your team.");
		topp.getChildren().addAll(manager, deletion);
		managePane.setPadding(new Insets(10, 10, 10, 10));
		managePane.setTop(topp);
		managePane.setCenter(Roster());
		HBox bot = new HBox(5);
		Button exit1 = new Button("Exit");
		Button delete = new Button("Remove from Roster");
		Button home = new Button("Go to Main Page");
		exit1.setOnAction(e -> mainStage.close());
		home.setOnAction(e -> mainStage.setScene(homeScene));

		delete.setOnAction(e -> Remove());
		bot.setPadding(new Insets(10,10,10,10));
		bot.getChildren().addAll(home, delete, exit1);
		managePane.setBottom(bot);
	}

	public ListView Players() {
		//ListView for mainScene
		NFL_Manager player = new NFL_Manager();
		String playersInfo = player.toString();
		String[] players = playersInfo.split("_");
		Player = new ListView<>();
		for (String teamPlayer : players) {
			Player.getItems().addAll(teamPlayer);
		}

		return Player;

	}

	public void SearchStage() {
		//New window for SeachTextfield
		Stage window = new Stage();
		window.setTitle("Players Found");
		window.getIcons().add(new Image("/Icon/NFL.jpg"));
		BorderPane border = new BorderPane();
		Label label = new Label();
		label.setText("Welcome to players found");
		Button closeButton = new Button("Close this window");
		closeButton.setOnAction(e -> window.close());
		Button add = new Button("Add to Roster");
		add.setOnAction(e -> Add1());
		VBox top = new VBox(5);
		top.getChildren().addAll(label);
		HBox bot = new HBox(5);
		bot.getChildren().addAll(add, closeButton);
		bot.setPadding(new Insets(10,10,10,10));
		border.setTop(top);
		border.setBottom(bot);
		border.setCenter(Position);
		Scene scene = new Scene(border, 400, 400);
		scene.getStylesheets().add("GCU.css");
		window.setScene(scene);
		window.showAndWait();
	}

	public void Search(TextField output) {
		//Searches any string output to match of any string has it in them and outputs it to another window
		boolean count = false;
		NFL_Manager player = new NFL_Manager();
		String playersInfo = player.toString();
		String[] players = playersInfo.split("_");
		Position = new ListView<>();
		for (String position : players) {
			if (position.contains(output.getText())) {
				Position.getItems().addAll(position);

				count = true;
			}

		}
		if (count == false) {
			AlertBox.display("Search warning", "Search " + output.getText() + " was not Found.");
		}
		if(count == true) {
			SearchStage();
		}
		
		
		

	}

	public String Add1() {
		//Adds to another listview
		String selectedItem = "";
		ObservableList<String> playerSelected;
		playerSelected = Position.getSelectionModel().getSelectedItems();

		for (String selected : playerSelected) {
			Roster.getItems().add(selected);
		}

		return selectedItem;

	}

	public String Add() {
		//adds to another listview
		String selectedItem = "";
		ObservableList<String> playerSelected;
		playerSelected = Player.getSelectionModel().getSelectedItems();

		for (String selected : playerSelected) {
			Roster.getItems().add(selected);
		}

		return selectedItem;

	}

	public void Remove() {
		//removes from listview
		int selectedItem = Roster.getSelectionModel().getSelectedIndex();
		Roster.getItems().remove(selectedItem);

	}

	public ListView Roster() {
		//creates listview in scene2
		Roster = new ListView<>();
		Roster.getItems().addAll(Add());
		return Roster;
	}

}
