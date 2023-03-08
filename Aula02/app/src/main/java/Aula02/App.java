package Aula02;

public class App {

    public String getGreeting() {
        return "Hello World!";
    }

    public static void main(String[] args) {
       Monitor c1 = new Monitor(); 
       
       c1.cor = "Preto";
       c1.modelo = "Samsung";
       c1.ligado = true;
       c1.preco = 900;
       c1.funcionando();    
       c1.status();
    }
}
