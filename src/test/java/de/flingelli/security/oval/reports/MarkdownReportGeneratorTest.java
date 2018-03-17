package de.flingelli.security.oval.reports;

import org.testng.annotations.Test;

import javax.xml.bind.JAXBException;
import java.io.File;
import java.io.IOException;
import java.nio.file.Files;

public class MarkdownReportGeneratorTest {

    @Test
    public void getScanReport() throws JAXBException, IOException {
        MarkdownReportGenerator generator = new MarkdownReportGenerator(getOvalResults());
        File file = File.createTempFile("scan_report", ".md");
        Files.write(file.toPath(), generator.getScanReport().toString().getBytes());
        file.delete();
    }

    private OvalResults getOvalResults() throws JAXBException {
        OvalResults ovalResults = new OvalResults();
        ovalResults.readXML(new File("src/test/resources/oval-results.xml").getAbsolutePath());
        return ovalResults;
    }
}
