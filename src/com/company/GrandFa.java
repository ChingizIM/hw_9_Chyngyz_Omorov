package com.company;

public class GrandFa {

    private String name;
    private int age;
    private String job;
    private Hobby hobby;
    private Wife wife;

    public GrandFa(String name, int age, String job, Hobby hobby, Wife wife) {
        this.name = name;
        this.age = age;
        this.job = job;
        this.hobby = hobby;
        this.wife = wife;
    }

    public GrandFa() {

    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getJob() {
        return job;
    }

    public Hobby getHobby() {
        return hobby;
    }

    public Wife getWife() {
        return wife;
    }

    public void Eat() {
        System.out.println();
    }
    public String getInfo(){
        return getInfo() +
                "\nName: " + name +
                "\nAge: " + age +
                "\nJob " + job +
                "\nHobby " + hobby +
                "\nWife " + wife;
    }
}
