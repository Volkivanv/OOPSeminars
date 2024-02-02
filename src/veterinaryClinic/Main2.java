package veterinaryClinic;

import veterinaryClinic.core.clients.Animal;
import veterinaryClinic.core.clients.impl.Cat;
import veterinaryClinic.core.clients.impl.Dog;
import veterinaryClinic.core.clients.Goable;

import java.util.ArrayList;
import java.util.List;

public class Main2 {
    public static void main(String[] args) {
        List<Goable> list = new ArrayList<>();
        Cat cat = new Cat();
        Dog dog = new Dog();
        list.add(cat);
        list.add(dog);
        System.out.println(list);
        Animal animal = new Animal() { // анонимный класс
            @Override
            public void eat() {

            }
        };

    }
}
