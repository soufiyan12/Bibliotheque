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
    private long IdAdherent;
    private static long cmp;
    
    //stocker les livres empruntés dans un endroit particulier
    ArrayList<Document> stock=new ArrayList<Document>();
    
    //class ArrayList ========/////======class Vector
    
    //disponibilite du livre 1 or 0
    //Attention: un livre ne peut être emprunté que s'il n'est pas déjà emprunté par un adhérent.
   
    
    /*
    Les adhérents peuvent emprunter des livres (et uniquement des livres) et on doit pouvoir
savoir à tout moment quels sont les livres empruntés par un adhérent.
    */
    
    public Adherent(String prenom,String nom){
        this.prenom=prenom;
        this.nom=nom;
        this.IdAdherent=cmp++;
    }
    
    public void emprunter(Document d){
        
        if(d.empruntable()){
            
            //Livre l=(Livre) d; 
            if(((Livre)d).getDisponible()){
                System.out.println("livre empruntable et disponible ");
                ((Livre) d).setIDAdherent(this.IdAdherent);
                stock.add(((Livre) d));
                System.out.println("le livre emprunter est " + ((Livre) d).toString()+"par "+this.toString());
            }else{
                System.out.println("livre demande not exist pr le moment ");
            }
            
            }else{
                System.out.println("ce Document n'est pas empruntable ");
            }
        /*
        .....
        
        */
        
    }
    
    public void rendre(Document d){
       
        if(d.getClass().getName()=="Livre"){
            stock.remove(d);
            ((Livre) d).setIDAdherent(0);
        } else {
            System.out.println("Erreur, Le document n'est pas empruntable !! ");
        }
        
        
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

    @Override
    public String toString() {
        return "prenom=" + prenom + ", nom=" + nom +", idAdherent =" + IdAdherent+ ", stock=" + stock;
    }
    
    
    
}
