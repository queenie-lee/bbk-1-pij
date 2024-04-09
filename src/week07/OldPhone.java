package week07;

public class OldPhone implements Phone {

    private String brand;

    /**
     * Creates a new OldPhone with a given brand.
     *
     * @param brand the brand of this OldPhone
     */
    public OldPhone(String brand) {
        this.brand = brand;
    }

    /**
     * @return the brand of this OldPhone
     */
    public String getBrand() {
        return brand;
    }
    /**
     * Just print on the screen: "Calling <number>..."
     *
     * @param number the phone number to call
     */
    @Override
    public void call(String number) {
        System.out.println("Calling <" + number +">");
    }
}
