package veterinaryClinic.core.drugStore;

import veterinaryClinic.core.drugStore.components.Azitronite;
import veterinaryClinic.core.drugStore.components.Penicilin;
import veterinaryClinic.core.drugStore.components.Pharmacy2;
import veterinaryClinic.core.drugStore.components.Water;

import java.util.*;

public class DrugMain {
    public static void main(String[] args) {
        Component water = new Water("water",10D, 1);
        Component azitronite = new Azitronite("azitronite",2D,14);
        Component pencilin = new Penicilin("Penicilin",1.6D,6);
    //    Pharmacy p1 = new Pharmacy();
        Pharmacy2 p1 = new Pharmacy2();
        p1.addComponents(water, azitronite);

        Pharmacy2 p2 = new Pharmacy2();
        p2.addComponents(pencilin,water);

        Pharmacy2 p3 = new Pharmacy2();
        p3.addComponents(azitronite,pencilin);
        List<Component> components = new ArrayList<>();
        components.add(azitronite);
        components.add(water);
        components.add(pencilin);

        System.out.println(components);

        Collections.sort(components, Comparator.reverseOrder());

//        Iterator<Component> iterator = p1;
//        while (iterator.hasNext()) {
//            System.out.println(p1.next().toString());
//        }



        for (Component c : p2){
            System.out.println(c);
        }
    }


}

