import java.time.LocalDate;

public class Driver {

    Course engineering = new Course("4BP", LocalDate.of(2017, 9, 1), LocalDate.of(2021, 6, 5));
    Course occupationalTherapy = new Course("OT502", LocalDate.of(2019, 9, 1), LocalDate.of(2023, 6, 5));
    Course computerScience = new Course("4CT", LocalDate.of(2021, 9, 1), LocalDate.of(2025, 6, 5));

    Module softwareEngineering = new Module("Software Engineering", "CT417");
    Module DSP = new Module("DSP", "EE445");
    Module projectManagement = new Module("Project Management", "CT418");
    Module humanBodyFunction = new Module("Human Body Function", "OT417");
    Module Neuroanatomy = new Module("Neuroanatomy", "OT419");
    Module systemOnChip  = new Module("System On Chip", "EE451");
    Module matlab = new Module("Matlab", "CT414");
    Module telecommunications = new Module("Telecommunications Software Applications", "EE453");

    Student kourtney = new Student("Kourtney Kardashian", 41, LocalDate.of(1979, 4, 18));
    Student kim = new Student("Kim Kardashian", 40, LocalDate.of(1980, 10, 21));
    Student rob = new Student("Rob Kardashian", 33, LocalDate.of(1987, 3, 17));



}
