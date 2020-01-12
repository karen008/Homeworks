package University;

public class NoStudentException extends RuntimeException {

    @Override
    public String toString() {
        return "No Students in group";
    }
}
