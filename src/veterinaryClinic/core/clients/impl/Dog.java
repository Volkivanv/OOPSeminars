package veterinaryClinic.core.clients.impl;

import veterinaryClinic.core.clients.Animal;
import veterinaryClinic.core.clients.Goable;
import veterinaryClinic.core.clients.Huntable;
import veterinaryClinic.core.clients.Swimable;
import veterinaryClinic.core.illnesses.Illness;
import veterinaryClinic.core.owners.Owner;

import java.time.LocalDate;

public class Dog extends Animal implements Goable, Huntable, Swimable {
    public Dog(String nickName, Owner owner, LocalDate birthDate, Illness illness) {
        super(nickName, owner, birthDate, illness); //Сходи в род.класс и вызови 4 параметра
    }

    public Dog() {
        super();
    }

    @Override
    public void eat() {
        System.out.println("Собака ест");
    }

    @Override
    public void go() {
        System.out.println(this.getType() + " " + this.getNickName() + " идет со скоростью "+ this.getRunSpeed());
    }

    @Override
    public double getRunSpeed() {
        return 15;
    }

    @Override
    public void swim() {
        System.out.println(this.getType() + " " + this.getNickName() + " плывет со скоростью "+ this.getSwimSpeed());
    }

    @Override
    public double getSwimSpeed() {
        return Swimable.super.getSwimSpeed();
    }

    @Override
    public void hunt() {

    }
}
