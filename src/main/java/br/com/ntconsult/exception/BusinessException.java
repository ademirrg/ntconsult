package br.com.ntconsult.exception;

public class BusinessException extends RuntimeException{

    public BusinessException(String message) {
        super (message);
    }
}
