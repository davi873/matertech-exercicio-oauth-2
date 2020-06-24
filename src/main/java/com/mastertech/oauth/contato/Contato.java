package com.mastertech.oauth.contato;

import org.hibernate.annotations.GeneratorType;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Contato {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    private String nome;
    private String telefone;
    private int userId;

    public Contato(){

    }

    public Contato(String nome, String telefone, int userId) {
        this.nome = nome;
        this.telefone = telefone;
        this.userId = userId;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public int getIdUser() {
        return userId;
    }

    public void setIdUser(int userId) {
        this.userId = userId;
    }
}
