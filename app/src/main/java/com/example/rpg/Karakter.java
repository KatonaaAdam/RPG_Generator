package com.example.rpg;

import java.util.Random;

public class Karakter {
    boolean ferfi;
    String fajta;
    int ero;
    int ertelem;
    int magia;
    int eletero;
    int ugyesseg;
    int kitartas;
    String nev;
    String story;
    Random r = new Random();


    public Karakter(boolean ferfi, String fajta, int ero, int ertelem, int magia, int eletero, int ugyesseg, int kitartas, String nev, String story) {
        this.ferfi = ferfi;
        this.fajta = fajta;
        this.ero = ero;
        this.ertelem = ertelem;
        this.magia = magia;
        this.eletero = eletero;
        this.ugyesseg = ugyesseg;
        this.kitartas = kitartas;
        this.nev = nev;
        this.story = story;
    }

    public Karakter(boolean ferfi, String fajta, int ero, int ertelem, int magia, int eletero, int ugyesseg, int kitartas) {
        this.ferfi = ferfi;
        this.fajta = fajta;
        this.ero = ero;
        this.ertelem = ertelem;
        this.magia = magia;
        this.eletero = eletero;
        this.ugyesseg = ugyesseg;
        this.kitartas = kitartas;
    }

    public String getNev() {
        return nev;
    }

    public void setNev(String nev) {
        this.nev = nev;
    }

    public String getStory() {
        return story;
    }

    public void setStory(String story) {
        this.story = story;
    }

    public Karakter() {
    }

    public boolean isFerfi() {
        return ferfi;
    }

    public void setFerfi(boolean ferfi) {
        this.ferfi = ferfi;
    }

    public String getFajta() {
        return fajta;
    }

    public void setFajta(String fajta) {
        this.fajta = fajta;
    }

    public int getEro() {
        return ero;
    }

    public void setEro(int ero) {
        this.ero = ero;
    }

    public int getErtelem() {
        return ertelem;
    }

    public void setErtelem(int ertelem) {
        this.ertelem = ertelem;
    }

    public int getMagia() {
        return magia;
    }

    public void setMagia(int magia) {
        this.magia = magia;
    }

    public int getEletero() {
        return eletero;
    }

    public void setEletero(int eletero) {
        this.eletero = eletero;
    }

    public int getUgyesseg() {
        return ugyesseg;
    }

    public void setUgyesseg(int ugyesseg) {
        this.ugyesseg = ugyesseg;
    }

    public int getKitartas() {
        return kitartas;
    }

    public void setKitartas(int kitartas) {
        this.kitartas = kitartas;
    }

    public void embertGeneral(){
        this.setEro(r.nextInt(45-28)+28);
        this.setErtelem(r.nextInt(50-35)+35);
        this.setMagia(r.nextInt(40-30)+30);
        this.setEletero(r.nextInt(48-29)+29);
        this.setUgyesseg(r.nextInt(40-35)+35);
        this.setKitartas(r.nextInt(40-32)+32);
    }
    public void embertGeneralNo(){
        this.setEro(r.nextInt(40-28)+28);
        this.setErtelem(r.nextInt(55-35)+35);
        this.setMagia(r.nextInt(42-30)+30);
        this.setEletero(r.nextInt(40-29)+29);
        this.setUgyesseg(r.nextInt(43-35)+35);
        this.setKitartas(r.nextInt(41-32)+32);
    }
    public void orkotGeneral(){
        this.setEro(r.nextInt(60-50)+50);
        this.setErtelem(r.nextInt(30-10)+10);
        this.setMagia(r.nextInt(40-20)+20);
        this.setEletero(r.nextInt(60-45)+45);
        this.setUgyesseg(r.nextInt(30-25)+25);
        this.setKitartas(r.nextInt(50-40)+40);
    }
    public void orkotGeneralNo(){
        this.setEro(r.nextInt(57-50)+50);
        this.setErtelem(r.nextInt(30-15)+15);
        this.setMagia(r.nextInt(37-20)+20);
        this.setEletero(r.nextInt(58-45)+45);
        this.setUgyesseg(r.nextInt(35-25)+25);
        this.setKitartas(r.nextInt(51-40)+40);
    }

    public void tundetGeneral(){
        this.setEro(r.nextInt(40-30)+30);
        this.setErtelem(r.nextInt(60-50)+50);
        this.setMagia(r.nextInt(50-45)+45);
        this.setEletero(r.nextInt(40-31)+31);
        this.setUgyesseg(r.nextInt(48-43)+43);
        this.setKitartas(r.nextInt(30-27)+27);
    }
    public void tundetGeneralNo(){
        this.setEro(r.nextInt(38-30)+30);
        this.setErtelem(r.nextInt(60-50)+50);
        this.setMagia(r.nextInt(47-45)+45);
        this.setEletero(r.nextInt(40-31)+31);
        this.setUgyesseg(r.nextInt(51-43)+43);
        this.setKitartas(r.nextInt(85-27)+27);
    }

    public void lidercetGeneral(){
        this.setEro(r.nextInt(45-40)+40);
        this.setErtelem(r.nextInt(35-20)+20);
        this.setMagia(r.nextInt(40-36)+36);
        this.setEletero(r.nextInt(52-44)+44);
        this.setUgyesseg(r.nextInt(39-36)+36);
        this.setKitartas(r.nextInt(40-38)+38);
    }
    public void lidercetGeneralNo(){
        this.setEro(r.nextInt(42-37)+37);
        this.setErtelem(r.nextInt(38-20)+20);
        this.setMagia(r.nextInt(40-36)+36);
        this.setEletero(r.nextInt(50-44)+44);
        this.setUgyesseg(r.nextInt(39-36)+36);
        this.setKitartas(r.nextInt(42-38)+38);
    }
}
