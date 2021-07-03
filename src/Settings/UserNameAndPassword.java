package Settings;

import java.util.ArrayList;

public class UserNameAndPassword {

    public static ArrayList<String> UserNameLists = new ArrayList<>();

    public String password;

    public String userName;



    public UserNameAndPassword(String Username, String Password) {
        setUsername(Username);
        setPassword(Password);
    }

    public UserNameAndPassword() {

    }

    public void addUserToList() {

    }
    /*
       private String userName and password oluştur

     Adı UserNameLists , türü Strıng ve static olan bir  Arraylist oluşturun.

    */

    public String setUsername(String myUsername) {
        if (myUsername.length() < 6) return "Username length should be more then 6";
        if (myUsername.contains(" ")) return "Username should not contain space";
        if (!myUsername.contains("@")) return "Username should contain @ symbol";
        if (UserNameLists.contains(myUsername))
            return "Username should be unique";
         else userName = myUsername;

         return userName;
    }

    /*
        Create a method name is setUsername
        return type is String
        parameter is String(myUsername)

        if the myUsername length is less then 6
        return Username length should be more then 6

        if the myUsername contains space(" ")
        return  Username should not contain space

        if the myUsername does NOT contains @
        return Username should contain @ symbol

        if the UserNameLists has myusername
        return Username should be unique

        if all these are false
        private userName = myUsername

        and return the username
    */


    /*
       türü String ve parametresi String(myUsername) olan
       setUsername adında bir method oluşturun

       Eğer myUsername length 6 dan küçük ise
       Username length should be more then 6 return et.

        Eğer myUsername boşluk(" ") içeriyorsa
        Username should not contain space return et

        Eğer myUsername  @ sembolü içermiyorsa
        Username should contain @ symbol return et

        Eğer UserNameLists de  myusername varsa
        Username should be unique return et

        Eğer bunların hepsi false ise
       private userName = myUsername

       ve userName return et
   */


    public String setPassword(String myPassword) {
        if (myPassword.length() <= 5) {
            return "Password length more then 5 character";
        } else password = myPassword;
        return myPassword;
    }





    /*
    Create a method name is setPassword
    Return type is String
    Parameter is String(myPassword)

    if myPassword length is less or equal then 5
    return  Password length more then 5 character

    if first condition is false
    private password variable is equal to myPassword

    and return the myPassword

     */



 /*
    Return türü String ve parametresi String(myPassword) olan setPassword methodunu oluşturun



    Eğer myPassword length  5 ten küçük veya eşit ise
     Password length more then 5 character  return edin

    Eğer ilk condition false ise
    private password variable  myPassword a eşittir

    ve   myPassword return et

     */


}
