package University;

import java.util.ArrayList;
import java.util.List;

public class Professor {

    private final String name;
    private String designation;
    private final List<Department> attachedDepartments = new ArrayList<>();

    public Professor(String name, String d) {
        this.name = name;
        this.designation=d;
    }

    public void destroy() {

    }

    public void join(Department d) {
        attachedDepartments.add(d);
    }

    public void quit(Department d) {
        attachedDepartments.remove(d);
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Professor " + name + " working for " + attachedDepartments.size() + " department(s)\n";
    }
}