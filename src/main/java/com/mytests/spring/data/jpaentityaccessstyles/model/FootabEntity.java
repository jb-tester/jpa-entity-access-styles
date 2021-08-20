package com.mytests.spring.data.jpaentityaccessstyles.model;

import javax.persistence.*;

/**
 * *
 * <p>Created by irina on 8/20/2021.</p>
 * <p>Project: jpa-entity-access-styles</p>
 * *
 */
@Entity
@Table(name = "footab", schema = "jbtests")
// @Access(AccessType.PROPERTY)   // error should be reported about the missing id
public class FootabEntity {
    @Id
    @Column(name = "username")
    private String username;

    private Integer age;

    private Byte enabled;

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public Byte getEnabled() {
        return enabled;
    }

    public void setEnabled(Byte enabled) {
        this.enabled = enabled;
    }


}
