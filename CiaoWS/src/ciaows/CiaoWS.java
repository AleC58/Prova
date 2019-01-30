/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package ciaows;

/**

 @author cazziolato.alex
 */
public class CiaoWS {

	/**
	 @param args the command line arguments
	 */
	public static void main(String[] args) {
		System.out.println(ciaoVecio("qq"));
	}

	private static String ciaoVecio(java.lang.String name) {
		ciaoveciopkg.CiaoVecio_Service service = new ciaoveciopkg.CiaoVecio_Service();
		ciaoveciopkg.CiaoVecio port = service.getCiaoVecioPort();
		return port.ciaoVecio(name);
	}
	
}
