package TestPackage;

import Item.Items;
import Settings.UserNameAndPassword;
import Settings.UserSettings;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;

public class YourTest {

    /*
        Given before class

              Do not change the before class
    */

    /*
        before class verilmiştir

        before class değiştirmeyin
   */
    @Before
    public void beforeClass(){

        UserNameAndPassword userNameAndPassword = new UserNameAndPassword();

        userNameAndPassword.addUserToList();

    }

    /*

    YOUR CODE IS STARTING HERE

    Test the UserNameAndPassword class setUsername method

    Check all the possible options.

    NOTE :  For each possibility you need to create a different @Test method

     */


      /*

    KOD BURDAN BAŞLIYOR

     UserNameAndPassword class setUsername method TEST EDİN

    Bütün ihtimalleri check edin

    NOTE :  Her ihtimal için farklı @Test method oluşturmanız gerekiyor

     */

    @Test
    public void testSetUsername1() {
        UserNameAndPassword myUsername = new UserNameAndPassword();
        String result = myUsername.setUsername("Arif");
        String expected = "Username length should be more then 6";

        Assert.assertEquals("",expected, result);

    }
    @Test
    public void testSetUsername2() {
        UserNameAndPassword myUsername = new UserNameAndPassword();
        String result = myUsername.setUsername("Elif @ gmail.com");
        String expected = "Username should not contain space";

       Assert.assertEquals("",expected,result);
    }
    @Test
    public void testSetUsername3() {
        UserNameAndPassword myUsername = new UserNameAndPassword();
        String result = myUsername.setUsername("Bilgegmail.com");
        String expected = "Username should contain @ symbol";

        Assert.assertEquals(expected, result);

    }
    @Test
    public  void testSetUsername4() {

        UserNameAndPassword myUsername = new UserNameAndPassword();
        UserNameAndPassword.UserNameLists.add("Arfikomis@hotmail.com");
        String  result = myUsername.setUsername("Arfikomis@hotmail.com");

        String expected = "Username should be unique";


        Assert.assertEquals("",expected, result);

    }
    @Test
    public void testSetUsername5() {
        UserNameAndPassword myUsername = new UserNameAndPassword();
        String result = myUsername.setUsername("Micheil@gmail.com");
        String expected = "Micheil@gmail.com";


        Assert.assertEquals(expected, result);

    }



}
