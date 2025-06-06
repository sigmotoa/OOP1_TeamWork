import javax.sound.midi.Soundbank;


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

        Pet juan082 = new Pet();
        juan082.name = "Simon";
        juan082.breed = "Golden Retriever";
        juan082.kind = Kind.Dog;
        System.out.println(juan082);

        Pet kath115 = new Pet();
        kath115.name = "lulu";
        kath115.breed = "guacamaya";
        kath115.kind = Kind.Bird;



        System.out.println(pet1);


        Pet Bernabe046 = new Pet();
        Bernabe046.name = "Bernabe";
        Bernabe046.breed = "Calico";
        Bernabe046.kind = Kind.Cat;

        System.out.println(Bernabe046);

        Pet eduardo038 = new Pet();
        eduardo038.name = "techino";
        eduardo038.breed = "rolo";
        eduardo038.kind = Kind.Alligator;
    System.out.println(eduardo038);


        Pet Santiago111 = new Pet();
        Santiago111.name = "Santiago";
        Santiago111.breed = "";
        Santiago111.kind = Kind.Alligator;

        System.out.println(Santiago111);


    }
}