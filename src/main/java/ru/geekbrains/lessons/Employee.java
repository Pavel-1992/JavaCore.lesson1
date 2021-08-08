package ru.geekbrains.lessons;
public class Employee {
    private  String fullname;
    private  String position;
    private  String email;
    private  String telephone;
    private  int salary;
    private  int age;

    public Employee(String fullname, String position, String email, String telephone, int salary, int age) {
        this.fullname = fullname;
        this.position = position;
        this.email = email;
        this.telephone = telephone;
        this.salary = salary;
        this.age = age;
    }

    public void printInfo(){
        System.out.println("Фамилия: "+fullname);
        System.out.println("Должность: "+position);
        System.out.println("Почта: "+email);
        System.out.println("Телефон: "+telephone);
        System.out.println("Зарплата: "+salary);
        System.out.println("Возраст: "+age);
    }
    public int getAge() {
        return age;
    }
}

