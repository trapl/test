/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TestPackage;

import java.util.ArrayList;
import modal.Doctor;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author dell
 */
public class TestTest {

    public TestTest() {
    }

    @Before
    public void setUp() {
    }

    @After
    public void tearDown() {
    }

    /**
     * Test of add method, of class Test.
     */
    @Test
    public void testAdd() {
        System.out.println("add");
        String name = "tra";
        String DOB = "22-2-1999";
        String Spec = "dentis";
        int avai = 0;
        String email = "tra@gmail.com";
        String number = "1234567890";
        TestPackage.Test instance = new TestPackage.Test();
        Doctor expResult = new Doctor(avai, name, DOB, Spec, avai, email, number);
        Doctor result = instance.add(name, DOB, Spec, avai, email, number);
        assertEquals(expResult.Name, result.Name);
        // TODO review the generated test code and remove the default call to fail.

    }

    /**
     * Test of getIndex method, of class Test.
     */
    @Test
    public void testGetIndex() {
        System.out.println("getIndex");
        int id = 1;
        TestPackage.Test instance = new TestPackage.Test();
        int expResult = 0;
        int result = instance.getIndex(id);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.

    }

    @Test
    public void testGetIndex1() {
        System.out.println("getIndex");
        int id = 10;
        TestPackage.Test instance = new TestPackage.Test();
        int expResult = -1;
        int result = instance.getIndex(id);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.

    }

    @Test
    public void testGetIndex2() {
        System.out.println("getIndex");
        int id = 8;
        TestPackage.Test instance = new TestPackage.Test();
        int expResult = -1;
        int result = instance.getIndex(id);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.

    }
   

    /**
     * Test of update method, of class Test.
     */
    @Test
    public void testUpdate() {
        System.out.println("update");
        TestPackage.Test instance = new TestPackage.Test();
        int id = 2;
        int index = instance.getIndex(id);
        String y = "y";
        String name = "tra";
        String DOB = "22-2-1999";
        String Spec = "dentis";
        int avai = 0;
        String email = "tra@gmail.com";
        String number = "1234567890";
        Doctor expResult = new Doctor(id, name, DOB, Spec, avai, email, number);     
        Doctor result = instance.update(id, index, name, DOB, Spec, avai, email, email,y);
        assertEquals(expResult.Name, result.Name);
        // TODO review the generated test code and remove the default call to fail.

    }
     @Test
    public void testUpdate1() {
        System.out.println("update");
        TestPackage.Test instance = new TestPackage.Test();
        int id = 2;
        int index = instance.getIndex(id);
        String y = "y";
        String name = "tra";
        String DOB = "22-2-1999";
        String Spec = "dentis";
        int avai = 0;
        String email = "tra@gmail.com";
        String number = "1234567890";
        Doctor expResult = new Doctor(id, name, DOB, Spec, avai, email, number);     
        Doctor result = instance.update(id, index, name, DOB, Spec, avai, email, email,y);
        assertEquals(expResult.Name, result.Name);
        // TODO review the generated test code and remove the default call to fail.

    }
      @Test
    public void testUpdate2() {
        System.out.println("update");
        TestPackage.Test instance = new TestPackage.Test();
        int id = 2;
        String y ="n";
        int index = instance.getIndex(id);
        String name = "hai";
        String DOB = "11/12/1221";
        String Spec = "1";
        int avai = 0;
        String email = "1@g.com";
        String number = "(123)-456-7890";
      Doctor expResult = new Doctor(id, name, DOB, Spec, avai, email, number);
        Doctor result = instance.update(id, index, name, DOB, Spec, avai, email, email,y);
        assertEquals(expResult.Name, result.Name);
        // TODO review the generated test code and remove the default call to fail.

    }
    
       @Test
    public void testUpdate3() {
        System.out.println("update");
        TestPackage.Test instance = new TestPackage.Test();
        int id = 11;
        String y ="n";
        int index = instance.getIndex(id);
        String name = "hai";
        String DOB = "11/12/1221";
        String Spec = "1";
        int avai = 0;
        String email = "1@g.com";
        String number = "(123)-456-7890";
        Doctor expResult = null;
        Doctor result = instance.update(id, index, name, DOB, Spec, avai, email, email,y);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.

    }

