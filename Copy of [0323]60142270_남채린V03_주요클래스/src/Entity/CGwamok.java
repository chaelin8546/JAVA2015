package Entity;

import java.io.Serializable;

public class CGwamok implements Serializable {
	private static final long serialVersionUID = 1L;
	//attributes
	private int ID;
	private String name;
	private int hakjeom;
	
	//setters & getters
	public int getID() {return ID;}
	public void setID(int iD) {ID = iD;}
	public String getName() {return name;}
	public void setName(String name) {this.name = name;}
	public int getHakjeom() {return hakjeom;}
	public void setHakjeom(int hakjeom) {this.hakjeom = hakjeom;}
	

}
