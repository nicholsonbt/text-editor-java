package main;

import javafx.application.Application;
import javafx.stage.Stage;
import main.logic.Settings;

/**
 * The main class of this application.
 */
public class Main extends Application  {

	/**
	 * Setup the stage and show it.
	 */
    @Override
    public void start(Stage stage) throws Exception {
    	// Set the stage with a new scene, containing a new instance of GUI (extends Pane).
    	Settings.Initialize(stage);
    	
        // Show the stage.
        stage.show();
        
        // Call everything that needs to be called after the stage has been shown.
        Settings.Setup();
    }
    
    /**
     * The main function of this application.
     */
	public static void main(String[] args) {
		launch(args);
	}
}
