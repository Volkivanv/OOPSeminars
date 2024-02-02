package veterinaryClinic.core.clients.impl;

import veterinaryClinic.core.clients.Animal;
import veterinaryClinic.core.clients.Goable;
import veterinaryClinic.core.clients.Huntable;
import veterinaryClinic.core.clients.Flyable;
import veterinaryClinic.core.illnesses.Illness;
import veterinaryClinic.core.owners.Owner;

import java.time.LocalDate;

public class Eagle extends Animal implements Goable, Flyable, Huntable {
    public Eagle(String nickName, Owner owner, LocalDate birthDate, Illness illness) {
        super(nickName, owner, birthDate, illness);
    }
    public Eagle() {
        super();
    }

    @Override
    public void eat() {
        System.out.println("Орел поймал добычу и ест");

    }

    @Override
    public void go() {
        System.out.println(this.getType()+" "+this.getNickName()+" идет");

    }

    @Override
    public double getRunSpeed() {
        return 2;
    }

    @Override
    public void fly() {
        System.out.println(this.getType()+" "+this.getNickName()+ " летит со скоростью "+ this.getFlySpeed());
    }

    @Override
    public double getFlySpeed() {
        return 200;
    }

    @Override
    public void hunt() {

    }
}
