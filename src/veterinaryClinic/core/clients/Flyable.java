package veterinaryClinic.core.clients;

public interface Flyable {
    void fly();
    default double getFlySpeed(){
        return 90;
    }
}
