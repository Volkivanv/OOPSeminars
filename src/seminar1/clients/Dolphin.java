package seminar1.clients;

import java.time.LocalDate;

public class Dolphin extends Animal {
    public Dolphin(String nickName, Owner owner, LocalDate birthDate, Illness illness) {
        super(nickName, owner, birthDate, illness);
    }

    public Dolphin() {
        super();
    }
    @Override
    public void fly(){
        System.out.println("Дельфины не летают");
    }
    @Override
    public void toGo(){
        System.out.println("Дельфины не ходят");
    }
}
