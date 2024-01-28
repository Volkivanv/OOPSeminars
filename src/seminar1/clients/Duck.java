package seminar1.clients;

import java.time.LocalDate;

public class Duck extends Animal{
    public Duck(String nickName, Owner owner, LocalDate birthDate, Illness illness) {
        super(nickName, owner, birthDate, illness);
    }
    public Duck() {
        super();
    }
}
