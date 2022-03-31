package com.company;

public final class Son extends Dady {


    private String name;
    private int age;
    private String job;
    private Hobby hobby;
    private Wife wife;

    public Son() {

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

    public Son(String name, int age, String job, Hobby hobby, Wife wife) {
        super(name, age, job, hobby, wife);
    }

    public void Eat() {
        System.out.println();
    }


    public String getInfo() {
        return getInfo() +
                "\nName: " + name +
                "\nAge: " + age +
                "\nJob " + job +
                "\nHobby " + hobby +
                "\nWife " + wife;

    }

}

