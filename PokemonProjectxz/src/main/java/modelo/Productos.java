/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

/**
 *
 * @author juans
 */

// ACA seguramente va las cosas del pokemon
public class Productos {
    
    private int id;
    private String pokemon,tipo1,tipo2,mov1,mov2,mov3,mov4;
    private Double vgc,smogon;

    public Productos(int id, String pokemon, String tipo1, String tipo2, String mov1, String mov2, String mov3, String mov4, Double vgc, Double smogon) {
        this.id = id;
        this.pokemon = pokemon;
        this.tipo1 = tipo1;
        this.tipo2 = tipo2;
        this.mov1 = mov1;
        this.mov2 = mov2;
        this.mov3 = mov3;
        this.mov4 = mov4;
        this.vgc = vgc;
        this.smogon = smogon;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getPokemon() {
        return pokemon;
    }

    public void setPokemon(String pokemon) {
        this.pokemon = pokemon;
    }

    public String getTipo1() {
        return tipo1;
    }

    public void setTipo1(String tipo1) {
        this.tipo1 = tipo1;
    }

    public String getTipo2() {
        return tipo2;
    }

    public void setTipo2(String tipo2) {
        this.tipo2 = tipo2;
    }

    public String getMov1() {
        return mov1;
    }

    public void setMov1(String mov1) {
        this.mov1 = mov1;
    }

    public String getMov2() {
        return mov2;
    }

    public void setMov2(String mov2) {
        this.mov2 = mov2;
    }

    public String getMov3() {
        return mov3;
    }

    public void setMov3(String mov3) {
        this.mov3 = mov3;
    }

    public String getMov4() {
        return mov4;
    }

    public void setMov4(String mov4) {
        this.mov4 = mov4;
    }

    public Double getVgc() {
        return vgc;
    }

    public void setVgc(Double vgc) {
        this.vgc = vgc;
    }

    public Double getSmogon() {
        return smogon;
    }

    public void setSmogon(Double smogon) {
        this.smogon = smogon;
    }

    
    
    
}
