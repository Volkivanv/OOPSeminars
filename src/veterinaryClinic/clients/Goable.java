package veterinaryClinic.clients;

@FunctionalInterface
public interface Goable {
//    public static final double pi = 3.14159; // Является константой
//    public static final List<Integer> pp = new ArrayList<>();
    void go();
    default double getRunSpeed(){
        return 10;
    }
}
