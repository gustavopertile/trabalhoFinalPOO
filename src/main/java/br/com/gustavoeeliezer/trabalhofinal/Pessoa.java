/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.gustavoeeliezer.trabalhofinal;

/**
 *
 * @author gustavopertile
 */
public abstract class Pessoa {
        private String nome;
        private int idade;
        private String endereço;
        private String sexo;
        private Double altura;
        private String telefone;
        
        /**
         * @return the nome
         */
        public String getNome() {
            return nome;
        }

        /**
         * @param nome the nome to set
         */
        public void setNome(String nome) {
            this.nome = nome;
        }

        /**
         * @return the idade
         */
        public int getIdade() {
            return idade;
        }

        /**
         * @param idade the idade to set
         */
        public void setIdade(int idade) {
            this.idade = idade;
        }

        /**
         * @return the endereço
         */
        public String getEndereço() {
            return endereço;
        }

        /**
         * @param endereço the endereço to set
         */
        public void setEndereço(String endereço) {
            this.endereço = endereço;
        }

        /**
         * @return the sexo
         */
        public String getSexo() {
            return sexo;
        }

        /**
         * @param sexo the sexo to set
         */
        public void setSexo(String sexo) {
            this.sexo = sexo;
        }

        /**
         * @return the altura
         */
        public Double getAltura() {
            return altura;
        }

        /**
         * @param altura the altura to set
         */
        public void setAltura(Double altura) {
            this.altura = altura;
        }

        /**
         * @return the telefone
         */
        public String getTelefone() {
            return telefone;
        }

        /**
         * @param telefone the telefone to set
         */
        public void setTelefone(String telefone) {
            this.telefone = telefone;
        }
        
        
    }
    
