package gson;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.io.FileReader;
import java.io.IOException;

/**
 * Created by Anastasia on 26.01.2017.
 */
public class PersonFabric {


        static Person getPerson(String jsonContent) {
            Gson gson = new GsonBuilder().create();
            return gson.fromJson(jsonContent, Person.class);
        }

        static Person getPersonFromFile(String fileName) throws IOException {
            String fileContent = gson.FileReader.readFile(fileName);
            return getPerson(fileContent);
        }
    }

