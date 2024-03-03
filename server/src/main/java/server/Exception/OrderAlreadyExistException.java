package server.Exception;

public class OrderAlreadyExistsException extends RuntimeException {

    public OrderAlreadyExistException(String message) {
        super(message);
    }
}
