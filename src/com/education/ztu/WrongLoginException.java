package com.education.ztu;

public class WrongLoginException extends Exception{
    public WrongLoginException(){
        super("Введено неправильний логін.");
    }

    public WrongLoginException(String errorMessage){
        super(errorMessage);
    }
}
