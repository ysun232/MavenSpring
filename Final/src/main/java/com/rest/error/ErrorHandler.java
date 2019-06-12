package com.rest.error;

import org.apache.http.HttpStatus;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@ControllerAdvice
public class ErrorHandler extends ResponseEntityExceptionHandler {

    @ExceptionHandler(BookNotFoundException.class)
    public void springHandleNotFound(HttpServletResponse response) throws IOException{
        response.sendError(HttpStatus.SC_NOT_FOUND);
    }

    public void springUnSupportedFieldPatch(HttpServletResponse response) throws IOException{
        response.sendError(HttpStatus.SC_METHOD_NOT_ALLOWED);
    }
}