    /**
     * Test of sort method, of class Test.
     */
    @Test
    public void testSort() {
        System.out.println("sort");
        TestPackage.Test instance = new TestPackage.Test();
        ArrayList<Doctor> expResult = new ArrayList<>();
        expResult.add(new Doctor(1, "huy", "14/16/1999", "1", 0, "1@g.com", "(123)-456-7890"));
        expResult.add(new Doctor(2, "hai", "11/12/1221", "1", 0, "1@g.com", "(123)-456-7890"));
        expResult.add(new Doctor(3, "hoang", "12/11/1221", "1", 0, "1@g.com", "(123)-456-7890"));
        expResult.add(new Doctor(4, "thuy", "12/12/1999", "1", 0, "1@g.com", "(123)-456-7890"));
        expResult = instance.sort();
        ArrayList<Doctor> result = instance.sort();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.

    }

    /**
     * Test of delete method, of class Test.
     */
    @Test
    public void testDelete() {
        System.out.println("delete");
        int id = 0;
        TestPackage.Test instance = new TestPackage.Test();
        boolean expResult = false;
        boolean result = instance.delete(id);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.

    }
     @Test
    public void testDelete1() {
        System.out.println("delete");
        int id = 1;
        TestPackage.Test instance = new TestPackage.Test();
        boolean expResult = true;
        boolean result = instance.delete(id);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.

    }

    /**
     * Test of search method, of class Test.
     */
    @Test
    public void testSearch() {
        System.out.println("search");
        String input = "1";
        TestPackage.Test instance = new TestPackage.Test();
        int expResult = 1;
        int result = instance.search(input);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.

    }

    @Test
    public void testSearch1() {
        System.out.println("search");
        String input = "huy";
        TestPackage.Test instance = new TestPackage.Test();
        int expResult = 1;
        int result = instance.search(input);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.

    }

    @Test
    public void testSearch2() {
        System.out.println("search");
        String input = "h";
        TestPackage.Test instance = new TestPackage.Test();
        int expResult = 1;
        int result = instance.search(input);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.

    }

    @Test
    public void testSearch3() {
        System.out.println("search");
        String input = "7";
        TestPackage.Test instance = new TestPackage.Test();
        int expResult = -1;
        int result = instance.search(input);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.

    }

     @Test
    public void testSearch4() {
        System.out.println("search");
        String input = "tra";
        TestPackage.Test instance = new TestPackage.Test();
        int expResult = -1;
        int result = instance.search(input);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.

    }
    /**
     * Test of input method, of class Test.
     */
    @Test
    public void testInput() {
        System.out.println("input");
        String name = "tra";
        int val=10;
        TestPackage.Test instance = new TestPackage.Test();
        String expResult = "1";
        String result = instance.input(name,val);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.

    }
    
     @Test
    public void testInput1() {
        System.out.println("input");
        String name = "1234";
        int val=10;
        TestPackage.Test instance = new TestPackage.Test();
        String expResult = "1";
        String result = instance.input(name,val);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.

    }
      @Test
    public void testInput2() {
        System.out.println("input");
        String name = "12345678901111";
        int val=10;
        TestPackage.Test instance = new TestPackage.Test();
        String expResult = "-1";
        String result = instance.input(name,val);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.

    }

      @Test
    public void testInput3() {
        System.out.println("input");
        String name = "tra1234";
        int val=10;
        TestPackage.Test instance = new TestPackage.Test();
        String expResult = "1";
        String result = instance.input(name,val);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.

    }
     @Test
    public void testInput4() {
        System.out.println("input");
        String name = "";
        int val=10;
        TestPackage.Test instance = new TestPackage.Test();
        String expResult = "1";
        String result = instance.input(name,val);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.

    }
    
    /**
     * Test of choice method, of class Test.
     */
    @Test
    public void testChoice() {
        System.out.println("choice");
        String input="2";
        int min = 1;
        int max = 3;
        TestPackage.Test instance = new TestPackage.Test();
        int expResult = 2;
        int result = instance.choice(input, min, max);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.

    }
     @Test
    public void testChoice3() {
        System.out.println("choice");
        String input="1";
        int min = 1;
        int max = 3;
        TestPackage.Test instance = new TestPackage.Test();
        int expResult = 1;
        int result = instance.choice(input, min, max);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.

    }
     @Test
    public void testChoice6() {
        System.out.println("choice");
        String input="1";
        int min = 1;
        int max = 1;
        TestPackage.Test instance = new TestPackage.Test();
        int expResult = 1;
        int result = instance.choice(input, min, max);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.

    }
    
     @Test
    public void testChoice4() {
        System.out.println("choice");
        String input="3";
        int min = 1;
        int max = 3;
        TestPackage.Test instance = new TestPackage.Test();
        int expResult = 3;
        int result = instance.choice(input, min, max);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.

    }
    
