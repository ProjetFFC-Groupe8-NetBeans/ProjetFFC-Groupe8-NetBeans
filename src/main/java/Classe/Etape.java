/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Classe;

/**
 *
 * @author ch999
 */
import java.util.ArrayList;


public class Etape {

	private float distance;
	private String villeDepart;
	private String villeArrive;
	private ArrayList<Col> cols;
	private ArrayList<Sprint> sprints;
	
	
	
	public Etape(float distance, String villeDepart, String villeArrive) {
		super();
		this.distance = distance;
		this.villeDepart = villeDepart;
		this.villeArrive = villeArrive;
		this.cols=new ArrayList<Col>();
		this.sprints=new ArrayList<Sprint>();
	}
	
	public void ajouterCol(Col col) {
		cols.add(col);
	}
	
	public void ajouterSprint(Sprint sprint) {
		sprints.add(sprint);
	}
	
	
	public ArrayList<Col> getCols() {
		return cols;
	}
	public void setCols(ArrayList<Col> cols) {
		this.cols = cols;
	}
	public ArrayList<Sprint> getSprints() {
		return sprints;
	}
	public void setSprints(ArrayList<Sprint> sprints) {
		this.sprints = sprints;
	}
	public float getDistance() {
		return distance;
	}
	public void setDistance(float distance) {
		this.distance = distance;
	}
	public String getVilleDepart() {
		return villeDepart;
	}
	public void setVilleDepart(String villeDepart) {
		this.villeDepart = villeDepart;
	}
	public String getVilleArrive() {
		return villeArrive;
	}
	public void setVilleArrive(String villeArrive) {
		this.villeArrive = villeArrive;
	}
	
	

}
