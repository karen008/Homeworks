package University.Exceptions;

public class NoFacultyException extends RuntimeException {

    @Override
    public String toString() {
        return "There isn't faculties in this university";
    }
}
