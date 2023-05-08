package University;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Department {

    private final String name;
    private List<Professor> professors = new ArrayList<>();
    private final University university;

    public Department(University univ, String name) {
        this.university = univ;
        this.name = name;
        //check here univ not null throw whatever depending on your needs
    }

    public void assign(Professor p) {
        //maybe use a Set here
        System.out.println("Department hiring " + p.getName());
        professors.add(p);
        p.join(this);
    }

    public void fire(Professor p) {
        //maybe use a Set here
        System.out.println("Department firing " + p.getName());
        professors.remove(p);
        p.quit(this);
    }

    public void destroy() {
        //It's aggregation here, we just tell the professor they are fired but they can still keep living
        System.out.println("Destroying department");
        professors.forEach(professor -> professor.quit(this));
        professors = null;
    }

    @Override
    public String toString() {
        String s= name + "{\n" ;
        if(professors!=null)
            for(Professor d:professors)
                s+=d+"\n";
        return professors == null
                ? "Department " + name + " doesn't exists anymore"
                : "Department " + s;


    }
}
