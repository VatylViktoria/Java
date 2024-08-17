package com.education.ztu;

public class WrongPasswordException extends Exception{
    public WrongPasswordException(){
        super("Введено неправильний пароль");
    }

    public WrongPasswordException(String errorMessage){
        super(errorMessage);
    }
}
