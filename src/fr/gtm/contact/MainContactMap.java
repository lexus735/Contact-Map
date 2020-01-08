package fr.gtm.contact;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;


public class MainContactMap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<Contact,Adresse> repertoire = new HashMap <>();
		
		Contact c1 = new Contact("Greta");
		Contact c2 = new Contact("Edouard");
		Contact c3 = new Contact("Philippe");
		
		Adresse a1 = new Adresse("rue de Stockholm");
		Adresse a2 = new Adresse ("rue de Varenne");
		Adresse a3 = new Adresse ("rue de l'arc en ciel");
		
		repertoire.put(c1, a1);
		repertoire.put(c2, a2);
		repertoire.put(c3, a3);
		
		for (Entry <Contact, Adresse> entry : repertoire.entrySet()) {
			Contact c = entry.getKey();
			Adresse a = entry.getValue();
			System.out.println(c.getNom() + " a pour adresse " + a.getRue());
		
 	
	
	}
	

}}
