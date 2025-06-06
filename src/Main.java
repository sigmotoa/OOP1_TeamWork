//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Pet pet1 = new Pet();
        pet1.name = "Cometa";
        pet1.breed = "Criollo";
        pet1.kind = Kind.Dog;

        Pet bird019 = new Pet();
        bird019.name = "Agaporni";
        bird019.breed = "Inseparables";
        bird019.kind = Kind.Bird;

        System.out.println(pet1);
    }
}