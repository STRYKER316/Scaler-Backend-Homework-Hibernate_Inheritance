package com.example.scalerbackendhomeworkhibernate_inheritance.repositories;

import com.example.scalerbackendhomeworkhibernate_inheritance.singletable.Mentor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MentorRepositorySingleTable extends JpaRepository<Mentor, Long> {
    @Override
    <S extends Mentor> S save(S entity);
}
