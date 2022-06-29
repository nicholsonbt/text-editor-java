module TextEditor {
	requires javafx.controls;
	requires javafx.graphics;
	
	opens main to javafx.graphics, javafx.fxml;
}
