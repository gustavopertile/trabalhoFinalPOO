/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.gustavoeeliezer.trabalhofinal;

/**
 *
 * @author gustavopertile
 */
public abstract class Moto {
    private String marca;
    private int ano;
    private String modelo;
    private Boolean partidaEletr;
    private int cilindradas;
    private String cor;

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public Boolean getPartidaEletr() {
        return partidaEletr;
    }

    public void setPartidaEletr(Boolean partidaEletr) {
        this.partidaEletr = partidaEletr;
    }

    public int getCilindradas() {
        return cilindradas;
    }

    public void setCilindradas(int cilindradas) {
        this.cilindradas = cilindradas;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }
}
