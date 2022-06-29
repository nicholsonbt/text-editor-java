package main.gui;

import javafx.scene.control.Alert;

public class NotImplementedWarning extends Alert {
	public NotImplementedWarning() {
		super(AlertType.WARNING);
		
		this.setTitle("Not Implemented Warning");
		this.setHeaderText(null);
		this.setContentText("The action you attempted to perform has not yet been implemented.");
		this.showAndWait();
	}
}


