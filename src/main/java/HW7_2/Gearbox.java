package HW7_2;

public class Gearbox<T, U, V> {
    private T type;
    private U schema;
    private V automatic;

    public Gearbox(T type, U schema, V automatic) {
        this.type = type;
        this.schema = schema;
        this.automatic = automatic;
    }

    public T getType() {
        return type;
    }

    public U getSchema() {
        return schema;
    }

    public V getAutomatic() {
        return automatic;
    }
}


//Приклад використання
//
//public class Main {
//    public static void main(String[] args) {
//        Gearbox<String, String, Boolean> gearbox = new Gearbox<>("CVT", "4WD", true);
//        System.out.println("Type: " + gearbox.getType());
//        System.out.println("Schema: " + gearbox.getSchema());
//        System.out.println("Automatic: " + gearbox.getAutomatic());
//    }
//}
