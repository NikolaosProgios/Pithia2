package Controller;

import java.util.ArrayList;

public class Table {
    private String mathima;
    private String am;
    private String vathmos;

    public void setMathima(String mathima) {
        this.mathima = mathima;
    }

    public void setAm(String am) {
        this.am = am;
    }

    public void setVathmos(String vathmos) {
        this.vathmos = vathmos;
    }

    public String getMathima() {
        return mathima;
    }

    public String getAm() {
        return am;
    }

    public String getVathmos() {
        return vathmos;
    }
    
    ArrayList <Table> pinakas=new ArrayList<>();    
       
    public Table() {
    }
    
    String [] Table;

    public Table(String[] Table) {
        this.Table = Table;
    }

    public String[] getTable() {
        return Table;
    }

    public void setTable(String[] Table) {
        this.Table = Table;
    }     
}
