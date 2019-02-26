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
public class Volume extends Document {
    //Les volumes sont soit des dictionnaires soit des livres, soit des BD.
    //Les volumes ont en plus un auteur (chaîne).
    private String auteur;
    
    public Volume(String auteur,String titre){
        super(titre);
        this.auteur=auteur;
    }

    public String getAuteur() {
        return auteur;
    }

    public void setAuteur(String auteur) {
        this.auteur = auteur;
    }

    @Override
    public String toString() {
        return super.toString() + ",   auteur= " + auteur + '}';
    }
    
    
}
