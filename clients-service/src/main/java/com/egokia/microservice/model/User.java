package com.egokia.microservice.model;

import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;

import java.util.Date;

/**
 * Created by Aounetse vincent on 27/11/2018.
 */
public class User {

    @Id
    private ObjectId _id;
    private Date creation;
    private Boolean status;
    private String lastname;
    private String firstname;

    public User() {
    }

    public User(ObjectId _id, Date creation, Boolean status, String lastname, String firstname) {
        this._id = _id;
        this.creation = creation;
        this.status = status;
        this.lastname = lastname;
        this.firstname = firstname;
    }

    public ObjectId getId() {
        return _id;
    }

    public void setId(ObjectId id) {
        this._id = id;
    }

    public Date getCreation() {
        return creation;
    }

    public void setCreation(Date creation) {
        this.creation = creation;
    }

    public Boolean getStatus() {
        return status;
    }

    public void setStatus(Boolean status) {
        this.status = status;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }
}
