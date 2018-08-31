package com.test.automation;

public class NewWebClassProxy implements com.test.automation.NewWebClass {
  private String _endpoint = null;
  private com.test.automation.NewWebClass newWebClass = null;
  
  public NewWebClassProxy() {
    _initNewWebClassProxy();
  }
  
  public NewWebClassProxy(String endpoint) {
    _endpoint = endpoint;
    _initNewWebClassProxy();
  }
  
  private void _initNewWebClassProxy() {
    try {
      newWebClass = (new com.test.automation.NewWebClassServiceLocator()).getNewWebClass();
      if (newWebClass != null) {
        if (_endpoint != null)
          ((javax.xml.rpc.Stub)newWebClass)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
        else
          _endpoint = (String)((javax.xml.rpc.Stub)newWebClass)._getProperty("javax.xml.rpc.service.endpoint.address");
      }
      
    }
    catch (javax.xml.rpc.ServiceException serviceException) {}
  }
  
  public String getEndpoint() {
    return _endpoint;
  }
  
  public void setEndpoint(String endpoint) {
    _endpoint = endpoint;
    if (newWebClass != null)
      ((javax.xml.rpc.Stub)newWebClass)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
    
  }
  
  public com.test.automation.NewWebClass getNewWebClass() {
    if (newWebClass == null)
      _initNewWebClassProxy();
    return newWebClass;
  }
  
  public void main(java.lang.String[] args) throws java.rmi.RemoteException{
    if (newWebClass == null)
      _initNewWebClassProxy();
    newWebClass.main(args);
  }
  
  
}