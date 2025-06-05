import java.util.ArrayList;
import java.util.List;

public class Owner {
    private String name;
    private List<Pet> pets;

    public Owner(String name) {
        this.name = name;
        this.pets = new ArrayList<>();
    }

    public void addPet(Pet pet) {
        pets.add(pet);
    }

    public void requestService(Pet pet, Service service) {
        pet.receiveService(service);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Pet> getPets() {
        return pets;
    }

    public void setPets(List<Pet> pets) {
        this.pets = pets;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Lastnik: ").append(name).append("\n");
        for (Pet pet : pets) {
            sb.append(" - ").append(pet).append("\n");
        }
        return sb.toString();
    }
}