package veterinaryClinic.core.drugStore;

public abstract class Component implements Comparable<Component> {
    private String Title;
    private Double weight;
    private Double power;

    public Component(String title, Double weight, Double power) {
        this.Title = title;
        this.weight = weight;
        this.power = power;
    }
    @Override
    public String toString() {
        return String.format("Title = %s, Weight = %s, Power = %s", this.Title, this.weight, this.power);
    }

    @Override
    public int compareTo(Component o) {
        //   return this.power - o.power;
        if(this.power < o.power){
            return -1;
        }else if(this.power > o.power) {
            return 1;
        }
        else {
            return 0;
        }
     //   return Integer.compare(this.power, o.power);

    }

    public Double getWeight() {
        return weight;
    }

    public Double getPower() {
        return power;
    }
}
