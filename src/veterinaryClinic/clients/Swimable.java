package veterinaryClinic.clients;

public interface Swimable {
    void swim();
    default double getSwimSpeed(){
        return 2;
    };
}
