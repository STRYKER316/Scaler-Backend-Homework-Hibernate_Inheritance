package com.example.scalerbackendhomeworkhibernate_inheritance.repositories;

import com.example.scalerbackendhomeworkhibernate_inheritance.singletable.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepositorySingleTable extends JpaRepository<User, Long> {
    @Override
    <S extends User> S save(S entity);
}
