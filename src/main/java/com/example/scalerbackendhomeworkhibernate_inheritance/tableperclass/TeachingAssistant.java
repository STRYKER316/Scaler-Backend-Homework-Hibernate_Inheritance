package com.example.scalerbackendhomeworkhibernate_inheritance.tableperclass;

import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity(name = "tpc_ta")
public class TeachingAssistant extends User {
    private double avgRating;
}
