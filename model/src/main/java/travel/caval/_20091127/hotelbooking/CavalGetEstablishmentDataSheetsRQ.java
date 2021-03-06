
package travel.caval._20091127.hotelbooking;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import java.util.ArrayList;
import java.util.List;


/**
 * <p>Clase Java para cavalGetEstablishmentDataSheetsRQ complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="cavalGetEstablishmentDataSheetsRQ"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://caval.travel/20091127/hotelBooking}abstractAuthenticatedAgencyRQ"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="countryCodes" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="stateIds" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="cityIds" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="establishmentIds" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="updatedSince" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="descriptionsInAllLanguagesWanted" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "cavalGetEstablishmentDataSheetsRQ", propOrder = {
    "countryCodes",
    "stateIds",
    "cityIds",
    "establishmentIds",
    "updatedSince",
    "descriptionsInAllLanguagesWanted"
})
public class CavalGetEstablishmentDataSheetsRQ
    extends AbstractAuthenticatedAgencyRQ
{

    @XmlElement(nillable = true)
    protected List<String> countryCodes;
    @XmlElement(nillable = true)
    protected List<String> stateIds;
    @XmlElement(nillable = true)
    protected List<String> cityIds;
    @XmlElement(nillable = true)
    protected List<String> establishmentIds;
    protected String updatedSince;
    protected Boolean descriptionsInAllLanguagesWanted;

    /**
     * Gets the value of the countryCodes property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the countryCodes property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCountryCodes().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getCountryCodes() {
        if (countryCodes == null) {
            countryCodes = new ArrayList<String>();
        }
        return this.countryCodes;
    }

    /**
     * Gets the value of the stateIds property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the stateIds property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getStateIds().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getStateIds() {
        if (stateIds == null) {
            stateIds = new ArrayList<String>();
        }
        return this.stateIds;
    }

    /**
     * Gets the value of the cityIds property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the cityIds property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCityIds().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getCityIds() {
        if (cityIds == null) {
            cityIds = new ArrayList<String>();
        }
        return this.cityIds;
    }

    /**
     * Gets the value of the establishmentIds property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the establishmentIds property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getEstablishmentIds().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getEstablishmentIds() {
        if (establishmentIds == null) {
            establishmentIds = new ArrayList<String>();
        }
        return this.establishmentIds;
    }

    /**
     * Obtiene el valor de la propiedad updatedSince.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUpdatedSince() {
        return updatedSince;
    }

    /**
     * Define el valor de la propiedad updatedSince.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUpdatedSince(String value) {
        this.updatedSince = value;
    }

    /**
     * Obtiene el valor de la propiedad descriptionsInAllLanguagesWanted.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isDescriptionsInAllLanguagesWanted() {
        return descriptionsInAllLanguagesWanted;
    }

    /**
     * Define el valor de la propiedad descriptionsInAllLanguagesWanted.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setDescriptionsInAllLanguagesWanted(Boolean value) {
        this.descriptionsInAllLanguagesWanted = value;
    }

}
