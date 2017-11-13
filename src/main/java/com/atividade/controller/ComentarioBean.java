/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.atividade.controller;

import com.atividade.facade.ComentarioFacade;
import com.atividade.models.Comentario;
import java.io.Serializable;
import java.util.List;
import javax.inject.Named;
import javax.faces.view.ViewScoped;
import javax.inject.Inject;

/**
 *
 * @author savio
 */
@Named
@ViewScoped
public class ComentarioBean implements Serializable 
{
    private static final long serialVersionUID = 1L;
    
    @Inject
    private ComentarioFacade facade;
    
    private Comentario novoComentario = new Comentario();
    
    public Comentario getNovoComentario()
    {
        return novoComentario;
    }
    
    public List<Comentario> getComentarios()
    {
        return facade.findAll();
    }
    
    public void adicionar()
    {
        facade.create(novoComentario);
        novoComentario = new Comentario();
    }    
}
