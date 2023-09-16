package com.example.scalerbackendhomeworkhibernate_inheritance.singletable;

import jakarta.persistence.Entity;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity(name = "st_ta")
public class TeachingAssistant extends User {
    private double avgRating;
}
