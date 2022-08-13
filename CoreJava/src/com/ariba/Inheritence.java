package com.ariba;
class Buch
{
	public void wasBinIch() {
		System.out.println("Buch");
	}
	public void woBinIch() {
		System.out.println("Regal");
	}
}
class Sachbuch extends Buch 
{
	public void wasBinIch() {
		System.out.println("Sachbuch");
	}
}

class Javabuch extends Sachbuch
{
	public void woBinIch() {
		System.out.println("schreibtisch");
	}
}


public class Inheritence {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Buch b = new Buch();
		Sachbuch s = new Sachbuch();
		Buch j = new Javabuch();
		b.wasBinIch();
		b.woBinIch();
		s.wasBinIch();
		s.woBinIch();
		j.wasBinIch();
		j.woBinIch();
				

	}

}
