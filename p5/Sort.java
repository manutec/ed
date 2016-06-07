/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package p5;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 *
 * @author Manu
 */
public class Sort {
    double timeStart,timeEnd,elapsedTime,milis;
    List<Integer> lista = new ArrayList<>();
    int swap=0;
    public void RunTimes()
    { 
        
        System.out.println("\t\tL. Alteatoria\tLista Ordenada\tListaInversa\tLista igual");
        BubbleTime();
        SelectionTime();
        InsertionTime();
        QuickTime();
        MergeTime();
        BinaryTime();
        SecuentialTime();
    }
    
    public void RunTest()
    {
        lista=ListaAleatoria(20);
        setSwap(0);
        System.out.println("\u001B[31m"+"Bubble Sort");
        System.out.println("\u001B[31m"+"-------------");
        System.out.println("Lista Aleatoria");
        System.out.println(lista.toString());
        System.out.println(Bubble(lista).toString());
        System.out.println("\u001B[32m"+"Swaps: "+getSwap());
        setSwap(0);
        System.out.println("Lista ya ordenada");
        lista=ListaOrdenada(20);
        System.out.println(lista.toString());
        System.out.println(Bubble(lista).toString());
        System.out.println("\u001B[32m"+"Swaps: "+getSwap());
        setSwap(0);
        System.out.println("Lista inversa");
        lista=ListaInversa(20);
        System.out.println(lista.toString());
        System.out.println(Bubble(lista).toString());
        System.out.println("\u001B[32m"+"Swaps: "+getSwap());
        setSwap(0);
        System.out.println("Lista de mismos elementos");
        lista= ListaIgual(20);
        System.out.println(lista.toString());
        System.out.println(Bubble(lista).toString());
        System.out.println("\u001B[32m"+"Swaps: "+getSwap());
        
        
        lista=ListaAleatoria(20);
        setSwap(0);
        System.out.println("");
        System.out.println("\u001B[31m"+"Selection Sort");
        System.out.println("\u001B[31m"+"-------------");
        System.out.println("Lista Aleatoria");
        System.out.println(lista.toString());
        System.out.println(Selection(lista).toString());
        System.out.println("\u001B[32m"+"Swaps: "+getSwap());
        setSwap(0);
        System.out.println("Lista ya ordenada");
        lista=ListaOrdenada(20);
        System.out.println(lista.toString());
        System.out.println(Selection(lista).toString());
        System.out.println("\u001B[32m"+"Swaps: "+getSwap());
        setSwap(0);
        System.out.println("Lista inversa");
        lista=ListaInversa(20);
        System.out.println(lista.toString());
        System.out.println(Selection(lista).toString());
        System.out.println("\u001B[32m"+"Swaps: "+getSwap());
        setSwap(0);
        System.out.println("Lista de mismos elementos");
        lista= ListaIgual(20);
        System.out.println(lista.toString());
        System.out.println(Selection(lista).toString());
        System.out.println("\u001B[32m"+"Swaps: "+getSwap());
        setSwap(0);
        
        lista=ListaAleatoria(20);
        setSwap(0);
        System.out.println("");
        System.out.println("\u001B[31m"+"Insertion Sort");
        System.out.println("\u001B[31m"+"-------------");
        System.out.println("Lista Aleatoria");
        System.out.println(lista.toString());
        System.out.println(Insertion(lista).toString());
        System.out.println("\u001B[32m"+"Swaps: "+getSwap());
        setSwap(0);
        System.out.println("Lista ya ordenada");
        lista=ListaOrdenada(20);
        System.out.println(lista.toString());
        System.out.println(Insertion(lista).toString());
        System.out.println("\u001B[32m"+"Swaps: "+getSwap());
        setSwap(0);
        System.out.println("Lista inversa");
        lista=ListaInversa(20);
        System.out.println(lista.toString());
        System.out.println(Insertion(lista).toString());
        System.out.println("\u001B[32m"+"Swaps: "+getSwap());
        setSwap(0);
        System.out.println("Lista de mismos elementos");
        lista= ListaIgual(20);
        System.out.println(lista.toString());
        System.out.println(Insertion(lista).toString());
        System.out.println("\u001B[32m"+"Swaps: "+getSwap());
        setSwap(0);
        
        lista=ListaAleatoria(20);
        setSwap(0);
        System.out.println("");
        System.out.println("\u001B[31m"+"Quick Sort");
        System.out.println("\u001B[31m"+"-------------");
        System.out.println("Lista Aleatoria");
        System.out.println(lista.toString());
        System.out.println(Quick(lista,0,20).toString());
        System.out.println("\u001B[32m"+"Swaps: "+getSwap());
        setSwap(0);
        System.out.println("Lista ya ordenada");
        lista=ListaOrdenada(20);
        System.out.println(lista.toString());
        System.out.println(Quick(lista,0,20).toString());
        System.out.println("\u001B[32m"+"Swaps: "+getSwap());
        setSwap(0);
        System.out.println("Lista inversa");
        lista=ListaInversa(20);
        System.out.println(lista.toString());
        System.out.println(Quick(lista,0,20).toString());
        System.out.println("\u001B[32m"+"Swaps: "+getSwap());
        setSwap(0);
        System.out.println("Lista de mismos elementos");
        lista= ListaIgual(20);
        System.out.println(lista.toString());
        System.out.println(Quick(lista,0,20).toString());
        System.out.println("\u001B[32m"+"Swaps: "+getSwap());
        setSwap(0);
        
        lista=ListaAleatoria(20);
        System.out.println("");
        System.out.println("\u001B[31m"+"Merge Sort");
        System.out.println("\u001B[31m"+"-------------");
        System.out.println("Lista Aleatoria");
        System.out.println(lista.toString());
        System.out.println(Merge(lista).toString());
        System.out.println("Lista ya ordenada");
        lista=ListaOrdenada(20);
        System.out.println(lista.toString());
        System.out.println(Merge(lista).toString());
        System.out.println("Lista inversa");
        lista=ListaInversa(20);
        System.out.println(lista.toString());
        System.out.println(Merge(lista).toString());
        System.out.println("Lista de mismos elementos");
        lista= ListaIgual(20);
        System.out.println(lista.toString());
        System.out.println(Merge(lista).toString());
        
        lista=ListaInversa(20);
        lista=Bubble(lista);
        int numero=7;
        System.out.println("");
        System.out.println("\u001B[31m"+"Binary Search");
        System.out.println("\u001B[31m"+"-------------");
        int pos = BusquedaBinaria(lista,numero);
        System.out.println(lista.toString());
        System.out.println("Numro " +numero + " está en la posicion "+(pos+1));
        
        numero=4;
        lista=ListaInversa(20);
        System.out.println("");
        System.out.println("\u001B[31m"+"Secuential Search");
        System.out.println("\u001B[31m"+"-------------");
        pos = BusquedaSecuencial(lista,numero);
        System.out.println(lista.toString());
        System.out.println("Numero " +numero + " está en la posicion "+(pos+1));  
        
    }
    
