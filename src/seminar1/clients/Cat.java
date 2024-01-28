package seminar1.clients;


import java.time.LocalDate;

public class Cat extends Animal {

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
    public void fly() {
        System.out.println("Коты не летают");
    }
    @Override
    public void swim(){
        System.out.println("Коты не плавают");
    }
}