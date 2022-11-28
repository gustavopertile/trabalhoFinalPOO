/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.gustavoeeliezer.trabalhofinal;

/**
 *
 * @author gustavopertile
 */
 public final class Estagiário extends Pessoa {
        private String bolsa; 
        private int horas_servico;

        /**
         * @return the bolsa
         */
        public String getBolsa() {
            return bolsa;
        }

        /**
         * @param bolsa the bolsa to set
         */
        public void setBolsa(String bolsa) {
            this.bolsa = bolsa;
        }

        /**
         * @return the horas_servico
         */
        public int getHoras_servico() {
            return horas_servico;
        }

        /**
         * @param horas_servico the horas_servico to set
         */
        public void setHoras_servico(int horas_servico) {
            this.horas_servico = horas_servico;
        }
 }
