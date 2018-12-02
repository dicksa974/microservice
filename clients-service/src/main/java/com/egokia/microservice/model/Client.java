package com.egokia.microservice.model;

import org.bson.types.ObjectId;

/**
 * Created by Aounetse vincent on 28/11/2018.
 */
public class Client {

    private ObjectId _id;
    private int phone;
    private String adress_1;
    private String adress_2;
    private int codePostal;
    private String ville;
    private String pays;
    private User user;

    public Client() {
    }

    public Client(ObjectId _id, int phone, String adress_1, String adress_2, int codePostal, String ville, String pays, User user) {
        this._id = _id;
        this.phone = phone;
        this.adress_1 = adress_1;
        this.adress_2 = adress_2;
        this.codePostal = codePostal;
        this.ville = ville;
        this.pays = pays;
        this.user = user;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public ObjectId get_id() {
        return _id;
    }

    public void set_id(ObjectId _id) {
        this._id = _id;
    }

    public int getPhone() {
        return phone;
    }

    public void setPhone(int phone) {
        this.phone = phone;
    }

    public String getAdress_1() {
        return adress_1;
    }

    public void setAdress_1(String adress_1) {
        this.adress_1 = adress_1;
    }

    public String getAdress_2() {
        return adress_2;
    }

    public void setAdress_2(String adress_2) {
        this.adress_2 = adress_2;
    }

    public int getCodePostal() {
        return codePostal;
    }

    public void setCodePostal(int codePostal) {
        this.codePostal = codePostal;
    }

    public String getVille() {
        return ville;
    }

    public void setVille(String ville) {
        this.ville = ville;
    }

    public String getPays() {
        return pays;
    }

    public void setPays(String pays) {
        this.pays = pays;
    }
}
