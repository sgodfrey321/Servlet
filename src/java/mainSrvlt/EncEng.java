/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mainSrvlt;

import beans.EncBean;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.activation.DataHandler;
import javax.ejb.EJB;
import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.xml.bind.annotation.XmlMimeType;

/**
* Should I have one servlet for all operations or a unique servlet for each operation?
* Where should I do the authentication, I want to use some sort of LDAP for offering people a unique directory
 */
@WebService(serviceName = "EncEng")
public class EncEng {
    
    Logger log = Logger.getLogger("MyLogger");
    
    
    @EJB
    EncBean encryptionbean;
    /**
     * @param fileName input file name for storing
     * @param inputdatahandler data being sent in over a socket
     * @return the new name of the encrypted file
     * 
     */
    @WebMethod(operationName = "encrypt")
    public String encrypt(
            @WebParam(name = "fileName") String fileName, 
            @WebParam(name = "inputdata") @XmlMimeType("application/octet-stream") DataHandler inputdatahandler) {
        
        
        log.log(Level.INFO, "encrypt webservice has been called");
        
        return fileName;
    }
}
