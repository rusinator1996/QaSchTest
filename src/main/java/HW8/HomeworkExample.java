package HW8;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class HomeworkExample {

    private static final Logger LOGGER = Logger.getLogger(HomeworkExample.class.getName());

    public void myHomework() {
        try {
            // Read from file
            readFile("src/main/java/HW8/example1.txt");
        } catch (IOException e) {
            // Log stack trace
            LOGGER.log(Level.SEVERE, "Exception stack trace:", e);
            // Re-throw custom unchecked exception
            throw new CustomUncheckedException("Error occurred while processing the file", e);
        }
    }

    private void readFile(String filePath) throws IOException {
        try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
            // Process the file content
            String line;
            while ((line = reader.readLine()) != null) {
                // Do something with each line
                System.out.println(line);
            }
        }
    }

    // Custom unchecked exception
    private static class CustomUncheckedException extends RuntimeException {
        public CustomUncheckedException(String message, Throwable cause) {
            super(message, cause);
        }
    }

    public static void main(String[] args) {
        HomeworkExample homeworkExample = new HomeworkExample();
        homeworkExample.myHomework();
    }
}
