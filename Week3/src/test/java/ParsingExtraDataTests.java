package Week3;
import duke.FileResource;
import org.apache.commons.csv.CSVParser;
import org.junit.Test;


public class ParsingExtraDataTests {


    @Test
    public void testCountryInfo() {
        FileResource fr = new FileResource("res/exports/exportdata.csv");
        CSVParser parser = fr.getCSVParser();

        ParsingExportData.countryInfo(parser, "Nauru");
    }

    @Test
    public void testListExportersTwoProducts() {
        FileResource fr = new FileResource("res/exports/exportdata.csv");
        CSVParser parser = fr.getCSVParser();

        ParsingExportData.listExportersTwoProducts(parser, "cotton", "flowers");
    }


    @Test
    public void testNumberOfExporters() {
        FileResource fr = new FileResource("res/exports/exportdata.csv");
        CSVParser parser = fr.getCSVParser();

        ParsingExportData.numberOfExporters(parser, "cocoa");
    }

    @Test
    public void testBigExporters() {
        FileResource fr = new FileResource("res/exports/exportdata.csv");
        CSVParser parser = fr.getCSVParser();

        ParsingExportData.bigExporters(parser, "$999,999,999,999");
    }
}