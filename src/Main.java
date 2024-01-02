public class Main {
    public static void main(String[] args) {
        Animal animals = new Animal();

        animals.addAnimal("Rabbit");
        animals.addAnimal("Tiger");
        animals.addAnimal("Cat");
        animals.addAnimal("Frog");
        animals.addAnimal("Dog");
        
        animals.printNames();

        animals.removeAnimal();

        animals.printNames();
    }
}