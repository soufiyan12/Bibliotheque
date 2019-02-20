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
import java.util.Vector;
public class Bibliotheque {
    //La bibliothèque comprend un ensemble de documents et un ensemble d'adhérents
    private Vector<Document> D;
    private Vector<Adherent> A;
    
    /*
    Définir des méthodes toString
permettant de visualiser ces objets convenablement
    */

    @Override
    public String toString() {
        return "Bibliotheque{" + "D=" + D + ", A=" + A + '}';
    }
    
    /*
    Ecrire les méthodes ajouterAdherent 
    et ajouterDocument dans Bibliotheque.
    */
    
    public void ajouterAdherent(Adherent ad){
        
        A.addElement(ad);
        
        /*
        code .......
        */
    }
    public void ajouterDocument(Document doc){
        D.addElement(doc);
        
        /*
        ..........
        */
    }
        
        
       
        public static void main(String[] args){

        Bibliotheque bibli = new Bibliotheque();

        Adherent ad = new Adherent("Jean", "Dupond");

        bibli.ajouterAdherent(ad);

        ad = new Adherent("Marie","Dubois");

        bibli.ajouterAdherent(ad);

        int n=4;

        Document[] docs = new Document[n];

        docs[0] = new Livre("Misérables","Hugo V.");

        docs[1] = new Journal("Dr Dobbs",05,10,2003);

        // 10 représente le mois de septembre

        docs[2] = new BD("Thorgal: La galère noire","Van Hamme",

        "Rosinsky");

        docs[3] = new Livre("Systèmes multi-agents","Ferber J.");

        for (int i=0;i<n;i++ ){

        System.out.println("document "+docs[i]);

        bibli.ajouterDocument(docs[i]);
}
}
       
    
    
    /*
    Dans la classe Bibliothèque, donnez le code de la méthode
Document[] chercherDocument(String titre)
qui retourne, sous la forme d'un tableau de document, tous les documents dont le titre contient la
chaîne <titre>. La taille du tableau de documents correspond au nombre de documents trouvés.
Note: il existe une méthode indexOf(String str) qui retourne l'index de la première
occurrence de la sous-chaîne str dans la chaîne courante, et –1 si str n'est pas une sous-chaîne de la
chaîne courante.
    */
    
    
    
    
}
