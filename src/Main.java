//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Pet pet1 = new Pet();
        pet1.name = "Cometa";
        pet1.breed = "Criollo";
        pet1.kind = Kind.Dog;

        Pet kath115 = new Pet();
        kath115.name = "lulu";
        kath115.breed = "guacamaya";
        kath115.kind = Kind.Bird;



        System.out.println(pet1);
    }
}