package com.example.laborator1;

import java.util.ArrayList;
import java.util.*;
public class Universitat {
    //note care sunt prea mici,returneaza o lisat cu ele
    public List<Integer> nicht_ausreichende_noten(List<Integer> array_noten)
    {
        List<Integer> aux=new ArrayList<Integer>();
        for (int i=0;i<array_noten.size();i++)
            if (array_noten.get(i) < 40)//mai mici decat 40
                aux.add(array_noten.get(i));
        return aux;
    }
    //face memia notelor,facand o suma anotelor si impartind la nuamru de note
    public float durschnittwert_noten(List<Integer> array_noten)
    {
        float sum=0;
        float d;
        for (int i=0;i<array_noten.size();i++)
            sum=sum+array_noten.get(i);//suma lor
        int size= array_noten.size();//marimea
        d=sum/size;
        return d;
    }
    //rotunjirea notelor dupa criterii
    public List<Integer> abgerundete_noten(List<Integer> array_noten)
    {
        int multiple;
        List<Integer> aux=new ArrayList<Integer>();
        for(int i=0;i<array_noten.size();i++) {
            if (array_noten.get(i) < 38)//daca ii mai mic decat 38 atunci nu i mai rotunjeste nimic,ca i prea mica
                aux.add(array_noten.get(i));
            else
            {
                multiple=array_noten.get(i)/5;//dua regula de la lab
                multiple=(multiple+1)*5;
                if(multiple-array_noten.get(i)<3)//verifica daca i multiplu si difrnta ii mai mica de 3 atunci o va rotunji in sus
                    aux.add(multiple);
                else
                    aux.add(array_noten.get(i));
            }
        }
        return aux;
    }
    //maximul notelor rotunjite
    public int max_abgerundete_note(List<Integer> array_noten)
    {
        int max=0;
        List<Integer> aux=new ArrayList<>();
        aux=abgerundete_noten(array_noten);//gasim lista cu notele rotunjite si afisam maximu
        for(int i=0;i<aux.size();i++)
            if(aux.get(i)>max)
                max=aux.get(i);
            return max;

    }
}
