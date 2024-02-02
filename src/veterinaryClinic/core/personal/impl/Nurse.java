package veterinaryClinic.core.personal.impl;

import veterinaryClinic.core.clients.Animal;
import veterinaryClinic.core.personal.Personal;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Nurse extends Personal implements ProcedureAble{

    private List<String> procedures = new ArrayList<>();
    public Nurse(String name, int stage, String department){
        super(name, stage, "Медсестра", department);

    }
    public Nurse(){
        super();
    }

    @Override
    public void procedure(Animal animal) {
        procedures.add("укол");
        procedures.add("постановку клизмы");
        procedures.add("наложение гипса");
        Random rand = new Random();
        int rand_int = rand.nextInt(procedures.size());
        System.out.println("Медсестра "+ this.getName() + " делает " + animal + " " + procedures.get(rand_int));
    }
    public String getName(){
        return super.getName();
    }
}
