//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Pet pet1 = new Pet();
        pet1.name = "Cometa";
        pet1.breed = "Criollo";
        pet1.kind = Kind.Dog;


        System.out.println(pet1);

        Pet Bernabe = new Pet();
        Bernabe.name = "Bernabe";
        Bernabe.breed = "Calico";
        Bernabe.kind = Kind.Cat;

        System.out.println(Bernabe);
    }
}