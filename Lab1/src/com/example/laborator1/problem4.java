package com.example.laborator1;

import java.util.ArrayList;
import java.util.List;
public class problem4 extends problema2 {
    //verifica care i tastatura cea mai ieftina din lista,folosind o metoda imprumutata de la problema 2
    public int billigste_tasatur(List<Integer> tastatur)
    {
        return min(tastatur);
    }
    //verifica care i cel mai scump produs
    public int teureste_gegenstand(List<Integer> tastatur,List<Integer> usb)
    {
        //foloseste maximu de la problema 2 si verfica care i mai mare
        int max1=max(tastatur);
        int max2=max(usb);
        if(max1>max2)
            return max1;
        return max2;
    }
    //verifica care i cei mai scump usb pe care si l permite un client cu un anumit buget
    public int teureste_usb(List<Integer> usb,int buget)
    {
        int max=0;
        for(int i=0;i<usb.size();i++)
            if(usb.get(i)>max & usb.get(i)<buget)
                max=usb.get(i);
            return max;
    }
    //cumpara cea mai buna achizitie dintre tastatura si usb cu un anumit buget alocat
    public int kaufen(List<Integer> tastatur,List<Integer> usb,int buget)
    {
        int sum;
        int max_kaufen=0;
        //parcurge amandoua listele
        for(int i=0;i<tastatur.size();i++)
            for(int j=0;j<usb.size();j++)
            {
                sum=0;
                //vede suma lor si daca ii cel mai bun max,o va pastra
                sum=tastatur.get(i)+usb.get(j);
                if(sum>max_kaufen & sum<buget)
                    max_kaufen=sum;
            }
        if(max_kaufen==0)//daca nu exista,afiseaza -1
            return -1;
        return max_kaufen;
    }
}
