package veterinaryClinic.core.drugStore.components;

import veterinaryClinic.core.drugStore.Component;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Spliterator;
import java.util.function.Consumer;

public class Pharmacy2 implements Iterable<Component> {
    private List<Component> components;
    private int index = 0;

    public Pharmacy2() {
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
}
