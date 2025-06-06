import java.util.StringJoiner;

public class Pet {

    String name;
    String breed;
    Enum<Kind> kind;

    @Override
    public String toString() {
        return new StringJoiner(", ", Pet.class.getSimpleName() + "[", "]")
                .add("name='" + name + "'")
                .add("breed='" + breed + "'")
                .add("kind=" + kind)
                .toString();
    }
}
