/*
Classe: Fibonacci
Data: 03/12/15
autor: Reginaldo

Implementação do algoritmo de Fibonacci da forma iterativa e recursiva usando biblioteca BigInteger para números extensos.
Faz a medição de tempo de ambos (iterativo e recursivo).
*/
import java.math.BigInteger;
import java.util.Scanner;


public class Fibonacci
{
    public static void main(String[] args)
    {
       long inicio1, fim1, ms1, inicio2, fim2, ms2;

       Scanner sc = new Scanner(System.in);
       System.out.println("Digite o N termo que deseja saber do Fibonacci");
       int n = sc.nextInt();

       inicio1 = System.currentTimeMillis();
       BigInteger fib1 = FibonacciIterativo(n);
       fim1 = System.currentTimeMillis();
       ms1 = fim1-inicio1;
       System.out.println("Fibonacci de " +n+ "=" +fib1);
       
       System.out.println("Tempo " +(ms1)+ "ms");
       ConverteMilisegToHoraMinutos(ms1);

       inicio2 = System.currentTimeMillis();
       BigInteger fib2 = Fibonacci2(n);
       fim2 = System.currentTimeMillis();
       ms2 = fim2-inicio2;
       System.out.println("Fibonacci de " +n+ "=" +fib2);
       System.out.println("Tempo " +(ms2)+ "ms");
       ConverteMilisegToHoraMinutos(ms2);
              
    }
    
    public static BigInteger FibonacciIterativo(int n)
    {
        BigInteger ant = new BigInteger("1");
        BigInteger atual = new BigInteger("1");
        BigInteger prox = new BigInteger("0");
        
        for(int i=3; i<=n; i++)
        {
              prox = ant.add(atual);
              ant = atual;
              atual = prox;
        }
        return atual;
    }

    public static BigInteger Fibonacci2(int n)
    {
        if(n==0 || n==1) return new BigInteger("1");
           return Fibonacci2(n-1).add(Fibonacci2(n-2));
    }

    public static void ConverteMilisegToHoraMinutos(long ms)
    {
         long segundos, minutos, horas;
         segundos = (ms/1000) % 60;
         minutos = (ms/6000) % 60; //6000 = 1000*60
         horas = (ms/3600000) % 60; //3600000 = 1000*60*60
         System.out.format("%02d:%02d:%02d\n\n", horas, minutos, segundos);
         
    }

    
}