    private ArrayList<Integer> ListaAleatoria(int num)
    {
        Random ran = new Random();
        ArrayList<Integer> list = new ArrayList<>();
        boolean rep=false;
        int random=0;
        int cont=0;
        list.add(ran.nextInt(1000));
       
        do{
            do{ 
                random = ran.nextInt(5000);
                rep=false; 
                for(int b :list)  //Controlamos que no se repita el numero                
                {
                    if(random==b) {
                        rep=true;
                        break;
                    }        
                }                               
            }while(rep);
            list.add(random);
            cont++;
        }while(cont!=num);   
        return list;
    }
    
    private ArrayList<Integer> ListaOrdenada(int num){
        ArrayList<Integer> list = new ArrayList<>();
        for(int a=0;a<=num;a++){
            list.add(a); 
        }
            
        return list;
    }
    
    private ArrayList<Integer> ListaInversa(int num)
    {
        ArrayList<Integer> list = new ArrayList<>();
        for(int a=num;a>=0;a--)
        {
            list.add(a);
        }
        return list;       
    }
    
    private ArrayList<Integer> ListaIgual(int num)
    {
        ArrayList<Integer> list = new ArrayList<>();
        for(int a=0;a<=num;a++)
        {
            list.add(500);        
        }
        return list;
    }
    
    private List<Integer> Bubble(List<Integer> lista)
    {
        if(lista.size()<=1)return lista;
         for(int i = 0; i < lista.size() - 1; i++)
        {
            for(int j = 0; j < lista.size() - 1; j++)
            {
                
                if (lista.get(j) > lista.get(j + 1))
                {
                    swap++;
                    int tmp = lista.get(j+1);
                    lista.set(j+1, lista.get(j));
                    lista.set(j,tmp);
                }
            }
        }  
        return lista;
    }
    
    private List<Integer> Selection(List<Integer> lista)
    {
        if(lista.size()<=1)return lista;
        int minimo=0;
        int temp=0;
        for(int a=0;a<lista.size()-1;a++)
        {
            minimo=a;
            for(int b=a+1;b<lista.size();b++)
            {
                if(lista.get(b)<lista.get(minimo)) minimo=b;            
            }
            if(minimo!=a)
            {
                swap++;
                temp = lista.get(a);
                lista.set(a,lista.get(minimo));
                lista.set(minimo,temp);
            }
            
        }  
        return lista;
    }
    
