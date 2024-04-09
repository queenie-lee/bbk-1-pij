package week19;

public class PostcodeData {
    private String postcode;
    private String region;
    private double latitude;
    private double longitude;

//    PostcodeData {
//        this.postcode = postcode;
//        this.region = region;
//        this.latitude = latitude;
//        this.longitude = longitude;
//    }

    @Override
    public String toString() {
        return "postcode=" + postcode + ", region=" + region + ", latitude=" + latitude +
                ", longitude=" + longitude + "]";
    }
}
