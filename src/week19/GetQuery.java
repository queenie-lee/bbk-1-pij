package week19;

import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.net.http.HttpResponse.BodyHandlers;

import com.google.gson.Gson;

public class GetQuery {
    public static void main(String[] args) throws URISyntaxException,
            IOException, InterruptedException {
        Gson gson = new Gson();
        String[] postcodes = {"SW1A 0AA", "EH99 1SP", "CF99 1SN", "BT4 3XX", "WC1E 7HX"};
        ManyPostCodesQueryData manyPostCodes = new ManyPostCodesQueryData(postcodes);
        HttpRequest getRequest = HttpRequest.newBuilder()
//                .uri(new URI("https://api.postcodes.io/postcodes/WC1E7HX"))
//                .uri(new URI ("https", "//api.postcodes.io/postcodes/WC1E 7HX", null))
                .uri(new URI ("https", "//api.postcodes.io/postcodes/", null))
//                .GET()
                .header("Content-Type", "application/json")
                .POST(HttpRequest.BodyPublishers.ofString(gson.toJson(manyPostCodes)))
                .build();
        HttpClient httpClient = HttpClient.newHttpClient();
        HttpResponse<String> response =
                httpClient.send(getRequest, BodyHandlers.ofString());
//        System.out.println(response.body());
//        System.out.println(response.statusCode());
        String json = response.body();



        PostcodeResponse postCode = gson.fromJson(json,PostcodeResponse.class);
        int status = response.statusCode();

        if (status == 200) {
            System.out.println("The API call was successful.");
            System.out.println(postCode);
        } else {
            System.out.println("The API call was not successful.\nStatus code: " + status);
        }
    }
}
