package com.montoya.appfragment;

import java.io.Serializable;

public class Persona implements Serializable {
    private  int id;
    private  String nom,tel,email,gru;
    private  int idImg;

    public Persona() {
    }

    public Persona(int id, String nom, String tel, String email, String gru, int idImg) {
        this.id = id;
        this.nom = nom;
        this.tel = tel;
        this.email = email;
        this.gru = gru;
        this.idImg = idImg;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getTel() {
        return tel;
    }

    public void setTel(String tel) {
        this.tel = tel;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getGru() {
        return gru;
    }

    public void setGru(String gru) {
        this.gru = gru;
    }

    public int getIdImg() {
        return idImg;
    }

    public void setIdImg(int idImg) {
        this.idImg = idImg;
    }
}
