
package ciaoveciopkg;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the ciaoveciopkg package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _CiaoVecio_QNAME = new QName("http://CiaoVecioPkg/", "ciaoVecio");
    private final static QName _CiaoVecioResponse_QNAME = new QName("http://CiaoVecioPkg/", "ciaoVecioResponse");
    private final static QName _SommaResponse_QNAME = new QName("http://CiaoVecioPkg/", "sommaResponse");
    private final static QName _Somma_QNAME = new QName("http://CiaoVecioPkg/", "somma");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: ciaoveciopkg
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link Somma }
     * 
     */
    public Somma createSomma() {
        return new Somma();
    }

    /**
     * Create an instance of {@link CiaoVecioResponse }
     * 
     */
    public CiaoVecioResponse createCiaoVecioResponse() {
        return new CiaoVecioResponse();
    }

    /**
     * Create an instance of {@link CiaoVecio_Type }
     * 
     */
    public CiaoVecio_Type createCiaoVecio_Type() {
        return new CiaoVecio_Type();
    }

    /**
     * Create an instance of {@link SommaResponse }
     * 
     */
    public SommaResponse createSommaResponse() {
        return new SommaResponse();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CiaoVecio_Type }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://CiaoVecioPkg/", name = "ciaoVecio")
    public JAXBElement<CiaoVecio_Type> createCiaoVecio(CiaoVecio_Type value) {
        return new JAXBElement<CiaoVecio_Type>(_CiaoVecio_QNAME, CiaoVecio_Type.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CiaoVecioResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://CiaoVecioPkg/", name = "ciaoVecioResponse")
    public JAXBElement<CiaoVecioResponse> createCiaoVecioResponse(CiaoVecioResponse value) {
        return new JAXBElement<CiaoVecioResponse>(_CiaoVecioResponse_QNAME, CiaoVecioResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SommaResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://CiaoVecioPkg/", name = "sommaResponse")
    public JAXBElement<SommaResponse> createSommaResponse(SommaResponse value) {
        return new JAXBElement<SommaResponse>(_SommaResponse_QNAME, SommaResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Somma }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://CiaoVecioPkg/", name = "somma")
    public JAXBElement<Somma> createSomma(Somma value) {
        return new JAXBElement<Somma>(_Somma_QNAME, Somma.class, null, value);
    }

}
