package CustomSetHomework;

public class SetMain {
    public static void main(String[] args) {
        CustomSet<SetStudent> setOfStudents = new CustomSet<>();
        setOfStudents.add( new SetStudent("Vanessa", "Cohen", 21));
        setOfStudents.add( new SetStudent("Tony", "Pierce", 18));
        setOfStudents.add( new SetStudent("Abel", "Garza", 22));
        setOfStudents.add( new SetStudent("Tony", "Patterson", 18));
        setOfStudents.add( new SetStudent("Colin", "Morgan", 19));
        setOfStudents.add( new SetStudent("Denise", "Morrison", 21));
        setOfStudents.add( new SetStudent("Theodore", "Scott", 22));
        setOfStudents.add( new SetStudent("Colin", "Morgan", 19));
        setOfStudents.add( new SetStudent("Theodore", "Tyler", 19));

        System.out.println(setOfStudents);
        System.out.println(setOfStudents.contains(new SetStudent("Tony", "Patterson", 18)));
        System.out.println("Number of Students : " + setOfStudents.getSize());

        setOfStudents.remove(new SetStudent("Colin", "Morgan", 19));

        System.out.println(setOfStudents);
        System.out.println(setOfStudents.contains(new SetStudent("Veronica", "Wheeler", 22)));
        System.out.println("Number of Students : " + setOfStudents.getSize());

        setOfStudents.add(new SetStudent("Veronica", "Wheeler", 22));

        System.out.println(setOfStudents);

    }
}

