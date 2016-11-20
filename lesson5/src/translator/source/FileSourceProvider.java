package translator.source;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

/**
 * Implementation for loading content from local file system.
 * This implementation supports absolute paths to local file system without specifying file:// protocol.
 * Examples c:/1.txt or d:/pathToFile/file.txt
 */
public class FileSourceProvider implements SourceProvider {

    @Override
    public boolean isAllowed(String pathToSource) throws IOException {
        File file = new File(pathToSource);
        if (file.exists() && file.isAbsolute()) {
            return true;
        } else {
            return false;
        }
    }

    @Override
    public String load(String pathToSource) throws IOException {
        StringBuilder builder = new StringBuilder();
        String fileText;
        try (BufferedReader reader = new BufferedReader(new FileReader(pathToSource))) {
            String line;
            while ((line = reader.readLine()) != null) {
                builder.append(line + "\n");
            }
            fileText = builder.toString();
        }
        return fileText;
    }
}
