package main.gui.menu;

import javafx.scene.control.Menu;
import javafx.scene.control.MenuBar;


public class TopMenu extends MenuBar {
	public TopMenu() {
		// Create drop-down menus.
		Menu fileMenu = new FileMenu();
		Menu editMenu = new EditMenu();
		
		// Add the drop-down menus to this (the top menu-bar).
		this.getMenus().add(fileMenu);
		this.getMenus().add(editMenu);
	}
}