    private List<Integer> Insertion(List<Integer> lista)
    {
        if(lista.size()<=1)return lista;
        int min=0;
        int temp=0;
       for(int a=0;a<lista.size();a++)
       {
           min=lista.get(a);
           for(int b=a;b>0;b--)
           {
               if(lista.get(b)<lista.get(b-1))
               {
                   swap++;
                   temp=lista.get(b);
                   lista.set(b,lista.get(b-1));
                   lista.set(b-1, temp);               
               }
           }       
       }
        return lista;
    }
    
    private List<Integer> Quick(List<Integer> lista,int bajo,int alto)
    {
        if(lista.size()<=1)return lista;
        if(bajo>=alto)return lista;       
        int mitad=bajo+(alto-bajo)/2;        
        int temp=0;
        int b= bajo;
        int a= alto;
        while(b<=a)
        {
            while(lista.get(b)<lista.get(mitad))
            {
                b++;
            }
            while(lista.get(a)>lista.get(mitad))
            {
                a--;
            }
            if(b<=a)
            {
                swap++;
                temp=lista.get(b);
                lista.set(b,lista.get(a));
                lista.set(a,temp);
                b++;
                a--;            
            }
        
        }
        if(bajo<a) Quick(lista,bajo,a);
        if(alto>b) Quick(lista,b,alto);
        
        return lista;
    }
    
    private List<Integer> Merge(List<Integer> lista)
    {
        List<Integer> izq = new ArrayList<Integer>();
        List<Integer> der = new ArrayList<Integer>();
        int centro;
        if(lista.size()<=1)return lista;
        else
        {
            centro = lista.size()/2;
            for(int a=0;a<centro;a++)
            {
                izq.add(lista.get(a));
            }
            for(int b= centro;b<lista.size();b++)
            {
                der.add(lista.get(b));           
            }
            izq = Merge(izq);
            der = Merge(der);
            Merge(izq,der,lista);        
        }
        return lista;       
    }
    
    private List<Integer> Merge(List<Integer>izq,List<Integer>der,List<Integer>lista)
    {
        int indexizq=0;
        int indexder=0;
        int indexlista=0;
     
        for(int a=0;a<lista.size();a++)
        {
        
            if(indexizq==izq.size())
            {
                lista.set(a,der.get(indexder));
                indexder++;           
            }else{
                if(indexder==der.size())
                {
                    lista.set(a, izq.get(indexizq));
                    indexizq++;
                }else{
                    if(izq.get(indexizq)<=der.get(indexder))
                    {
                        lista.set(a,izq.get(indexizq));
                        indexizq++;
                    }else{
                        if(izq.get(indexizq)>=der.get(indexder))
                        {
                            lista.set(a,der.get(indexder));
                            indexder++;
                        }
                    }
                }
                
            }
        }
      
        return lista;
    }
    
    private int BusquedaBinaria(List lista,int dato)
    {
        int inicio = 0;
        int fin = lista.size() - 1;
        int pos;
        while (inicio <= fin) 
        {
            pos = (inicio+fin) / 2;           
            if ((int)lista.get(pos) == dato )
                return pos;
            else if ((int)lista.get(pos) < dato ) {
                inicio = pos+1;
            } else {
                fin = pos-1;
            }
        }
        return -1;
    }
    
    private int BusquedaSecuencial(List<Integer> lista,int dato)
    {
        int pos=0;
        for(int elemento : lista)
        {
            if(elemento==dato){
                pos=lista.indexOf(elemento);
                break;
            }
        
        }        
        return pos;
    }
    
    private void BubbleTime()
    {
        lista=ListaAleatoria(1000);
        timeStart = System.nanoTime();
        Bubble(lista);
        timeEnd = System.nanoTime();      
        elapsedTime = timeEnd-timeStart;
        milis = elapsedTime / 1000000.0;
        System.out.print("Bubble Sort:\t");
        //System.out.println("\u001B[31m"+"----------------");
        System.out.print(+milis +".ms\t" );
        //Elementos ordenados
        lista=ListaOrdenada(1000);
        timeStart = System.nanoTime();       
        Bubble(lista);
        timeEnd = System.nanoTime();      
        elapsedTime = timeEnd-timeStart;
        milis = elapsedTime / 1000000.0;
        System.out.print(+milis+".ms\t");
        //Elementos ordenados inversamente
        lista=ListaInversa(1000);
        timeStart = System.nanoTime();
        Bubble(lista);        
        timeEnd = System.nanoTime();      
        elapsedTime = timeEnd-timeStart;
        milis = elapsedTime / 1000000.0;
        System.out.print(+milis+".ms\t");
        //Mismos elementos
        lista=ListaIgual(1000);
        timeStart = System.nanoTime();
        Bubble(lista);
        timeEnd = System.nanoTime();      
        elapsedTime = timeEnd-timeStart;
        milis = elapsedTime / 1000000.0;
        System.out.println(+milis+".ms\t");
    
    }
    
