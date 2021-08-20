package com.mytests.spring.data.jpaentityaccessstyles.repos;

import com.mytests.spring.data.jpaentityaccessstyles.model.ContactEntity;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.RepositoryDefinition;

import java.util.List;

/**
 * *
 * <p>Created by irina on 8/20/2021.</p>
 * <p>Project: jpa-entity-access-styles</p>
 * *
 */
@RepositoryDefinition(domainClass = ContactEntity.class, idClass = Integer.class )
public interface ContactRepo {

    @Query("select c from ContactEntity c where c.lastname = 'petrovskaya' ")
    List<ContactEntity> customQuery1();

    // used 'name' column is incorrect
   // List<ContactEntity> findByNameIs(String name);
}
