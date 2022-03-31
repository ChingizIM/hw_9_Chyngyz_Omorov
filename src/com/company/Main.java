package com.company;

public class Main {

    public static void main(String[] args) {
        Hobby sport = new Hobby("football", "10 years");
        Dady will = new Dady("Will Smith", 39, "acter", sport,
                Wife.MARGO);
        System.out.println(will.getInfo());
        will.Eat();
        will.Eat("Plov");


        Hobby books = new Hobby("reading books", "25 years");
        GrandFa robert = new GrandFa("Robert de Niro", 67, "police", books,
                Wife.MONIKA);
        System.out.println(robert.getInfo());
        robert.Eat();


        Hobby technology = new Hobby("technology", "5 years");
        Son ilon = new Son("Ilon Mask", 20, "ingener", technology,
                Wife.JENIFER);
        System.out.println(ilon.getInfo());
        ilon.Eat();

    }

    public void Dady(String[] args) {

        Dady dady1 = new Dady();
        dady1.getName();
        dady1.getAge();
        dady1.getJob();
        dady1.getHobby();
        System.out.println(dady1);
    }

    public void Son() {
        Son son1 = new Son();
        son1.getName();
        son1.getAge();
        son1.getJob();
        System.out.println(son1);
    }

    public void Son(String[] args) {
        Son son2 = new Son();
        son2.getName();
        son2.getAge();
        son2.getJob();
        son2.getHobby();
        son2.getWife();
        System.out.println(son2);
    }
}




