/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.atividade.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

/**
 *
 * @author alunoces
 */
@Entity
public class Comentario 
{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    @Column(length = 50)
    private String nome;
    private String email;
    private String comentario;
    private boolean responsabilidade;
    @ManyToOne
    private Noticia noticia;

    /**
     * @return the id
     */
    public long getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(long id) {
        this.id = id;
    }

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
     * @return the email
     */
    public String getEmail() {
        return email;
    }

    /**
     * @param email the email to set
     */
    public void setEmail(String email) {
        this.email = email;
    }

    /**
     * @return the comentario
     */
    public String getComentario() {
        return comentario;
    }

    /**
     * @param comentario the comentario to set
     */
    public void setComentario(String comentario) {
        this.comentario = comentario;
    }

    /**
     * @return the responsabilidade
     */
    public boolean isResponsabilidade() {
        return responsabilidade;
    }

    /**
     * @param responsabilidade the responsabilidade to set
     */
    public void setResponsabilidade(boolean responsabilidade) {
        this.responsabilidade = responsabilidade;
    }

    /**
     * @return the noticia
     */
    public Noticia getNoticia() {
        return noticia;
    }

    /**
     * @param noticia the noticia to set
     */
    public void setNoticia(Noticia noticia) {
        this.noticia = noticia;
    }
}