    private void SelectionTime()
    {
        //Selection sort
        //Lista Aleatoria    
        lista=ListaAleatoria(1000);
        timeStart = System.nanoTime();
        Selection(lista);
        timeEnd = System.nanoTime();      
        elapsedTime = timeEnd-timeStart;
        milis = elapsedTime / 1000000.0;
        System.out.print("Select. Sort:\t");
        System.out.print(+milis +".ms\t" );
        //Elementos ordenados
        lista=ListaOrdenada(1000);
        timeStart = System.nanoTime();       
        Selection(lista);
        timeEnd = System.nanoTime();      
        elapsedTime = timeEnd-timeStart;
        milis = elapsedTime / 1000000.0;
        System.out.print(+milis+".ms\t");
        //Elementos ordenados inversamente
        lista=ListaInversa(1000);
        timeStart = System.nanoTime();
        Selection(lista);       
        timeEnd = System.nanoTime();      
        elapsedTime = timeEnd-timeStart;
        milis = elapsedTime / 1000000.0;
        System.out.print(+milis+".ms\t");
        //Mismos elementos
        lista=ListaIgual(1000);
        timeStart = System.nanoTime();
        Selection(lista);  
        timeEnd = System.nanoTime();      
        elapsedTime = timeEnd-timeStart;
        milis = elapsedTime / 1000000.0;
        System.out.println(+milis+".ms\t");
    
    
    }
    
    private void InsertionTime()
    {
        //Insertion sort
        //Lista Aleatoria    
        lista=ListaAleatoria(1000);
        timeStart = System.nanoTime();
        Insertion(lista);
        timeEnd = System.nanoTime();      
        elapsedTime = timeEnd-timeStart;
        milis = elapsedTime / 1000000.0;
        System.out.print("Insertion Sort:\t");
        System.out.print(+milis +".ms\t" );
        //Elementos ordenados
        lista=ListaOrdenada(1000);
        timeStart = System.nanoTime();       
        Insertion(lista);
        timeEnd = System.nanoTime();      
        elapsedTime = timeEnd-timeStart;
        milis = elapsedTime / 1000000.0;
        System.out.print(+milis+".ms\t");
        //Elementos ordenados inversamente
        lista=ListaInversa(1000);
        timeStart = System.nanoTime();
        Insertion(lista);       
        timeEnd = System.nanoTime();      
        elapsedTime = timeEnd-timeStart;
        milis = elapsedTime / 1000000.0;
        System.out.print(+milis+".ms\t");
        //Mismos elementos
        lista=ListaIgual(1000);
        timeStart = System.nanoTime();
        Insertion(lista);
        timeEnd = System.nanoTime();      
        elapsedTime = timeEnd-timeStart;
        milis = elapsedTime / 1000000.0;
        System.out.println(+milis+".ms\t");
    
    }
    
    private void QuickTime()
    {
         //Insertion sort
        //Lista Aleatoria    
        lista=ListaAleatoria(1000);
        timeStart = System.nanoTime();
        Quick(lista,0,999);
        timeEnd = System.nanoTime();      
        elapsedTime = timeEnd-timeStart;
        milis = elapsedTime / 1000000.0;
        System.out.print("Quick Sort:\t");
        System.out.print(+milis +".ms\t" );
        //Elementos ordenados
        lista=ListaOrdenada(1000);
        timeStart = System.nanoTime();       
        Quick(lista,0,999);
        timeEnd = System.nanoTime();      
        elapsedTime = timeEnd-timeStart;
        milis = elapsedTime / 1000000.0;
        System.out.print(+milis+".ms\t");
        //Elementos ordenados inversamente
        lista=ListaInversa(1000);
        timeStart = System.nanoTime();
        Quick(lista,0,999);       
        timeEnd = System.nanoTime();      
        elapsedTime = timeEnd-timeStart;
        milis = elapsedTime / 1000000.0;
        System.out.print(+milis+".ms\t");
        //Mismos elementos
        lista=ListaIgual(1000);
        timeStart = System.nanoTime(); 
        Quick(lista,0,999);
        timeEnd = System.nanoTime();      
        elapsedTime = timeEnd-timeStart;
        milis = elapsedTime / 1000000.0;
        System.out.println(+milis+".ms\t");
    
    }
    
