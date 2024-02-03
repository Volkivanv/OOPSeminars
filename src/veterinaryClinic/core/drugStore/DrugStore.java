package veterinaryClinic.core.drugStore;

import java.util.*;
import java.util.function.Consumer;

public class DrugStore implements Iterable<Pharmacy2> {
    private List<Pharmacy2> pharmacies;

    private int index = 0;

    public DrugStore(){
        this.pharmacies = new ArrayList<>();
    }

    public void addPharmacies(Pharmacy2... pharmacies) {
        for (Pharmacy2 pharmacy : pharmacies) {
            this.pharmacies.add(pharmacy);
        }
    }

    public void removePharmacies(Pharmacy2 pharmacy){
        this.pharmacies.remove(pharmacy);
    }

    @Override
    public Iterator<Pharmacy2> iterator() {
        return new Iterator<Pharmacy2>() { //Анонимный класс
            @Override
            public boolean hasNext() {
                return (index < pharmacies.size());
            }

            @Override
            public Pharmacy2 next() {
                return pharmacies.get(index++);
            }
        };
    }



    public List<Pharmacy2> getPharmacies() {
        return this.pharmacies;
    }

    public void sortByPower(){
        Collections.sort(this.pharmacies);
    }

    public void sortByWeight(){
        pharmacies.sort(new Comparator<Pharmacy2>(){
            @Override
            public int compare(Pharmacy2 o1, Pharmacy2 o2) {
                return o1.compareToWeight(o2);
            }
        });
    }
}
