package com.example.laborator1;
import java.util.*;
public class problema3 {
    //face suma a doua numere,listate ca lsite
    public List<Integer> sum_2_zahlen(List<Integer> zahl1,List<Integer> zahl2)
    {
        int sum;
        //declara un auxiliar care ii egal cu primu numar
        List<Integer> aux=new ArrayList<Integer>(zahl1);
        int carry;
        //parcurge de la coada la cap
        for(int i=aux.size()-1;i>=0;i--)
        {
            //aduna cifrele de pe pozitii
            sum=aux.get(i)+zahl2.get(i);
            //daca suma ii mai mare decat 10,are carrry si pune in stanga un +1
            //pune +1 la pozitia din fata lui si in locul de pe i,pune exact %10 din suma
            if(sum>=10 && (i-1)!=-1) {
                aux.set(i,sum % 10);
                carry=sum/10;
                aux.set(i-1,aux.get(i-1)+carry);
            }
            else
                //cazu in care suma este mai mica decat 10
                aux.set(i,sum);
        }
        int aux1;
        //cazu in care pe prima pozitie avem un numar mai mare,trebuie despartit in 2 cifre
        if(aux.get(0)>=10)
        {
            aux1=aux.get(0);
            aux.remove(0);
            aux.add(0,aux1%10);
            aux1/=10;
            aux.add(0,aux1);
        }
        return aux;
    }
    //diferenta a doua numere
    public List<Integer> dif_2_zahlen(List<Integer> zahl1,List<Integer> zahl2)
    {
        int dif;
        List<Integer> aux=new ArrayList<Integer>(zahl1);
        //parcurge de la coada la cap
        for (int i=zahl1.size()-1;i>=0;i--)
        {
            dif=aux.get(i)-zahl2.get(i);//face diferenta
            if(dif<0 && (i-1)!=-1) {
                aux.set(i,(aux.get(i)+10)-zahl2.get(i));//diferenta in cazu in care prima cifra de la primu numar ii mai mic decat cea de la al doilea
                aux.set(i-1,aux.get(i-1)-1);//scade de la cel din fata,s a imprumutat

            }
            else
                aux.set(i,dif);

        }
        //cazu in care prin scadere s a ajns la un numar care are mai putine cifre decat celalalt
        int j=0;
        while(aux.get(j)==0)
        {
            aux.remove(j);
        }
        return aux;
    }
    //inmultirea unui numar si o cifra
    public List<Integer> inmultire(List<Integer> zahl1,int p)
    {
        int carry;
        int mul;
        List<Integer> aux=new ArrayList<Integer>(zahl1);

        //parcurge coada cap lista
        for (int i=aux.size()-1;i>=0;i--)
        {
            mul=aux.get(i)*p;//face inmultirea dintre cifra si cifra numarului
            if(mul>=10 && (i-1)!=-1)//in cazu in care inmultirea trece de 10,trebuie sa dam la urmatorul ce i in plus
            {
                aux.set(i,mul%10);//seteaza %10
                mul/=10;
                aux.set(i-1,aux.get(i-1)+mul);//si ce i in plus da mai departe
            }
            else
                aux.set(i,mul);

        }
        int aux1;
        int j=0;
        //cazu in care prima cifra ii mai mare decat 10,trebe sa splituim
        while(aux.get(j)>=10) {
            aux1 = aux.get(j);
            aux.remove(0);
            aux.add(0, aux1 % 10);
            aux1 /= 10;
            aux.add(0, aux1);
        }
        return aux;

    }
    //impartirea dintre un numar si o cifra,totu intreg
    public List<Integer> impartire(List<Integer> zahl1,int p)
    {
        int div;
        List<Integer> aux=new ArrayList<Integer>(zahl1);
        for (int i=aux.size()-1;i>=0;i--)
        {
            div=aux.get(i)/p;//face diviziunea
            aux.set(i,div);
        }
        return aux;

    }
}
