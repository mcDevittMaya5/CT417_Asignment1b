

import java.time.LocalDate;
import java.util.ArrayList;

public class Driver {

    public static void main(String[] args) {
        ArrayList<Course> courses = new ArrayList<>();
        ArrayList<Student> students = new ArrayList<>();

        Course engineering = new Course("4BP", LocalDate.of(2017, 9, 1), LocalDate.of(2021, 6, 5));
        courses.add(engineering);
        Course occupationalTherapy = new Course("OT502", LocalDate.of(2019, 9, 1), LocalDate.of(2023, 6, 5));
        courses.add(occupationalTherapy);
        Course computerScience = new Course("4CT", LocalDate.of(2021, 9, 1), LocalDate.of(2025, 6, 5));
        courses.add(computerScience);

        Module softwareEngineering = new Module("Software Engineering", "CT417");
        Module DSP = new Module("DSP", "EE445");
        Module projectManagement = new Module("Project Management", "CT418");
        Module humanBodyFunction = new Module("Human Body Function", "OT417");
        Module neuroanatomy = new Module("Neuroanatomy", "OT419");
        Module systemOnChip  = new Module("System On Chip", "EE451");
        Module matlab = new Module("Matlab", "CT414");
        Module telecommunications = new Module("Telecommunications Software Applications", "EE453");

        Student kourtney = new Student("Kourtney Kardashian", 41, LocalDate.of(1979, 4, 18));
        students.add(kourtney);
        Student kim = new Student("Kim Kardashian", 40, LocalDate.of(1980, 10, 21));
        students.add(kim);
        Student rob = new Student("Rob Kardashian", 33, LocalDate.of(1987, 3, 17));
        students.add(rob);
        Student khloe = new Student("Khloe Kardashian", 36, LocalDate.of(1984, 6, 27));
        students.add(khloe);

        //Adding the course to their students
        kourtney.addCourse(engineering);
        khloe.addCourse(engineering);
        kim.addCourse(occupationalTherapy);
        rob.addCourse(computerScience);

        //Adding the modules required to the courses
        //engineering
        engineering.addModule(softwareEngineering);
        engineering.addModule(DSP);
        engineering.addModule(systemOnChip);
        engineering.addModule(telecommunications);

        //computer science
        computerScience.addModule(softwareEngineering);
        computerScience.addModule(projectManagement);
        computerScience.addModule(matlab);

        //occupational therapy
        occupationalTherapy.addModule(humanBodyFunction);
        occupationalTherapy.addModule(neuroanatomy);

        //Students select Modules from their course
        kourtney.addModule(softwareEngineering);
        kourtney.addModule(DSP);
        kourtney.addModule(telecommunications);
        //kourtney does not select system on chip
        khloe.addModule(systemOnChip); //Khloe only repeating one module she failed.
        kim.addModule(humanBodyFunction);
        kim.addModule(neuroanatomy);
        rob.addModule(softwareEngineering);
        rob.addModule(projectManagement);
        rob.addModule(matlab);




        for (Course c : courses)
        {
            System.out.println("Course Name: "+ c.getCourseName());
            System.out.println("Associated Modules: ");
            for(Module m : c.getModules())
            {
                System.out.println("Module: "+m.getModuleName()+" "+m.getModuleID());
            }
            System.out.println("\n");
        }

        for(Student s : students)
        {
            System.out.println("Student Name: "+ s.getName() + "\t Username: "+s.getUsername());
            System.out.println("Course of study: ");
            for (Course c : s.getCourses())
            {
                System.out.println(c.getCourseName());
            }
            for (Module m : s.getModules())
            {
                System.out.println("Module Name: "+m.getModuleName()+"\t Module ID: "+m.getModuleID());
            }
            System.out.println("\n");
        }







    }

}
