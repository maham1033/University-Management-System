package University;

public class Driver {
    public static void main(String[] args)
    {
        University university = new University();
        //the department only exists in the university
        Department dep1 = university.createDepartment("Math");
        Department dep2 = university.createDepartment("CE");
        // the professor exists outside the university
        Professor prof1 = new Professor("Ali","P");
        Professor prof2 = new Professor("Hina","AP");
        Professor prof3 = new Professor("Sehar","L");
        System.out.println("University Detail"+university);
        System.out.println("Professors");
        System.out.println(prof1);
        System.out.println(prof2);
        System.out.println(prof3);

        dep1.assign(prof1);
        System.out.println(university);

        dep1.assign(prof2);
        System.out.println(dep1);

        dep2.assign(prof2);
        dep2.assign(prof3);
        System.out.println(dep2);
        dep2.fire(prof2);
        dep2.destroy();
        System.out.println("University");
        System.out.println(university);


    }
}