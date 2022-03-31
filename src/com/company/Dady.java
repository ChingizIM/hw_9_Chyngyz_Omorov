package com.company;

public class Dady extends GrandFa {

    private String name;
    private int age;
    private String job;
    private Hobby hobby;
    private Wife wife;

    public Dady() {
        super();
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public int getAge() {
        return age;
    }

    @Override
    public String getJob() {
        return job;
    }

    @Override
    public Hobby getHobby() {
        return hobby;
    }

    @Override
    public Wife getWife() {
        return wife;
    }

    public Dady(String name, int age, String job, Hobby hobby, Wife wife) {
        super(name, age, job, hobby, wife);
    }

    public void Eat() {
        System.out.println("Italian pasta");
    }


    public String getInfo() {
        return super.getInfo() +
                "\nName: " + name +
                "\nAge: " + age +
                "\nJob " + job +
                "\nHobby " + hobby +
                "\nWife " + wife;

    }

    public void Eat(String eat) {
        System.out.println(eat);
    }
}


