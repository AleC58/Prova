
package ciaoveciopkg;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.Action;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.6-1b01 
 * Generated source version: 2.2
 * 
 */
@WebService(name = "CiaoVecio", targetNamespace = "http://CiaoVecioPkg/")
@XmlSeeAlso({
    ObjectFactory.class
})
public interface CiaoVecio {


    /**
     * 
     * @param name
     * @return
     *     returns java.lang.String
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "ciaoVecio", targetNamespace = "http://CiaoVecioPkg/", className = "ciaoveciopkg.CiaoVecio_Type")
    @ResponseWrapper(localName = "ciaoVecioResponse", targetNamespace = "http://CiaoVecioPkg/", className = "ciaoveciopkg.CiaoVecioResponse")
    @Action(input = "http://CiaoVecioPkg/CiaoVecio/ciaoVecioRequest", output = "http://CiaoVecioPkg/CiaoVecio/ciaoVecioResponse")
    public String ciaoVecio(
        @WebParam(name = "name", targetNamespace = "")
        String name);

    /**
     * 
     * @param b
     * @param a
     * @return
     *     returns int
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "somma", targetNamespace = "http://CiaoVecioPkg/", className = "ciaoveciopkg.Somma")
    @ResponseWrapper(localName = "sommaResponse", targetNamespace = "http://CiaoVecioPkg/", className = "ciaoveciopkg.SommaResponse")
    @Action(input = "http://CiaoVecioPkg/CiaoVecio/sommaRequest", output = "http://CiaoVecioPkg/CiaoVecio/sommaResponse")
    public int somma(
        @WebParam(name = "a", targetNamespace = "")
        int a,
        @WebParam(name = "b", targetNamespace = "")
        int b);

}
