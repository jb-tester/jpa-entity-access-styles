package com.mytests.spring.data.jpaentityaccessstyles.repos;

import com.mytests.spring.data.jpaentityaccessstyles.model.SampleEntity;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

/**
 * *
 * <p>Created by irina on 8/20/2021.</p>
 * <p>Project: jpa-entity-access-styles</p>
 * *
 */
public interface SampleRepo extends CrudRepository<SampleEntity, Integer> {

    List<SampleEntity> findByAppearanceAndVersion(String appearance, Integer version);
}
