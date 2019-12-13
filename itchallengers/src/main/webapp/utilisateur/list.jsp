<%-- 
    Document   : list
    Created on : 6 déc. 2019, 15:29:26
    Author     : delaCruz
--%>

<%@page import="tg.ip.net.itchallengers.entities.Utilisateur"%>
<%@page import="java.util.List"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Liste des utilisateurs</title>
    </head>
    <body>
        <%
           List<Utilisateur> listUtilisateurs = (List<Utilisateur>)request.getAttribute("liste");
           
           for(Utilisateur u : listUtilisateurs){
               out.println(u);
           }
        %>
    </body>
</html>
