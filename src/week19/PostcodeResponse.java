package week19;


public class PostcodeResponse {

    private int status;

    private PostcodeData result;


    @Override
    public String toString() {
        return "Postcode status=" + status + ", postcodeData= [" + result;
    }
}
