package pl.podsiadly;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.time.LocalDateTime;

public class Init {
    public static void main(String[] args) {

        Path path = Paths.get("src/main/resources/data.sql");

        try {
            if (Files.exists(path)) {
                Files.writeString(path, "", StandardCharsets.UTF_8, StandardOpenOption.DELETE_ON_CLOSE);
            }

            Files.writeString(path, "", StandardCharsets.UTF_8, StandardOpenOption.CREATE);

            int max = 100;
            for (int i = 1; i <= max; i++ ) {
                String str = "INSERT INTO POST(id, title, content, created) " +
                        "values ("+i+", 'Test "+i+"', 'Content "+i+"', '"+ LocalDateTime.now().minusDays(max-i) +"');\n";
                Files.writeString(path, str, StandardCharsets.UTF_8, StandardOpenOption.APPEND);
            }

            for (int i = 1; i <= max; i++ ) {
                int postId = 1 + i/10;
                String str = "INSERT INTO COMMENT(id, post_id, content, created) " +
                        "values ("+i+","+postId+", 'Comment "+i+"', '"+ LocalDateTime.now().minusDays(max-i)+"');\n";
                Files.writeString(path, str, StandardCharsets.UTF_8, StandardOpenOption.APPEND);
            }
        } catch (IOException ex) {
            // Print messqage exception occurred as
            // invalid. directory local path is passed
            System.out.print("Invalid Path\n");
            System.out.println(ex.getMessage());
        }

    }
}
