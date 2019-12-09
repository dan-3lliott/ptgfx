import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.control.Tab;
import javafx.scene.control.TextField;
import javafx.scene.layout.Priority;
import javafx.scene.layout.VBox;

public class ViewStudentTab extends Tab {
    public ViewStudentTab() {
        //set up tab
        setText("Students");
        //create table
        ViewStudentTable viewStudentTable = new ViewStudentTable();
        VBox.setVgrow(viewStudentTable, Priority.ALWAYS);
        //create search bar
        TextField searchBar = new TextField();
        searchBar.setPromptText("Search...");
        searchBar.setMaxWidth(800);
        //set up vbox
        VBox vBox = new VBox();
        vBox.setSpacing(5);
        vBox.setPadding(new Insets(10, 10, 10, 10));
        vBox.setAlignment(Pos.TOP_CENTER);
        //add components to vbox
        vBox.getChildren().addAll(viewStudentTable, searchBar);
        //set content of tab to vbox
        setContent(vBox);
    }
}
