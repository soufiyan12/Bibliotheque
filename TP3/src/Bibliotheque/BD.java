/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Bibliotheque;

/**
 *
 * @author soufiyan
 */
public class BD extends Volume{
    //Les BD ont en plus un nom de dessinateur(chaîne).
    private String dessinateur;
    
    public BD(String dessinateur,String titre,String auteur){
        super(titre,auteur);
        this.dessinateur=dessinateur;
        
    }
    
}
