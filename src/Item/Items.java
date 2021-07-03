package Item;

public class Items {
    private static double allUserPrice;
    private double price;

    public void ItemName(String myItem) {
        switch (myItem) {
            case "Rose teddy bear":
                price += 30;
                break;
            case "Iphone max":
                price += 850.23;
                break;
            case "laptop mouse":
                price += 23.50;
                break;
            case "Monitor":
                price += 90.23;
                break;
            case "charger":
                price += 43.20;
                break;
            case "hdmi cable":
                price += 5.90;
                break;
            case "mug":
                price += 30;
                break;
        }


    }


    public void colorPrice(String color) {

        switch (color) {
            case "Red":
                price += 10;
            case "Blue":
                price += 6;
            case "Black":
                price += 4;
            case "White":
                price += 2;

        }

    }


    public double customText(boolean a, String b) {
        if (a && b.length() > 10)  price += 5;
        if (a && b.length() <= 10)  price += 3;

        return price;
    }




public void AddtoAllUserPrice(){

    allUserPrice +=price;
}


public static double getAllUserPrice(){
    return allUserPrice;

}


}
