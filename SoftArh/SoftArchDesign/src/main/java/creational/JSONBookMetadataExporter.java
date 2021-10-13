package creational;

public class JSONBookMetadataExporter extends BookMetadataExporter{
    @Override
    public BookMetadataFormatter buildformat() {
        return new JSONBookMetadataFormatter();
    }
}
