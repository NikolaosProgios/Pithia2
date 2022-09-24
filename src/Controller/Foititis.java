package Controller;

import java.util.ArrayList;

public class Foititis extends Person{

// PRIVATE INSTANCE FIELDS
private int am=0;
private int examin=1;
private String tmima="IT";
//not
    private String vathmos;

//constractor
    public Foititis(String username, String password, int am, String Name, String LastName, 
                    String tmima,String vathmos) {
        super( username,  password, Name,LastName);
        this.am = am;
        
        this.tmima = tmima;
        //akis
        this.vathmos=vathmos;
    }
    public int getAm() {
        return am;
    }
    public int getExamin() {
        return examin;
    }
    public String getTmima() {
        return tmima;
    }
    public String getVathmos() {
        return vathmos;
    }
//not
    public void setVathmos(String vathmos) {
        this.vathmos = vathmos;
    }    
    @Override
    public String toString() {
        return "Foititis{" + "am=" + am + ", examin=" + examin + ", tmima=" + tmima + '}';
    }
    ArrayList <Foititis> foitites=new ArrayList<>();
    
   public  void FoititisData(){
        //User Story x : Insert foititites 
        
        //Foititis 1os
        foitites.add(new Foititis("it175001","001",175001,"nikos",
            "progios","IT","5")) ; 
        //Foititis 2os
        foitites.add(new Foititis("it175002","002",175002,"axileas",
            "rasit","IT","4")) ; 
        //Foititis 3os
        foitites.add(new Foititis("it175003","003",175003,"kyriazis",
            "karapostolis","IT","3")) ; 
        //Foititis 4os
        foitites.add(new Foititis("it175004","004",175004,"nikos",
            "akrivos","IT","2")) ; 
    }    
   
    public  String findFoititi(int am, String tmima) {        
        String info="";
        for (int i = 0 ; i<foitites.size() ; i++){
            if (foitites.get(i).getAm() == am ){
                info = foitites.get(i).toString();
            }                
        }
        return info ;
    }   
}