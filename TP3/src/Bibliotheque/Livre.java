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
public class Livre extends Volume {
    //Seuls les livres sont empruntables.
   
      public Livre(String auteur,String titre){
        super(titre,auteur);
        
    }
   
   // si empruntable return true sinon return false 
      
    public boolean empruntable(){
        /*
        code
        */
        return true;
    }

    @Override
    public String toString() {
        return "Livre"  ;
    }
    
}
