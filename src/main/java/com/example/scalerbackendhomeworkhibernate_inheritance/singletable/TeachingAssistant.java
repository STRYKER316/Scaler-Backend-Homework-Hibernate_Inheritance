package com.example.scalerbackendhomeworkhibernate_inheritance.singletable;

import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity(name = "st_ta")
@DiscriminatorValue("3")
public class TeachingAssistant extends User {
    private double avgRating;
}
