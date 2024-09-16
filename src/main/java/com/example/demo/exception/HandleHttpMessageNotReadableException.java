package com.example.demo.exception;

import org.springframework.http.HttpInputMessage;
import org.springframework.http.HttpStatus;
import org.springframework.http.converter.HttpMessageNotReadableException;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(value = HttpStatus.BAD_REQUEST)
public class HandleHttpMessageNotReadableException extends HttpMessageNotReadableException {
    public HandleHttpMessageNotReadableException(String msg, HttpInputMessage httpInputMessage) {
        super(msg, httpInputMessage);
    }
}
