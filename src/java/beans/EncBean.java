/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package beans;

import javax.activation.DataHandler;
import javax.ejb.Stateless;

/**
 *
 * @author samgodfrey
 */
@Stateless
public class EncBean {

    /*
    This is the encryption bean. It will take in:
    @param fileName, the name to use for the new encrypted file
    @param inputDataHandler, a pointer to the stream of data coming in from the client
    and it will return:
    @return fileName, the new file name of the encrypted file
    */
    public String execute(String fileName, DataHandler dh){
        return null;
    }
}
