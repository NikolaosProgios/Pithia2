package Controller;
import java.util.ArrayList;

public class kathigitis extends Person{
    private String typos;//monimos or prosorinos
    private String id ;
    private String tmima;//to tmima pou aniki
    
    public kathigitis(String username, String password,String id , String Name, String LastName,String typos, String tmima) {
        super(username, password, Name, LastName);
        this.id=id;
        this.typos = typos;
        this.tmima = tmima;
    }
    public String getTypos() {
        return typos;
    }
    public String getId() {
        return id;
    }
    public String getTmima() {
        return tmima;
    }
    public void setTypos(String typos) {
        this.typos = typos;
    }
    public void setId(String id) {
        this.id = id;
    }
    public void setTmima(String tmima) {
        this.tmima = tmima;
    }
    @Override
    public String toString() {
        return "kathigitis{" + "typos=" + typos + ", id=" + id + ", tmima=" + tmima + '}';
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
    
     public  String findKathigiti(String id, String tmima) {        
        String info="";
        for (int i = 0 ; i<kathigiti.size() ; i++){
            if (kathigiti.get(i).getId() == id ){
                info = kathigiti.get(i).toString();
            }                
        }
        return info ;
    }
}