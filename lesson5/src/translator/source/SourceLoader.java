package translator.source;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * SourceLoader should contains all implementations of SourceProviders to be able to load different sources.
 */
public class SourceLoader {
    private List<SourceProvider> sourceProviders = new ArrayList<>();

    public SourceLoader() {
        sourceProviders.add(new FileSourceProvider());
        sourceProviders.add(new URLSourceProvider());
    }

    public String loadSource(String pathToSource) throws IOException {


        if (sourceProviders.get(0).isAllowed(pathToSource)) {
            return sourceProviders.get(0).load(pathToSource);
        } else if (sourceProviders.get(1).isAllowed(pathToSource)) {
            return sourceProviders.get(1).load(pathToSource);
        } else {
           return null;
        }
    }
}
