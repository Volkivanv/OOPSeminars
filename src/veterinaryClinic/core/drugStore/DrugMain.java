package veterinaryClinic.core.drugStore;

import veterinaryClinic.core.drugStore.components.Azitronite;
import veterinaryClinic.core.drugStore.components.Penicilin;
import veterinaryClinic.core.drugStore.components.Water;

import java.util.*;

public class DrugMain {
    public static void main(String[] args) {
        Component water = new Water("water",10D, 1D);
        Component azitronite = new Azitronite("azitronite",2D,14D);
        Component pencilin = new Penicilin("Penicilin",1.6D,6D);
    //    Pharmacy p1 = new Pharmacy();
        Pharmacy2 p1 = new Pharmacy2("Антигельминтное");
        p1.addComponents(water, azitronite);

        Pharmacy2 p2 = new Pharmacy2("Антибиотик");
        p2.addComponents(pencilin,water);

        Pharmacy2 p3 = new Pharmacy2("Двойной удар");
        p3.addComponents(azitronite,pencilin);
//        List<Component> components = new ArrayList<>();
//        components.add(azitronite);
//        components.add(water);
//        components.add(pencilin);
//
//        System.out.println(components);
//
//        Collections.sort(components, Comparator.reverseOrder());

//        Iterator<Component> iterator = p1;
//        while (iterator.hasNext()) {
//            System.out.println(p1.next().toString());
//        }

        DrugStore ds = new DrugStore();
        ds.addPharmacies(p1, p2, p3);
        for(Pharmacy2 p:ds){
            System.out.println(p);
        }

        ds.sortByPower();

        System.out.println("--------------------------------");

        for(Pharmacy2 p:ds.getPharmacies()){
            System.out.println(p);
        }

        ds.sortByWeight();
        System.out.println("--------------------------------");

        for(Pharmacy2 p:ds.getPharmacies()){
            System.out.println(p);
        }



    }


}

