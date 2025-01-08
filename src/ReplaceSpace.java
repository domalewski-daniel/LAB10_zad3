import java.io.*;

public class ReplaceSpace {
    public static void main(String[] args) {

        String filePath = "C:/Lab10_zad3.txt";

        try {

            StringBuilder content = new StringBuilder();
            try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
                String line;
                while ((line = reader.readLine()) != null) {
                    content.append(line.replace(" ", "-")).append(System.lineSeparator());
                }
            }

            try (BufferedWriter writer = new BufferedWriter(new FileWriter(filePath))) {
                writer.write(content.toString());
            }

            System.out.println("Zmiany zapisane");
        } catch (IOException e) {
            System.err.println("Wystąpił błąd" + e.getMessage());
        }
    }
}
