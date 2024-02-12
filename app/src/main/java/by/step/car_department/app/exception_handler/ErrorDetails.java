package by.step.car_department.app.exception;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import org.springframework.http.HttpStatus;

import java.util.Date;

@Getter
@Setter
@AllArgsConstructor
public class ErrorDetails {
    
    private Date timestamp;
    
    private String message;

    private String rusMessage;

    private String details;
    
    private HttpStatus httpStatus;
    
    private int code;
}
