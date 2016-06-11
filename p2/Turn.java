/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package crewmanagement;

/**
 *
 * @author Manu
 */
public class Turn {
    
    private String aDay;
    private int aInitHour,aFinishHour;
    
    /**
     * Constructor sin parametros de la clase Turn
     */
    public Turn() {
        aDay ="";
        aInitHour =0;
        aFinishHour=0;
    }
    
    /**
     * Constructor de la clase Turn con parametro dia de turno
     * @param aDay Cadena que especifica el dia del turno y lo convierte en mayusculas
     */
    public Turn(String aDay) {
        this.aDay = aDay.toUpperCase();
    }
    
     
    /**
     * Constructor de la clase Turn que recibe tres parametros, el dia la hora de inicio y la hora de fin
     * @param aDay Cadena para especificar el dia del turno
     * @param aInitHour Especifica la hora de inicio del turno
     * @param aFinishHour  Especifica la hora del fin del turno
     */
    public Turn(String aDay, int aInitHour, int aFinishHour){
        try
        {
            setDay(aDay);
          //  this.aDay = aDay.toUpperCase();
          setInitHour(aInitHour);
          setFinishHour(aFinishHour);
         //   if((aInitHour>=0) && (aInitHour<=23)) this.aInitHour = aInitHour;
         //       else System.out.println("Por favor, introduzca una hora de inicio valida en formato 24h.");
         //   if((aFinishHour>=0) && (aFinishHour<=23)) this.aFinishHour = aFinishHour;
          //      else System.out.println("Por favor, introduzca una hora de fin valida en formato 24h.");
        }
        catch(Exception e){
            System.out.println("Error:" + e);
        }
    }
    
    
     
      
    /**
     * Método para especificar el dia  
     * @param aDay  Cadena dia que lo convierte en mayusculas
     */
    public void setDay(String aDay) {
        if(aDay==null || aDay=="") this.aDay=null;
        else this.aDay = aDay.toUpperCase();
    }
    
    
    /**
     * Metodo que devuelve el dia
     * @return 
     */
    public String getDay() {
       return aDay; 
    }
    
    /**
     * Metodo para especificar la hora de inicio.
     * @param aInitHour Parametro tendrá que estar en formato 24 horas.
     */
    public void setInitHour(int aInitHour) {
       if((aInitHour>=0) && (aInitHour<=23)) this.aInitHour = aInitHour;
       
    }
    
    
    /**
     * Devuelve la hora de inicio
     * @return 
     */
    public int getInitHour() {
        return aInitHour;
    }
    
    
    /**
     * Método para especificar la hora de fin de turno
     * @param aFinishHour Parametro usado para especificar la hora en forato 24 horas 
     */
    public void setFinishHour(int aFinishHour) {
        if((aFinishHour>=0) && (aFinishHour<=23)) this.aFinishHour = aFinishHour;
     
   
    }
    
      
    /**
     * Método que devuelve la hora de fin de turno.
     * @return 
     */
    public int getFinishHour() {
        return aFinishHour;
    }
}
