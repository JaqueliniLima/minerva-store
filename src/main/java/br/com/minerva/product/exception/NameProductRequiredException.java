package br.com.minerva.product.exception;

public class NameProductRequiredException extends RuntimeException{

    public NameProductRequiredException(String message){
        super(message);
    }
}
