
package com.bp.service;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.bp.service package. 
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

    private final static QName _SayHello_QNAME = new QName("http://service.bp.com/", "sayHello");
    private final static QName _SayHelloResponse_QNAME = new QName("http://service.bp.com/", "sayHelloResponse");
    private final static QName _HelloPeople_QNAME = new QName("http://service.bp.com/", "helloPeople");
    private final static QName _HelloPeopleResponse_QNAME = new QName("http://service.bp.com/", "helloPeopleResponse");
    private final static QName _PeopleInfoResponse_QNAME = new QName("http://service.bp.com/", "peopleInfoResponse");
    private final static QName _SayNextNumResponse_QNAME = new QName("http://service.bp.com/", "sayNextNumResponse");
    private final static QName _SayNextNum_QNAME = new QName("http://service.bp.com/", "sayNextNum");
    private final static QName _PeopleInfo_QNAME = new QName("http://service.bp.com/", "peopleInfo");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.bp.service
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link PeopleInfoResponse }
     * 
     */
    public PeopleInfoResponse createPeopleInfoResponse() {
        return new PeopleInfoResponse();
    }

    /**
     * Create an instance of {@link PeopleInfoResponse.Return }
     * 
     */
    public PeopleInfoResponse.Return createPeopleInfoResponseReturn() {
        return new PeopleInfoResponse.Return();
    }

    /**
     * Create an instance of {@link SayNextNumResponse }
     * 
     */
    public SayNextNumResponse createSayNextNumResponse() {
        return new SayNextNumResponse();
    }

    /**
     * Create an instance of {@link SayNextNum }
     * 
     */
    public SayNextNum createSayNextNum() {
        return new SayNextNum();
    }

    /**
     * Create an instance of {@link PeopleInfo }
     * 
     */
    public PeopleInfo createPeopleInfo() {
        return new PeopleInfo();
    }

    /**
     * Create an instance of {@link HelloPeople }
     * 
     */
    public HelloPeople createHelloPeople() {
        return new HelloPeople();
    }

    /**
     * Create an instance of {@link HelloPeopleResponse }
     * 
     */
    public HelloPeopleResponse createHelloPeopleResponse() {
        return new HelloPeopleResponse();
    }

    /**
     * Create an instance of {@link SayHelloResponse }
     * 
     */
    public SayHelloResponse createSayHelloResponse() {
        return new SayHelloResponse();
    }

    /**
     * Create an instance of {@link SayHello }
     * 
     */
    public SayHello createSayHello() {
        return new SayHello();
    }

    /**
     * Create an instance of {@link PeopleInfoResponse.Return.Entry }
     * 
     */
    public PeopleInfoResponse.Return.Entry createPeopleInfoResponseReturnEntry() {
        return new PeopleInfoResponse.Return.Entry();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SayHello }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.bp.com/", name = "sayHello")
    public JAXBElement<SayHello> createSayHello(SayHello value) {
        return new JAXBElement<SayHello>(_SayHello_QNAME, SayHello.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SayHelloResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.bp.com/", name = "sayHelloResponse")
    public JAXBElement<SayHelloResponse> createSayHelloResponse(SayHelloResponse value) {
        return new JAXBElement<SayHelloResponse>(_SayHelloResponse_QNAME, SayHelloResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link HelloPeople }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.bp.com/", name = "helloPeople")
    public JAXBElement<HelloPeople> createHelloPeople(HelloPeople value) {
        return new JAXBElement<HelloPeople>(_HelloPeople_QNAME, HelloPeople.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link HelloPeopleResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.bp.com/", name = "helloPeopleResponse")
    public JAXBElement<HelloPeopleResponse> createHelloPeopleResponse(HelloPeopleResponse value) {
        return new JAXBElement<HelloPeopleResponse>(_HelloPeopleResponse_QNAME, HelloPeopleResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PeopleInfoResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.bp.com/", name = "peopleInfoResponse")
    public JAXBElement<PeopleInfoResponse> createPeopleInfoResponse(PeopleInfoResponse value) {
        return new JAXBElement<PeopleInfoResponse>(_PeopleInfoResponse_QNAME, PeopleInfoResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SayNextNumResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.bp.com/", name = "sayNextNumResponse")
    public JAXBElement<SayNextNumResponse> createSayNextNumResponse(SayNextNumResponse value) {
        return new JAXBElement<SayNextNumResponse>(_SayNextNumResponse_QNAME, SayNextNumResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SayNextNum }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.bp.com/", name = "sayNextNum")
    public JAXBElement<SayNextNum> createSayNextNum(SayNextNum value) {
        return new JAXBElement<SayNextNum>(_SayNextNum_QNAME, SayNextNum.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PeopleInfo }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.bp.com/", name = "peopleInfo")
    public JAXBElement<PeopleInfo> createPeopleInfo(PeopleInfo value) {
        return new JAXBElement<PeopleInfo>(_PeopleInfo_QNAME, PeopleInfo.class, null, value);
    }

}
