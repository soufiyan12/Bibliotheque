/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Bibliotheque;

import java.util.Vector;

/**
 *
 * @author soufiyan
 */
public class Livre extends Volume {
    //Seuls les livres sont empruntables.
   private float prix;
    private long isbn;
    //String uniqueID = UUID.randomUUID().toString();
    private static int nb_livre=1;
    private boolean disponible;//verifie  la disponibilite du livre car peut etre emprunter par un adherent qlconq
    private long IDAdherent;
    
      public Livre(String auteur,String titre){
        super(titre,auteur);
        this.disponible=true;
        this.isbn=nb_livre ++;
        IDAdherent=0;
        
    }

    public boolean getDisponible(){
        if(this.IDAdherent==0) return true;
        else return false;
    }

    public long getIDAdherent() {
        return IDAdherent;
    }

   
      
   // si empruntable return true sinon return false 
      
    public boolean empruntable(){
        /*
        code
        */
        return true;
    }
    
    
    public void setIDAdherent(long ID){
        this.IDAdherent=ID;
    }

    @Override
    public String toString() {
        return super.toString() + " International Standard Book Number : "+isbn + (this.empruntable()?" Ce livre est disponible ":(" Ce livre est emprunté par l'adherent : " + this.IDAdherent));
    }
// appel method sort base sur  critere qui dans cette methode par example on met une condition sur le prix du livre  
    
  /*
    if(D.get(i).getClass().getName()=="Livre"){
                if(((Livre) D.get(i)).getDisponible()==true) {
                    System.out.println("Ce document est emprunté par L'utilisateur dont l'ID est : " + ((Livre) D.get(i)).getIDAdherent());
                } else System.out.println("Ce Livre est disponible.");
            }
    
    
    
    
    */
    

   
    
}
