package Controller;
import org.junit.Test;
import static org.junit.Assert.*;

public class AdminTest {
    String username=""; String password="";   String id="";
    String Name="";     String LastName="";   String typos="";
    String tmima="";
    public AdminTest() {
    }

    /**
     * Test of getId method, of class Admin.
     */
    @Test
    public void testGetId() {
        System.out.println("getId");
        Admin instance =new Admin(username,password,id,Name,LastName,typos,tmima);
        String expResult = "";
        String result = instance.getId();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of getTypos method, of class Admin.
     */
    @Test
    public void testGetTypos() {
        System.out.println("getTypos");
        Admin instance =new Admin(username,password,id,Name,LastName,typos,tmima);
        String expResult = "";
        String result = instance.getTypos();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of setId method, of class Admin.
     */
    @Test
    public void testSetId() {
        System.out.println("setId");
        String id = "";
        Admin instance =new Admin(username,password,id,Name,LastName,typos,tmima);
        instance.setId(id);
        // TODO review the generated test code and remove the default call to fail.
       // fail("The test case is a prototype.");
    }

    /**
     * Test of getTmima method, of class Admin.
     */
    @Test
    public void testGetTmima() {
        System.out.println("getTmima");
        Admin instance =new Admin(username,password,id,Name,LastName,typos,tmima);
        String expResult = "";
        String result = instance.getTmima();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of setTypos method, of class Admin.
     */
    @Test
    public void testSetTypos() {
        System.out.println("setTypos");
        String typos = "";
        Admin instance =new Admin(username,password,id,Name,LastName,typos,tmima);
        instance.setTypos(typos);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of setTmima method, of class Admin.
     */
    @Test
    public void testSetTmima() {
        System.out.println("setTmima");
        String tmima = "";
        Admin instance =new Admin(username,password,id,Name,LastName,typos,tmima);
        instance.setTmima(tmima);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of AdminData method, of class Admin.
     */
    @Test
    public void testAdminData() {
        System.out.println("AdminData");
        Admin instance =new Admin(username,password,id,Name,LastName,typos,tmima);
        instance.AdminData();
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of findAdmin method, of class Admin.
     */
    @Test
    public void testFindAdmin() {
        System.out.println("findAdmin");
        String id = "";
        String tmima = "";
        Admin instance =new Admin(username,password,id,Name,LastName,typos,tmima);
        String expResult = "";
        String result = instance.findAdmin(id, tmima);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of egrisi method, of class Admin.
     */
    @Test
    public void testEgrisi() {
        System.out.println("egrisi");
        String AM = "";
        String Mathima = "";
        String Vathmos = "";
        Admin instance =new Admin(username,password,id,Name,LastName,typos,tmima);
        String[] expResult = {"","",""};
        String[] result = instance.egrisi(AM, Mathima, Vathmos);
        assertArrayEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of showMessage method, of class Admin.
     */
    @Test
    public void testShowMessage() {
        System.out.println("showMessage");
        boolean Flag = false;
        Admin instance =new Admin(username,password,id,Name,LastName,typos,tmima);
        instance.showMessage(Flag);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
}
