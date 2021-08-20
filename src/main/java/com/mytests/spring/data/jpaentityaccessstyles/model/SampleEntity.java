package com.mytests.spring.data.jpaentityaccessstyles.model;

import javax.persistence.*;

/**
 * *
 * <p>Created by irina on 8/20/2021.</p>
 * <p>Project: jpa-entity-access-styles</p>
 * *
 */
@Entity
@Table(name = "sample", schema = "jbtests")
@Access(AccessType.PROPERTY)  // without this annotation the columns will not be found since the fields have different names and the accessors annotations are ignored
public class SampleEntity extends BaseSampleEntity {
    private String name;
    private String appearance;

    @Basic
    @Column(name = "sample")
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Basic
    @Column(name = "color")
    public String getAppearance() {
        return appearance;
    }

    public void setAppearance(String appearance) {
        this.appearance = appearance;
    }

    @Override
    public String toString() {
        return "SampleEntity{" +
                "id='" + getId() + '\'' +
                "version='" + getVersion() + '\'' +
                "name='" + name + '\'' +
                ", appearance='" + appearance + '\'' +
                '}';
    }
}
