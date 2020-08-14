package projectx;

import static javax.swing.JOptionPane.*;

//kopiert fra bokeksempel 1.3:dialog.java side 19
//koden funker ikke, input og message er udefindert


public class kap1input {
	public static void main(String[] args) {
		String navn = showInputDialog("Navn: "); 
		showMessageDialog(null, "hei " + navn);
	}


	}

