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
import tg.ip.net.itchallengers.entities.Privilege;

/**
 *
 * @author delaCruz
 */
@Stateless
public class PrivilegeDAO {
    @PersistenceContext(unitName = "tg.ip.net_itchallengers_war_1.0PU")
    private EntityManager em;
    
    public Boolean ajouter(Privilege p){
        em.persist(p);
        return true;
    }
    
    public Privilege chercherUn(Long id){
        Privilege p = em.find(Privilege.class, id);
        return p;
    }
    
    public List<Privilege> chercherTout(){
        String query = "SELECT p  FROM Privilege p";
        
        List<Privilege> listPrivilege = em.createQuery(query).getResultList();
        
        return listPrivilege;
    }
    
    public Boolean supprimer(Long id){
        Privilege p = em.find(Privilege.class, id);
        em.remove(p);
        return true;
    }
    
    public Boolean supprimer(Privilege p){
        em.remove(p);
        return true;
    }
    
    public Boolean modifier(Privilege p){
        
        em.merge(p);
        
        return true;
    }
}
