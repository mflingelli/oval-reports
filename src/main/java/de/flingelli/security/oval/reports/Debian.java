package de.flingelli.security.oval.reports;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

@XmlAccessorType(XmlAccessType.FIELD)
public class Debian {
    @XmlElement(namespace = "http://oval.mitre.org/XMLSchema/oval-definitions-5")
    private String date;
    @XmlElement(namespace = "http://oval.mitre.org/XMLSchema/oval-definitions-5")
    private String moreinfo;

    public String getDate() {
        return date;
    }

    public String getMoreinfo() {
        return moreinfo;
    }

    public Date getDateAsDate() throws ParseException {
        return new SimpleDateFormat("yyyy-MM-dd").parse(getDate());
    }
}
