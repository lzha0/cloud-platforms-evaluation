
package org.cloudcomputingevaluation;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ReadAndUpdateResult" type="{http://cloudComputingEvaluation.org/}Result" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "readAndUpdateResult"
})
@XmlRootElement(name = "ReadAndUpdateResponse")
public class ReadAndUpdateResponse {

    @XmlElementRef(name = "ReadAndUpdateResult", namespace = "http://cloudComputingEvaluation.org/", type = JAXBElement.class)
    protected JAXBElement<Result> readAndUpdateResult;

    /**
     * Gets the value of the readAndUpdateResult property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Result }{@code >}
     *     
     */
    public JAXBElement<Result> getReadAndUpdateResult() {
        return readAndUpdateResult;
    }

    /**
     * Sets the value of the readAndUpdateResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Result }{@code >}
     *     
     */
    public void setReadAndUpdateResult(JAXBElement<Result> value) {
        this.readAndUpdateResult = ((JAXBElement<Result> ) value);
    }

}
