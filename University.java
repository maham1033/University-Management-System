package University;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class University {

    private List<Department> departments = new ArrayList<>();

    public Department createDepartment(String Name) {
        final Department dep = new Department(this, Name);
        departments.add(dep);
        return dep;
    }

    public void destroy() {
        System.out.println("Destroying university");
        //it's composition, when I destroy a university I also destroy the departments. they cant live outside my university instance
        if (departments != null)
            departments.forEach(Department::destroy);
        departments = null;
    }

    @Override
    public String toString() {
        String s= "University{\n" +
                "departments=\n" ;
        for(Department d:departments)
            s+=d+"\n";
        return s;
    }}