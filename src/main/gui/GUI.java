package main.gui;

import javafx.beans.property.DoubleProperty;
import javafx.beans.value.ObservableValue;
import javafx.scene.control.MenuBar;
import javafx.scene.control.ScrollPane;
import javafx.scene.control.SplitPane;
import javafx.scene.layout.Pane;
import javafx.scene.layout.VBox;
import main.gui.menu.TopMenu;
import main.logic.Settings;

/**
 * Represents a GUI instance that holds (almost) all GUI elements of the window
 * for this application.
 */
public class GUI extends Pane {
	/**
	 * Constructor function for GUI that sets the size of this
	 * (a JavaFX Pane) and creates and adds content to itself.
	 * 
	 * @param width The width of the stage / window.
	 * @param height The height of the stage / window.
	 */
	public GUI(int width, int height) {
		// Set the preferred width and height of the application.
		this.setPrefWidth(width);
		this.setPrefHeight(height);
		
		// Create and add content to the GUI Pane.
		this.getChildren().add(createContent());
	}

	/**
	 * Creates and adds content to a JavaFX VBox and returns this to
	 * the constructor.
	 * 
	 * @return A VBox with children being the top menu bar and the
	 * page content.
	 */
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
    	
    	// Add a listener to the divider position property.
    	DoubleProperty divider = content.getDividers().get(0).positionProperty();
    	divider.addListener((ObservableValue<? extends Number> observable, Number oldValue, Number newValue) -> Settings.ChangeDividerValue((double)oldValue, (double)newValue));
    	
    	// Add the top menu and content SplitPane as a children of root.
    	root.getChildren().add(topMenu);
    	root.getChildren().add(content);
    	
    	// Return the root VBox.
        return root;
    }
    
    /**
     * Set the divider position to a new ratio.
     * @param newRatio The new ratio to set the divider position to.
     */
    public void NewDividerRatio(double newRatio) {
    	// Get the split pane from this.
    	VBox root = (VBox)this.getChildren().get(0);
    	SplitPane content = (SplitPane)root.getChildren().get(1);
    	
    	// Set the new split ratio.
    	content.setDividerPositions(newRatio);
    }
}
