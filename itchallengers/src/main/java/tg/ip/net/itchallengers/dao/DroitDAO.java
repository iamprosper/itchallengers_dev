/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tg.ip.net.itchallengers.dao;

import java.util.List;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import tg.ip.net.itchallengers.entities.Droit;

/**
 *
 * @author delaCruz
 */
@Stateless
public class DroitDAO {
    @PersistenceContext(unitName = "tg.ip.net_itchallengers_war_1.0PU")
    private EntityManager em;
    
    public Boolean ajouter(Droit d){
        em.persist(d);
        return true;
    }
    
    public Droit chercherUn(Long id){
        Droit d = em.find(Droit.class, id);
        return d;
    }
    
    public List<Droit> chercherTout(){
        String query = "SELECT d  FROM Droit d";
        
        List<Droit> listDroit = em.createQuery(query).getResultList();
        
        return listDroit;
    }
    
    public Boolean supprimer(Long id){
        Droit d = em.find(Droit.class, id);
        em.remove(d);
        return true;
    }
    
    public Boolean supprimer(Droit d){
        em.remove(d);
        return true;
    }
    
    public Boolean modifier(Droit d){
        
        em.merge(d);
        
        return true;
    }
}
