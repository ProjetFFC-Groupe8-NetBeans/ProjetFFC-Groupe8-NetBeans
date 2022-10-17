/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Classe;

/**
 *
 * @author ch999
 */
public class Edition {
    
    private int numED;
	private int annee;
	private String dateDebut;
	private String dateFin;
	
	
	public Edition(int numED, int annee, String dateDebut, String dateFin) {
		super();
		this.numED = numED;
		this.annee = annee;
		this.dateDebut = dateDebut;
		this.dateFin = dateFin;
	}
	
	public int getNumED() {
		return numED;
	}
	public void setNumED(int numED) {
		this.numED = numED;
	}
	public int getAnnee() {
		return annee;
	}
	public void setAnnee(int annee) {
		this.annee = annee;
	}
	public String getDateDebut() {
		return dateDebut;
	}
	public void setDateDebut(String dateDebut) {
		this.dateDebut = dateDebut;
	}
	public String getDateFin() {
		return dateFin;
	}
	public void setDateFin(String dateFin) {
		this.dateFin = dateFin;
	}
        
}
