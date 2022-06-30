package main.logic;

import javafx.scene.Scene;
import javafx.stage.Stage;
import main.gui.GUI;

/**
 * A static class that encapsulates data and methods that are
 * required by or link class instances that are not directly
 * related.
 */
public class Settings {
	// Initialize public constants:
	//  - Default width and height of the window:
	public static final int DEFAULT_WIDTH = 1080;
	public static final int DEFAULT_HEIGHT = 720;
	
	// Initialize private constants:
	//  - The divider width (I couldn't find any documentation on
	//    this, so the value stated here was found by testing and
	//    may be slightly off and/or different under alternate
	//    external factors - such as JavaFX version, OS, etc).
	private static final int DIVIDER_WIDTH = 18;
	
	// Declare public variables:
	public static double stageWidth, stageHeight, maximumPageTreeWidth;
	
	// Declare private variables:
	private static Stage stage;
	
	/**
	 * Initialize the window (this must be called before setup, as
	 * several setup statements require the window to be displayed
	 * beforehand due to using variables that are only assigned to
	 * once said window is shown).
	 * @param newStage The stage / window to initialize.
	 */
	public static void Initialize(Stage newStage) {
		// Initialize the stage.
		stage = newStage;
		stage.setScene(new Scene(new GUI(DEFAULT_WIDTH, DEFAULT_HEIGHT)));
        
        // Add an event listener for stage resize events.
        stage.widthProperty().addListener(e -> Resize());
        stage.heightProperty().addListener(e -> Resize());
        
        // Set the window title.
        stage.setTitle("Text Editor");
	}
	
	/**
	 * Setup declared variables with default values.
	 */
	public static void Setup() {
		// The initial width of the page tree is 200.
		maximumPageTreeWidth = 200;
		
		// Resize the window to initialize any variables that are
		// dynamically calculated with regards to the size of the
		// window.
		Resize();
	}
	
	/**
	 * Gets the instance of GUI that is the root child of the scene.
	 * 
	 * @return The GUI instance.
	 */
	private static GUI GetGUI() {
		return (GUI)stage.getScene().getRoot();
	}
	
	/**
	 * Calculate and return the divider ratio.
	 * 
	 * @return The divider ratio.
	 */
	public static double GetDividerRatio() {
		// Calculate the divider ratio by dividing the maximum page
		// tree width by the available window width. The maximum
		// divided ratio is 1.
		return Math.min(maximumPageTreeWidth / (stageWidth - DIVIDER_WIDTH), 1);
	}
	
	/**
	 * Set a new maximum page tree width given the new ratio.
	 * 
	 * @param newRatio The new ratio given the current width of the
	 *                 window.
	 */
	public static void SetDividerRatio(double newRatio) {
		maximumPageTreeWidth = newRatio * (stageWidth - DIVIDER_WIDTH);
	}
	
	/**
	 * Guard function to prevent SetDividerRatio from being called
	 * when it shouldn't. This would occur when the width of the page
	 * tree equals the width of the window, and the window is being
	 * reduced in width. In this case, this function will be called,
	 * but SetDividerRatio should not be.
	 * 
	 * @param oldValue The old ratio of page tree width to total
	 *                 window width.
	 * @param newValue The new ratio of page tree width to total
	 *                 window width.
	 */
	public static void ChangeDividerValue(double oldValue, double newValue) {
		
		// If either of the old value and new value equals 1, don't
		// call SetDividerRatio.
		if (oldValue != 1 && newValue != 1)
			SetDividerRatio(newValue);
	}
	
	/**
	 * Function called when the window is resized.
	 */
	private static void Resize() {
		// Change the width and height variables to their new values.
		stageWidth = stage.getWidth();
		stageHeight = stage.getHeight();
		
		// Set the divider ratio to its new ratio (keeping the
		// absolute value the same).
		GetGUI().NewDividerRatio(GetDividerRatio());
	}

}


























