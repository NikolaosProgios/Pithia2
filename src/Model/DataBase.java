package Model;
import Controller.*;
import Controller.Foititis;
import java.util.*;

// ArrayList Foitites
// ArrayList Admin
// ArrayList Mathimaton

public class DataBase {
    //Foititis
    ArrayList <Foititis> foitites=new ArrayList<>();    
    
    public  void FoititisData(){
        //User Story x : Insert foititites 
        
        //Foititis 1os
        foitites.add(new Foititis("it175070","175070",175070,"Dimitris",
            "Nikolopoulos","IT","5")) ; 
        //Foititis 2os
        foitites.add(new Foititis("it175002","175002",175002,"Nikos",
            "Progios","IT","7")) ; 
        //Foititis 3os
        foitites.add(new Foititis("it174991","174991",174991,"Ahilleas",
            "Rasit","IT","7")) ; 
        //Foititis 4os
        foitites.add(new Foititis("it174952","174952",174952,"Kyriazis",
            "Karapostolis","IT","7")) ; 
    }    
    public  void insertFoititi(String username, String password, int am, String Name, String LastName, String tmima) {
        foitites.add(new Foititis(username,password,am,Name,LastName,tmima,"-")) ;   
    }    
    public  boolean deleteFoititi(int am, String tmima) {        
        boolean flag= true ; 
        for (int i = 0 ; i<foitites.size() ; i++){
            if (foitites.get(i).getAm() == am ){
                foitites.remove(i);
            }
            else {
                flag=false; 
            }                
        }return flag ;
    }
    static String nname ;  
    public  boolean cheackFoititi(String name,String password) {        
        FoititisData();        
       
        boolean flag=false;
        for (int i = 0 ; i<foitites.size()-1 ; i++){            
            if (foitites.get(i).getUsername().equals(name) && 
                    foitites.get(i).getPassword().equals(password)
                    ){
                nname=name;
                flag=true;
            }                
        }
        return flag ;
    }
    
    //Return Foititi Odject
    public  Foititis infoFoititi() {        
        FoititisData();     int f=0; 
        //Foititis f1=new Foititis();
        for (int i = 0 ; i<foitites.size()-1 ; i++){
            if (foitites.get(i).getUsername().equals(nname) ){
              f=i; 
            }                
        }
        return  foitites.get(f) ;
    }    
    public  String searchFoititi(int am, String tmima) {        
        String info="";
        for (int i = 0 ; i<foitites.size() ; i++){
            if (foitites.get(i).getAm() == am ){
                info = foitites.get(i).toString();
            }                
        }
        return info ;
    }
//not
    public void vathmologiaFoititi(int am,String vathmos)    {
        boolean flag=false;
        int foundF=0;
        for (int i = 0 ; i<foitites.size()-1 ; i++){
            if (foitites.get(i).getAm() == am)                         
            {
                flag=true;
                foundF=i;
            }                
        }
        
        if(flag=true)
        {
           foitites.get(foundF).setVathmos(vathmos);
        }
    }
    
    public String FindVathmologiaFoititi(int am)    {
        boolean flag=false;
        int foundF=0;
        String info=" ";
        for (int i = 0 ; i<foitites.size()-1 ; i++){
            if (foitites.get(i).getAm() == am){      
                flag=true;
                foundF=i;
            }                
        }  
        if(flag=true) {
            info=foitites.get(foundF).getVathmos();
        }
        return info ;
    }
//not
    public void ResetVathmologiaFoititi(int am)    {
        boolean flag=false;
        int foundF=0;
        for (int i = 0 ; i<foitites.size()-1 ; i++){
            if (foitites.get(i).getAm() == am){      
                flag=true;
                foundF=i;
            }                
        }        
        if(flag=true) {
           foitites.get(foundF).setVathmos("-");
        }
    }    
    ArrayList <Admin> admins=new ArrayList<>();
    public  void AdminData(){
        //User Story x : Insert foititites 
        
        //Admin 1os
        admins.add(new Admin("admin1","001","admin1","nikos",
            "progios","monimos","IT")) ;
        //Admin 2os
        admins.add(new Admin("admin3","003","admin3","kyriazis",
            "karapostolis","monimos","IT")) ; 
        //Admin 3os
        admins.add(new Admin("admin2","002","admin2","axileas",
            "rasit","monimos","IT")) ; 
        //Admin 4os
        admins.add(new Admin("admin4","004","admin4","dimitris",
            "nikolopoulos","monimos","IT")) ; 
    }
    
    public  void insertAdmin(String username, String password,String Name ,String id, String LastName, String typos,String tmima) {
        
        admins.add(new Admin(username,password,id,Name,LastName,typos,tmima)) ;   
    }    
    public  boolean deleteAdmin(String id) {        
        boolean flag= true ; 
        for (int i = 0 ; i<admins.size() ; i++){
            if (admins.get(i).getId()== id ){
                admins.remove(i);
            }
            else {
                flag=false; 
            }                
        }return flag ;
    }    
    public  boolean cheackAdmin(String name,String password) {        
        AdminData();
        boolean flag=false;
        for (int i = 0 ; i<admins.size()-1 ; i++){
            if (admins.get(i).getUsername().equals(name) && 
                    admins.get(i).getPassword().equals(password) ){
                nname=name;flag=true;
            }                
        }
        return flag ;
    }    
//Return Foititi Odject
    public  Admin infoAdmin() {        
        AdminData();     int f=0; 
        for (int i = 0 ; i<admins.size()-1 ; i++){
            if (admins.get(i).getUsername().equals(nname) ){
              f=i;
            }                
        }
        return  admins.get(f) ;
    }
    public  String searchAdmin(String id, String tmima) {        
        String info="";
        for (int i = 0 ; i<admins.size() ; i++){
            if (admins.get(i).getId() == id ){
                info = admins.get(i).toString();
            }                
        }
        return info ;
    }
    
