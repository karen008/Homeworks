package CustomSetHomework;

import java.util.Objects;

public class SetStudent implements Comparable<SetStudent> {
    private String firstName;
    private String lastName;
    private int age;

    public SetStudent(String firstName, String lastName, int age) {
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
    public int compareTo(SetStudent setStudent) {
        if (this.age - setStudent.age > 0) return 1;
        if (this.age - setStudent.age < 0) return -1;

        if (this.firstName.compareTo(setStudent.firstName) > 0) return 1;
        if (this.firstName.compareTo(setStudent.firstName) < 0) return -1;

        if (this.lastName.compareTo(setStudent.lastName) > 0) return 1;
        if (this.lastName.compareTo(setStudent.lastName) < 0) return -1;

        return 0;
    }

    @Override
    public String toString() {
        return  firstName + " " + lastName + " " + age;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        SetStudent setStudent = (SetStudent) o;
        return age == setStudent.age &&
                Objects.equals(firstName, setStudent.firstName) &&
                Objects.equals(lastName, setStudent.lastName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(firstName, lastName, age);
    }
}

