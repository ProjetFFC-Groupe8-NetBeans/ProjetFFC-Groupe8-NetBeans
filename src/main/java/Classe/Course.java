/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Classe;

/**
 *
 * @author ch999
 */
public abstract class Course {
    protected int numCrouse;
	protected String nomCourse;
	protected String villeDeparte;
	protected String paysDeparte;
	protected String villeArrive;
	protected String paysArrive;
	protected Edition edition;
	
	
	
	public Course(int numCrouse, String nomCourse, String villeDeparte, String paysDeparte, String villeArrive,String paysArrive, Edition edition) {
		super();
		this.numCrouse = numCrouse;
		this.nomCourse = nomCourse;
		this.villeDeparte = villeDeparte;
		this.paysDeparte = paysDeparte;
		this.villeArrive = villeArrive;
		this.paysArrive = paysArrive;
		this.edition = edition;
	}
	
	public int getNumCrouse() {
		return numCrouse;
	}
	public void setNumCrouse(int numCrouse) {
		this.numCrouse = numCrouse;
	}
	public String getNomCourse() {
		return nomCourse;
	}
	public void setNomCourse(String nomCourse) {
		this.nomCourse = nomCourse;
	}
	public String getVilleDeparte() {
		return villeDeparte;
	}
	public void setVilleDeparte(String villeDeparte) {
		this.villeDeparte = villeDeparte;
	}
	public String getPaysDeparte() {
		return paysDeparte;
	}
	public void setPaysDeparte(String paysDeparte) {
		this.paysDeparte = paysDeparte;
	}
	public String getVilleArrive() {
		return villeArrive;
	}
	public void setVilleArrive(String villeArrive) {
		this.villeArrive = villeArrive;
	}
	public String getPaysArrive() {
		return paysArrive;
	}
	public void setPaysArrive(String paysArrive) {
		this.paysArrive = paysArrive;
	}
	public Edition getEdition() {
		return edition;
	}
	public void setEdition(Edition edition) {
		this.edition = edition;
	}
	
}
