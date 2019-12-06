import java.util.ArrayList;

public class Database {
    public static ArrayList<Student> students() {
        ArrayList<Student> students = new ArrayList<>();
        students.add(new Student("Daniel Elliott", 9632019, 1));
        students.add(new Student("Jackson Elder", 9556374, 1));
        return students;
    }
}
