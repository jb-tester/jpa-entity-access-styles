package com.mytests.spring.data.jpaentityaccessstyles.model;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;

/**
 * *
 * <p>Created by irina on 8/20/2021.</p>
 * <p>Project: jpa-entity-access-styles</p>
 * *
 */
@MappedSuperclass
public class BaseSampleEntity {
    @Id
    @Column(name = "id")
    private Integer id;
    @Basic
    @Column(name = "version")
    private Integer version;


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }


    public Integer getVersion() {
        return version;
    }

    public void setVersion(Integer version) {
        this.version = version;
    }
}
