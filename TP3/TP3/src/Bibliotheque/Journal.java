/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Bibliotheque;
//Les journaux ont (outre les caractéristiques de document) une date de parution (on pourra
//prendre la classe java.util.Date ou bien construire notre propre classe Date).
//import java.util.Date;
/**
 *
 * @author soufiyan
 */
public class Journal extends Document {
    
    private int year ; int month ; int day;
    //private Date d;
    public Journal(String titre,int day, int month, int year){
        super(titre);
       // d=new Date();
       this.day=day;
       this.month=month;
       this.year=year;      
    }
       
    //date de parution 

    @Override
    public String toString() {
        return super.toString() + " ===> Journal{" + "" + year + "/" + month + "/" + day + '}';
    }

  
   
    
    
}
