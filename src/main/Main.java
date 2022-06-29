package main;

import javafx.application.Application;
import javafx.stage.Stage;
import main.gui.GUI;
import javafx.scene.Scene;


public class Main extends Application  {
	
	// The preferred width and height of the application.
	final int WIDTH = 1080;
	final int HEIGHT = 720;
	

    @Override
    public void start(Stage stage) throws Exception {
    	// Set the stage with a new scene, containing a new instance of GUI (extends Pane).
        stage.setScene(new Scene(new GUI(WIDTH, HEIGHT)));
        
        // Set the window title.
        stage.setTitle("Text Editor");
        
        // Show the stage.
        stage.show();
    }


	public static void main(String[] args) {
		launch(args);
	}
}
