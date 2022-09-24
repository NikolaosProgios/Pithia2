package Controller;
import org.junit.Test;
import static org.junit.Assert.*;


public class MathimataTest {
        
     String id="";
     String examino="";
     String typos="";
     String onomasia="";
     String ores="";
     String Vathmos="";
     String Foititis="";
    
    public MathimataTest() {
    }

    /**
     * Test of getVathmos method, of class Mathimata.
     */
    @Test
    
    public void testGetVathmos() {
        System.out.println("getVathmos");
        Mathimata instance = new Mathimata( id, examino,  typos,  onomasia, ores, Vathmos, Foititis);
        String expResult = "";
        String result = instance.getVathmos();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of setVathmos method, of class Mathimata.
     */
    @Test
    public void testSetVathmos() {
        System.out.println("setVathmos");
        String Vathmos = "";
        Mathimata instance = new Mathimata( id, examino,  typos,  onomasia, ores, Vathmos, Foititis);
        instance.setVathmos(Vathmos);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of setFoititis method, of class Mathimata.
     */
    @Test
    public void testSetFoititis() {
        System.out.println("setFoititis");
        String Foititis = "";
        Mathimata instance = new Mathimata( id, examino,  typos,  onomasia, ores, Vathmos, Foititis);
        instance.setFoititis(Foititis);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of getFoititis method, of class Mathimata.
     */
    @Test
    public void testGetFoititis() {
        System.out.println("getFoititis");
        Mathimata instance = new Mathimata( id, examino,  typos,  onomasia, ores, Vathmos, Foititis);
        String expResult = "";
        String result = instance.getFoititis();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of getExamino method, of class Mathimata.
     */
    @Test
    public void testGetExamino() {
        System.out.println("getExamino");
        Mathimata instance = new Mathimata( id, examino,  typos,  onomasia, ores, Vathmos, Foititis);
        String expResult = "";
        String result = instance.getExamino();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of getTypos method, of class Mathimata.
     */
    @Test
    public void testGetTypos() {
        System.out.println("getTypos");
        Mathimata instance = new Mathimata( id, examino,  typos,  onomasia, ores, Vathmos, Foititis);
        String expResult = "";
        String result = instance.getTypos();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of getOnomasia method, of class Mathimata.
     */
    @Test
    public void testGetOnomasia() {
        System.out.println("getOnomasia");
        Mathimata instance = new Mathimata( id, examino,  typos,  onomasia, ores, Vathmos, Foititis);
        String expResult = "";
        String result = instance.getOnomasia();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of getOres method, of class Mathimata.
     */
    @Test
    public void testGetOres() {
        System.out.println("getOres");
        Mathimata instance = new Mathimata( id, examino,  typos,  onomasia, ores, Vathmos, Foititis);
        String expResult = "";
        String result = instance.getOres();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of setExamino method, of class Mathimata.
     */
    @Test
    public void testSetExamino() {
        System.out.println("setExamino");
        String examino = "";
        Mathimata instance = new Mathimata( id, examino,  typos,  onomasia, ores, Vathmos, Foititis);
        instance.setExamino(examino);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of setTypos method, of class Mathimata.
     */
    @Test
    public void testSetTypos() {
        System.out.println("setTypos");
        String typos = "";
        Mathimata instance = new Mathimata( id, examino,  typos,  onomasia, ores, Vathmos, Foititis);
        instance.setTypos(typos);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of setOnomasia method, of class Mathimata.
     */
    @Test
    public void testSetOnomasia() {
        System.out.println("setOnomasia");
        String onomasia = "";
        Mathimata instance = new Mathimata( id, examino,  typos,  onomasia, ores, Vathmos, Foititis);
        instance.setOnomasia(onomasia);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of setOres method, of class Mathimata.
     */
    @Test
    public void testSetOres() {
        System.out.println("setOres");
        String ores = "";
        Mathimata instance = new Mathimata( id, examino,  typos,  onomasia, ores, Vathmos, Foititis);
        instance.setOres(ores);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of getId method, of class Mathimata.
     */
    @Test
    public void testGetId() {
        System.out.println("getId");
        Mathimata instance = new Mathimata( id, examino,  typos,  onomasia, ores, Vathmos, Foititis);
        String expResult = "";
        String result = instance.getId();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of setId method, of class Mathimata.
     */
    @Test
    public void testSetId() {
        System.out.println("setId");
        String id = "";
        Mathimata instance = new Mathimata( id, examino,  typos,  onomasia, ores, Vathmos, Foititis);
        instance.setId(id);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of MathimataData method, of class Mathimata.
     */
    @Test
    public void testMathimataData() {
        System.out.println("MathimataData");
        Mathimata instance = new Mathimata( id, examino,  typos,  onomasia, ores, Vathmos, Foititis);
        instance.MathimataData();
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of findMathimata method, of class Mathimata.
     */
    @Test
    public void testFindMathimata() {
        System.out.println("findMathimata");
        String id = "";
        String kod = "";
        Mathimata instance = new Mathimata( id, examino,  typos,  onomasia, ores, Vathmos, Foititis);
        String expResult = "";
        String result = instance.findMathimata(id, kod);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of Update method, of class Mathimata.
     */
    @Test
    public void testUpdate() {
        System.out.println("Update");
        String nameF = "";
        String nameM = "";
        String Vathmoi = "";
        Mathimata instance =new Mathimata( id, examino,  typos,  onomasia, ores, Vathmos, Foititis);
        instance.Update(nameF, nameM, Vathmoi);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of Save_Vathmologia method, of class Mathimata.
     */
    @Test
    public void testSave_Vathmologia() {
        System.out.println("Save_Vathmologia");
        String id = "";
        String Vathmoi = "";
        Mathimata instance = new Mathimata( id, examino,  typos,  onomasia, ores, Vathmos, Foititis);
        instance.Save_Vathmologia(id, Vathmoi);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
}
