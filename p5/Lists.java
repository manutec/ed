/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package p5;

import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;


/**
 *
 * @author Manu
 */
public class Lists {

     List<Integer> arraylist ;//Se inicializan las variables
     List<Integer> linked;
     double timeStart,timeEnd,elapsedTime,milis;
     double[] resultado;
     DecimalFormat df = new DecimalFormat("0.00000000"); 
    /**
     * @param args the command line arguments
     */
    
     
    void RunTimes(){
        
        
        arraylist = new ArrayList<>();//Se inicializan las variables  
        linked = new LinkedList<>();
        resultado = new double[100];//Ajusta la precision de los resultados a mas valor mas precision
        
         
        System.out.println("\t\tArrayList\tLinkedList");
        System.out.println("Test 01:\t"+df.format(Test01(arraylist))+".ms\t" +df.format(Test01(linked))+ ".ms Añadir elemento al final de la lista");
        System.out.println("Test 02:\t"+df.format(Test02(arraylist))+".ms\t"+df.format(Test02(linked))+".ms Añadir elemento al principio de la lista");
        System.out.println("Test 03:\t"+df.format(Test03(arraylist))+".ms\t"+df.format(Test03(linked))+".ms Añadir elemento a mitad de la lista");
        System.out.println("Test 04:\t"+df.format(Test04(arraylist))+".ms\t"+df.format(Test04(linked))+ ".ms Borrar elemento al final de la lista");
        System.out.println("Test 05:\t"+df.format(Test05(arraylist))+".ms\t"+df.format(Test05(linked))+ ".ms Borrar elemento al principio de la lista");
        System.out.println("Test 06:\t"+df.format(Test06(arraylist))+".ms\t"+df.format(Test06(linked))+ ".ms Borrar elemento a mitad de la lista");
        System.out.println("Test 07:\t"+df.format(Test07(arraylist))+".ms\t"+df.format(Test07(linked))+".ms Borrar por valor al final de la lista");
        System.out.println("Test 08:\t"+df.format(Test08(arraylist))+".ms\t"+df.format(Test08(linked))+ ".ms Borrar por valor al principio de la lista");
        System.out.println("Test 09:\t"+df.format(Test09(arraylist))+".ms\t"+df.format(Test09(linked))+ ".ms Borrar por valor a mitad de la lista");
        System.out.println("Test 10:\t"+df.format(Test10(arraylist))+".ms\t"+df.format(Test10(linked))+ ".ms Vaciado de la lista");
        System.out.println("Test 11:\t"+df.format(Test11(arraylist))+".ms\t"+df.format(Test11(linked))+ ".ms Busqueda de elemento");
        System.out.println("Test 12:\t"+df.format(Test12(arraylist))+".ms\t"+df.format(Test12(linked))+ ".ms Busqueda de elemento implementando");
        System.out.println("Test 13:\t"+df.format(Test13(arraylist))+".ms\t"+df.format(Test13(linked))+ ".ms Busqueda binaria de elemento");
            
     
           
    }
    
   
    
    private void inicializar(List<Integer> array){
        array.clear();
        for(int a=0;a<=999;a++)//Se les añaden los 1000 valores iniciales
        {
            
           array.add(a);
        }
    }
    
