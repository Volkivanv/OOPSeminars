package veterinaryClinic.core.drugStore;

import veterinaryClinic.core.drugStore.Component;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Spliterator;
import java.util.function.Consumer;

public class Pharmacy2 implements Iterable<Component>, Comparable<Pharmacy2> {
    private String name = "Панацея";
    private List<Component> components;
    private int index = 0;

    public Pharmacy2() {
        this.components = new ArrayList<>();
    }
    public Pharmacy2(String name) {
        this.name = name;
        this.components = new ArrayList<>();
    }

    public void addComponents(Component... components) {
        for (Component c : components) {
            this.components.add(c);
        }
    }


    @Override
    public Iterator<Component> iterator() {
        return new Iterator<Component>() { //Анонимный класс
            @Override
            public boolean hasNext() {
                return (index < components.size());
            }

            @Override
            public Component next() {
                return components.get(index++);
            }
        };
    }

    @Override
    public void forEach(Consumer<? super Component> action) {
        Iterable.super.forEach(action);
    }

    @Override
    public Spliterator<Component> spliterator() {
        return Iterable.super.spliterator();
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(name);
        sb.append(", ");
        sb.append("Эффективность: "+ this.getTotalPower());
        sb.append(", ");
        sb.append("Масса: "+ this.getTotalWeight());
        return sb.toString();
    }
    public Double getTotalWeight(){
        Double totalWeight = 0D;
        for (Component c : components) {
            totalWeight += c.getWeight();
        }
        return totalWeight;
    }
    public Double getTotalPower(){
        Double totalPower = 0D;
        for (Component c : components) {
            totalPower += c.getPower() * c.getWeight();
        }
        return totalPower;
    }

    @Override
    public int compareTo(Pharmacy2 o) {
        if(this.getTotalPower() < o.getTotalPower()){
            return -1;
        } else if(this.getTotalPower() == o.getTotalPower()){

            return 0;
        } else {
            return 1;
        }
    }

    public int compareToWeight(Pharmacy2 o) {
        if(this.getTotalWeight() < o.getTotalWeight()){
            return -1;
        } else if(this.getTotalWeight() == o.getTotalWeight()){

            return 0;
        } else {
            return 1;
        }
    }
}
