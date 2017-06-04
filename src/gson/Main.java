package gson;

import java.io.IOException;

/**
 * Created by Anastasia on 26.01.2017.
 */
public class Main{
        public static void main(String[] args) throws IOException {

            String sourse = "D:\\настя\\JSONXML\\src\\gson\\json.txt";
            Person person1 = PersonFabric.getPersonFromFile(sourse);

            System.out.println(person1.name);
            System.out.println(person1.adress.city);

        }
}
