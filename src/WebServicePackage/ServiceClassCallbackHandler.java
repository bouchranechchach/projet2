
/**
 * ServiceClassCallbackHandler.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.6.2  Built on : Apr 17, 2012 (05:33:49 IST)
 */

    package WebServicePackage;

    /**
     *  ServiceClassCallbackHandler Callback class, Users can extend this class and implement
     *  their own receiveResult and receiveError methods.
     */
    public abstract class ServiceClassCallbackHandler{



    protected Object clientData;

    /**
    * User can pass in any object that needs to be accessed once the NonBlocking
    * Web service call is finished and appropriate method of this CallBack is called.
    * @param clientData Object mechanism by which the user can pass in user data
    * that will be avilable at the time this callback is called.
    */
    public ServiceClassCallbackHandler(Object clientData){
        this.clientData = clientData;
    }

    /**
    * Please use this constructor if you don't want to set any clientData
    */
    public ServiceClassCallbackHandler(){
        this.clientData = null;
    }

    /**
     * Get the client data
     */

     public Object getClientData() {
        return clientData;
     }

        
           /**
            * auto generated Axis2 call back method for calculAnnuite method
            * override this method for handling normal response from calculAnnuite operation
            */
           public void receiveResultcalculAnnuite(
                    WebServicePackage.ServiceClassStub.CalculAnnuiteResponse result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from calculAnnuite operation
           */
            public void receiveErrorcalculAnnuite(java.lang.Exception e) {
            }
                
           /**
            * auto generated Axis2 call back method for calculCapital method
            * override this method for handling normal response from calculCapital operation
            */
           public void receiveResultcalculCapital(
                    WebServicePackage.ServiceClassStub.CalculCapitalResponse result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from calculCapital operation
           */
            public void receiveErrorcalculCapital(java.lang.Exception e) {
            }
                
           /**
            * auto generated Axis2 call back method for calculDuree method
            * override this method for handling normal response from calculDuree operation
            */
           public void receiveResultcalculDuree(
                    WebServicePackage.ServiceClassStub.CalculDureeResponse result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from calculDuree operation
           */
            public void receiveErrorcalculDuree(java.lang.Exception e) {
            }
                


    }
    