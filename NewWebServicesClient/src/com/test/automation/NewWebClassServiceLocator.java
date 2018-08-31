/**
 * NewWebClassServiceLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.test.automation;

public class NewWebClassServiceLocator extends org.apache.axis.client.Service implements com.test.automation.NewWebClassService {

    public NewWebClassServiceLocator() {
    }


    public NewWebClassServiceLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public NewWebClassServiceLocator(java.lang.String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for NewWebClass
    private java.lang.String NewWebClass_address = "http://localhost:8080/NewWebServices/services/NewWebClass";

    public java.lang.String getNewWebClassAddress() {
        return NewWebClass_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String NewWebClassWSDDServiceName = "NewWebClass";

    public java.lang.String getNewWebClassWSDDServiceName() {
        return NewWebClassWSDDServiceName;
    }

    public void setNewWebClassWSDDServiceName(java.lang.String name) {
        NewWebClassWSDDServiceName = name;
    }

    public com.test.automation.NewWebClass getNewWebClass() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(NewWebClass_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getNewWebClass(endpoint);
    }

    public com.test.automation.NewWebClass getNewWebClass(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            com.test.automation.NewWebClassSoapBindingStub _stub = new com.test.automation.NewWebClassSoapBindingStub(portAddress, this);
            _stub.setPortName(getNewWebClassWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setNewWebClassEndpointAddress(java.lang.String address) {
        NewWebClass_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (com.test.automation.NewWebClass.class.isAssignableFrom(serviceEndpointInterface)) {
                com.test.automation.NewWebClassSoapBindingStub _stub = new com.test.automation.NewWebClassSoapBindingStub(new java.net.URL(NewWebClass_address), this);
                _stub.setPortName(getNewWebClassWSDDServiceName());
                return _stub;
            }
        }
        catch (java.lang.Throwable t) {
            throw new javax.xml.rpc.ServiceException(t);
        }
        throw new javax.xml.rpc.ServiceException("There is no stub implementation for the interface:  " + (serviceEndpointInterface == null ? "null" : serviceEndpointInterface.getName()));
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(javax.xml.namespace.QName portName, Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        if (portName == null) {
            return getPort(serviceEndpointInterface);
        }
        java.lang.String inputPortName = portName.getLocalPart();
        if ("NewWebClass".equals(inputPortName)) {
            return getNewWebClass();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("http://automation.test.com", "NewWebClassService");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("http://automation.test.com", "NewWebClass"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(java.lang.String portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        
if ("NewWebClass".equals(portName)) {
            setNewWebClassEndpointAddress(address);
        }
        else 
{ // Unknown Port Name
            throw new javax.xml.rpc.ServiceException(" Cannot set Endpoint Address for Unknown Port" + portName);
        }
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(javax.xml.namespace.QName portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        setEndpointAddress(portName.getLocalPart(), address);
    }

}
