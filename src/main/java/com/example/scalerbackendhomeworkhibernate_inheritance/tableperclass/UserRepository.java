package com.example.scalerbackendhomeworkhibernate_inheritance.tableperclass;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository("userRepo_tpc")
public interface UserRepository extends JpaRepository<User, Long> {
    @Override
    <S extends User> S save(S entity);
}
