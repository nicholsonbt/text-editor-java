package main.gui.menu;

import javafx.scene.control.Menu;
import javafx.scene.control.MenuItem;
import main.gui.NotImplementedWarning;

/**
 * Represents a drop-down FileMenu in the TopMenu MenuBar.
 */
public class FileMenu extends Menu {
	
	/**
	 * Constructor function for the FileMenu that creates and adds
	 * several menu items and sub-menus.
	 */
	public FileMenu() {
		this.setText("File");
		
		// Create menu items and sub-menus.
		MenuItem newFileItem = new MenuItem("New File");
		MenuItem openFileItem = new MenuItem("Open File");
		MenuItem saveItem = new MenuItem("Save");
		MenuItem saveAsItem = new MenuItem("Save As");
		Menu exportAsMenu = createExportAsMenu();
		MenuItem renameItem = new MenuItem("Rename");
		Menu printMenu = createPrintMenu();
		MenuItem recentFilesItem = new MenuItem("Recent Files");
		MenuItem openFolderItem = new MenuItem("Open Folder");
		
		// Set actions for all menu item click events.
		newFileItem.setOnAction(e -> new NotImplementedWarning());
		openFileItem.setOnAction(e -> new NotImplementedWarning());
		saveItem.setOnAction(e -> new NotImplementedWarning());
		saveAsItem.setOnAction(e -> new NotImplementedWarning());
		renameItem.setOnAction(e -> new NotImplementedWarning());
		recentFilesItem.setOnAction(e -> new NotImplementedWarning());
		openFolderItem.setOnAction(e -> new NotImplementedWarning());
		
		// Add all menu items and sub-menus to the menu (file menu).
		this.getItems().add(newFileItem);
		this.getItems().add(openFileItem);
		this.getItems().add(saveItem);
		this.getItems().add(saveAsItem);
		this.getItems().add(exportAsMenu);
		this.getItems().add(renameItem);
		this.getItems().add(printMenu);
		this.getItems().add(recentFilesItem);
		this.getItems().add(openFolderItem);
	}
	
	/**
	 * Creates and returns the 'export as' sub-menu.
	 */
	private Menu createExportAsMenu() {
		// Crate the export as sub-menu.
		Menu exportAsMenu = new Menu("Export As");
		
		// Create menu items for the sub-menu (export as).
		MenuItem exportAsPDFItem = new MenuItem("PDF");
		MenuItem exportAsHTMLItem = new MenuItem("HTML");
		
		// Set actions for all (export as) menu items.
		exportAsPDFItem.setOnAction(e -> new NotImplementedWarning());
		exportAsHTMLItem.setOnAction(e -> new NotImplementedWarning());
		
		// Add all (export as) menu items to the sub-menu (export as).
		exportAsMenu.getItems().add(exportAsPDFItem);
		exportAsMenu.getItems().add(exportAsHTMLItem);
		
		// Return the export as sub-menu.
		return exportAsMenu;
	}
	
	/**
	 * Creates and returns the 'print' sub-menu.
	 */
	private Menu createPrintMenu() {
		// Crate the print sub-menu.
		Menu printMenu = new Menu("Print");
		
		// Create menu items for the sub-menu (print).
		MenuItem printAllPagesItem = new MenuItem("All Pages");
		MenuItem printSelectedItem = new MenuItem("Select Pages");
		
		// Set actions for all (print) menu items.
		printAllPagesItem.setOnAction(e -> new NotImplementedWarning());
		printSelectedItem.setOnAction(e -> new NotImplementedWarning());
		
		// Add all (print) menu items to the sub-menu (print).
		printMenu.getItems().add(printAllPagesItem);
		printMenu.getItems().add(printSelectedItem);
		
		// Return the export as sub-menu.
		return printMenu;
	}
}
