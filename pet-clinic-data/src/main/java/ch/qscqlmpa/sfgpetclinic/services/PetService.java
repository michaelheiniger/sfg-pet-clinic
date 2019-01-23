package ch.qscqlmpa.sfgpetclinic.services;

import ch.qscqlmpa.sfgpetclinic.model.Pet;

import java.util.Set;

public interface PetService {

    Pet findById(Long id);

    Pet save(Pet pet);

    Set<Pet> findAll();
}
