package veterinaryClinic.core.personal;

public abstract class Personal {
    private String name = "Имя";
    private int stage = 30;
    private String position = "Должность";
    private String department = "Отдел";

    public Personal(String name, int stage, String position, String department) {
        this.name = name;
        this.stage = stage;
        this.position = position;
        this.department = department;
    }
    public Personal(){

    }

    @Override
    public String toString() {
        return String.format("%s %s %s %s", this.name, this.stage, this.position, this.department);
    }


    protected String getName() {
        return name;
    }
}
