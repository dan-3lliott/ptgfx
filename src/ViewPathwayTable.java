import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import java.util.Objects;

public class ViewPathwayTable extends TableView {
    public ViewPathwayTable() {
        //set up table
        setEditable(false);
        //set up columns, then set up cell factory so that pathway objects can be added directly in
        TableColumn<Student, Integer> idColumn = new TableColumn<>("Id");
        idColumn.setCellValueFactory(new PropertyValueFactory<>("id"));
        TableColumn<Student, String> titleColumn = new TableColumn<>("Title");
        titleColumn.setCellValueFactory(new PropertyValueFactory<>("title"));
        //add columns
        getColumns().addAll(idColumn, titleColumn);
        //populate with data from database
        getItems().addAll(Objects.requireNonNull(Database.pathways()));
    }
}
