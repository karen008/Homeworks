package Collections;

public class CollectionsStudent implements Comparable<CollectionsStudent> {
    private String firstName;
    private String lastName;
    private int age;
    private CollectionsStudent previousStudent;
    private CollectionsStudent nextStudent;

    public CollectionsStudent getPreviousStudent() {
        return previousStudent;
    }

    public void setPreviousStudent(CollectionsStudent previousStudent) {
        this.previousStudent = previousStudent;
    }

    public CollectionsStudent getNextStudent() {
        return nextStudent;
    }

    public void setNextStudent(CollectionsStudent nextStudent) {
        this.nextStudent = nextStudent;
    }

    public CollectionsStudent(String firstName, String lastName, int age) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public int getAge() {
        return age;
    }

    @Override
    public String toString() {
        return lastName + " " + firstName + " " + age;
    }

    @Override
    public int compareTo(CollectionsStudent s) {
        return this.lastName.compareTo(s.getLastName());
    }

    @Override
    public boolean equals(Object s) {
        CollectionsStudent tempStudent = (CollectionsStudent) s;

        if (s == this) {
            return true;
        }
        if (this.firstName != tempStudent.firstName) {
            return false;
        }
        if (this.lastName != tempStudent.lastName) {
            return false;
        }
        if (this.age != tempStudent.age) {
            return false;
        }
        return true;
    }


}
