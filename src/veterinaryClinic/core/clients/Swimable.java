package veterinaryClinic.core.clients;

public interface Swimable {
    void swim();
    default double getSwimSpeed(){
        return 2;
    };
}
