package json1;

import com.google.gson.Gson;

/**
 * Created by Anastasia on 27.01.2017.
 */
public class Main {
    public static void main(String[] args) {

        String baseFile = "user.json";

        User user = new User();

        Gson gson = new Gson();
        String jsonString = gson.toJson(user);



        System.out.println("json " + jsonString);


    }
}
