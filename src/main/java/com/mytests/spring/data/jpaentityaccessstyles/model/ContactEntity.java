package com.mytests.spring.data.jpaentityaccessstyles.model;

import javax.persistence.*;

/**
 * *
 * <p>Created by irina on 8/20/2021.</p>
 * <p>Project: jpa-entity-access-styles</p>
 * *
 */
@Entity
@Table(name = "contact", schema = "jbtests")
@Access(AccessType.FIELD)
public class ContactEntity {
    @Id
    private Integer id;
    @Basic
    private String firstname;
    @Basic
    private String lastname;
    @Basic
    private String telephone;
    @Basic
    private String email;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return firstname;
    }

    public void setName(String firstname) {
        this.firstname = firstname;
    }

    public String getSurname() {
        return lastname;
    }

    public void setSurname(String lastname) {
        this.lastname = lastname;
    }

    public String getPhone() {
        return telephone;
    }

    public void setPhone(String telephone) {
        this.telephone = telephone;
    }

    public String getMailAddr() {
        return email;
    }

    public void setMailAddr(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "ContactEntity{" +
                "id=" + id +
                ", firstname='" + firstname + '\'' +
                ", lastname='" + lastname + '\'' +
                ", telephone='" + telephone + '\'' +
                ", email='" + email + '\'' +
                '}';
    }
}
