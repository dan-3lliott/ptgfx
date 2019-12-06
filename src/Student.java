public class Student {
    private String name;
    private int id;
    private int pathwayId;
    public Student(String name, int id, int pathwayId) {
        this.name = name;
        this.id = id;
        this.pathwayId = pathwayId;
    }
    public String getName() {
        return name;
    }
    public int getId() {
        return id;
    }
    public int getPathwayId() {
        return pathwayId;
    }
}
