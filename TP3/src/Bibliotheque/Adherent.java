/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Bibliotheque;

import java.util.ArrayList;

/**
 *
 * @author soufiyan
 */
public class Adherent {
    //Les adhérents ont un prénom (chaîne de caractère) et un nom (chaîne aussi).
    private String prenom;
    private String nom;
    
    //stocker les livres emprunter dans un endroit particulier
    ArrayList<Document> stock=new ArrayList<Document>();
    
    //class ArrayList ========/////======class Vector
    
    //disponibilite du livre 1 or 0
    //Attention: un livre ne peut être emprunté que s'il n'est pas déjà emprunté par un adhérent.
    private boolean disponible;
    
    /*
    Les adhérents peuvent emprunter des livres (et uniquement des livres) et on doit pouvoir
savoir à tout moment quels sont les livres empruntés par un adhérent.
    */
    public Adherent(String prenom,String nom){
        this.prenom=prenom;
        this.nom=nom;
    }
    
    public void emprunter(Livre l){
        
        if(l.empruntable()){
            System.out.println("livre existe ");
            stock.add(l);
            System.out.println("le livre emprunter est " + l.toString());
        }else{
            System.out.println("livre dont exist ");
        }
        /*
        .....
        
        */
        
    }
    
    public void rendre(Livre l){
        
        /*
        ......
        */
        
    }
    
    
    /*
    Ecrire le code des méthodes permettant de gérer l'emprunt et le rendu d'un livre. Dans la classe
Adhérent, ces méthodes sont définies ainsi:
void emprunter(Livre l){...} void rendre(Livre l){...}
Attention: un livre ne peut être emprunté que s'il n'est pas déjà emprunté par un adhérent.
    */
    
    
    
}
