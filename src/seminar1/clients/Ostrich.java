package seminar1.clients;



import java.time.LocalDate;



public class Ostrich extends Animal{
    public Ostrich(String nickName, Owner owner, LocalDate birthDate, Illness illness) {
        super(nickName, owner, birthDate, illness);
    }

    public Ostrich(){
        super();
    }

    @Override
    public void fly(){
        System.out.println("Страусы не летают!");
    }
    @Override
    public void swim(){
        System.out.println("Страусы не плавают");
    }
}

