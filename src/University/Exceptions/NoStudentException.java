package University.Exceptions;

public class NoStudentException extends RuntimeException {

    @Override
    public String toString() {
        return "There isn't Students in this group";
    }
}
