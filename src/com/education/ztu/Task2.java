package com.education.ztu;

import java.util.regex.Pattern;

public class Task2 {
    public static boolean checkCredentials(String login, String password, String confirmPassword){
        Pattern p = Pattern.compile("[a-zA-Z0-9_]+");
        try {
            if (login.length() >= 20 || !p.matcher(login).matches())
                throw new WrongLoginException();
            if (password.length() >= 20 || !p.matcher(password).matches() || !password.equals(confirmPassword))
                throw new WrongPasswordException();
        }catch (WrongLoginException | WrongPasswordException e){
            return false;
        }
        return true;
    }
}
