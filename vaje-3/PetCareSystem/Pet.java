import java.util.ArrayList;
import java.util.List;

public class Pet {
    private String name;
    private String species;
    private int age;
    private List<Service> serviceHistory;

    public Pet(String name, String species, int age) {
        this.name = name;
        this.species = species;
        this.age = age;
        this.serviceHistory = new ArrayList<>();
    }

    public void receiveService(Service service) {
        serviceHistory.add(service);
        System.out.println(name + " je prejel storitev: " + service.getDescription());
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSpecies() {
        return species;
    }

    public void setSpecies(String species) {
        this.species = species;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public List<Service> getServiceHistory() {
        return serviceHistory;
    }

    public void setServiceHistory(List<Service> serviceHistory) {
        this.serviceHistory = serviceHistory;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(name).append(" (").append(species).append(", ").append(age).append(" let)\n");
        sb.append("  Storitev zgodovina:\n");
        for (Service service : serviceHistory) {
            sb.append("    - ").append(service).append("\n");
        }
        return sb.toString();
    }
}