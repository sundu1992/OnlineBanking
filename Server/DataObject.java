/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Server;

/**
 *
 * @author Sundu
 */
import java.io.*;

public class DataObject implements Serializable{

	//DataObject class cannot be modified as per project specifications. 
	//"message" field is used for sending success/failure messages between client and server

	protected String message;
		
	public DataObject(){

		message = null;
	}

	public void setMessage(String m){

		message = m;
	}

	public String getMessage(){

		return message;
	}

}