package com.example.scalerbackendhomeworkhibernate_inheritance.mappedsuperclass;

import jakarta.persistence.Entity;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity(name = "ms_ta")
public class TeachingAssistant extends User {
    private double avgRating;
}
