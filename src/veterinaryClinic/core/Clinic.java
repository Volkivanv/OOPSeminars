package veterinaryClinic.core;

import veterinaryClinic.core.clients.Animal;
import veterinaryClinic.core.personal.Personal;

import java.util.ArrayList;
import java.util.List;

public class Clinic {
    private List<Animal> animals = new ArrayList<>();
    private List<Personal> personal = new ArrayList<>();

    public void addAnimals(Animal... animals) {

        for (Animal animal : animals) {
            this.animals.add(animal);
        }
    }


    public void removeAnimal(Animal animal) {
        this.animals.remove(animal);
    }
    public List<Animal> getAnimals() {
        return this.animals;
    }
    public void printAnimals() {
        for (Animal animal : this.animals) {
            System.out.println(animal);
        }
    }

    public void hirePersonals(Personal... personals) {
        for (Personal personal : personals) {
            this.personal.add(personal);
            System.out.println("Сотрудник " + personal + " нанят\n");
        }
    }
    public void hirePersonal(Personal personal){
        this.personal.add(personal);
        System.out.println("Сотрудник" + personal + "нанят\n");
    }

    public void firePersonal(Personal personal) {
        this.personal.remove(personal);
        System.out.println("Сотрудник " + personal + " уволен\n");
    }
    public List<Personal> getPersonal() {
        return this.personal;
    }
    public void printPersonal() {
        for (Personal personal : this.personal) {
            System.out.println(personal);
        }
    }



}
