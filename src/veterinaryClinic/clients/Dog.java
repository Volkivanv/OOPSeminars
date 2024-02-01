package veterinaryClinic.clients;

import java.time.LocalDate;

public class Dog extends Animal implements Goable, Huntable, Swimable {
    public Dog(String nickName, Owner owner, LocalDate birthDate, Illness illness) {
        super(nickName, owner, birthDate, illness); //Сходи в род.класс и вызови 4 параметра
    }

    public Dog() {
        super();
    }

//    @Override
//    public void fly() {
//        System.out.println("Собаки не летают");
//    }

    @Override
    public void eat() {
        System.out.println("Собака ест");
    }

    @Override
    public void go() {
        System.out.println(this.getType() + " " + this.getNickName() + " идет");
    }

    @Override
    public void swim() {
        System.out.println(this.getType() + " " + this.getNickName() + " плывет");
    }

}
