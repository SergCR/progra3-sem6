package com.practicasemana6.practicasemana6;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.PutMapping;
import java.util.ArrayList;
import java.util.List;

@RestController
public class RestAnimalController {
    
    @GetMapping("/animal")
    public Animal getAnimal(){
        return new Animal("Perro", "Mamifero", "Ladrido");
    }

    @GetMapping("/animales")
    public void geAnimals(){
        Animal animalList = new Animal();
        animalList.getAnimals();
    }

    @PostMapping("/animal")
    public void addAnimal(String name, String type, String sound){
        Animal miAnimal = new Animal(name, type, sound);
        miAnimal.addAnimal(miAnimal);
        miAnimal.getAnimals();
    }

    @DeleteMapping("/animal")
    public void deleteAnimal(int index){
        Animal miAnimal = new Animal();
        miAnimal.genAnimals();
        miAnimal.getAnimals();
        miAnimal.removeAnimal(index);
        miAnimal.getAnimals();
    }

    @PutMapping("/animal")
    public void editAnimal(String name, String type, String sound, int index){
        Animal elAnimal = new Animal(name, type, sound);
        elAnimal.updateListMember(elAnimal, index);
    }
}
