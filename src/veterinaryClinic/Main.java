package veterinaryClinic;


import veterinaryClinic.core.Clinic;
import veterinaryClinic.core.clients.Animal;
import veterinaryClinic.core.clients.impl.*;
import veterinaryClinic.core.personal.Personal;
import veterinaryClinic.core.personal.impl.Doctor;
import veterinaryClinic.core.personal.impl.Nurse;

public class Main {
    public static void main(String[] args) {
        Clinic cl = new Clinic();
        Animal cat1 = new Cat();
        Animal dog1 = new Dog();
        Animal cat2 = new Cat();
        Animal dolphin = new Dolphin();
        Animal duck1 = new Duck();
        Animal eagle1 = new Eagle();
        Animal ostrich1 = new Ostrich();
        cl.addAnimals(cat1, dog1, cat2, dolphin, eagle1, duck1, ostrich1);
      //  cl.printAnimals();
        for(Animal an:cl.getAnimals()){

           if(an instanceof Cat){
               ((Cat) an).go();
           }
           if(an instanceof Dog){
               ((Dog) an).go();
               ((Dog) an).swim();
           }
           try{
               ((Duck) an).go();
               ((Duck) an).swim();
               ((Duck) an).fly();
           } catch (ClassCastException e){

           }
           if(an instanceof Eagle){
               ((Eagle) an).go();
               ((Eagle) an).fly();
           }
           if(an instanceof Ostrich){
               ((Ostrich) an).go();
           }
            try{
                ((Dolphin) an).swim();
            } catch (ClassCastException e){

            }

        }

        Personal doctor1 = new Doctor("Василий",10, "Хирургия");
        Personal doctor2 = new Doctor("Петр", 5, "Терапия");
        Personal doctor3 = new Doctor("Анна", 13, "Травматология");

        Personal nurse1 = new Nurse("Елена",3, "Хирургия");
        Personal nurse2 = new Nurse("Юлия",4, "Терапия");
        Personal nurse3 = new Nurse("Юлия",4, "Травматология");

        cl.hirePersonals(doctor1, doctor2, doctor3, nurse1, nurse2, nurse3);
        cl.firePersonal(doctor3);
        cl.printPersonal();

        try {
            ((Doctor) doctor1).addNurse((Nurse) nurse1);
        } catch(ClassCastException e){

        }

        try {
        ((Doctor) doctor1).addNurse((Nurse) nurse2);
        } catch(ClassCastException e){

        }

        ((Doctor) doctor1).diagnose(ostrich1);
        ((Nurse) nurse1).procedure(ostrich1);
        ((Doctor) doctor2).diagnose(duck1);
        ((Nurse) nurse1).procedure(cat1);

        System.out.println("--------------------------------");
        System.out.println("умеют ходить: \n");

      //  System.out.println(cl.getGoable());
        for(Animal an:cl.getGoable()){
            System.out.println(an.getClass() + " " + an.getNickName() + "\n");
        }

        System.out.println("--------------------------------");
        System.out.println("умеют летать: \n");
        for(Animal an:cl.getFlyable()){
            System.out.println(an.getClass() + " " + an.getNickName() + "\n");
        }

        System.out.println("--------------------------------");
        System.out.println("умеют плавать: \n");
        for(Animal an:cl.getSwimable()){
            System.out.println(an.getClass() + " " + an.getNickName() + "\n");
        }





    }
}
