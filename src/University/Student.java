package University;

public class Student extends Group {
    protected String studentName;
    protected int[] marks;

    protected Student(StudentBuilder builder) {
            studentName = builder.StudentName;
            facultyName = builder.faculty.facultyName;
            groupNumber = builder.GroupNumber;
            subjects = builder.faculty.subjects;

    }

    protected static class StudentBuilder {
        protected String StudentName;
        Faculty faculty;
        int GroupNumber;

        protected StudentBuilder(String Name) {
            this.StudentName = Name;
        }

        protected StudentBuilder faculty(Faculty faculty) {
            this.faculty = faculty;
            return this;
        }

        protected StudentBuilder group(int GroupNumber) {
            this.GroupNumber = GroupNumber;
            return this;
        }

        protected Student build(){
            Student s = new Student(this);
            return s;
        }

    }
}
