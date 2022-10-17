/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Classe;

/**
 *
 * @author ch999
 */
public class Employee {
    private int numEmployee;
	private String nomEmployee;
	private String prenomEmployee;
	private String teleEmployee;
	private String emailEmployee;
	private static int compteur=1;
	private TypeEmployee typeE;
	
	
	public Employee(String nomEmployee, String prenomEmployee, String teleEmployee,String emailEmployee,TypeEmployee typeE) {
		super();
		this.numEmployee = compteur++;
		this.nomEmployee = nomEmployee;
		this.prenomEmployee = prenomEmployee;
		this.teleEmployee = teleEmployee;
		this.emailEmployee = emailEmployee;
		this.setTypeE(typeE);
	}
	
	
	public int getNumEmployee() {
		return numEmployee;
	}
	public void setNumEmployee(int numEmployee) {
		this.numEmployee = numEmployee;
	}
	public String getNomEmployee() {
		return nomEmployee;
	}
	public void setNomEmployee(String nomEmployee) {
		this.nomEmployee = nomEmployee;
	}
	public String getPrenomEmployee() {
		return prenomEmployee;
	}
	public void setPrenomEmployee(String prenomEmployee) {
		this.prenomEmployee = prenomEmployee;
	}
	public String getTeleEmployee() {
		return teleEmployee;
	}
	public void setTeleEmployee(String teleEmployee) {
		this.teleEmployee = teleEmployee;
	}
	public String getEmailEmployee() {
		return emailEmployee;
	}
	public void setEmailEmployee(String emailEmployee) {
		this.emailEmployee = emailEmployee;
	}


	public TypeEmployee getTypeE() {
		return typeE;
	}


	public void setTypeE(TypeEmployee typeE) {
		this.typeE = typeE;
	}
	
}
