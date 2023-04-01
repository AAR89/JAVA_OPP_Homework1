package JAVA_OPP_Homework1;

public enum Relationships {
    PARENT("Родители"), CHILDREN("Дети");

    private String description;

    Relationships(String description) {
        this.description = description;
    }
}
