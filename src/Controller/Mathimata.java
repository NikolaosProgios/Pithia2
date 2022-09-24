package Controller;
import java.util.ArrayList;

public class Mathimata {
    
    private String id;
    private String examino;
    private String typos;//theoria or ergastirio
    private String onomasia;
    private String ores;    
    private String Vathmos;
    private String Foititis;

    public String getVathmos() {
        return Vathmos;
    }

    public void setVathmos(String Vathmos) {
        this.Vathmos = Vathmos;
    }

    public Mathimata() {
    }

    public Mathimata(String id,String examino, String typos, String onomasia, 
                    String ores,String Vathmos,String Foititis) {
        this.id=id;
        this.examino = examino;
        this.typos = typos;
        this.onomasia = onomasia;
        this.ores = ores;
        this.Vathmos = Vathmos;
        this.Foititis=Foititis;
    }

    public void setFoititis(String Foititis) {
        this.Foititis = Foititis;
    }

    public String getFoititis() {
        return Foititis;
    }
    public String getExamino() {
        return examino;
    }
    public String getTypos() {
        return typos;
    }
    public String getOnomasia() {
        return onomasia;
    }
    public String getOres() {
        return ores;
    }
    public void setExamino(String examino) {
        this.examino = examino;
    }
    public void setTypos(String typos) {
        this.typos = typos;
    }
    public void setOnomasia(String onomasia) {
        this.onomasia = onomasia;
    }
    public void setOres(String ores) {
        this.ores = ores;
    }
    public String getId() {
        return id;
    }
    public void setId(String id) {
        this.id = id;
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
      public  String findMathimata(String id, String kod) {        
        String info="";
        for (int i = 0 ; i<mathimata.size() ; i++){
            if (mathimata.get(i).getId() == id ){
                info = mathimata.get(i).toString();
            }                
        }
        return info ;
    }
    public  void Update(String nameF,String nameM, String Vathmoi){
        for (int i = 0 ; i<mathimata.size() ; i++){
            if (mathimata.get(i).getFoititis() == nameF )
            {
                if(mathimata.get(i).getOnomasia()==nameM)
                {
                    mathimata.get(i).setVathmos(Vathmoi);
                }
            }
        }                   
    }
      
    public  void Save_Vathmologia(String id, String Vathmoi){
        for (int i = 0 ; i<mathimata.size() ; i++){
            if (mathimata.get(i).getId() == id )
            {
                 mathimata.get(i).setVathmos(Vathmoi);
            }
        }                   
    }           
}