package by.step.car_department.app.exception;

public class DataNotFoundException extends RuntimeException{

    public DataNotFoundException() {
        this("data not found");
    }

    public DataNotFoundException(String message) {
        super(message);
    }
}
