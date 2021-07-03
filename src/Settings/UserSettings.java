package Settings;

public class UserSettings {

   public String username;
   public String password;
   public String Address1;
   public String City;
   public String ZipCode;
   public String ItemName;
   public String customText;
   public String color;

    public boolean wanaCustomText;
    public double myPrice;





    @Override
    public String toString() {
        return "UserSettings{" +
                "username='" + username + '\'' +
                ", password='" + password + '\'' +
                ", Address1='" + Address1 + '\'' +
                ", City='" + City + '\'' +
                ", ZipCode='" + ZipCode + '\'' +
                ", ItemName='" + ItemName + '\'' +
                ", customText='" + customText + '\'' +
                ", color='" + color + '\'' +
                ", wanaCustomText=" + wanaCustomText +
                ", myPrice=" + myPrice +
                '}';
    }

}
