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
public class Livre extends Volume implements Comparable {
    //Seuls les livres sont empruntables.
   private float prix;
    private long isbn;
    //String uniqueID = UUID.randomUUID().toString();
    private static int nb_livre=1;
    private boolean disponible;//verifie  la disponibilite du livre car peut etre emprunter par un adherent qlconq
    
      public Livre(String auteur,String titre){
        super(titre,auteur);
        this.disponible=true;
        this.isbn=nb_livre ++;
        
        
    }

      public boolean getDisponible(){
          return disponible;
      }
    public void setDisponible(boolean disponible) {
        this.disponible = disponible;
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
        return super.toString()+ "===> Livre {" +" International Standard Book Number ===>"+isbn+"}";
    }
// appel method sort base sur  critere qui dans cette methode par example on met une condition sur le prix du livre  
    @Override
    public int compareTo(Object o) {
        //if(o isInstanceOf livre )
    if(this.prix>((Livre)o).prix){
        return 1;
    }else
        if(this.prix<((Livre)o).prix){
            return -1;
        
    }else{
            return 0;
        }
    
    }

   
    
}
