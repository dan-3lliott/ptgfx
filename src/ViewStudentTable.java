import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import java.util.Objects;

public class ViewStudentTable extends TableView {
    public ViewStudentTable() {
        //set up table
        setEditable(false);
        //set up columns, set up cell value factory so that student objects can be added directly in
        TableColumn<Student, String> nameColumn = new TableColumn<>("Name");
        nameColumn.setCellValueFactory(new PropertyValueFactory<>("name"));
        TableColumn<Student, Integer> idColumn = new TableColumn<>("Student ID");
        idColumn.setCellValueFactory(new PropertyValueFactory<>("id"));
        TableColumn<Student, Integer> pathwayIdColumn = new TableColumn<>("Pathway ID");
        pathwayIdColumn.setCellValueFactory(new PropertyValueFactory<>("pathwayId"));
        //add columns
        getColumns().addAll(nameColumn, idColumn, pathwayIdColumn);
        //populate with data from database
        getItems().addAll(Objects.requireNonNull(Database.students()));
    }
}
