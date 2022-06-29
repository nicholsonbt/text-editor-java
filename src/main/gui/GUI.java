package main.gui;

import javafx.scene.control.MenuBar;
import javafx.scene.layout.Pane;
import javafx.scene.layout.VBox;
import main.gui.menu.TopMenu;


public class GUI extends Pane {
	public GUI(int width, int height) {
		// Set the preferred width and height of the application.
		this.setPrefWidth(width);
		this.setPrefHeight(height);
		
		// Create and add content to the GUI Pane.
		this.getChildren().add(createContent());
	}

    private VBox createContent() {
    	// Create a VBox root to contain menus at the top of the application
    	// screen and some content below these.
    	VBox root = new VBox();
    	
    	// Create the top menu.
    	MenuBar topMenu = new TopMenu();
    	// Bind the top menu preferred width to the width of this (the GUI).
    	topMenu.prefWidthProperty().bind(this.widthProperty());
    	
    	// Add the top menu as a child of root.
    	root.getChildren().add(topMenu);
    	
    	// Return the root VBox.
        return root;
    }
}
