package Collections;

public class Initializer {
    private StudentsArrayList studentsArrayList = new StudentsArrayList();
    private StudentsLinkedList studentsLinkedList = new StudentsLinkedList();

    void initializeArrayListOfStudents(CollectionsStudent... students) {
        for (int i = 0; i < students.length; i++) {
            studentsArrayList.add(students[i]);
        }
    }

    void initializeLinkedListOfStudents(CollectionsStudent... students) {
        for (int i = 0; i < students.length; i++) {
            studentsLinkedList.addLast(students[i]);
        }
    }

    // Print all students
    void showAllStudents() {
        System.out.println(studentsArrayList);
        System.out.println(studentsLinkedList);
    }
}
