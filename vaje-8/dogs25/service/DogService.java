package si.unm.fis.prspr.dogs.service;

import java.util.List;

import org.springframework.stereotype.Service;

import si.unm.fis.prspr.dogs.entity.Dog;
import si.unm.fis.prspr.dogs.repository.DogRepository;

@Service
public class DogService {
    private final DogRepository dogRepository;

    public DogService(DogRepository dogRepository) {
        this.dogRepository = dogRepository;
    }

    public List<Dog> getDogs(){
        return dogRepository.findAll();
    }

    public void addDog(Dog d){
        dogRepository.save(d);
    }

    public void updateDog(Dog d){
        dogRepository.save(d);
    }

    public void deleteDog(Integer id){
        dogRepository.deleteById(id);
    }

}
