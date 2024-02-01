package veterinaryClinic.clients;

import java.time.LocalDate;

public class Dolphin extends Animal implements Swimable {
    public Dolphin(String nickName, Owner owner, LocalDate birthDate, Illness illness) {
        super(nickName, owner, birthDate, illness);
    }

    public Dolphin() {
        super();
    }

    @Override
    public void eat() {

    }
    @Override
    public double getSwimSpeed() {
        return 20;
    }
    @Override
    public void swim() {
        System.out.println(this.getType() + " " + this.getNickName() + " плывет");
    }
}
