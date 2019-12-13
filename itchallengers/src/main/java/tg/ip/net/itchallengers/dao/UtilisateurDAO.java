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
import tg.ip.net.itchallengers.entities.Utilisateur;

/**
 *
 * @author delaCruz
 */
@Stateless
public class UtilisateurDAO {
    
    @PersistenceContext(unitName = "tg.ip.net_itchallengers_war_1.0PU")
    private EntityManager em;
    
    public Boolean ajouter(Utilisateur u){
        em.persist(u);
        return true;
    }
    
    public Utilisateur chercherUn(Long id){
        Utilisateur u = em.find(Utilisateur.class, id);
        return u;
    }
    
    public List<Utilisateur> chercherTout(){
        String query = "SELECT u  FROM Utilisateur u";
        
        List<Utilisateur> listUtilisateur = em.createQuery(query).getResultList();
        
        return listUtilisateur;
    }
    
    public Boolean supprimer(Long id){
        Utilisateur u = em.find(Utilisateur.class, id);
        em.remove(u);
        return true;
    }
    
    public Boolean supprimer(Utilisateur u){
        em.remove(u);
        return true;
    }
    
    public Boolean modifier(Utilisateur u){
        
        em.merge(u);
        
        return true;
    }
    
}