    private int BusquedaBinaria(List array,int dato)
    {
    
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
    
    
    private double Test01(List<Integer> list)
    {
        //Test 1 añadir elemento al final
        
        
        milis=0;
        for(int a=0;a<resultado.length;a++)
        {
            
            inicializar(arraylist);
            timeStart = System.nanoTime();
            list.add(1001);
            timeEnd = System.nanoTime();      
            elapsedTime = timeEnd-timeStart;
            resultado[a] = elapsedTime / 1000000.0;
            milis += resultado[a];
        }
        milis /= resultado.length;
        return milis;
    }
    
    private double Test02(List<Integer> list)
    {
    
        //Test 2 añadir elemento al principio
        
        milis=0;
        for(int a=0;a<resultado.length;a++)
        {
            inicializar(list);
            timeStart = System.nanoTime();
            list.add(0, 1002);
            timeEnd = System.nanoTime();      
            elapsedTime = timeEnd-timeStart;
            resultado[a] = elapsedTime / 1000000.0;
            milis += resultado[a];
            
        }
        milis /= resultado.length; 
        return milis;      
    }
    
    private double Test03(List<Integer> list)
    {
        //Test 3 añadir elemento a mitad
        
        milis=0;
        for(int a=0;a<resultado.length;a++)
        {
            inicializar(list);
            timeStart = System.nanoTime();
            list.add(arraylist.size()/2, 1003);
            timeEnd = System.nanoTime();      
            elapsedTime = timeEnd-timeStart;
            resultado[a] = elapsedTime / 1000000.0;
            milis +=resultado[a];
        }    
        milis /= resultado.length;
        return milis;
        
    }
    
    private double Test04(List<Integer> list)
    {
        //Test 4 borrar el elemento al final de la lista
       
        milis=0;
        for(int a=0;a<resultado.length;a++)
        {
            inicializar(list);
            timeStart = System.nanoTime();
            list.remove(arraylist.size()-1);
            timeEnd = System.nanoTime();      
            elapsedTime = timeEnd-timeStart;
            resultado[a] = elapsedTime / 1000000.0;
            milis += resultado[a];
        }
        milis /= resultado.length;
        return milis;
    }
    
    private double Test05(List<Integer> list)
    {
        //Test 5 borrar el elemento al principio
    
        milis=0;
        for(int a=0;a<resultado.length;a++)
        {           
            inicializar(list);
            timeStart = System.nanoTime();
            list.remove(0);
            timeEnd = System.nanoTime();      
            elapsedTime = timeEnd-timeStart;
            resultado[a] = elapsedTime / 1000000.0;
            milis += resultado[a];
        }
        milis /= resultado.length;       
        return milis; 
    }
    
    private double Test06(List<Integer> list)
    {
        //Test 6 Borrar el elemento a mitad
      
        milis=0;
        for(int a=0;a<resultado.length;a++)
        {           
            inicializar(list);
            timeStart = System.nanoTime();
            list.remove(arraylist.size()/2);
            timeEnd = System.nanoTime();      
            elapsedTime = timeEnd-timeStart;
            resultado[a] = elapsedTime / 1000000.0;
            milis += resultado[a];
        }
        milis /= resultado.length;
        return milis;
        
    }
    
    private double Test07(List<Integer> list)
    {
        //Test 7 Borrar por valor al final
        
        milis=0;
        for(int a=0;a<resultado.length;a++)
        {           
            inicializar(list);
            timeStart = System.nanoTime();
            list.remove(Integer.valueOf(1000));
            timeEnd = System.nanoTime();      
            elapsedTime = timeEnd-timeStart;
            resultado[a] = elapsedTime / 1000000.0;
            milis += resultado[a];
        }
        milis /= resultado.length;
        return milis;
        
    }
                         
    private double Test08(List<Integer> list)
    {
        //Test 8 Borrar por valor al principio
     
        milis=0;
        for(int a=0;a<resultado.length;a++)
        {           
            inicializar(list);
            timeStart = System.nanoTime();
            list.remove(Integer.valueOf(0));
            timeEnd = System.nanoTime();      
            elapsedTime = timeEnd-timeStart;
            resultado[a] = elapsedTime / 1000000.0;
            milis += resultado[a];
        }
        milis /= resultado.length;
        return milis;
           
    }
    
    private double Test09(List<Integer> list)
    {
        //Test 9 Borrar por valor a mitad
      
        milis=0;
        for(int a=0;a<resultado.length;a++)
        {           
            inicializar(list);
            timeStart = System.nanoTime();
            list.remove(Integer.valueOf(500));
            timeEnd = System.nanoTime();      
            elapsedTime = timeEnd-timeStart;
            resultado[a] = elapsedTime / 1000000.0;
            milis += resultado[a];
        }
        
        milis /= resultado.length;
        return milis;
    }
    
    private double Test10(List<Integer> list)
    {
        //Test 10 vaciado de la lista
     
        milis=0;
        for(int a=0;a<resultado.length;a++)
        {           
            inicializar(list);
            timeStart = System.nanoTime();
            list.clear();
            timeEnd = System.nanoTime();      
            elapsedTime = timeEnd-timeStart;
            resultado[a] = elapsedTime / 1000000.0;
            milis += resultado[a];
        }
        milis /= resultado.length;
        return milis;      
    }
    
    private double Test11(List<Integer> list)
    {
        //Test 11 busqueda de elemento 
     
        milis=0;
        for(int a=0;a<resultado.length;a++)
        {           
            inicializar(list);
            timeStart = System.nanoTime();
            list.indexOf(900);
            timeEnd = System.nanoTime();      
            elapsedTime = timeEnd-timeStart;
            resultado[a] = elapsedTime / 1000000.0;
            milis += resultado[a];
        }
        milis /= resultado.length;
        return milis;
             
    }
    
    private double Test12(List<Integer> list)
    {
         //Test 12 busqueda de elemento implementando
        
        milis=0;
        for(int a=0;a<resultado.length;a++)
        {           
            inicializar(list);
            timeStart = System.nanoTime();
            for(int b : list)
            {
                if(b==900){
                break;
                } 
            }
            timeEnd = System.nanoTime();      
            elapsedTime = timeEnd-timeStart;
            resultado[a] = elapsedTime / 1000000.0;
            milis += resultado[a];
        }
        milis /= resultado.length;
        return milis;   
    }
    
    private double Test13(List<Integer> list)
    {
        //Test 13 busqueda de elemento mediante busqueda binaria
        
        milis=0;
        for(int a=0;a<resultado.length;a++)
        {           
            inicializar(list);
            timeStart = System.nanoTime();
            BusquedaBinaria(list,900);
            timeEnd = System.nanoTime();      
            elapsedTime = timeEnd-timeStart;
            resultado[a] = elapsedTime / 1000000.0;
            milis += resultado[a];
        }
        milis /= resultado.length;
        return milis;
    }
    
}
