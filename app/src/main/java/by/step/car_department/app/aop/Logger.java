package by.step.car_department.app.aop;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.apache.logging.log4j.LogManager;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;


@Component
@Aspect
public class Logger {
    
        private static final String SPACE = " ";
        
        @AfterThrowing(pointcut = "execution ( public * by.step.car_department.service.*.*(..))", throwing = "exception")
        public void loggingExceptionControllerLayer(JoinPoint joinPoint,Throwable exception) {
            ObjectMapper objectMapper = new ObjectMapper();
            org.apache.logging.log4j.Logger logger = LogManager.getLogger(joinPoint.getTarget().getClass());
            
            StringBuilder builder = new StringBuilder();
            builder.append(joinPoint.getSignature()).append(SPACE);
            builder.append(joinPoint.getArgs().length).append(SPACE);
            builder.append(joinPoint.getSignature().getName()).append(SPACE);
            builder.append(exception.getMessage()).append(SPACE);
            
            
            try{
                builder.append(objectMapper.
                        writerWithDefaultPrettyPrinter().
                        writeValueAsString(joinPoint.getArgs())).
                        append(SPACE);
                logger.error(builder.toString());
                
            } catch(JsonProcessingException e){
                logger.error(e.getMessage());
            }
        }
    
}
