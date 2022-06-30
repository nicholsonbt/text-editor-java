package main.gui.menu;

import javafx.scene.control.Menu;
import javafx.scene.control.MenuItem;
import main.gui.NotImplementedWarning;

/**
 * Represents a drop-down EditMenu in the TopMenu MenuBar.
 */
public class EditMenu extends Menu {
	
	/**
	 * Constructor function for the EditMenu that creates and adds
	 * several menu items and sub-menus.
	 */
	public EditMenu() {
		this.setText("Edit");
		
		// Create menu items and sub-menus.
		MenuItem undoItem = new MenuItem("Undo");
		MenuItem redoItem = new MenuItem("Redo");
		MenuItem cutItem = new MenuItem("Cut");
		MenuItem copyItem = new MenuItem("Copy");
		MenuItem pasteItem = new MenuItem("Paste");
		MenuItem selectAllItem = new MenuItem("Select All");
		MenuItem clipboardHistoryItem = new MenuItem("Clipboard History");
		MenuItem findItem = new MenuItem("Find");
		
		// Set actions for all menu item click events.
		undoItem.setOnAction(e -> new NotImplementedWarning());
		redoItem.setOnAction(e -> new NotImplementedWarning());
		cutItem.setOnAction(e -> new NotImplementedWarning());
		copyItem.setOnAction(e -> new NotImplementedWarning());
		pasteItem.setOnAction(e -> new NotImplementedWarning());
		selectAllItem.setOnAction(e -> new NotImplementedWarning());
		clipboardHistoryItem.setOnAction(e -> new NotImplementedWarning());
		findItem.setOnAction(e -> new NotImplementedWarning());
		
		// Add all menu items and sub-menus to the menu (edit menu).
		this.getItems().add(undoItem);
		this.getItems().add(redoItem);
		this.getItems().add(cutItem);
		this.getItems().add(copyItem);
		this.getItems().add(pasteItem);
		this.getItems().add(selectAllItem);
		this.getItems().add(clipboardHistoryItem);
		this.getItems().add(findItem);
	}
}
