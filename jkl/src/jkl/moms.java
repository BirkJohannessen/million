package jkl;

import static javax.swing.JOptionPane.*;
import static java.lang.Double.*;

public class moms {

	public static void main(String[] args) {
		
		// input fra bruker
		
	String belopTxt = showImputDialog("Bel�p: ");
	
	double belop = parseDouble(belopTxt);
	
		//begregne moms+ total
	
	double moms = belop*0.25;
	double pris = belop + moms;
	
		//kvittering i boks
	
	String utTxt = "bel�p: " + belop + "Moms: " + moms + "Total: ";
	showMessageDialog(null, utTxt);
	}

}