     @Test
    public void testChoice2() {
        System.out.println("choice");
       String input="traf";
        int min = 1;
        int max = 3;
        TestPackage.Test instance = new TestPackage.Test();
        int expResult = -2;
        int result = instance.choice(input, min, max);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.

    }
      @Test
    public void testChoice5() {
        System.out.println("choice");
       String input="6";
        int min = 1;
        int max = 3;
        TestPackage.Test instance = new TestPackage.Test();
        int expResult = -1;
        int result = instance.choice(input, min, max);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.

    }


    /**
     * Test of getDates method, of class Test.
     */
    @Test
    public void testGetDates() {
        System.out.println("getDates");
        String input="22-2-1999";
        TestPackage.Test instance = new TestPackage.Test();
        String expResult = "22-02-1999";
        String result = instance.getDates(input);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.

    }
     @Test
    public void testGetDates1() {
        System.out.println("getDates");
        String input="30-2-1999";
        TestPackage.Test instance = new TestPackage.Test();
        String expResult = "-1";
        String result = instance.getDates(input);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.

    }
     @Test
    public void testGetDates2() {
        System.out.println("getDates");
        String input="29-2-2020";
        TestPackage.Test instance = new TestPackage.Test();
        String expResult = "29-02-2020";
        String result = instance.getDates(input);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.

    }
     @Test
    public void testGetDates3() {
        System.out.println("getDates");
        String input="29-22-2020";
        TestPackage.Test instance = new TestPackage.Test();
        String expResult = "-1";
        String result = instance.getDates(input);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.

    }
    @Test
    public void testGetDates4() {
        System.out.println("getDates");
        String input="40-5-2020";
        TestPackage.Test instance = new TestPackage.Test();
        String expResult = "-1";
        String result = instance.getDates(input);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.

    }
     @Test
    public void testGetDates5() {
        System.out.println("getDates");
        String input="10-5-20202";
        TestPackage.Test instance = new TestPackage.Test();
        String expResult = "10-05-20202";
        String result = instance.getDates(input);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.

    }

    /**
     * Test of isValid method, of class Test.
     */
    @Test
    public void testIsValid() {
        System.out.println("isValid");
        String email = "tra@gmail.com";
        TestPackage.Test instance = new TestPackage.Test();
        boolean expResult = true;
        boolean result = instance.isValid(email);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.

    }
    
     @Test
    public void testIsValid1() {
        System.out.println("isValid");
        String email = "tra@gmail";
        TestPackage.Test instance = new TestPackage.Test();
        boolean expResult = false;
        boolean result = instance.isValid(email);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.

    }

     @Test
    public void testIsValid2() {
        System.out.println("isValid");
        String email = "@gmail.com";
        TestPackage.Test instance = new TestPackage.Test();
        boolean expResult = false;
        boolean result = instance.isValid(email);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.

    }
    
     @Test
    public void testIsValid3() {
        System.out.println("isValid");
        String email = "@gmail.com.vn";
        TestPackage.Test instance = new TestPackage.Test();
        boolean expResult = false;
        boolean result = instance.isValid(email);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.

    }
      @Test
    public void testIsValid4() {
        System.out.println("isValid");
        String email = "tra@gmail.com.vn";
        TestPackage.Test instance = new TestPackage.Test();
        boolean expResult = true;
        boolean result = instance.isValid(email);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.

    }
     @Test
    public void testIsValid5() {
        System.out.println("isValid");
        String email = "1231312";
        TestPackage.Test instance = new TestPackage.Test();
        boolean expResult = false;
        boolean result = instance.isValid(email);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.

    }
    @Test
    public void testIsValid6() {
        System.out.println("isValid");
        String email = "tra@gmail,com,vn";
        TestPackage.Test instance = new TestPackage.Test();
        boolean expResult = false;
        boolean result = instance.isValid(email);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.

    }
    @Test
    public void testIsValid7() {
        System.out.println("isValid");
        String email = "tra@gmail,com.vn";
        TestPackage.Test instance = new TestPackage.Test();
        boolean expResult = false;
        boolean result = instance.isValid(email);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.

    }
    /**
     * Test of checkMail method, of class Test.
     */
    @Test
    public void testCheckMail() {
        System.out.println("checkMail");
        String input ="tra@gmail.com";
        TestPackage.Test instance = new TestPackage.Test();
        String expResult = "tra@gmail.com";
        String result = instance.checkMail(input);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.

    }
    
