import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
public class A1 {
    public static void main(String[] args) {
        String content = "import java.io.IOException;\n" +
                "import java.nio.file.Files;\n" +
                "import java.nio.file.Paths;\n" +
                "public class A1 {\n" +
                "    public static void main(String[] args) {\n" +
                "        String content = \"Hello, world! This is a simple Java file write.\";\n" +
                "        String fileName = \"output.txt\";\n" +
                "        try {\n" +
                "            Files.writeString(Paths.get(fileName), content);\n" +
                "        } catch (IOException e) {\n" +
                "            System.err.println(\"Error writing to file: \" + e.getMessage());\n" +
                "        }\n" +
                "    }\n" +
                "}";
        String fileName = "output.txt";
        try {
            Files.writeString(Paths.get(fileName), content);
        } catch (IOException e) {
            System.err.println("Error writing to file: " + e.getMessage());
        }
    }
}
