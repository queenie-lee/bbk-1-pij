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

    @Override
    public int hashCode() {
        return brand.hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        } else if (this == obj) {
            return true;
//        } else if (obj instanceof OldPhone oldPhone) {
//            return oldPhone.brand.equals(brand);
        }
        else if (this.getClass() == obj.getClass()) {
            return ((OldPhone)obj).brand.equals(brand);
        } else {
            return false;
        }
    }
}
