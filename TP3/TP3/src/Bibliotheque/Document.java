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
public  class Document {
    //Ces documents sont soit des journaux, soit des volumes.
    // Les documents sont caractérisés par un titre (chaîne de caractères).
    
    private String titre;
    
    //nombre du livres de meme titre ???
    //verifier si exite un livre disponible 
    //livre emprunter par qui ???
    public Document(String titre){
        this.titre=titre;
        
    }
    //methode empruntable
    //livre est le seul document qui peut etre emprunter par un adherent
    public boolean empruntable(){
        return true;
        
    }

    public String getTitre() {
        return titre;
    }

    public void setTitre(String titre) {
        this.titre = titre;
    }

    @Override
    public String toString() {
        return "Document{" + "titre=" + titre + '}';
    }
    
    
}
