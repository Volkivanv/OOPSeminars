package veterinaryClinic.core.clients.impl;


import veterinaryClinic.core.illnesses.Illness;
import veterinaryClinic.core.owners.Owner;
import veterinaryClinic.core.clients.Animal;
import veterinaryClinic.core.clients.Goable;
import veterinaryClinic.core.clients.Huntable;

import java.time.LocalDate;

public class Cat extends Animal implements Goable, Huntable {

    //Todo напомнить в чём разница в double
    Double discount;

    public Cat(String nickName, Owner owner, LocalDate birthDate, Illness illness, Double discount) {
        super(nickName, owner, birthDate, illness); //Todo сначала конструктор Супер-класса
        this.discount = discount;
    }

    public Cat() {
        super();
        this.discount = 10D;
    }

    public Double getDiscount() {
        return discount;
    }

    public void setDiscount(Double discount) {
        this.discount = discount;
    }

    //Todo статикой пользоваться аккуратно ( пароли там не хранить :-) )
    public static void meow(){
        System.out.println("Мяяяу!");
    }

    @Override
    public String toString() {
        return super.toString()+"Discount("+discount+")";
    }
    @Override
    public void go() {
        System.out.println(this.getType()+" "+this.getNickName()+" идет со скоростью "+ this.getRunSpeed() );
    }

    @Override
    public double getRunSpeed() {
        return Goable.super.getRunSpeed();
    }

    @Override
    public void eat() {
        System.out.println("Кошка поймала мышку и ест");
    }

    @Override
    public void hunt() {

    }
}