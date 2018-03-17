package de.flingelli.security.oval.reports;

import java.util.List;

public class MarkdownReportGenerator {
    private OvalResults ovalResults;

    public MarkdownReportGenerator(OvalResults ovalResults) {
        this.ovalResults = ovalResults;
    }

    public StringBuilder getScanReport() {
        StringBuilder builder = new StringBuilder("# Scan report\n");
        addDefinitions(builder, "Failed", ovalResults.getDefinitionsOfFailedTests());
        addDefinitions(builder, "Passed", ovalResults.getDefinitionsOfPassedTests());
        return builder;
    }

    private void addDefinitions(StringBuilder builder, String title, List<Definition> definitions) {
        builder.append("\n## " + title + " (" + definitions.size() + ")\n");
        if (definitions.size() > 0) {
            builder.append("| CVE | URL |\n");
            builder.append("| --- | --- |\n");
        }
        definitions.forEach(definition -> {
            String url = "";
            if (definition.getMetadata().getReference() != null && definition.getMetadata().getReference().getRefUrl() != null) {
                url = definition.getMetadata().getReference().getRefUrl();
            }
            builder.append("|" + definition.getMetadata().getTitle() +
                    "|[" + url + "](" + url + ")|\n");
        });
        builder.append("\n");
    }
}
