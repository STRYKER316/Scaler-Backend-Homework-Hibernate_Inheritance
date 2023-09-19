package com.example.scalerbackendhomeworkhibernate_inheritance.tableperclass;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository("mentorRepo_tpc")
public interface MentorRepository extends JpaRepository<Mentor, Long> {
    @Override
    <S extends Mentor> S save(S entity);
}
