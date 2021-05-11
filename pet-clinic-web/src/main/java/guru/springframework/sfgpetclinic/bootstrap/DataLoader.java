package guru.springframework.sfgpetclinic.bootstrap;

import guru.springframework.sfgpetclinic.model.Owner;
import guru.springframework.sfgpetclinic.model.Pet;
import guru.springframework.sfgpetclinic.model.PetType;
import guru.springframework.sfgpetclinic.model.Vet;
import guru.springframework.sfgpetclinic.services.OwnerService;
import guru.springframework.sfgpetclinic.services.PetTypeService;
import guru.springframework.sfgpetclinic.services.VetService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.time.LocalDate;

/**
 * Created by gs on 04/05/2021.
 **/
@Component
public class DataLoader implements CommandLineRunner {
    private final OwnerService ownerService;
    private final VetService vetService;
    private final PetTypeService petTypeService;

    @Autowired
    public DataLoader(OwnerService ownerService, VetService vetService, PetTypeService petTypeService) {
        this.ownerService = ownerService;
        this.vetService = vetService;
        this.petTypeService = petTypeService;
    }

    @Override
    public void run(String... args) throws Exception {

        PetType dog = new PetType();
        dog.setName("Dog");
        petTypeService.save(dog);
        PetType cat = new PetType();
        cat.setName("Cat");
        petTypeService.save(cat);

        System.out.println("Loaded PetTypes...");

        Owner owner1 = new Owner();
        owner1.setFirstName("Michael");
        owner1.setLastName("Schumacher");
        owner1.setAddress("123 New Street");
        owner1.setCity("Brumbrum");
        owner1.setTelephone("123123123123123");

        Pet michaelsPet = new Pet();
        michaelsPet.setPetType(dog);
        michaelsPet.setOwner(owner1);
        michaelsPet.setBirthDate(LocalDate.now());
        michaelsPet.setName("Archie");
        owner1.getPets().add(michaelsPet);
        ownerService.save(owner1);

        Owner owner2 = new Owner();
        owner2.setFirstName("John");
        owner2.setLastName("Doe");
        owner2.setAddress("456 Old Street");
        owner2.setCity("London");
        owner2.setTelephone("7667565656");

        Pet johnsPet = new Pet();
        johnsPet.setPetType(cat);
        johnsPet.setOwner(owner2);
        johnsPet.setBirthDate(LocalDate.now());
        johnsPet.setName("Katinukas");
        owner2.getPets().add(johnsPet);
        ownerService.save(owner2);

        Owner owner3 = new Owner();
        owner3.setFirstName("Joanna");
        owner3.setLastName("Doanna");
        owner3.setAddress("777 Old Street");
        owner3.setCity("Miami");
        owner3.setTelephone("6565454565656");

        Pet joannesPet = new Pet();
        joannesPet.setPetType(cat);
        joannesPet.setOwner(owner3);
        joannesPet.setBirthDate(LocalDate.now());
        joannesPet.setName("Ziggy");
        owner3.getPets().add(joannesPet);
        ownerService.save(owner3);

        System.out.println("Loaded Owners...");

        Vet vet1 = new Vet();
        vet1.setFirstName("Jarno");
        vet1.setLastName("Truli");

        vetService.save(vet1);

        Vet vet2 = new Vet();
        vet2.setFirstName("Jane");
        vet2.setLastName("Doe");

        vetService.save(vet2);

        System.out.println("Loaded Vets...");
    }
}
