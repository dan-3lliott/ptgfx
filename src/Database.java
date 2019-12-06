import javafx.scene.control.Alert;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.util.ArrayList;

public class Database {
    public static ArrayList<Student> students() {
        ArrayList<Student> students = new ArrayList<>();
        try {
            //get results set from students table
            ResultSet rs = getConnection().createStatement().executeQuery("SELECT * FROM students");
            while (rs.next()) {
                //add a new student for each row in the students table
                students.add(new Student(rs.getString("name"), rs.getInt("id"), rs.getInt("pathwayId")));
            }
            return students;
        }
        catch (Exception e) {
            //show an alert with the exception message
            showAlert(e.getLocalizedMessage());
            return null;
        }
    }
    public static Connection getConnection() {
        try {
            //get connection to database, return it for access
            Class.forName("com.mysql.jdbc.Driver");
            return DriverManager.getConnection("jdbc:mysql://localhost:3306/testing", "root", "");
        }
        catch (Exception e) {
            //show an alert with the exception message
            showAlert(e.getMessage());
            return null;
        }
    }
    public static void showAlert(String text) {
        //create a new alert
        Alert alert = new Alert(Alert.AlertType.WARNING);
        System.out.println("new alert");
        //set text
        alert.setHeaderText(text);
        alert.setContentText("Please contact the developer of this program for assistance.");
        //display and wait
        alert.showAndWait();
    }
}
