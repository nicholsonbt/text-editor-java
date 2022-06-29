package main;

import javafx.application.Application;
import javafx.stage.Stage;
import main.gui.GUI;
import javafx.scene.Scene;

public class Main extends Application  {
	
	// The preferred width and height of the application.
	final int WIDTH = 1080;
	final int HEIGHT = 720;
	
	Scene scene;
	

    @Override
    public void start(Stage stage) throws Exception {
    	// Set the stage with a new scene, containing a new instance of GUI (extends Pane).
    	scene = new Scene(new GUI(WIDTH, HEIGHT));
        stage.setScene(scene);
        
        // Add an event listener for stage resize events.
        stage.widthProperty().addListener((observable, oldValue, newValue) -> onResize(oldValue, newValue));
        
        // Set the window title.
        stage.setTitle("Text Editor");
        
        // Show the stage.
        stage.show();
        
        // Call everything that needs to be called after the stage has been shown.
        Setup();
    }
    
    private GUI GetGUI() {
    	return (GUI)this.scene.getRoot();
    }
    
    private void Setup() {
    	GetGUI().Setup();
    }
    
    private void onResize(Number oldValue, Number newValue) {
    	// Call the GUI resize function on stage resize.
    	GetGUI().Resize(oldValue, newValue);
    }


	public static void main(String[] args) {
		launch(args);
	}
}
