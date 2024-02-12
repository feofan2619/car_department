package by.step.car_department.app.exception;

import by.step.car_department.service.exception.DataNotFoundException;
import org.hibernate.HibernateException;
import org.hibernate.exception.ConstraintViolationException;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.context.request.WebRequest;

import javax.persistence.EntityNotFoundException;
import java.util.Date;

import static org.springframework.http.HttpStatus.BAD_REQUEST;
import static org.springframework.http.HttpStatus.NOT_FOUND;


@ControllerAdvice
public class GlobalExceptionHandler {
    
    @ExceptionHandler(DataNotFoundException.class)
    public ResponseEntity <?> notResultData(DataNotFoundException exception, WebRequest request){
        ErrorDetails errorDetails = new ErrorDetails(new Date(),
                exception.getMessage(),
                "данные не найдены"
                ,request.getDescription(false)
                ,NOT_FOUND
                ,NOT_FOUND.value());
        return new ResponseEntity<>(errorDetails, NOT_FOUND);
    }

    @ExceptionHandler(EntityNotFoundException.class)
    public ResponseEntity <?> notResultData(EntityNotFoundException exception, WebRequest request){
        ErrorDetailsBuilder build = ErrorDetailsBuilder.builder().
                timestamp(new Date()).
                message(exception.getMessage()).
                rusMessage("нет данных по id").
                details(request.getDescription(false)).
                httpStatus(NOT_FOUND).
                code(NOT_FOUND.value()).
                build();
        return new ResponseEntity<>(build, NOT_FOUND);
    }

    @ExceptionHandler(ConstraintViolationException.class)
    public ResponseEntity <?> notResultData(ConstraintViolationException exception, WebRequest request){
        ErrorDetailsBuilder build = ErrorDetailsBuilder.builder().
                timestamp(new Date()).
                message(exception.getMessage()).
                rusMessage("повтор данных").
                details(request.getDescription(false)).
                httpStatus(BAD_REQUEST).
                code(BAD_REQUEST.value()).
                build();
        return new ResponseEntity<>(build, BAD_REQUEST);
    }

    @ExceptionHandler(HibernateException.class)
    public ResponseEntity <?> notResultData(HibernateException exception, WebRequest request){
        ErrorDetailsBuilder build = ErrorDetailsBuilder.builder().
                timestamp(new Date()).
                message(exception.getMessage()).
                rusMessage("запрещено изменять данные типа VIN и др. номера").
                details(request.getDescription(false)).
                httpStatus(BAD_REQUEST).
                code(BAD_REQUEST.value()).
        build();
        return new ResponseEntity<>(build, BAD_REQUEST);
    }

//    @ExceptionHandler(ArrayIndexOutOfBoundsException.class)
//    public ResponseEntity <?> noSuchElement(ArrayIndexOutOfBoundsException exception, WebRequest request){
//        ErrorDetails errorDetails = new ErrorDetails(new Date(),
//                exception.getMessage() + " нет данных при получении из бд"
//                ,request.getDescription(false)
//                ,NOT_FOUND
//                ,NOT_FOUND.value());
//        return new ResponseEntity<>(errorDetails, NOT_FOUND);
//    }
}

