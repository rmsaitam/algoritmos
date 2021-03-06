/*
Classe: Algoritmos
Data: 03/12/15
autor: Reginaldo

Nessa classe Algoritmos tem a implementação de dois algoritmos Fibonacci e Fatorial de forma iterativa usando biblioteca BigInteger para números extensos.
*/
import java.math.BigInteger;

public class Algoritmos
{
    public static void main(String[] args)
    {
        BigInteger n = new BigInteger("10");
        BigInteger i;
        //System.out.println("Fibonacci de " +n+ "= " +FibonaciIterativo(n));
        for(i = new BigInteger("1"); i.compareTo(n)<= 0; i=i.add(BigInteger.ONE))
            System.out.print(FibonacciIterativo(i) +"\t");

        BigInteger num = new BigInteger("30");
        System.out.println("Fatorial de " +num+ "=" +FatoriaIterativo(num));
    }

    public static BigInteger FibonacciIterativo(BigInteger n)
    {
       BigInteger ant = new BigInteger("1");
       BigInteger atual = new BigInteger("1");
       BigInteger prox = new BigInteger("0");
       BigInteger i;

       for(i = new BigInteger("3"); i.compareTo(n) <=0; i=i.add(BigInteger.ONE)) //O(n)
       {
            prox = ant.add(atual); //prox = ant+atual
            ant = atual;
            atual = prox;
       }
       return atual;
    }

    public static BigInteger FatoriaIterativo(BigInteger n)
    {
        BigInteger fat;
        BigInteger i;
        for(fat = new BigInteger("1"); n.compareTo(BigInteger.ONE) > 0; n=n.subtract(BigInteger.ONE))
        {
             fat = fat.multiply(n);
        }
        return fat;
    }
}
