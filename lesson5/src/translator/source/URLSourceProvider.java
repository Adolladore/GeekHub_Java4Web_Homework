package translator.source;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.URLConnection;

/**
 * Implementation for loading content from specified URL.<br/>
 * Valid paths to load are http://someurl.com, https://secureurl.com, ftp://frpurl.com etc.
 */
public class URLSourceProvider implements SourceProvider {

    @Override
    public boolean isAllowed(String pathToSource) {
        String urlPattern = "^http(s{0,1})://[a-zA-Z0-9_/\\-\\.]+\\.([A-Za-z/]{2,5})" +
                "[a-zA-Z0-9_/\\&\\?\\=\\-\\.\\~\\%]*";
        return pathToSource.matches(urlPattern);
    }

    @Override
    public String load(String pathToSource) throws IOException {
        StringBuilder builder = new StringBuilder();
        String fileText;
        URL url = new URL(pathToSource);
        URLConnection connection = url.openConnection();

        try (BufferedReader in = new BufferedReader(new InputStreamReader(connection.getInputStream()))) {
            String inputLine;
            while ((inputLine = in.readLine()) != null) {
                builder.append(inputLine + "\n");
            }
            fileText = builder.toString();
        }
        return fileText;
    }
}
