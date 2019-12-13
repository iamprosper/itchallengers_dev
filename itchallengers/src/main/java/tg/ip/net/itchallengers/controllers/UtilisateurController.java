/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tg.ip.net.itchallengers.controllers;

import java.io.IOException;
import java.util.List;
import javax.ejb.EJB;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import tg.ip.net.itchallengers.dao.UtilisateurDAO;
import tg.ip.net.itchallengers.entities.Utilisateur;

/**
 *
 * @author delaCruz
 */
@WebServlet(name = "UtilisateurController", urlPatterns = {"/utilisateur"})
public class UtilisateurController extends HttpServlet {
    
    @EJB
    UtilisateurDAO utilisateurDAO;

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        List<Utilisateur> listUtilisateurs = utilisateurDAO.chercherTout();
        
        req.setAttribute("liste", listUtilisateurs);
        req.getRequestDispatcher("utilisateur\\add.jsp").forward(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        
        String nom = req.getParameter("nom");
        String username = req.getParameter("username");
        String motDePasse = req.getParameter("mot_de_passe");
        
        Utilisateur u = new Utilisateur();
        u.setNom(nom);
        u.setUsername(username);
        u.setMotDePasse(motDePasse);
        
        utilisateurDAO.ajouter(u);
        
        List<Utilisateur> listUtilisateurs = utilisateurDAO.chercherTout();
        
        req.setAttribute("liste", listUtilisateurs);
        
        req.getRequestDispatcher("utilisateur\\list.jsp").forward(req, resp);
    }
    
    
    
    
    
}
