
package travel.caval._20091127.commons;

import javax.xml.bind.annotation.*;


/**
 * <p>Clase Java para abstractAuthenticatedAgencyRQ complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="abstractAuthenticatedAgencyRQ"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://caval.travel/20091127/commons}abstractAuthenticatedRQ"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="agentId" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="language" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "abstractAuthenticatedAgencyRQ", propOrder = {
    "agentId",
    "language"
})
@XmlSeeAlso({
    CavalCancelBookingRQ.class,
    CavalGetBookingRQ.class,
    CavalGetWholeSupportedMapRQ.class,
    CavalGetListOfBookingsRQ.class
})
public abstract class AbstractAuthenticatedAgencyRQ
    extends AbstractAuthenticatedRQ
{

    @XmlElement(required = true)
    protected String agentId;
    @XmlElement(required = true)
    protected String language;

    /**
     * Obtiene el valor de la propiedad agentId.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAgentId() {
        return agentId;
    }

    /**
     * Define el valor de la propiedad agentId.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAgentId(String value) {
        this.agentId = value;
    }

    /**
     * Obtiene el valor de la propiedad language.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLanguage() {
        return language;
    }

    /**
     * Define el valor de la propiedad language.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLanguage(String value) {
        this.language = value;
    }

}
