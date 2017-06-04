package json1;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.io.File;
import java.io.IOException;
import com.fasterxml.jackson.databind.ObjectMapper;

/**
 * Created by Anastasia on 27.01.2017.
 */
public class Converter {

    public static void toJSON(User user) throws IOException {
        ObjectMapper mapper = new ObjectMapper();
        mapper.writeValue(new File(baseFile), user);
        System.out.println("json created!");
    }

    public static User toJavaObject() throws IOException {
        ObjectMapper mapper = new ObjectMapper();
        return mapper.readValue(new File(baseFile), User.class);
    }
}






}
