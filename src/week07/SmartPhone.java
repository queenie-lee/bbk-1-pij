package week07;

public class SmartPhone extends MobilePhone {
    SmartPhone(String brand) {
        super(brand);
    }
    public void browseWeb(String url) {
        System.out.println("Visiting the website: " + url);
    }

    public void findPosition() {
        System.out.println("You are at Latitude: -2.05408, Longitude: -4.54984");
    }

    @Override
    public void call(String number) {
        if (number.substring(0,2).equals("00")) {
            System.out.println("Calling <" + number + "> through the internet to save money.");
            addCalledNumber(number);
        } else {
            super.call(number);
        }
    }
}
