package calculatorKata.Controller;




import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import calculatorKata.Entity.Numeri;
import calculatorKata.Entity.Somma;

@RestController
public class Main {

	@PostMapping(path = "/", consumes = "application/json")
	public Somma add(@RequestBody Numeri numbers){
		
		if(numbers.equals(null) || numbers.getNumeri().equals("")) {
			Somma s = new Somma(0);
			return s;
		}
		
		if(numbers.getNumeri().length() == 1) {
			Somma s = new Somma(Integer.parseInt(numbers.getNumeri()));
			return s;
		}
		
		
		if(numbers.getNumeri().length() > 1) {
			if(numbers.getNumeri().charAt(0) == '/' && numbers.getNumeri().charAt(1) == '/') {
				
				char delimitatore = numbers.getNumeri().charAt(2);
				
				int somma = 0;
				String[] numeriString = numbers.getNumeri().split("(?<=^.{3})");
			
				for (int i = 1; i < numeriString.length; i++) {
					String[] numeriString2 = numeriString[i].split("[,\n"+delimitatore+"]");
					for (String string : numeriString2) {
						somma += Integer.parseInt(string);
					}					
				}
				Somma s = new Somma(somma);
				return s;
			}
			int somma = 0;
			String[] numeriString = numbers.getNumeri().split("[,\n]");
			for (String string : numeriString) {
				somma += Integer.parseInt(string);
			}
			Somma s = new Somma(somma);
			return s;
			
		}
		
		
		
		return null;
	}
	
	
	
}
