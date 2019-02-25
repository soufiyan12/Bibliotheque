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
import java.util.ArrayList;
import java.util.Vector;
public class Bibliotheque {
    //La bibliothèque comprend un ensemble de documents et un ensemble d'adhérents
    private Vector<Document> D;
    private Vector<Adherent> A;
   
    //D=new Vector<Document>();
        //A=new Vector<Adherent>();
    //D=new Vector<Document>();
    /*
    Définir des méthodes toString
permettant de visualiser ces objets convenablement
    */

    public Bibliotheque() {
        D=new Vector<Document>();
        A=new Vector<Adherent>();
       //D.sort
    }

    
    
    
    
    /*
    Ecrire les méthodes ajouterAdherent 
    et ajouterDocument dans Bibliotheque.
    */
    
    public void ajouterAdherent(Adherent ad){
        
        A.add(ad);
        
        /*
        code .......
        */
    }
    public void ajouterDocument(Document doc){
        D.add(doc);
        
        /*
        ..........
        */
    }
        
    /**
     *
     * @param titre
     * @return
     */
    public Document[] chercherDocument(String titre){
        Document[] Res = new Document[D.size()];
        int j=0; // Indices of &
        for(int i=0;i<D.size();i++){
            if (D.get(i).getTitre().contains(titre)){
                Res[j++]=D.get(i);
            }
        }
        
        
        return Res;
}
  /*
  String[] colours = { "Red", "Orange", "Yellow", "Green" };

int indexOfYellow = ArrayUtils.indexOf(colours, "Yellow");
  public static <T> int indexOf(T needle, T[] haystack)
{
    for (int i=0; i<haystack.length; i++)
    {
        if (haystack[i] != null && haystack[i].equals(needle)
            || needle == null && haystack[i] == null) return i;
    }

    return -1;
}
  */
    
    /*
    Dans la classe Bibliothèque, donnez le code de la méthode
Document[] chercherDocument(String titre)
qui retourne, sous la forme d'un tableau de document, tous les documents dont le titre contient la
chaîne <titre>. La taille du tableau de documents correspond au nombre de documents trouvés.
Note: il existe une méthode indexOf(String str) qui retourne l'index de la première
occurrence de la sous-chaîne str dans la chaîne courante, et –1 si str n'est pas une sous-chaîne de la
chaîne courante.
    */
    /*
    Donnez l'ensemble des méthodes permettant à la bibliothèque de lister l'ensemble de ses
documents avec leurs caractéristiques et, lorsqu'il s'agit d'un livre, de lister ses adhérents
éventuels.Pour lancer ce listing il suffira d'envoyer un message listerDocuments() à la
bibliothèque:
Bibliotheque bibli; bibli.listerDocuments();
    */
    
    public void listerDocument(){
        System.out.println(":::::::::::liste documents:::::::::");
        for(int i=0;i<D.size();i++){
            System.out.println("Document"+D.elementAt(i));
        }
        System.out.println(":::::::::::liste Adherents:::::::::");
        for(int j=0;j<A.size();j++){
            System.out.println("Adherent"+D.elementAt(j));
        }
        
        
        
    }
    
    
    
    
}
