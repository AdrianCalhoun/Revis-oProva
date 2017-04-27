/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ucam.java.web.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author escm
 */
public class FavoritosServlet extends HttpServlet {
    
    public void doPost(HttpServletRequest req, HttpServletResponse res) throws IOException{
    
        String tipo = req.getParameter("tipo");
        
        PrintWriter saida = res.getWriter();
        
        String[] filmeFavorito = req.getParameterValues("ver");
        
        for(int i=0; i<filmeFavorito.length; i++){
            saida.println("<br> Desejo ver: " + filmeFavorito[i]);
        }
        
        
        saida.println ("<html>");
        saida.println ("<body>");
        saida.println ("<h1> A bebida selecionada foi " + tipo + "</h1>");
        saida.println ("</body>");
        saida.println ("</html>");
        
        
    }
    public void doGet (HttpServletRequest req, HttpServletResponse res) throws IOException{
    
        String tipo = req.getParameter("opit");
        
        PrintWriter saida = res.getWriter();
        
        
        
        saida.println("<html>");
        saida.println ("<body>");
        saida.println ("<h1> iof adanoiceles adibeb A " + tipo + "</h1>");
        saida.println ("</body>");
        saida.println("</html>");
        
        
        
    }    
}    
    
