package projetobanco;


public class Conta {
   String nome;
   double saldo;
   
   
   
   public void depositar(double valor){
       //saldo = saldo + valor;
       saldo += valor;
       System.out.println("Operação de depósito no valor de R$: " + valor);
       
   }
   
   public void sacar(double valor){
       //saldo = saldo + valor;
        if(saldo > valor){
           saldo -=valor;
           System.out.println("Operação de saque no valor de R$: ");
            }else{
           System.out.println("Operação não realizada, saldo insuficiente");
           
       }
       
   }
   public void exibirSaldo(){
       System.out.println(nome + " seu saldo é R$: " + saldo);
   }
   

}
