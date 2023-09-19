package com.example.scalerbackendhomeworkhibernate_inheritance;

//import com.example.scalerbackendhomeworkhibernate_inheritance.singletable.MentorRepository;
//import com.example.scalerbackendhomeworkhibernate_inheritance.singletable.UserRepository;
//import com.example.scalerbackendhomeworkhibernate_inheritance.singletable.Mentor;
//import com.example.scalerbackendhomeworkhibernate_inheritance.singletable.User;
import com.example.scalerbackendhomeworkhibernate_inheritance.tableperclass.Mentor;
import com.example.scalerbackendhomeworkhibernate_inheritance.tableperclass.MentorRepository;
import com.example.scalerbackendhomeworkhibernate_inheritance.tableperclass.User;
import com.example.scalerbackendhomeworkhibernate_inheritance.tableperclass.UserRepository;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ScalerBackendHomeworkHibernateInheritanceApplication implements CommandLineRunner {

    public static void main(String[] args) {
        SpringApplication.run(ScalerBackendHomeworkHibernateInheritanceApplication.class, args);
    }


//    ------------------- Code to save entities to DB -------------------
    private MentorRepository mentorRepository;
    private UserRepository userRepository;

    public ScalerBackendHomeworkHibernateInheritanceApplication(@Qualifier("mentorRepo_tpc") MentorRepository mentorRepository,
                                                                 @Qualifier("userRepo_tpc") UserRepository userRepository) {
        this.mentorRepository = mentorRepository;
        this.userRepository = userRepository;
    }

    @Override
    public void run(String... args) throws Exception {
//        save a Mentor object to Single-Table DB
        Mentor mentor = new Mentor();
        mentor.setName("Stryker316");
        mentor.setEmail("stryker@yahoo.com");
        mentor.setAvgRating(4.75);
        mentorRepository.save(mentor);

//        save a User object to Single-Table DB
        User user = new User();
        user.setName("User1");
        user.setEmail("User1@Yahoo.com");
        userRepository.save(user);
    }
}
