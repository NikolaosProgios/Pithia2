package Controller;

//import View.Diorthotikoi_Vathmoi;
import java.awt.List;
import java.util.ArrayList;

public class Admin extends Person{

    // PRIVATE INSTANCE FIELDS
    private String typos;//monimos or prosorinos
    private String id ;
    private String tmima;
   
    public Admin(String username, String password,String id , String Name, String LastName,
            String typos, String tmima) {
        super(username, password, Name, LastName);
        this.id=id;
        this.typos = typos;
        this.tmima = tmima;
    }

   /* public Admin() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }*/
    public String getId() {
        return id;
    }
    public String getTypos() {
        return typos;
    }
    public void setId(String id) {
        this.id = id;
    }
    public String getTmima() {
        return tmima;
    }
    public void setTypos(String typos) {
        this.typos = typos;
    }
    public void setTmima(String tmima) {
        this.tmima = tmima;
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
    public  String findAdmin(String id, String tmima) {        
        String info="";
        for (int i = 0 ; i<admins.size() ; i++){
            if (admins.get(i).getId() == id ){
                info = admins.get(i).toString();
            }                
        }
        return info ;
    }
   public String[] egrisi(String AM, String Mathima,String Vathmos){
       String[] newEgrisi={AM,Mathima,Vathmos};
       return newEgrisi;
        
    }
    public  void showMessage(boolean Flag){
        if (Flag==true){
            System.out.println("Η Έγριση Καταχωρήθηκε");
        }
        else{
            System.out.println("Η Βαθμολογία δεν Εγγρύθηκε");
        }            
    }
}