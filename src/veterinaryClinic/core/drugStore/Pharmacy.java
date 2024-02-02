package veterinaryClinic.core.drugStore;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Pharmacy implements Iterator<Component> {
    private List<Component> components;
    private int index = 0;

    public Pharmacy() {
        this.components = new ArrayList<>();
    }

    public void addComponents(Component... components) {
        for (Component c : components) {
            this.components.add(c);
        }
    }

    @Override
    public boolean hasNext() {
        return (index < components.size());
    }

    @Override
    public Component next() {
        return components.get(index++);
    }
}
