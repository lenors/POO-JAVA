package Aula06;
public class App {
    public String getGreeting() {
        return "Hello World!";
    }
    public static void main(String[] args) {
        ControleRemoto c = new ControleRemoto();
        c.ligar();
        c.maisVolume();
        c.play();
        c.abrirMenu();
        c.fecharMenu();
        
    
    
    
    }
}
