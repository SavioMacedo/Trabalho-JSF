/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.atividade.facade;

import com.atividade.models.Noticia;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author savio
 */
@Stateless
public class NoticiaFacade extends AbstractFacade<Noticia> 
{
    @PersistenceContext(unitName = "ComentariosPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() 
    {
        return em;
    }
    
    public NoticiaFacade()
    {
        super(Noticia.class);
    }
    
}
