/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Bibliotheque;
//Les journaux ont (outre les caractéristiques de document) une date de parution (on pourra
//prendre la classe java.util.Date ou bien construire notre propre classe Date).
import java.util.Date;
/**
 *
 * @author soufiyan
 */
public class Journal extends Document {
    
    private Date d;
    public Journal(String titre,int year, int month, int date){
        super(titre);
        Date.UTC(year, month, date, date, month, year);
    }
       
    //date de parution 

    @Override
    public String toString() {
        return "Journal{" + "date=" + d + '}' ;
    }
   
    
    
}
