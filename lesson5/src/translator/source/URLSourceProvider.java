package translator.source;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;

/**
 * Implementation for loading content from specified URL.<br/>
 * Valid paths to load are http://someurl.com, https://secureurl.com, ftp://frpurl.com etc.
 */
public class URLSourceProvider implements SourceProvider {

    @Override
    public boolean isAllowed(String pathToSource) throws MalformedURLException {
        try {
            URL validOrNot = new URL(pathToSource);
            return true;
        } catch (MalformedURLException e ) {
            return false;
        }
    }

    @Override
    public String load(String pathToSource) throws IOException {
        StringBuilder content = new StringBuilder();
        URL url = new URL(pathToSource);

        try (BufferedReader in = new BufferedReader(new InputStreamReader(url.openStream()))) {
            String inputLine;
            while ((inputLine = in.readLine()) != null) {
                content.append(inputLine + "\n");
            }
        }
        return content.toString();
    }
}
