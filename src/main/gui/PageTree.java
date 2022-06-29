package main.gui;

import javafx.scene.control.TreeItem;
import javafx.scene.control.TreeView;
import javafx.scene.layout.Pane;

public class PageTree extends Pane {
	public PageTree() {
		// Create a tree view of strings.
		TreeView<String> pageTree = new TreeView<String>();
		
		// Create a root tree item (that will be hidden).
		TreeItem<String> rootItem = new TreeItem<String>("Pages");
		
		// Create children tree items and add them to the root.
		rootItem.getChildren().add(new TreeItem<String>("Pages"));
		rootItem.getChildren().add(new TreeItem<String>("Definitions"));
		
		// Set the root of the page tree and hide said root.
		pageTree.setRoot(rootItem);
		pageTree.setShowRoot(false);
		
		// Bind the width and height of the tree to the tree container.
		pageTree.prefWidthProperty().bind(this.widthProperty());
		pageTree.prefHeightProperty().bind(this.heightProperty());
		
		// Make the tree a child of its container.
		this.getChildren().add(pageTree);
	}
}