    ArrayList <kathigitis> kathigiti=new ArrayList<>();
    public  void KathigitiData(){
        //User Story x : Insert foititites 
        
        //Admin 1os
        kathigiti.add(new kathigitis("kathigitis1","011","kathigitis1","nikos",
            "progios","monimos","IT")) ;
        //Admin 2os
        kathigiti.add(new kathigitis("kathigitis2","012","kathigitis2","kyriazis",
            "karapostolis","monimos","IT")) ; 
        //Admin 3os
        kathigiti.add(new kathigitis("kathigitis3","013","kathigitis3","axileas",
            "rasit","monimos","IT")) ; 
        //Admin 4os
        kathigiti.add(new kathigitis("kathigitis4","014","kathigitis4","dimitris",
            "nikolopoulos","monimos","IT")) ; 
    }
    
    public  void insertKathigiti(String username, String password,String Name ,String id, String LastName, String typos,String tmima) {
        
        kathigiti.add(new kathigitis(username,password,id,Name,LastName,typos,tmima)) ;   
    }    
    public  boolean deleteKathigiti(String id) {        
        boolean flag= true ; 
        for (int i = 0 ; i<kathigiti.size() ; i++){
            if (kathigiti.get(i).getId()== id ){
                kathigiti.remove(i);
            }
            else {
                flag=false; 
            }                
        }return flag ;
    }    
    public  boolean cheackKathigiti(String name,String password) {        
        KathigitiData();
        boolean flag=false;
        for (int i = 0 ; i<kathigiti.size()-1 ; i++){
            if (kathigiti.get(i).getUsername().equals(name) && 
                    kathigiti.get(i).getPassword().equals(password) ){
                nname=name;flag=true;
            }                
        }
        return flag ;
    }    
//Return Foititi Odject
    public  kathigitis infoKathigiti() {        
        AdminData();     int f=0; 
        for (int i = 0 ; i<kathigiti.size()-1 ; i++){
            if (kathigiti.get(i).getUsername().equals(nname) ){
              f=i;
            }                
        }
        return  kathigiti.get(f) ;
    }
    public  String searchKathigiti(String id, String tmima) {        
        String info="";
        for (int i = 0 ; i<kathigiti.size() ; i++){
            if (kathigiti.get(i).getId() == id ){
                info = kathigiti.get(i).toString();
            }                
        }
        return info ;
    }
       
    ArrayList <Mathimata> mathimata=new ArrayList<>();    
    public  void MathimataData(){
          
        //Mathima 1
        mathimata.add(new Mathimata("001","5","theoria","Mihaniki Logismikou","10","-","Progios"));    
        //Ergastirio 1
        mathimata.add(new Mathimata("011","5","ergastirio","Mihaniki Logismikou","10","-","Karapostolis")) ;        
        //Mathima 2
        mathimata.add(new Mathimata("002","5","theoria","ADISE","15","-","Rasit")) ;        
        //Mathima 3
        mathimata.add(new Mathimata("003","5","theoria","Duktia","10","-","Nikolopoulos")) ;        
        //Ergastirio 3
        mathimata.add(new Mathimata("013","5","ergastirio","Duktia","10","-","Papadopoulos")) ;        
        //Mathima 4
        mathimata.add(new Mathimata("004","5","theoria","Epixeirisiaki","15","-","Karaiskos")) ;        
        //Mathima 5
        mathimata.add(new Mathimata("005","5","theoria","Organosi Dedomenon","15","-","Progios")) ;        
        //Ergastirio 5
        mathimata.add(new Mathimata("055","5","ergastirio","Organosi Dedomenon","5","-","Karapostolis")) ;
    }
//not
    public  void insertMathimata(String id,String examino,String typos,String onomasia,String ores,String Vathmos,String Foititis) {
        mathimata.add(new Mathimata(id,examino,typos,onomasia,ores,Vathmos,Foititis)) ;   
    }
//not
    public  boolean deleteMathima(String id) {        
        boolean flag= true ; 
        for (int i = 0 ; i<mathimata.size()-1 ; i++){
            if (mathimata.get(i).getId() == id ){
                mathimata.remove(i);
            }
            else {
                flag=false; 
            }                
        }return flag ;
    }
    
    //Return to ArrayList me ta mathimata ola
    public ArrayList lessons(){
        return mathimata ;
    }   
    
    public String lessons1(int i ){
        return mathimata.get(i).getOnomasia();
    }
    
    //Return to mathima(i) os Object typou Mathimata
    public Mathimata lessons2(int i ){
        return mathimata.get(i);
    }    
}