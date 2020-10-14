package com.example.laborator1;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.*;
public  class Main {
    public static void main(String[] args)
    {
        System.out.println("Dati problema dorita,apasand tasta numerica specifica problemei:");
        Scanner console = new Scanner(System.in);
        //citire de la tastatura
        int var=console.nextInt();
        //gandit ca o consola cu alegere a ce probleme edoresti
        if(var==1) {
            //a este o lista cu notele de la universitate
            List<Integer> a = new ArrayList<>();
            a.add(29);
            a.add(32);
            a.add(43);
            a.add(70);
            a.add(63);
            a.add(90);
            a.add(93);
            a.add(17);
            a.add(21);
            a.add(84);
            Universitat b = new Universitat();
            //apel de functii
            System.out.println("Maximum von abgerundte Noten:" + b.max_abgerundete_note(a));
            System.out.println("Array von abgerundete Noten:" + b.abgerundete_noten(a));
            System.out.println("Durschnittswert der Noten:" + b.durschnittwert_noten(a));
            System.out.println("Noten die nicht ausreichend sind:" + b.nicht_ausreichende_noten(a));
        }
        else
            if(var==2)
            {
                //creare obiect de tip problema 2
                problema2 a=new problema2();
                List<Integer> array=new ArrayList<>();
                array.add(4);
                array.add(8);
                array.add(10);
                array.add(3);
                array.add(17);
                //array este o lista cu valorile alea
                System.out.println("Maxim:"+a.max(array));
                System.out.println("Minim:"+a.min(array));
                System.out.println("Suma maxima:"+a.sum_max(array));
                System.out.println("Suma minima:"+a.sum_min(array));

            }
            else
                if(var==3)
                {
                    //creare obiect de tip problema 3
                    //operatii pe lista
                    problema3 c= new problema3();
                    List<Integer> zahl1=new ArrayList<>();
                    List<Integer> zahl2=new ArrayList<>();
                    zahl1.add(9);zahl1.add(2);zahl1.add(2);zahl1.add(0);zahl1.add(0);zahl1.add(0);zahl1.add(0);zahl1.add(0);zahl1.add(0);
                    zahl2.add(7);zahl2.add(7);zahl2.add(4);zahl2.add(0);zahl2.add(0);zahl2.add(0);zahl2.add(0);zahl2.add(0);zahl2.add(0);
                    System.out.println("Adunare="+c.sum_2_zahlen(zahl1,zahl2));
                    System.out.println("Diferenta="+c.dif_2_zahlen(zahl1,zahl2));
                    System.out.println("Inmultire="+c.inmultire(zahl1,2));
                    System.out.println("Impartire="+c.impartire(zahl1,2));
                }
                else
                    if(var==4)
                    {
                        //creare obiect clasa magazin
                        int buget=60;
                        List<Integer> tastatur=new ArrayList<>();
                        List<Integer> usb=new ArrayList<>();
                        tastatur.add(40);
                        tastatur.add(50);
                        tastatur.add(60);
                        /*tastatur.add(35);
                        tastatur.add(70);
                        tastatur.add(15);
                        tastatur.add(45);*/
                        /*usb.add(20);
                        usb.add(15);
                        usb.add(40);
                        usb.add(15);*/
                        usb.add(8);
                        usb.add(12);
                        problem4 d=new problem4();
                        //afisarea apelarilor de functie
                        System.out.println("Tastatura ieftina:"+d.billigste_tasatur(tastatur));
                        System.out.println("Gadget scump:"+d.teureste_gegenstand(tastatur,usb));
                        System.out.println("Cel mai scump usb,dupa buget:"+d.teureste_usb(usb,buget));
                        System.out.println("Combinatia cea mai buna de gadget-uri:"+d.kaufen(tastatur,usb,buget));
                    }
    }

}
