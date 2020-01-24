package Collections;

public class CollectionMain {
    public static void main(String[] args) {

       // Student names and surnames were generated using the tool found on Google )))

        CollectionsStudent[] students = new CollectionsStudent[]{
                new CollectionsStudent("Oliver", "Francis", 22),
                new CollectionsStudent("Al", "Townsend", 25),
                new CollectionsStudent("Vicki", "Gray", 27),
                new CollectionsStudent("Cathy", "Santiago", 19)
        };
        CollectionsStudent[] students1 = new CollectionsStudent[]{
                new CollectionsStudent("Terrell", "Malone", 22),
                new CollectionsStudent("Melinda", "Bridges", 25),
                new CollectionsStudent("Herbert", "Bass", 27),
                new CollectionsStudent("Pablo", "Dennis", 19)
        };
        Initializer studentsInitializer = new Initializer();
        studentsInitializer.initializeArrayListOfStudents(students);
        studentsInitializer.initializeLinkedListOfStudents(students1);
        studentsInitializer.showAllStudents();



    }
}
