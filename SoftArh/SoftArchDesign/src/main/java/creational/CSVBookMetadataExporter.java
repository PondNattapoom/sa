package creational;

import java.io.IOException;

public class CSVBookMetadataExporter extends BookMetadataExporter{
    @Override
    public BookMetadataFormatter buildformat() throws IOException {
        return new CSVBookMetadataFormatter();
    }
}
