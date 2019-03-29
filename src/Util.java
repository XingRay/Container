import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Util {
    private Util() {
        throw new UnsupportedOperationException();
    }

    public static void writeToFile(File parent, String fileName, String s) {
        if (!parent.exists()) {
            parent.mkdir();
        }
        File file = new File(parent, fileName);
        if (file.exists()) {
            file.delete();
        }
        FileWriter fileWriter = null;
        try {
            file.createNewFile();
            fileWriter = new FileWriter(file);
            fileWriter.write(s);
            fileWriter.flush();

        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (fileWriter != null) {
                try {
                    fileWriter.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
