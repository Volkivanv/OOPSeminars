package veterinaryClinic.core.personal.impl;

import veterinaryClinic.core.clients.Animal;
import veterinaryClinic.core.personal.Personal;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import static java.lang.Math.round;

public class Doctor  extends Personal implements DiagnosAble {
    private List<Nurse> nurses = new ArrayList<>();
    private List<String> diagnoses = new ArrayList<>();

    public Doctor(String name, int stage, String department){
        super(name, stage, "Доктор", department);

    }
    public Doctor(){
        super();
    }

    @Override
    public void diagnose(Animal animal) {
        diagnoses.add("чумка");
        diagnoses.add("бешенство");
        diagnoses.add("перелом");
        Random rand = new Random();
        int rand_int = rand.nextInt(diagnoses.size());
        System.out.println("У " + animal + " "+ diagnoses.get(rand_int));
    }
    public List<Nurse> getNurses() {
        return this.nurses;
    }

    public void addNurse(Nurse  nurse){
        this.nurses.add(nurse);
        System.out.println("Доктор " + this.getName() + " взял в команду " + nurse.getName() +"\n");
    }
}
