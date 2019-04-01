/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package synchro;

/**
 *
 * @author alex.cazziolato
 */
public class Prova {
	public synchronized void m(){
		n();
	}
	
	public synchronized void n(){
		System.out.println("ciao");}
	
}
