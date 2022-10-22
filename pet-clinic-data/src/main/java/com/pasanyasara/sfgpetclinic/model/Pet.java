package com.pasanyasara.sfgpetclinic.model;

import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;

@Getter
@Setter
public class Pet {
    private PetType petType;
    private Owner owner;
    private LocalDate birthDate;
}
