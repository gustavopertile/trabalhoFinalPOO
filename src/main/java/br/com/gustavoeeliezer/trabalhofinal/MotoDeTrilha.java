/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.gustavoeeliezer.trabalhofinal;

/**
 *
 * @author gustavopertile
 */
public class MotoDeTrilha extends Moto {
    private String registro;
    private String valor;
    
    public MotoDeTrilha(String marca, int ano, String modelo, Boolean partidaEletr, int cilindradas, String cor, String registro, String valor) {
            setMarca(marca);
            setAno(ano);
            setModelo(modelo);
            setPartidaEletr(partidaEletr);
            setCilindradas(cilindradas);
            setCor(cor);
            this.registro = registro;
            this.valor = valor;
        }

    public String getRegistro() {
        return registro;
    }

    public void setRegistro(String registro) {
        this.registro = registro;
    }

    public String getValor() {
        return valor;
    }

    public void setValor(String valor) {
        this.valor = valor;
    }
    
}
