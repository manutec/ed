/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package p5;

import java.util.ArrayList;
import java.util.LinkedList;


/**
 *
 * @author Manu
 */
public class Lists {

     ArrayList<Integer> arraylist ;//Se inicializan las variables
     LinkedList<Integer> linked;
    /**
     * @param args the command line arguments
     */
    
     
    void RunTimes(){
        double timeStart,timeEnd,elapsedTime,milis;
        arraylist = new ArrayList<>();//Se inicializan las variables
        linked = new LinkedList<>();
        inicializar(); //Se inicializan las listas con 1000 elementos
        
        System.out.println("\t\tArrayList\tLinkedList");
        
        //Test 1 añadir elemento al final
        //ArrayList
        timeStart = System.nanoTime();
        arraylist.add(1001);
        timeEnd = System.nanoTime();      
        elapsedTime = timeEnd-timeStart;
        milis = elapsedTime / 1000000.0;
        System.out.print("Test 1:\t\t"+milis +".ms" );
        
        //LinkedList
        timeStart = System.nanoTime();
        linked.addLast(1001);
        timeEnd = System.nanoTime();
        elapsedTime = timeEnd-timeStart;
        milis = elapsedTime / 1000000.0;
        System.out.println("\t" +milis + ".ms Añadir elemento al final de la lista");
        
        //Test 2 añadir elemento al principio
        //ArrayList
        timeStart = System.nanoTime();
        arraylist.add(0, 1002);
        timeEnd = System.nanoTime();      
        elapsedTime = timeEnd-timeStart;
        milis = elapsedTime / 1000000.0;
        System.out.print("Test 2:\t\t"+milis +".ms" );
        
        //LinkedList
        timeStart = System.nanoTime();
        linked.addFirst(1002);
        timeEnd = System.nanoTime();
        elapsedTime = timeEnd-timeStart;
        milis = elapsedTime / 1000000.0;
        System.out.println("\t" +milis + ".ms Añadir elemento al principio de la lista");
        
        //Test 3 añadir elemento a mitad
        //ArrayList
        timeStart = System.nanoTime();
        arraylist.add(arraylist.size()/2, 1003);
        timeEnd = System.nanoTime();      
        elapsedTime = timeEnd-timeStart;
        milis = elapsedTime / 1000000.0;
        System.out.print("Test 3:\t\t"+milis +".ms" );
        
        //LinkedList
        timeStart = System.nanoTime();
        linked.add(linked.size()/2,1003);
        timeEnd = System.nanoTime();
        elapsedTime = timeEnd-timeStart;
        milis = elapsedTime / 1000000.0;
        System.out.println("\t" +milis + ".ms Añadir elemento a mitad de la lista");
        
        //Test 4 borrar el elemento al final de la lista
        //ArrayList
        timeStart = System.nanoTime();
        arraylist.remove(arraylist.size()-1);
        timeEnd = System.nanoTime();      
        elapsedTime = timeEnd-timeStart;
        milis = elapsedTime / 1000000.0;
        System.out.print("Test 4:\t\t"+milis +".ms" );
        
        //LinkedList
        timeStart = System.nanoTime();
        linked.removeLast();
        timeEnd = System.nanoTime();
        elapsedTime = timeEnd-timeStart;
        milis = elapsedTime / 1000000.0;
        System.out.println("\t" +milis + ".ms Borrar elemento al final de la lista");
        
        //Test 5 borrar el elemento al principio
        //ArrayList
        timeStart = System.nanoTime();
        arraylist.remove(0);
        timeEnd = System.nanoTime();      
        elapsedTime = timeEnd-timeStart;
        milis = elapsedTime / 1000000.0;
        System.out.print("Test 5:\t\t"+milis +".ms" );
        
        //LinkedList
        timeStart = System.nanoTime();
        linked.removeFirst();
        timeEnd = System.nanoTime();
        elapsedTime = timeEnd-timeStart;
        milis = elapsedTime / 1000000.0;
        System.out.println("\t" +milis + ".ms Borrar elemento al principio de la lista");
        
        //Test 6 Borrar el elemento a mitad
        //ArrayList
        timeStart = System.nanoTime();
        arraylist.remove(arraylist.size()/2);
        timeEnd = System.nanoTime();      
        elapsedTime = timeEnd-timeStart;
        milis = elapsedTime / 1000000.0;
        System.out.print("Test 6:\t\t"+milis +".ms" );
        
        //LinkedList
        timeStart = System.nanoTime();
        linked.remove(linked.size()/2);
        timeEnd = System.nanoTime();
        elapsedTime = timeEnd-timeStart;
        milis = elapsedTime / 1000000.0;
        System.out.println("\t" +milis + ".ms Borrar elemento a mitad de la lista");
        
        //Test 7 Borrar por valor al final
        //ArrayList

        timeStart = System.nanoTime();
        arraylist.remove(Integer.valueOf(1000));
        timeEnd = System.nanoTime();      
        elapsedTime = timeEnd-timeStart;
        milis = elapsedTime / 1000000.0;
        System.out.print("Test 7:\t\t"+milis +".ms" );
        
        //LinkedList
        timeStart = System.nanoTime();
        linked.remove(Integer.valueOf(1000));
        timeEnd = System.nanoTime();
        elapsedTime = timeEnd-timeStart;
        milis = elapsedTime / 1000000.0;
        System.out.println("\t" +milis + ".ms Borrar por valor al final de la lista");
        
        //Test 8 Borrar por valor al principio
        //ArrayList
        timeStart = System.nanoTime();
        arraylist.remove(Integer.valueOf(0));
        timeEnd = System.nanoTime();      
        elapsedTime = timeEnd-timeStart;
        milis = elapsedTime / 1000000.0;
        System.out.print("Test 8:\t\t"+milis +".ms" );
        
        //LinkedList
        timeStart = System.nanoTime();
        linked.remove(Integer.valueOf(0));
        timeEnd = System.nanoTime();
        elapsedTime = timeEnd-timeStart;
        milis = elapsedTime / 1000000.0;
        System.out.println("\t" +milis + ".ms Borrar por valor al principio de la lista");
        
        //Test 9 Borrar por valor a mitad
        //ArrayList
        timeStart = System.nanoTime();
        arraylist.remove(Integer.valueOf(500));
        timeEnd = System.nanoTime();      
        elapsedTime = timeEnd-timeStart;
        milis = elapsedTime / 1000000.0;
        System.out.print("Test 9:\t\t"+milis +".ms" );
        
        //LinkedList
        timeStart = System.nanoTime();
        linked.remove(Integer.valueOf(500));
        timeEnd = System.nanoTime();
        elapsedTime = timeEnd-timeStart;
        milis = elapsedTime / 1000000.0;
        System.out.println("\t" +milis + ".ms Borrar por valor a mitad de la lista");
        
        //Test 10 vaciado de la lista
        //ArrayList
        timeStart = System.nanoTime();
        arraylist.clear();
        timeEnd = System.nanoTime();      
        elapsedTime = timeEnd-timeStart;
        milis = elapsedTime / 1000000.0;
        System.out.print("Test 10:\t"+milis +".ms" );
        
        //LinkedList
        timeStart = System.nanoTime();
        linked.clear();
        timeEnd = System.nanoTime();
        elapsedTime = timeEnd-timeStart;
        milis = elapsedTime / 1000000.0;
        System.out.println("\t" +milis + ".ms Vaciado de la lista");
        
        inicializar(); //Se vuelven a añadir 1000 elementos
        
        //Test 11 busqueda de elemento 
        //ArrayList
        timeStart = System.nanoTime();
        arraylist.indexOf(900);
        timeEnd = System.nanoTime();      
        elapsedTime = timeEnd-timeStart;
        milis = elapsedTime / 1000000.0;
        System.out.print("Test 11:\t"+milis +".ms" );
        
        //LinkedList
        timeStart = System.nanoTime();
        linked.indexOf(900);
        timeEnd = System.nanoTime();
        elapsedTime = timeEnd-timeStart;
        milis = elapsedTime / 1000000.0;
        System.out.println("\t" +milis + ".ms Busqueda de elemento");
        
        //Test 12 busqueda de elemento implementando
        //ArrayList
        timeStart = System.nanoTime();
        for(int a : arraylist){
           if(a==900){
            break;
           } 
        }
        timeEnd = System.nanoTime();      
        elapsedTime = timeEnd-timeStart;
        milis = elapsedTime / 1000000.0;
        System.out.print("Test 12:\t"+milis +".ms" );
        
        //LinkedList
        timeStart = System.nanoTime();
        for(int a : linked){
           if(a==900){
            break;
           } 
        }
        timeEnd = System.nanoTime();
        elapsedTime = timeEnd-timeStart;
        milis = elapsedTime / 1000000.0;
        System.out.println("\t" +milis + ".ms Busqueda de elemento implementando");
        
        //Test 13 busqueda de elemento mediante busqueda binaria
        //ArrayList
        timeStart = System.nanoTime();
        BusquedaBinaria(arraylist,900);
        timeEnd = System.nanoTime();      
        elapsedTime = timeEnd-timeStart;
        milis = elapsedTime / 1000000.0;
        System.out.print("Test 13:\t"+milis +".ms" );
        
        //LinkedList
        timeStart = System.nanoTime();
        BusquedaBinaria(linked,900);
        timeEnd = System.nanoTime();
        elapsedTime = timeEnd-timeStart;
        milis = elapsedTime / 1000000.0;
        System.out.println("\t" +milis + ".ms Busqueda binaria de elemento");
           
           
    }
    
    
    private void inicializar(){
    
        for(int a=0;a<=1000;a++)//Se les añaden los 1000 valores iniciales
        {
            arraylist.add(a);
            linked.add(a);
        }
    }
    
    private int BusquedaBinaria(ArrayList array,int dato)
    {
        array = arraylist;
        int inicio = 0;
        int fin = array.size() - 1;
        int pos;
        while (inicio <= fin) 
        {
            pos = (inicio+fin) / 2;           
            if ((int)array.get(pos) == dato )
                return pos;
            else if ((int)array.get(pos) < dato ) {
                inicio = pos+1;
            } else {
                fin = pos-1;
            }
        }
        return -1;
    }
    
    private int BusquedaBinaria(LinkedList array,int dato)
    {
        array = linked;
        int inicio = 0;
        int fin = array.size() - 1;
        int pos;
        while (inicio <= fin) 
        {
            pos = (inicio+fin) / 2;           
            if ((int)array.get(pos) == dato )
                return pos;
            else if ( (int)array.get(pos) < dato ) {
                inicio = pos+1;
            } else {
                fin = pos-1;
            }
        }
        return -1;
    }
    
}
