public class Main {
    public static void main(String[] args) {
        Owner ana = new Owner("Ana");
        Pet fido = new Pet("Fido", "Pes", 3);
        Pet mimi = new Pet("Mimi", "Mačka", 2);

        ana.addPet(fido);
        ana.addPet(mimi);

        Service vet = new Service("Veterinarski pregled", 30);
        Service grooming = new Service("Nega dlake", 20);

        ana.requestService(fido, vet);
        ana.requestService(mimi, grooming);

        System.out.println();
        System.out.println(ana);
    }
}