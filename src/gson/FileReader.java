package gson;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

/**
 * Created by Anastasia on 26.01.2017.
 */
public class FileReader {
    static String readFile(String fileName) throws IOException {
        List lines = Files.readAllLines(Paths.get(fileName), StandardCharsets.UTF_8);
        StringBuilder sb = new StringBuilder();
        for (Object line : lines) {
            sb.append(line);
        }
        return sb.toString();
    }
}