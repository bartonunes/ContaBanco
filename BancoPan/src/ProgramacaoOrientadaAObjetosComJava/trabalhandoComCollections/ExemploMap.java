package ProgramacaoOrientadaAObjetosComJava.trabalhandoComCollections;

import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

import javax.swing.text.StyledEditorKit.ItalicAction;

public class ExemploMap {
	public static void main(String[] args) {
		
		Map<String, Double> carrosPopulares = new HashMap<String, Double>();
			carrosPopulares.put("gol",14.4);
			carrosPopulares.put("uno",15.6);
			carrosPopulares.put("mobi",16.1);
			carrosPopulares.put("hb20",14.5);
			carrosPopulares.put("kwind",15.6);
			System.out.println("map original:\n"+carrosPopulares);
		
			System.out.println("Subistitua o consumo do gol para 15,2Km/l");
			carrosPopulares.put("gol", 15.2);
			System.out.println(carrosPopulares);
			
			System.out.println("Conifira se o modelo tucson esta no dicionario:");
			System.out.println(carrosPopulares.containsKey("Tucson"));

			System.out.println("Exiba o consulmo do uno:");
			System.out.println(carrosPopulares.get("uno"));

			System.out.println("Exiba o 3° modelo adicionado: Não pode, pois nao tem o indice");
			
			System.out.println("Exiba os modelo:");
			System.out.println(carrosPopulares.keySet());
			//retorna um set
			Set<String> modelos = carrosPopulares.keySet(); 
			System.out.println(modelos);
			
			
			System.out.println("Exiba os consulmos dos carros:");
			System.out.println(carrosPopulares.values());
			//retorna um set
			Collection<Double> valores = carrosPopulares.values();
			System.out.println(valores);
			
			System.out.println("Exiba o carro mais economico e o seu consulmo:");
			Double consulmoMaisEficiente = Collections.max(carrosPopulares.values());
			Set<Map.Entry<String,Double>> entries= carrosPopulares.entrySet();
			String modeloMaisEficiente="";
			
			for(Map.Entry<String,Double> entry: entries ) {
				if(entry.getValue().equals(consulmoMaisEficiente)) {
					modeloMaisEficiente = entry.getKey();
				}
			}
			System.out.println("modelo mais eficiente: "+ modeloMaisEficiente +" - "+ consulmoMaisEficiente);
			
			System.out.println("Exiba o carro manos economico e o seu consulmo:");
			String modeloMenosEficiente="";
			Double consulmoMenosEficiente = Collections.min(carrosPopulares.values());
			for(Map.Entry<String,Double> entry:entries) {
				if(entry.getValue().equals(consulmoMenosEficiente)) {
					modeloMenosEficiente= entry.getKey();
				}
			}
			System.out.println("modelo menos eficiente: "+ modeloMenosEficiente +" - "+ consulmoMenosEficiente);
			
			System.out.println("Exiba a soma dos consulmos:");
			Iterator<Double> iterator = carrosPopulares.values().iterator();
			Double soma= 0.0;
			while(iterator.hasNext()) {
				soma += iterator.next();
			}
			System.out.println(soma);
			System.out.println("Exiba a media dos consulmos:");
			System.out.println(soma/carrosPopulares.size());
			
			System.out.println("Remova os carros com o consulmos acima de 15.6 :");
			Iterator<Double> iterator2 = carrosPopulares.values().iterator();
			while(iterator2.hasNext()) {
				if(iterator2.next().equals(15.6)) {
					iterator2.remove();
				}
			}
			System.out.println(carrosPopulares);
			
			
			int e=0;
			while(true) {
				e++;
				System.out.println(e);
			}
	}
}
