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
    public ArrayList<String> chercherDocument(String titre){
     /*
       public Document[] chercherDocument(String titre){
      */
     //Document[] tap=new Document[j];
      ArrayList<Document> tapp= new ArrayList<Document>();
      int j=0;//taille de list tapp
      for(int i=0;i<D.size();i++){
          if(D.indexOf(i)!=-1){
              tapp.add(D.indexOf(i));
              System.out.println("");
              j++;
          }
      }
      if(j==0){
          System.out.println("ce document n'exite pas dans notre biblio");
      }
       
      
      
      
      return tapp;
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
    
    
    
    
}
