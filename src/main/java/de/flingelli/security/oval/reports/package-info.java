@javax.xml.bind.annotation.XmlSchema (
        namespace = "http://oval.mitre.org/XMLSchema/oval-results-5",
        elementFormDefault=javax.xml.bind.annotation.XmlNsForm.QUALIFIED,
        xmlns={
                @XmlNs(prefix="oval", namespaceURI="http://oval.mitre.org/XMLSchema/oval-common-5"),
                @XmlNs(prefix="xsi", namespaceURI="http://www.w3.org/2001/XMLSchema-instance"),
                @XmlNs(prefix="unix-def", namespaceURI="http://oval.mitre.org/XMLSchema/oval-definitions-5#unix"),
                @XmlNs(prefix="ind-def", namespaceURI="http://oval.mitre.org/XMLSchema/oval-definitions-5#independent"),
                @XmlNs(prefix="lin-def", namespaceURI="http://oval.mitre.org/XMLSchema/oval-definitions-5#linux")}
        )

package de.flingelli.security.oval.reports;
import javax.xml.bind.annotation.XmlNs;