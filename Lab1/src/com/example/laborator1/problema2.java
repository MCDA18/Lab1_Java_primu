package com.example.laborator1;
import java.util.*;
public class problema2 {
    //maximuimu dintr o lista
    public int max(List<Integer> array)
    {
        int max=0;
        for(int i=0;i<array.size();i++)
            if(array.get(i)>max)
                max=array.get(i);
            return max;
    }
    //minimu dintr o lista
    public int min(List<Integer> array)
    {
        int min=array.get(0);//presupunem ca i chiar primu
        for(int i=1;i<array.size();i++)
            if(array.get(i)<min)
                min=array.get(i);
        return min;
    }//suma minima a n-1 numere din lista,insemanand ca scoatem maximu si adunam numerele
    public int sum_min(List<Integer> array)
    {
        int maxim;
        maxim=min(array);
        int sum=0;
        for(int i=0;i<array.size();i++)
            if(maxim!=array.get(i))
                sum=sum+array.get(i);
        return sum;
    }
    //suma maximi ii inversa,scoatem minimu si avem suma maxima
    public int sum_max(List<Integer> array)
    {
        int minim;
        minim=max(array);
        int sum=0;
        for(int i=0;i<array.size();i++)
            if(minim!=array.get(i))
                sum=sum+array.get(i);
        return sum;
    }
}
