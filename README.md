# string-calculator-kata
String Calculator Kata (http://osherove.com/tdd-kata-1)

*l'applicazione è stata realizzata usando SpringBoot

//--------------------------------------------//

Passaggi per far funzionare l'applicazione:

(java version "17.0.7" 2023-04-18 LTS)

1)Aprire il CMD

2)scrivere il seguente comando --> git clone https://github.com/ste1707/string-calculator-kata.git

3)scrivere il seguente comando --> cd string-calculator-kata

4)scrivere il seguente comando --> mvn clean compile install

5)scrivere il seguente comando --> java -jar target\CalculatorKata1-0.0.1-SNAPSHOT.jar

//--------------------------------------------//

Per eseguire tutti i 6 step:
1) Aprire Postman (in quanto ci serve un client per chiamare il servizio)
2) Fare le varie richieste usando il verbo POST sul seguente url --> localhost:8080
3) Aggiungere un json nel body con la seguente struttura:

{
    "numeri":"1,5,-1006"
}

4)nel Caso del 5 step quello dei numeri negativi ho usato l'exception heandler per gestire l'errore. 

