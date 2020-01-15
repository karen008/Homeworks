package University;

public class Student extends Group {
    protected String StudentName;
    protected int[] Marks;

    protected Student(StudentBuilder builder) {
            StudentName = builder.StudentName;
            FacultyName = builder.faculty.FacultyName;
            GroupNumber = builder.GroupNumber;
            Subjects = builder.faculty.Subjects;

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
