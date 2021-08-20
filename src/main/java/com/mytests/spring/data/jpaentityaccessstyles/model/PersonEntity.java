package com.mytests.spring.data.jpaentityaccessstyles.model;

import javax.persistence.*;

/**
 * *
 * <p>Created by irina on 8/20/2021.</p>
 * <p>Project: jpa-entity-access-styles</p>
 * *
 */
@Entity
@Table(name = "person", schema = "jbtests")
@Access(AccessType.PROPERTY)
public class PersonEntity {
    private Long id;
    private String name;
    private String surName;
    private String addr;

    @Id
    @Column(name = "id")
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    @Basic
    @Column(name = "first_name")
    public String getFirstName() {
        return name;
    }

    public void setFirstName(String firstName) {
        this.name = firstName;
    }

    @Basic
    @Column(name = "last_name")
    public String getLastName() {
        return surName;
    }

    public void setLastName(String lastName) {
        this.surName = lastName;
    }

    @Basic
    @Column(name = "address")
    public String getAddress() {
        return addr;
    }

    public void setAddress(String address) {
        this.addr = address;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        PersonEntity that = (PersonEntity) o;

        if (id != null ? !id.equals(that.id) : that.id != null) return false;
        if (name != null ? !name.equals(that.name) : that.name != null) return false;
        if (surName != null ? !surName.equals(that.surName) : that.surName != null) return false;
        if (addr != null ? !addr.equals(that.addr) : that.addr != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id != null ? id.hashCode() : 0;
        result = 31 * result + (name != null ? name.hashCode() : 0);
        result = 31 * result + (surName != null ? surName.hashCode() : 0);
        result = 31 * result + (addr != null ? addr.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "PersonEntity{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", surName='" + surName + '\'' +
                ", addr='" + addr + '\'' +
                '}';
    }
}
