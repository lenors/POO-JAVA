
package Aula02;
public class Monitor {
       String cor;
       String modelo;
       int preco;
       boolean ligado;
       
       void status(){
           System.out.println("Qual o modelo do monitor. " + this.modelo);
           System.out.println("Qual a cor do Monitor. " + this.cor);
           System.out.println("O monitor esta ligado. " + this.ligado);
           System.out.println("Qual o preco do monitor? " + this.preco);
       }
       void funcionando(){
           if(this.ligado == true){
               System.out.println("Estou ligado");
           }else{
               System.out.println("Estou Desligado");
           }
       }
       void ligar(){
            this.ligado = true;
       }
       void desligado(){
           this.ligado = false;
           
       }
}
