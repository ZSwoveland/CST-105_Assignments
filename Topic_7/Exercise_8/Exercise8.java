import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

import javafx.application.*;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.scene.text.Font;
import javafx.scene.text.FontPosture;
import javafx.scene.text.FontWeight;
import javafx.stage.*;

//Zachary Swoveland
//CST-105
//5/20/18
//This is my own work, Zachary Swoveland
public class Exercise8 extends Application{
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Application.launch(args);
	}

	public void start(Stage primaryStage) {
		//Creates the layout and set up the entire application
		BorderPane border = new BorderPane();
		BorderPane border2 = new BorderPane();
		BorderPane border1 = new BorderPane();
		Scene scene1 = new Scene(border, 400,400);
		Scene scene2 = new Scene(border2, 400,400);
		Scene scene = new Scene(border1, 400, 400);
		primaryStage.setTitle("Chapter 14 Exercise 3, 4, and 6");
		primaryStage.setScene(scene2);
		primaryStage.show();
	
		HBox horiz1 = new HBox();
		HBox horiz2 = new HBox();
		
		Label exercise3 = new Label("Welcome to Chapter 14, Exercise 3");
		Button button3 = new Button("Go to Exercise 3");
		Button button1 = new Button("Go to Exercise 6");
		Button button2 = new Button("Go to Exercise 4");
		button1.setOnAction(e -> primaryStage.setScene(scene2));
		button2.setOnAction(e -> primaryStage.setScene(scene));
		button3.setOnAction(e -> primaryStage.setScene(scene1));

		
		
		
		Label exercise4 = new Label("Welcome to Chapter 14, Exercise 4");
		Label exercise6 = new Label("Welcome to Chapter 14, Exercise 6");
		
		border1.setCenter(Label());
		border1.setBottom(button3);
		border1.setTop(horiz1);
		horiz1.getChildren().add(exercise4);
		horiz2.getChildren().add(exercise6);
		
		
		
	
		
		border2.setCenter(CheckerBoard());
		border2.setBottom(button2);
		border2.setTop(horiz2);
		
		
		
		
		border.setCenter(CardSelect());
		border.setTop(exercise3);
		border.setBottom(button1);
		
	}
	public static HBox CardSelect() {
		//Holds images to shuffle and later output only the first 3 in a deck
		Image[] imgArray = new Image[52];
		for(int a = 0; a < 52; a++) {
			int x = a + 1;
			imgArray[a] = new Image("Images/"+x+".png");
		}
		ArrayList<Image> deck = new ArrayList<Image>(Arrays.asList(imgArray));
		Collections.shuffle(deck);
		ImageView image = new ImageView(deck.get(0));
		image.setFitHeight(100);
		image.setFitWidth(100);
		ImageView image2 = new ImageView(deck.get(1));
		image2.setFitHeight(100);
		image2.setFitWidth(100);

		ImageView image3 = new ImageView(deck.get(2));
		image3.setFitHeight(100);
		image3.setFitWidth(100);

		HBox cardDisplay = new HBox();
		cardDisplay.getChildren().addAll(image, image2, image3);
		return cardDisplay;
		
	}
	public static HBox Label() {
		//creates labels with vertical text with random coloring
		HBox horizontal = new HBox();
		horizontal.setPadding(new Insets(20,20,20,20));
		Label label1 = new Label("Java");
		label1.setFont(Font.font("Time New Roman", FontWeight.BOLD , FontPosture.ITALIC, 22));
		label1.setOpacity(Math.random());
		label1.setTextFill(Color.color(Math.random(),Math.random(),Math.random()));
		label1.setRotate(90);
		Label label2 = new Label("Java");
		label2.setFont(Font.font("Time New Roman", FontWeight.BOLD , FontPosture.ITALIC, 22));
		label2.setOpacity(Math.random());
		label2.setTextFill(Color.color(Math.random(),Math.random(),Math.random()));
		label2.setRotate(90);
		Label label3 = new Label("Java");
		label3.setFont(Font.font("Time New Roman", FontWeight.BOLD , FontPosture.ITALIC, 22));
		label3.setOpacity(Math.random());
		label3.setTextFill(Color.color(Math.random(),Math.random(),Math.random()));
		label3.setRotate(90);
		Label label4 = new Label("Java");
		label4.setFont(Font.font("Time New Roman", FontWeight.BOLD , FontPosture.ITALIC, 22));
		label4.setOpacity(Math.random());
		label4.setTextFill(Color.color(Math.random(),Math.random(),Math.random()));
		label4.setRotate(90);
		Label label5 = new Label("Java");
		label5.setFont(Font.font("Time New Roman", FontWeight.BOLD , FontPosture.ITALIC, 22));
		label5.setOpacity(Math.random());
		label5.setTextFill(Color.color(Math.random(),Math.random(),Math.random()));
		label5.setRotate(90);
		
		horizontal.getChildren().addAll(label1, label2, label3, label4, label5);
		return horizontal;
	}
	public static AnchorPane CheckerBoard() {
		//creates a checkerBoard
		AnchorPane center = new AnchorPane();
		int columns = 8, row = 8, horizon = 40, vert = 40;
		Rectangle rectangle= null;
		for(int y = 0; y < columns; y++) {
			for(int x = 0; x < row; x++) {
				rectangle = new Rectangle(horizon*x, vert*y, horizon, vert);
				rectangle.setStroke(Color.WHITE);
				if(((y + x) % 2 == 0)) {
					rectangle.setFill(Color.WHITE);
				}else {
					rectangle.setFill(Color.BLACK);
				}
				center.getChildren().add(rectangle);
			}
		}
		return center;
	}
	
	
}
