/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package javafxbremsweg;

/**
 *
 * @author ralph
 */
public class Bremsweg {
	/**
	 * 
	 * @param geschwindigkeit
	 * @param faktor
	 * @param verzoeger
	 * @return
	 */
	public double getBremsweg(double geschwindigkeit, double faktor,
			boolean verzoeger) {
		double bremsmeter = (geschwindigkeit * geschwindigkeit / 100) * faktor;
		double verzoegermeter = 0;
		if (verzoeger) {
			verzoegermeter = geschwindigkeit / 10 * 3;
		}
		return Math.floor((bremsmeter + verzoegermeter) * 100) / 100.0;
	}

	/**
	 * 
	 * @param geschwindigkeit
	 * @param faktor
	 * @param verzoeger
	 * @param reaktionszeit
	 * @param umsetzzeit
	 * @param ansprechzeit
	 * @param schwellzeit
	 * @return
	 */
	public double[] getBremsweg(double geschwindigkeit, double faktor,
			boolean verzoeger, double reaktionszeit, double umsetzzeit,
			double ansprechzeit, double schwellzeit) {
		double[] rueckgabe = { 0, 0, 0, 0, 0, 0, 0 };
		double bremsmeter = (geschwindigkeit * geschwindigkeit / 100) * faktor;
		double verzoegermeter = 0;
		double reaktionsmeter = 0;
		double umsetzmeter = 0;
		double ansprechmeter = 0;
		double schwellzeitmeter = 0;
		if (verzoeger) {
			reaktionsmeter = geschwindigkeit / 10 * 3 * reaktionszeit;
			umsetzmeter = geschwindigkeit / 10 * 3 * umsetzzeit;
			ansprechmeter = geschwindigkeit / 10 * 3 * ansprechzeit;
			schwellzeitmeter = geschwindigkeit / 10 * 3 * schwellzeit;
			verzoegermeter = geschwindigkeit / 10 * 3;
			rueckgabe[1] = verzoegermeter;
			rueckgabe[2] = reaktionsmeter + umsetzmeter + ansprechmeter
					+ schwellzeitmeter;
			rueckgabe[3] = reaktionsmeter;
			rueckgabe[4] = umsetzmeter;
			rueckgabe[5] = ansprechmeter;
			rueckgabe[6] = schwellzeitmeter;
		}
		rueckgabe[0] = Math.floor((bremsmeter + reaktionsmeter + umsetzmeter
				+ ansprechmeter + schwellzeitmeter) * 100) / 100.0;
		return rueckgabe;
	}
    
}
