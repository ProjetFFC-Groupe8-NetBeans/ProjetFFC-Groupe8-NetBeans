/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Classe;

/**
 *
 * @author ch999
 */
public class CourseSimple extends Course{
	public Etape etape;//pour course simple, il a juste 1 etape
	
	public CourseSimple(int numCrouse, String nomCourse, String villeDeparte, String paysDeparte, String villeArrive,String paysArrive, Edition edition,Etape etape) {
		super(numCrouse, nomCourse, villeDeparte, paysDeparte, villeArrive, paysArrive, edition);
		this.etape=etape;
	}

}
