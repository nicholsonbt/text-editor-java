package main.gui.menu;

import javafx.scene.control.Menu;
import javafx.scene.control.MenuBar;

/**
 * Represents a TopMenu instance that is located at the top of the
 * window and contains several drop-down menus.
 */
public class TopMenu extends MenuBar {
	/**
	 * Constructor function for the TopMenu that creates and adds
	 * several drop-down menus.
	 */
	public TopMenu() {
		// Create drop-down menus.
		Menu fileMenu = new FileMenu();
		Menu editMenu = new EditMenu();
		
		// Add the drop-down menus to this (the top menu-bar).
		this.getMenus().add(fileMenu);
		this.getMenus().add(editMenu);
	}
}
