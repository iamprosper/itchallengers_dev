<%-- 
    Document   : add
    Created on : 6 déc. 2019, 14:11:36
    Author     : delaCruz
--%>

<%@page import="java.util.List"%>
<%@page import="tg.ip.net.itchallengers.entities.Utilisateur"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Ajout d'un nouvel utilisateur</title>
        <link rel="stylesheet" href="add.css"type="text/css"/>
        <style>
            *{
                margin: 0;
                padding: 0;
                
            }
            body{
                /*background-color: #333;*/
                width: 100%;
                
            }
            
            #content{
                width: 60%;
                margin: auto;
                background: #ccc;
                display: flex;
                flex-direction: column;
            }
            
            form{
                width: 100%;
                margin: auto;
                border: 1px solid black;
                padding: 10px;
            }
            
            #liste{
                border-collapse: collapse;
                width: 100%;
                margin: 20px auto;
            }
            
            
            
            
        </style>
    </head>
    <body>
        <div id="content">
            
            <form action="" method="POST">
                <table>
                    <tr>
                        <td><label for="nom">Nom :</label></td>
                        <td><input type="text" id="nom" name="nom"/></td>
                    </tr>
                    <tr>
                        <td><label for="username">Username :</label></td>
                        <td><input type="text" id="username" name="username"/></td>
                    </tr>
                    <tr>
                        <td><label for="mot_de_passe">Mot de passe :</label></td>
                        <td><input type="password" id="mot_de_passe" name="mot_de_passe"/><br/></td>
                    </tr>
                    <tr>
                        <td colspan="2"><input type="submit" value="Enregistrer"/></td>
                    </tr>
                </table>
            </form>

            <table id ="liste" border="2px solid black">

                <tr>
                    <th>Id</th>
                    <th>Nom</th>
                    <th>Username</th>
                </tr>

                <%
                    //if(request.getMethod().equals("POST")){
                        List<Utilisateur> listUtilisateurs = (List<Utilisateur>)request.getAttribute("liste");

                        for(Utilisateur u : listUtilisateurs){
                %>

                <tr>
                    <td><%out.println(u.getId());%></td>
                    <td><%out.println(u.getNom());%></td>
                    <td><%out.println(u.getUsername());}%></td>
                </tr>

            </table>
        </div>
    </body>
</html>
