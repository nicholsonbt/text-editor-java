package main.gui;

import javafx.scene.control.Alert;


/**
 * Represents a NotImplementedWarning instance that creates
 * a popup window to inform the user that the functionality
 * they are currently attempting to use has not been
 * implemented yet.
 */
public class NotImplementedWarning extends Alert {
	
	/**
	 * Constructor for the NotImplementedWarning popup window.
	 */
	public NotImplementedWarning() {
		// Call the Alert constructor and set the alert type to 'warning'.
		super(AlertType.WARNING);
		
		// Set the title of this popup window.
		this.setTitle("Not Implemented Warning");
		
		// Set the header text to null to hide it.
		this.setHeaderText(null);
		
		// Set the context text of this popup window.
		this.setContentText("The action you attempted to perform has not yet been implemented.");
		
		// Show the popup window and wait until it's closed / destroyed.
		this.showAndWait();
	}
}


