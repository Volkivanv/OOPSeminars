package veterinaryClinic.clients;

import java.time.LocalDate;

public class Duck extends Animal implements Goable, Swimable, Flyable{
    public Duck(String nickName, Owner owner, LocalDate birthDate, Illness illness) {
        super(nickName, owner, birthDate, illness);
    }
    public Duck() {
        super();
    }

    @Override
    public void eat() {
        System.out.println("утка есть");
    }

    @Override
    public void go() {
        System.out.println(this.getType() + " " + this.getNickName() + " идет");
    }

    @Override
    public void swim() {
        System.out.println(this.getType() + " " + this.getNickName() + " плывет");
    }

    @Override
    public void fly() {
        System.out.println(this.getType() + " " + this.getNickName() + " летает");
    }
}