    @Test
    public void testCheckMail1() {
        System.out.println("checkMail");
        String input ="tragmail.com";
        TestPackage.Test instance = new TestPackage.Test();
        String expResult = "-1";
        String result = instance.checkMail(input);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.

    }
    @Test
    public void testCheckMail2() {
        System.out.println("checkMail");
        String input ="tra@gmail.vn";
        TestPackage.Test instance = new TestPackage.Test();
        String expResult = "tra@gmail.vn";
        String result = instance.checkMail(input);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.

    }
     @Test
    public void testCheckMail3() {
        System.out.println("checkMail");
        String input ="tra@gmail";
        TestPackage.Test instance = new TestPackage.Test();
        String expResult = "-1";
        String result = instance.checkMail(input);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.

    }
  @Test
    public void testCheckMail4() {
        System.out.println("checkMail");
        String input ="@gmail.com.vn";
        TestPackage.Test instance = new TestPackage.Test();
        String expResult = "-1";
        String result = instance.checkMail(input);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.

    }
     @Test
    public void testCheckMail5() {
        System.out.println("checkMail");
        String input ="tra@gmail.com.vn";
        TestPackage.Test instance = new TestPackage.Test();
        String expResult = "tra@gmail.com.vn";
        String result = instance.checkMail(input);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.

    }
     @Test
    public void testCheckMail6() {
        System.out.println("checkMail");
        String input ="@gmail.com";
        TestPackage.Test instance = new TestPackage.Test();
        String expResult = "-1";
        String result = instance.checkMail(input);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.

    }
     @Test
    public void testCheckMail7() {
        System.out.println("checkMail");
        String input ="1324";
        TestPackage.Test instance = new TestPackage.Test();
        String expResult = "-1";
        String result = instance.checkMail(input);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.

    }
    /**
     * Test of checkMoblie method, of class Test.
     */
    @Test
    public void testCheckMoblie() {
        System.out.println("checkMoblie");
        
        String mess = "1234567890";
        TestPackage.Test instance = new TestPackage.Test();
        String expResult = "(123)-456-7890";
        String result = instance.checkMoblie(mess);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.

    }
    
     @Test
    public void testCheckMoblie1() {
        System.out.println("checkMoblie");
        
        String mess = "1234567890111";
        TestPackage.Test instance = new TestPackage.Test();
        String expResult = "-1";
        String result = instance.checkMoblie(mess);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.

    }
    
    @Test
    public void testCheckMoblie2() {
        System.out.println("checkMoblie");
        String mess = "12345";
        TestPackage.Test instance = new TestPackage.Test();
        String expResult = "-1";
        String result = instance.checkMoblie(mess);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.

    }
    
    @Test
    public void testCheckMoblie3() {
        System.out.println("checkMoblie");
        String mess = "hagajs";
        TestPackage.Test instance = new TestPackage.Test();
        String expResult = "-2";
        String result = instance.checkMoblie(mess);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.

    }
   @Test
    public void testCheckMoblie4() {
        System.out.println("checkMoblie");
        
        String mess = "0969060934";
        TestPackage.Test instance = new TestPackage.Test();
        String expResult = "(096)-906-0934";
        String result = instance.checkMoblie(mess);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.

    }
    
    /**
     * Test of checkYOrN method, of class Test.
     */
    @Test
    public void testCheckYOrN() {
        System.out.println("checkYOrN");
        String input = "Y";
        TestPackage.Test instance = new TestPackage.Test();
        boolean expResult = true;
        boolean result = instance.checkYOrN(input);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.

    }
    @Test
    public void testCheckYOrN1() {
        System.out.println("checkYOrN");
        String input = "N";
        TestPackage.Test instance = new TestPackage.Test();
        boolean expResult = false;
        boolean result = instance.checkYOrN(input);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.

    }

     @Test
    public void testCheckYOrN2() {
        System.out.println("checkYOrN");
        String input = "v";
        TestPackage.Test instance = new TestPackage.Test();
        boolean expResult = false;
        boolean result = instance.checkYOrN(input);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.

    }
    
    
     @Test
    public void testCheckYOrN3() {
        System.out.println("checkYOrN");
        String input = "b";
        TestPackage.Test instance = new TestPackage.Test();
        boolean expResult = false;
        boolean result = instance.checkYOrN(input);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.

    }
     @Test
    public void testCheckYOrN4() {
        System.out.println("checkYOrN");
        String input = "y";
        TestPackage.Test instance = new TestPackage.Test();
        boolean expResult = true;
        boolean result = instance.checkYOrN(input);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.

    }
    
     @Test
    public void testCheckYOrN5() {
        System.out.println("checkYOrN");
        String input = "n";
        TestPackage.Test instance = new TestPackage.Test();
        boolean expResult = false;
        boolean result = instance.checkYOrN(input);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.

    }
}
