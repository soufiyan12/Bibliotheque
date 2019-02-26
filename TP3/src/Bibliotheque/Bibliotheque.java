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

import java.util.Iterator;
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
    public Vector<Document> chercherDocument(String titre){
        Vector<Document> V = new Vector<Document>();
        for(int i=0;i<D.size();i++){
            if (D.get(i).getTitre().indexOf(titre)!=-1){
               V.add(D.get(i));
            }
        }
 
        return V;
    }
    
    
    public void listerDocuments(){
        System.out.println("########        Liste des Documents :  ######## \n\n");
        
        for(int i=0;i<D.size();i++){
            System.out.println(D.get(i));
            
        }
    }
    
    
    @Override
    public String toString(){
        String Return=" ########        Liste des Documents :  ######## \n\n";
        Iterator<Document> i= D.iterator();
        
        while(i.hasNext()){
            Return += i.next() + "\n";   // Iterator.next() => returns the current Object, and points to the next one in the Vector
        }
        
        
        Return += "\n\n #######        Liste des Adherents Inscrits à la bibliothèque : ######### \n\n";
        
        
        
        Iterator<Adherent> j= A.iterator();
        
        while(j.hasNext()){
            Return += j.next() + "\n";   // Iterator.next() => returns the current Object, and points to the next one in the Vector
        }
        
        
        return Return;
    }
    
    
    
    
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
    
    
    
    
