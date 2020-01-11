package University;

public class NoSubjectException extends RuntimeException {
    @Override
    public String toString() {
        return "The student doesn't learn any subject";
    }
}
