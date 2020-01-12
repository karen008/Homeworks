package University.Exceptions;

public class NoGroupException extends RuntimeException {

    @Override
    public String toString() {
        return "There isn't groups in this faculty";
    }
}
