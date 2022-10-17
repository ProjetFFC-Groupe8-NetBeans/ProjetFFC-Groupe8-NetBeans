/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Classe;
import java.util.HashMap;
/**
 *
 * @author ch999
 */
public class CourseEtape extends Course{
    public HashMap <Ordre,Etape> listEtapes;
	
	public CourseEtape(int numCrouse, String nomCourse, String villeDeparte, String paysDeparte, String villeArrive,
			String paysArrive, Edition edition) {
		super(numCrouse, nomCourse, villeDeparte, paysDeparte, villeArrive, paysArrive, edition);
		this.listEtapes=new HashMap <Ordre,Etape>();
	}
	
	public void ajouterEtape(Ordre ordre,Etape etape) {
		if(!this.listEtapes.containsKey(ordre)) {
		this.listEtapes.put(ordre, etape); //pour verifier est-ce que dans ce ordre a daja avoir une etape
		}}
}
