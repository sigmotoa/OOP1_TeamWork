import javax.sound.midi.Soundbank;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Pet pet1 = new Pet();
        pet1.name = "Cometa";
        pet1.breed = "Criollo";
        pet1.kind = Kind.Dog;

        Pet juan082 = new Pet();
        juan082.name = "Simon";
        juan082.breed = "Golden Retriever";
        juan082.kind = Kind.Dog;
        System.out.println(juan082);
        System.out.println(pet1);
    }
}