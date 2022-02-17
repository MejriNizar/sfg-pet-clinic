package guru.springframework.sfgpetclinic.services;

import guru.springframework.sfgpetclinic.model.Owner;
import guru.springframework.sfgpetclinic.model.Vet;

import java.util.Set;

public interface VetService {
    Vet findById(long id);
    Vet save(Vet owner);
    Vet findByLastName(String lastName);
    Set<Vet> findAll();
}