    private void MergeTime()
    {
         //Merge sort
        //Lista Aleatoria    
        lista=ListaAleatoria(1000);
        timeStart = System.nanoTime();
        Merge(lista);
        timeEnd = System.nanoTime();      
        elapsedTime = timeEnd-timeStart;
        milis = elapsedTime / 1000000.0;
        System.out.print("Merge Sort:\t");
        System.out.print(+milis +".ms\t" );
        //Elementos ordenados
        lista=ListaOrdenada(1000);
        timeStart = System.nanoTime();       
        Merge(lista);
        timeEnd = System.nanoTime();      
        elapsedTime = timeEnd-timeStart;
        milis = elapsedTime / 1000000.0;
        System.out.print(+milis+".ms\t");
        //Elementos ordenados inversamente
        lista=ListaInversa(1000);
        timeStart = System.nanoTime();
        Merge(lista);       
        timeEnd = System.nanoTime();      
        elapsedTime = timeEnd-timeStart;
        milis = elapsedTime / 1000000.0;
        System.out.print(+milis+".ms\t");
        //Mismos elementos
        lista=ListaIgual(1000);
        timeStart = System.nanoTime(); 
        Merge(lista);
        timeEnd = System.nanoTime();      
        elapsedTime = timeEnd-timeStart;
        milis = elapsedTime / 1000000.0;
        System.out.println(+milis+".ms\t");
          
    }
    
    private void BinaryTime()
    {
         //Binary Search
        //Lista Aleatoria    
        lista=ListaAleatoria(1000);
        timeStart = System.nanoTime();
        BusquedaBinaria(lista,600);
        timeEnd = System.nanoTime();      
        elapsedTime = timeEnd-timeStart;
        milis = elapsedTime / 1000000.0;
        System.out.print("Binary Search:\t");
        System.out.print(+milis +".ms\t" );
        //Elementos ordenados
        lista=ListaOrdenada(1000);
        timeStart = System.nanoTime();       
        BusquedaBinaria(lista,500);
        timeEnd = System.nanoTime();      
        elapsedTime = timeEnd-timeStart;
        milis = elapsedTime / 1000000.0;
        System.out.print(+milis+".ms\t");
        //Elementos ordenados inversamente
        lista=ListaInversa(1000);
        timeStart = System.nanoTime();
        BusquedaBinaria(lista,500);      
        timeEnd = System.nanoTime();      
        elapsedTime = timeEnd-timeStart;
        milis = elapsedTime / 1000000.0;
        System.out.print(+milis+".ms\t");
        //Mismos elementos
        lista=ListaIgual(1000);
        timeStart = System.nanoTime(); 
        BusquedaBinaria(lista,500);
        timeEnd = System.nanoTime();      
        elapsedTime = timeEnd-timeStart;
        milis = elapsedTime / 1000000.0;
        System.out.println(+milis+".ms\t");
    
    }
    
    private void SecuentialTime()
    {
         //Secuential Search
        //Lista Aleatoria    
        lista=ListaAleatoria(1000);
        timeStart = System.nanoTime();
        BusquedaSecuencial(lista,600);
        timeEnd = System.nanoTime();      
        elapsedTime = timeEnd-timeStart;
        milis = elapsedTime / 1000000.0;
        System.out.print("Secuential S. :\t");
        System.out.print(+milis +".ms\t" );
        //Elementos ordenados
        lista=ListaOrdenada(1000);
        timeStart = System.nanoTime();       
        BusquedaSecuencial(lista,600);
        timeEnd = System.nanoTime();      
        elapsedTime = timeEnd-timeStart;
        milis = elapsedTime / 1000000.0;
        System.out.print(+milis+".ms\t");
        //Elementos ordenados inversamente
        lista=ListaInversa(1000);
        timeStart = System.nanoTime();
        BusquedaSecuencial(lista,600);     
        timeEnd = System.nanoTime();      
        elapsedTime = timeEnd-timeStart;
        milis = elapsedTime / 1000000.0;
        System.out.print(+milis+".ms\t");
        //Mismos elementos
        lista=ListaIgual(1000);
        timeStart = System.nanoTime(); 
        BusquedaSecuencial(lista,600);
        timeEnd = System.nanoTime();      
        elapsedTime = timeEnd-timeStart;
        milis = elapsedTime / 1000000.0;
        System.out.println(+milis+".ms\t");
        
    
    }

    public int getSwap() {
        return swap;
    }

    public void setSwap(int swap) {
        this.swap = swap;
    }

    
}


    

