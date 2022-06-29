package main.gui;

import javafx.scene.control.MenuBar;
import javafx.scene.control.ScrollPane;
import javafx.scene.control.SplitPane;
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
    	SplitPane content = new SplitPane();
    	
    	// Create the page tree container, the page tree it contains, and a
    	// page container.
    	ScrollPane pageTreeContainer = new ScrollPane();
    	Pane pageTree = new PageTree();
    	Pane pageContainer = new Pane();
    	
    	// Create the top menu.
    	MenuBar topMenu = new TopMenu();
    	
    	// Bind width and height of children to those of their parents.
    	root.prefWidthProperty().bind(this.widthProperty());
    	root.prefHeightProperty().bind(this.heightProperty());
    	topMenu.prefWidthProperty().bind(root.widthProperty());
    	content.prefWidthProperty().bind(root.widthProperty());
    	content.prefHeightProperty().bind(root.heightProperty());
    	pageTreeContainer.prefWidthProperty().bind(content.widthProperty());
    	pageTreeContainer.prefHeightProperty().bind(content.heightProperty());
    	pageTree.prefWidthProperty().bind(pageTreeContainer.widthProperty());
    	pageTree.prefHeightProperty().bind(pageTreeContainer.heightProperty());
    	
    	// Add page tree Pane to page tree container.
    	pageTreeContainer.setContent(pageTree);

    	// Add page tree container and page container to the SplitPane content.
    	content.getItems().add(pageTreeContainer);
    	content.getItems().add(pageContainer);
    	
    	// Add the top menu and content SplitPane as a children of root.
    	root.getChildren().add(topMenu);
    	root.getChildren().add(content);
    	
    	// Return the root VBox.
        return root;
    }
    
    public void Setup() {
    	VBox root = (VBox)this.getChildren().get(0);
    	SplitPane content = (SplitPane)root.getChildren().get(1);
    	content.setDividerPositions(0.2);
    }
    
    public void Resize(Number oldSize, Number newSize) {
    	// Get the split pane from this.
    	VBox root = (VBox)this.getChildren().get(0);
    	SplitPane content = (SplitPane)root.getChildren().get(1);
    	
    	// Get the split ratio for the split pane.
    	double splitRatio = content.getDividerPositions()[0];
    	
    	// Calculate and set the new split ratio.
    	content.setDividerPositions((splitRatio * (double)oldSize) / (double)newSize);
    }
}
