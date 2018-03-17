package de.flingelli.security.oval.reports;

import org.testng.Assert;
import org.testng.annotations.Test;

import javax.xml.bind.JAXBException;
import java.io.File;

public class OvalResultsTest {

    @Test
    public void getOvalDefinitions()  {
        Assert.assertEquals(TestHelper.getDefinitions().getOvalDefinitions().getDefinitions().size(), 2);
    }

    @Test
    public void getResults()  {
        Assert.assertNotNull(TestHelper.getDefinitions().getResults());
    }

    @Test
    public void getDefinitionsOfFailedTests() throws JAXBException {
        Assert.assertEquals(getOvalResults("src/test/resources/oval-results.xml").getDefinitionsOfFailedTests().size(), 3);
    }

    @Test
    public void getFailedTestsAllOk() throws JAXBException {
        Assert.assertEquals(getOvalResults("src/test/resources/oval-results-all-ok.xml").getDefinitionsOfFailedTests().size(), 0);
    }

    @Test
    public void getDefinitionsOfPassedTests() throws JAXBException {
        Assert.assertEquals(getOvalResults("src/test/resources/oval-results.xml").getDefinitionsOfPassedTests().size(), 18366);
    }

    @Test
    public void getDefinitionsOfFixedTests() throws JAXBException {
        Assert.assertEquals(
                getOvalResults("src/test/resources/oval-results.xml").getDefinitionsOfFixedTests("src/test/resources/oval-results-all-ok.xml").size(),
                3);
    }

    private OvalResults getOvalResults(String fileName) throws JAXBException {
        OvalResults ovalResults = new OvalResults();
        ovalResults.readXML(new File(fileName).getAbsolutePath());
        return ovalResults;
    }
}
