package veterinaryClinic.core.clients;

import veterinaryClinic.core.illnesses.Illness;
import veterinaryClinic.core.owners.Owner;

import java.time.LocalDate;

public abstract class Animal {

    // protected видно в классе и во всех наследниках
    protected String nickName;
    protected Owner owner;
    protected LocalDate birthDate;
    protected Illness illness;

    // Это пустой конструктор (по умолчанию)
    public Animal(String nickName, Owner owner, LocalDate birthDate, Illness illness) {
        this.nickName = nickName;
        this.owner = owner;
        this.birthDate = birthDate;
        this.illness = illness;
    }

    public Animal() {
        this("Кличка", new Owner("Хозяин"), LocalDate.now(), new Illness("Болеет"));
    }

    public String getNickName() {
        return nickName;
    }

    public Owner getOwner() {
        return owner;
    }

    public LocalDate getBirthDate() {
        return birthDate;
    }

    public Illness getIllness() {
        return illness;
    }

    public void setIllness(Illness illness) {
        this.illness = illness;
    }

//    public void lifeCycle() {
//        wakeUp("12:00");
//        hunt();
//        eat();
//        sleep();
//    }


//    public void fly(){
//        System.out.println(this.getType()+" "+this.getNickName()+" летит");
//    }
//
//    public void swim(){
//        System.out.println(this.getType()+" "+this.getNickName()+" плавает");
//    }

    private void wakeUp() {
        wakeUp("12:00");
    }

    private void wakeUp(String time) {
        System.out.println("Животное " + nickName + " проснулось в " + time);
    }

    public String getType() {
        return getClass().getSimpleName();
    }

    private void hunt() {
        System.out.println("Животное охотится!");
    }

    public abstract void eat();

    private void sleep() {
        System.out.println("Животное уснуло!");
    }


    @Override
    public String toString() {
        return String.format("nickName = %s, bd = %s, owner = %s, illness = %s", nickName, birthDate, owner, illness);
    }
}