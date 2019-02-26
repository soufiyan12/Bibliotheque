/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Bibliotheque;

import java.util.Iterator;
import java.util.Vector;

/**
 *
 * @author Adnane & Soufiyan
 */
public class Main {
     public static void main(String[] args){

        Bibliotheque bibli = new Bibliotheque();

        Adherent ad1 = new Adherent("Jean", "Dupond");

        bibli.ajouterAdherent(ad1);

        Adherent ad2 = new Adherent("Marie","Dubois");

        bibli.ajouterAdherent(ad2);
        

        int n=4;

        Document[] docs = new Document[n];

        docs[0] = new Livre("Misérables","Hugo V.");

        docs[1] = new Journal("Dr Dobbs",05,10,2003);

        // 10 représente le mois de septembre

        docs[2] = new BD("Thorgal: La galère noire","Van Hamme",

        "Rosinsky");

        docs[3] = new Livre("Systèmes multi-agents","Ferber J.");

        for (int i=0;i<n;i++ ){

        System.out.println("==> "+docs[i]);

        bibli.ajouterDocument(docs[i]);
        
        
        
}
        ad1.emprunter(docs[0]);
        System.out.println("===>"+ad1);
        //ad1.rendre(docs[0]);
        //System.out.println("===>"+ad1);
         
        ad2.emprunter(docs[3]);
        System.out.println("===>"+ad2);
        //ad2.rendre(docs[0]);
        //System.out.println("===>"+ad2);
        
        
        
        
        
        System.out.println("\n\n\n\nResultats de la recherche :\n");
        int j=0;
        Vector<Document> Resultat=bibli.chercherDocument("zzz");
        Iterator i =Resultat.iterator();
        if(!i.hasNext()) System.out.println("Aucune occurence de cette sous chaine dans les documents \n");
        while(i.hasNext()){
            System.out.println(i.next());
        }
       
        
        
        
        
        
        
        
        
        
        
        // Testint Biblio toString :
        System.out.println("\n\n\n\n\n\n" + bibli);
        
        new Home().setVisible(true);
        
        
        //Home home=new Home();
        //home.setVisible(true);
        
}
}
