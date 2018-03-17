package de.flingelli.security.oval.reports;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.TimeZone;

@XmlAccessorType(XmlAccessType.FIELD)
public class Generator {
    @XmlElement(name = "product_name", namespace = "http://oval.mitre.org/XMLSchema/oval-common-5")
    private String productName;
    @XmlElement(name = "schema_version", namespace = "http://oval.mitre.org/XMLSchema/oval-common-5")
    private String schemaVersion;
    @XmlElement(namespace = "http://oval.mitre.org/XMLSchema/oval-common-5")
    private String timestamp;

    public String getProductName() {
        return productName;
    }

    public String getSchemaVersion() {
        return schemaVersion;
    }

    public String getTimestamp() {
        return timestamp;
    }

    public Date getTimestampAsDate() throws ParseException {
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSS'Z'");
        try {
            return dateFormat.parse(getTimestamp());
        } catch (ParseException e) {
            dateFormat = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss");
            return dateFormat.parse(getTimestamp());
        }
    }
}
