
package com.google.api.ads.dfp.jaxws.v201511;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 *             A {@code ContentMetadataKeyHierarchy} defines a hierarchical relationship between content
 *             metadata keys.
 *           
 * 
 * <p>Java class for ContentMetadataKeyHierarchy complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ContentMetadataKeyHierarchy">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="id" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="hierarchyLevels" type="{https://www.google.com/apis/ads/publisher/v201511}ContentMetadataKeyHierarchyLevel" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="status" type="{https://www.google.com/apis/ads/publisher/v201511}ContentMetadataKeyHierarchyStatus" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ContentMetadataKeyHierarchy", propOrder = {
    "id",
    "name",
    "hierarchyLevels",
    "status"
})
public class ContentMetadataKeyHierarchy {

    protected Integer id;
    protected String name;
    protected List<ContentMetadataKeyHierarchyLevel> hierarchyLevels;
    @XmlSchemaType(name = "string")
    protected ContentMetadataKeyHierarchyStatus status;

    /**
     * Gets the value of the id property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getId() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setId(Integer value) {
        this.id = value;
    }

    /**
     * Gets the value of the name property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the value of the name property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setName(String value) {
        this.name = value;
    }

    /**
     * Gets the value of the hierarchyLevels property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the hierarchyLevels property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getHierarchyLevels().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ContentMetadataKeyHierarchyLevel }
     * 
     * 
     */
    public List<ContentMetadataKeyHierarchyLevel> getHierarchyLevels() {
        if (hierarchyLevels == null) {
            hierarchyLevels = new ArrayList<ContentMetadataKeyHierarchyLevel>();
        }
        return this.hierarchyLevels;
    }

    /**
     * Gets the value of the status property.
     * 
     * @return
     *     possible object is
     *     {@link ContentMetadataKeyHierarchyStatus }
     *     
     */
    public ContentMetadataKeyHierarchyStatus getStatus() {
        return status;
    }

    /**
     * Sets the value of the status property.
     * 
     * @param value
     *     allowed object is
     *     {@link ContentMetadataKeyHierarchyStatus }
     *     
     */
    public void setStatus(ContentMetadataKeyHierarchyStatus value) {
        this.status = value;
    }

}
