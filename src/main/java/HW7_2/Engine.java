package HW7_2;

public class Engine<T extends Comparable<T>> implements Comparable<Engine<T>> {
    private String type;
    private int horsepower;
    private int torque;

    public Engine(String type, int horsepower, int torque) {
        this.type = type;
        this.horsepower = horsepower;
        this.torque = torque;
    }

    public String getType() {
        return type;
    }

    public int getHorsepower() {
        return horsepower;
    }

    public int getTorque() {
        return torque;
    }

    @Override
    public int compareTo(Engine<T> other) {
        return Integer.compare(this.horsepower, other.getHorsepower());
    }

    public static void main(String[] args) {
        Engine<Integer> ea888Engine = new Engine<>("EA888", 220, 350);
        Engine<Integer> anotherEngine = new Engine<>("EA111", 150, 300);

        System.out.println("Comparison Result: " + ea888Engine.compareTo(anotherEngine));
    }
}

