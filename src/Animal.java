import java.util.LinkedList;

public class Animal {
    private LinkedList<String> names;

    public Animal() {
        this.names = new LinkedList<>();
    }

    public void addAnimal(String name) {
        names.addFirst(name);
    }

    public String removeAnimal() {
        if (!names.isEmpty()) {
            return names.removeLast();
        } else {
            return null;
        }
    }

    public void printNames() {
        System.out.println("Animals:");
        for (String name : names) {
            System.out.println(name);
        }
    }
}
