/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.atividade.controller;

import com.atividade.facade.NoticiaFacade;
import com.atividade.models.Noticia;
import java.io.Serializable;
import java.util.List;
import javax.inject.Inject;
import javax.inject.Named;

/**
 *
 * @author savio
 */

@Named("noticiaController")
public class NoticiaBean implements Serializable 
{
    private static final long serialVersionUID = 1L;
    
    @Inject
    private NoticiaFacade facade;
    
    private Noticia novaNoticia = new Noticia();
    
    public Noticia getNoticia()
    {
        return facade.find(1);
    }
    
    public void adicionar()
    {
        facade.create(novaNoticia);
        novaNoticia = new Noticia();
    } 
    
}
