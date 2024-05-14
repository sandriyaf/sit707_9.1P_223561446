package web.handler;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class GlobalExceptionHandler {

    @ExceptionHandler(Exception.class)
    public String handleException(Exception e) {
        // Log the exception for debugging purposes
        e.printStackTrace();
        // Redirect to a custom error page
        return "error";
    }
}
