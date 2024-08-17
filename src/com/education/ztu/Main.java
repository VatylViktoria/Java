package com.education.ztu;

public class Main {
    public static void main(String[] args){
        Car car = new Car("Toyota");
        Teacher teacher = new Teacher(
                "Katherine",
                "Cage",
                38,
                Gender.FEMALE,
                Location.ZHYTOMYR,
                "Web",
                "ZTU",
                car
        );
        teacher.whoIAm();
        System.out.println(teacher.getFullInfo());
        teacher.sayOccupation();
        teacher.sayAge();
        teacher.sayName();
        teacher.sayGender();
        teacher.sayLocation();
        System.out.println(teacher.getCar().engineIsRunning());
        teacher.getCar().getEngine().startEngine();
        System.out.println(teacher.getCar().engineIsRunning());

        Student student = new Student("IPZ", 3, "ZTU");
        student.sayName();
        student.sayOccupation();

        System.out.println(student instanceof Person);
    }
}
