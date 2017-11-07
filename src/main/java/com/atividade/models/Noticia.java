/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.atividade.models;

import java.util.Date;
import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.ForeignKey;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Temporal;

/**
 *
 * @author alunoces
 */
@Entity
public class Noticia 
{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    @Temporal(javax.persistence.TemporalType.DATE)
    private Date dataCadastro;
    @Column(length = 50)
    private String autor;
    private String descricao;
    @OneToMany(cascade = CascadeType.ALL,mappedBy = "noticia")
    private List<Comentario> comentarios;
}
