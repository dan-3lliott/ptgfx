import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;

public class ViewStudentTable extends TableView {
    public ViewStudentTable() {
        //set up table
        setEditable(false);
        //allow auto column resizing
        setColumnResizePolicy((param) -> false);
        //set up columns
        TableColumn nameColumn = new TableColumn("Name");
        TableColumn idColumn = new TableColumn("Student ID");
        getColumns().addAll(nameColumn, idColumn);
    }
}
