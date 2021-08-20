package com.mytests.spring.data.jpaentityaccessstyles.repos;

import com.mytests.spring.data.jpaentityaccessstyles.model.PersonEntity;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

/**
 * *
 * <p>Created by irina on 8/20/2021.</p>
 * <p>Project: jpa-entity-access-styles</p>
 * *
 */
public interface PersonRepo extends CrudRepository<PersonEntity, Integer> {

    @Query("select p from PersonEntity p where p.firstName = 'irina'")
    List<PersonEntity> personQuery1();

    //used 'addr' column is incorrect
  //  List<PersonEntity> findByAddrContaining(String addr);

    // used 'name' column is incorrect
    // @Query("select p from PersonEntity p where p.name= :name")
    // List<PersonEntity> personQuery2(String name);
}
