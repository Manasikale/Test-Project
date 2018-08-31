/**
 * NewWebClassService.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.test.automation;

public interface NewWebClassService extends javax.xml.rpc.Service {
    public java.lang.String getNewWebClassAddress();

    public com.test.automation.NewWebClass getNewWebClass() throws javax.xml.rpc.ServiceException;

    public com.test.automation.NewWebClass getNewWebClass(java.net.URL portAddress) throws javax.xml.rpc.ServiceException;
}
