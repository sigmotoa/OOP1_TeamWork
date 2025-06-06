import java.util.StringJoiner;

public class Pet {

    String name;
    String breed;
    Enum<Kind> kind;

    public Pet(String name ,String breed) {
        this.name = name;
        this.breed = breed;
    }

    @Override
    public String toString() {
        return new StringJoiner(", ", Pet.class.getSimpleName() + "[", "]")
                .add("name='" + name + "'")
                .add("breed='" + breed + "'")
                .add("kind=" + kind)
                .toString();
    }
}
