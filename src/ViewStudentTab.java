import javafx.geometry.Insets;
import javafx.scene.control.Tab;
import javafx.scene.control.TextField;
import javafx.scene.layout.VBox;

import javax.swing.text.View;

public class ViewStudentTab extends Tab {
    public ViewStudentTab() {
        //set up tab
        setText("View Students");
        //create table
        ViewStudentTable viewStudentTable = new ViewStudentTable();
        //create search bar
        TextField searchBar = new TextField();
        searchBar.setPromptText("Search...");
        //set up vbox
        VBox vBox = new VBox();
        vBox.setSpacing(5);
        vBox.setPadding(new Insets(10, 10, 10, 10));
        //add components to vbox
        vBox.getChildren().addAll(viewStudentTable, searchBar);
        //set content of tab to vbox
        setContent(vBox);
    }
}
