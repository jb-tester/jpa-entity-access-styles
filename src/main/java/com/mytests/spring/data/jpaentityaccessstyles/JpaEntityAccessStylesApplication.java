package com.mytests.spring.data.jpaentityaccessstyles;

import com.mytests.spring.data.jpaentityaccessstyles.model.ContactEntity;
import com.mytests.spring.data.jpaentityaccessstyles.model.PersonEntity;
import com.mytests.spring.data.jpaentityaccessstyles.model.SampleEntity;
import com.mytests.spring.data.jpaentityaccessstyles.repos.ContactRepo;
import com.mytests.spring.data.jpaentityaccessstyles.repos.PersonRepo;
import com.mytests.spring.data.jpaentityaccessstyles.repos.SampleRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class JpaEntityAccessStylesApplication implements CommandLineRunner {

    @Autowired
    private ContactRepo contactRepo;
    @Autowired
    private PersonRepo personRepo;
    @Autowired
    private SampleRepo sampleRepo;


    public static void main(String[] args) {
        SpringApplication.run(JpaEntityAccessStylesApplication.class, args);
    }


    @Override
    public void run(String... args) throws Exception {
        for (ContactEntity contact : contactRepo.customQuery1()) {
            System.out.println(contact);
        }
         for (PersonEntity person : personRepo.personQuery1()) {
            System.out.println(person);
        }
        for (SampleEntity sample : sampleRepo.findByAppearanceAndVersion("blue", 7)) {
            System.out.println(sample);
        }
         // incorrect queries tests:

        /*for (ContactEntity contact : contactRepo.findByNameIs("irina")) {
            System.out.println(contact);
        }*/

       /* for (PersonEntity person : personRepo.findByAddrContaining("UK")) {
            System.out.println(person);
        }*/
       /* for (PersonEntity person : personRepo.personQuery2("andrey")) {
            System.out.println(person);
        }*/
    }
}
