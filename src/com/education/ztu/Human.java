package com.education.ztu;

public interface Human {
    public String fullInfo = null;

    public void sayAge();
    public void sayGender();
    public void sayLocation();
    public void sayName();
    default void whoIAm(){
        System.out.println(getClass().getName());
    }

    public String getFullInfo();
}
