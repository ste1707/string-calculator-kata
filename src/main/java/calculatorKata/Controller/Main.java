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
		
		//contiene anche lo step 2
		if(numbers.getNumeri().length() > 1) {
			int somma = 0;
			String[] numeriString = numbers.getNumeri().split(",");
			for (String string : numeriString) {
				somma += Integer.parseInt(string);
			}
			Somma s = new Somma(somma);
			return s;
			
		}
		
		
		
		return null;
	}
	
	
	
}
