package by.step.car_department.app.exception;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;
import org.springframework.http.HttpStatus;

import java.util.Date;


@Builder
@Getter
@Setter
public class ErrorDetailsBuilder {
    
    private Date timestamp;
    
    private String message;

    private String rusMessage;

    private String details;
    
    private HttpStatus httpStatus;
    
    private int code;
}
