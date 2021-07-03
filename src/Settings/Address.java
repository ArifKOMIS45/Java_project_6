package Settings;

import java.util.ArrayList;


public class Address {
    static ArrayList<String> cityList = new ArrayList<>();

    private String Address1;
    private String City;
    private String ZipCode;

    public Address() {
    }

    public void SetCity() {

        cityList.add("New York");
        cityList.add("New Jersey");
        cityList.add("Ohio");
        cityList.add("Pennsylvania");
        cityList.add("Washington");
        cityList.add("Atlanta");
    }

    public String Address1(String myAddress) {
        Address1 = myAddress;
        return Address1;
    }


    public String City(String myCity) {
        if (!cityList.contains(myCity)) {
            return "We are not able to ship to your location";
        } else City = myCity;

        return City;

    }


    public String ZipCode(String myZipcode) {
        if (myZipcode.length() < 5)
            return "Zip code length should be 5";
        else ZipCode = myZipcode;
        return ZipCode;
    }
}
