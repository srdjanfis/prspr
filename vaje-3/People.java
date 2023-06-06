package com.srdjan;
import java.util.ArrayList;
import java.util.Iterator;

public class People {
	private String ime;
	private String priimek;
	private int visina;
	private String barvaOci;
	
	public People(String ime, String priimek, int visina, String barvaOci) {
		this.ime = ime;
		this.priimek = priimek;
		this.visina = visina;
		this.barvaOci = barvaOci;
	}
	
	public String getIme() {
		return ime;
	}
	public void setIme(String ime) {
		this.ime = ime;
	}
	public String getPriimek() {
		return priimek;
	}
	public void setPriimek(String priimek) {
		this.priimek = priimek;
	}
	public int getVisina() {
		return visina;
	}
	public void setVisina(int visina) {
		this.visina = visina;
	}
	public String getBarvaOci() {
		return barvaOci;
	}
	public void setBarvaOci(String barvaOci) {
		this.barvaOci = barvaOci;
	}
	public String toString() {
		return this.ime+" "+this.priimek+" "+this.visina+" "+this.barvaOci;
	}
	
	public static void main(String[] args) {
		ArrayList<People> aLPeople = new ArrayList<People>();
		aLPeople.add(new People("Janez", "Novak", 182, "črna"));
		aLPeople.add(new People("Petra", "Bernik", 168, "modra"));
		aLPeople.add(new People("Nuša", "Peternik", 172, "zelena"));
		aLPeople.add(new People("Nejc", "Sagadin", 169, "črna"));
		Iterator<People> it = aLPeople.iterator();
		People temp;
		while(it.hasNext()) {
			temp = it.next();
			if(temp.getVisina()>170) {
				System.out.println(temp);
			}
		}
	}
}
