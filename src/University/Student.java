package University;

public class Student extends Group {
    protected String StudentName;
    protected int[] Marks;

    protected Student(String StudentName,Faculty faculty,int GroupNumber) {
            this.StudentName = StudentName;
            this.FacultyName = faculty.FacultyName;
            this.GroupNumber = GroupNumber;
            this.Subjects = faculty.Subjects;

    }

}
