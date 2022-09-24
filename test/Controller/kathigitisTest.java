package Controller;import org.junit.Test;import static org.junit.Assert.*;

/**
 *
 * @author nikos
 */
public class kathigitisTest {
    String typos="";//monimos or prosorinos
    String id="" ;
    String tmima="";//to tmima pou aniki
    String username="";
    String  password="";
    String Name=""; 
    String LastName="";
       
    public kathigitisTest() {
    }

    /**
     * Test of getTypos method, of class kathigitis.
     */
    @Test
    public void testGetTypos() {
        System.out.println("getTypos");
        kathigitis instance = new kathigitis(username, password, id ,  Name, LastName, typos,tmima);;
        String expResult = "";
        String result = instance.getTypos();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of getId method, of class kathigitis.
     */
    @Test
    public void testGetId() {
        System.out.println("getId");
        kathigitis instance = new kathigitis(username, password, id ,  Name, LastName, typos,tmima);
        String expResult = "";
        String result = instance.getId();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of getTmima method, of class kathigitis.
     */
    @Test
    public void testGetTmima() {
        System.out.println("getTmima");
        kathigitis instance = new kathigitis(username, password, id ,  Name, LastName, typos,tmima);
        String expResult = "";
        String result = instance.getTmima();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of setTypos method, of class kathigitis.
     */
    @Test
    public void testSetTypos() {
        System.out.println("setTypos");
        String typos = "";
        kathigitis instance = new kathigitis(username, password, id ,  Name, LastName, typos,tmima);
        instance.setTypos(typos);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of setId method, of class kathigitis.
     */
    @Test
    public void testSetId() {
        System.out.println("setId");
        String id = "";
        kathigitis instance = new kathigitis(username, password, id ,  Name, LastName, typos,tmima);;
        instance.setId(id);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of setTmima method, of class kathigitis.
     */
    @Test
    public void testSetTmima() {
        System.out.println("setTmima");
        String tmima = "";
        kathigitis instance = new kathigitis(username, password, id ,  Name, LastName, typos,tmima);;
        instance.setTmima(tmima);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of KathigitiData method, of class kathigitis.
     */
    @Test
    public void testKathigitiData() {
        System.out.println("KathigitiData");
        kathigitis instance = new kathigitis(username, password, id ,  Name, LastName, typos,tmima);;
        instance.KathigitiData();
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of findKathigiti method, of class kathigitis.
     */
    @Test
    public void testFindKathigiti() {
        System.out.println("findKathigiti");
        String id = "";
        String tmima = "";
        kathigitis instance = new kathigitis(username, password, id ,  Name, LastName, typos,tmima);;
        String expResult = "";
        String result = instance.findKathigiti(id, tmima);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
}
