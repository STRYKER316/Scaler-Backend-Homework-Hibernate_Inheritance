package com.example.scalerbackendhomeworkhibernate_inheritance;

import com.example.scalerbackendhomeworkhibernate_inheritance.repositories.MentorRepositorySingleTable;
import com.example.scalerbackendhomeworkhibernate_inheritance.repositories.UserRepositorySingleTable;
import com.example.scalerbackendhomeworkhibernate_inheritance.singletable.Mentor;
import com.example.scalerbackendhomeworkhibernate_inheritance.singletable.User;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ScalerBackendHomeworkHibernateInheritanceApplication implements CommandLineRunner {

    public static void main(String[] args) {
        SpringApplication.run(ScalerBackendHomeworkHibernateInheritanceApplication.class, args);
    }


//    Code to save entities to DB
    private MentorRepositorySingleTable mentorRepositorySingleTable;
    private UserRepositorySingleTable userRepositorySingleTable;

    public ScalerBackendHomeworkHibernateInheritanceApplication (MentorRepositorySingleTable mentorRepositorySingleTable,
                                                                 UserRepositorySingleTable userRepositorySingleTable) {
        this.mentorRepositorySingleTable = mentorRepositorySingleTable;
        this.userRepositorySingleTable = userRepositorySingleTable;
    }

    @Override
    public void run(String... args) throws Exception {
//        save a Mentor object to DB
        Mentor mentor = new Mentor();
        mentor.setName("Stryker316");
        mentor.setEmail("stryker@yahoo.com");
        mentor.setAvgRating(4.75);
        mentorRepositorySingleTable.save(mentor);

//        save a User object to DB
        User user = new User();
        user.setName("User1");
        user.setEmail("User1@Yahoo.com");
        userRepositorySingleTable.save(user);

    }
}
