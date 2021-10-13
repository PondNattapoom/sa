package creational;

import javax.xml.parsers.ParserConfigurationException;
import java.io.IOException;
import java.io.PrintStream;

public abstract class BookMetadataExporter extends BookCollection {
    abstract BookMetadataFormatter buildformat() throws IOException, ParserConfigurationException;
    public void export(PrintStream stream) throws IOException, ParserConfigurationException {
        BookMetadataFormatter format =buildformat();
        for (Book i: books) {
            format.append(i);
        }
        stream.print(format.getMetadataString());
    }

}
