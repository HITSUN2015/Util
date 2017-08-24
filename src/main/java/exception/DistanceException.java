package exception;

/**
 * Created by Sunny on 17/8/24.
 */
public class DistanceException extends UtilException {
    public DistanceException(String message) {
        super(message);
    }

    public DistanceException(String message, Exception ex) {
        super(message, ex);
    }
}
