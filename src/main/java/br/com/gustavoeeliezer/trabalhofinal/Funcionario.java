/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.gustavoeeliezer.trabalhofinal;

/**
 *
 * @author gustavopertile
 */
public class Funcionario extends Pessoa {
        private String registro;
        private Double salario;
        
        
        public Funcionario(String nome, int idade, String endereço, String sexo, Double altura, String telefone, String registro, Double salario) {
            setNome(nome);
            setIdade(idade);
            setEndereço(endereço);
            setSexo(sexo);
            setAltura(altura);
            setTelefone(telefone);
            this.registro = registro;
            this.salario = salario;
        }
        /**
         * @return the registro
         */
        public String getRegistro() {
            return registro;
        }

        /**
         * @param registro the registro to set
         */
        public void setRegistro(String registro) {
            this.registro = registro;
        }

        /**
         * @return the salario
         */
        public Double getSalario() {
            return salario;
        }

        /**
         * @param salario the salario to set
         */
        public void setSalario(Double salario) {
            this.salario = salario;
        }
    }
    
