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
public class Employee {
    
    private String aName,aSurname,fullName,aDNI;
    private Turn[] aturn = new Turn[7];
 //   private Turn[] aturn;
  //  private Turn turn;
    private int anIndex;
   // private int turnCount;
    
    
    /**
     * Constructor sin parametros
     */
    public Employee()
    {
     //   for(int i=0; i< aturn.length;i++) aturn[i] = new Turn();     
        
    }
    
    /**
     * Constructor con parametros nombre y apellidos
     * @param aName Cadena para especificar el nombre
     * @param aSurname Cadena para especificar el apellido
     */
    public Employee (String aName,String aSurname) {
      this.aName = aName;
      this.aSurname = aSurname;
     // for(int i=0; i< aturn.length;i++) aturn[i] = new Turn();
     aturn[anIndex] = new Turn();
    }
    
    /**
     * Constructor que recibe tres parametros dni,nombre y apellidos
     * @param aDNI parametro para el dni
     * @param aName nombre del empleado
     * @param aSurname  apellidos del empleado
     */
    public Employee (String aDNI,String aName,String aSurname){
        this.aDNI = aDNI ;
        setDNI(aDNI);
        this.aName = aName;
        this.aSurname = aSurname;
      //  for(int i=0; i< aturn.length;i++) aturn[i] = new Turn();
        aturn[anIndex] = new Turn();
    }
    
    /**
     * Método para especificar el nombre
     * @param aName nombre del empleado
     */
    public void setName(String aName) {
        if(aName!=null)this.aName = aName;
        else this.aName=null;
    }
    
    /**
     * Método que devuelve el nombre del empleado
     * @return 
     */
    public String getName(){
        return aName;
    }
    
    /**
     * Método que recibe el apellido del empleado
     * @param aSurname apellidos del empleado
     */
    public void setSurname(String aSurname) {
        this.aSurname = aSurname;
    }
    
    /**
     * Método que devuelve los apellidos del empleado
     * @return 
     */
    public String getSurname() {
        return aSurname;
    }
    
    /**
     * Método que recibe dos valores voleanos si el primero es true devolverá el nombre
     * en mayusculas y si es false en minusculas, el segundo valor es para los apellidos
     * lo devolverá concatenado con una coma entre nombre y apellidos.
     * @param nameInUppercase true para mayusculas y false minusculas
     * @param surnameInUppercase true para mayusculas y false minusculas
     * @return 
     */
    public String getFullName(boolean nameInUppercase,boolean surnameInUppercase){
       if(aName==null)aName="";
       if(aSurname==null)aSurname="";
        
       if (nameInUppercase && surnameInUppercase){
           fullName= aName.toUpperCase() + ", " + aSurname.toUpperCase();    
       }
       else if (!nameInUppercase && surnameInUppercase)
           fullName = aName + ", " + aSurname.toUpperCase();
       else if (!nameInUppercase && !surnameInUppercase)
           fullName = aName + ", " + aSurname;
       else if(nameInUppercase && !surnameInUppercase)
           fullName = aName.toUpperCase() + ", " + aSurname;
       return fullName;
    }
  
    /**
     * Especifica el dni y comprueba que sea valido
     * @param aDNI cadena dni
     */
    public void setDNI (String aDNI){
        if(aDNI==null) aDNI=null;
        else if(aDNI.length()==9)
        {   
            String upDNI= aDNI.toUpperCase();
            String sDNI = upDNI.substring(0,8);
            String lDNI = null;  
            int DNI = Integer.parseInt(sDNI);     
            DNI = DNI % 23;
            switch (DNI)
            {
                case 0:
                    lDNI = "T";
                    break;
                case 1:
                    lDNI = "R";
                    break;
                case 2:
                    lDNI = "W";
                    break;
                case 3:
                    lDNI = "A";
                    break;
                case 4:
                    lDNI = "G";
                    break;
                case 5:
                    lDNI = "M";
                    break;
                case 6:
                    lDNI = "Y";
                    break;
                case 7:
                    lDNI = "F";
                    break;
                case 8:
                    lDNI = "P";
                    break;
                case 9:
                    lDNI = "D";
                    break;
                case 10:
                    lDNI = "X";
                    break;
                case 11:
                    lDNI = "B";
                    break;
                case 12:
                    lDNI = "N";
                    break;
                case 13:
                    lDNI = "J";
                    break;
                case 14:
                    lDNI = "Z";
                    break;
                case 15:
                    lDNI = "S";
                    break;
                case 16:
                    lDNI = "Q";
                    break;
                case 17:
                    lDNI = "V";
                    break;
                case 18:
                    lDNI = "H";
                    break;
                case 19:
                    lDNI = "L";
                    break;
                case 20:
                    lDNI = "C";
                    break;
                case 21:
                    lDNI = "K";
                    break;
                case 22:
                    lDNI = "E";
                    break;
                default:
                    break;
            }
        sDNI = upDNI.substring(8);
        if(lDNI.equals(sDNI)) this.aDNI = upDNI;
        else 
        {
            aDNI=null;
          //  System.out.println("DNI no valido.");
        }  
        }
        else
        aDNI=null;   
    }
    
    /**
     * Devuelve el dni
     * @return 
     */
    public String getDNI() {
        return aDNI;
    }
    
    /**
     * Añade un turno al empleado 
     * @param turn 
     */
    public void addTurn(Turn turn) {
         if(anIndex < aturn.length ) 
        {
                aturn[anIndex] = turn;
                anIndex++;
        
        }
    
    }
    /**
     * Borrará un turno especificando el dia;
     * @param aDay 
     */
    public void removeTurn(String aDay) 
    {
        aDay=aDay.toUpperCase();
        int cont=0;
        for(int i=0; i<anIndex;i++)
       {
           if(aDay.equals(aturn[i].getDay()))
           {
              cont++; 
           }
        }
        
       int borrar=0; 
       for(int j=0; j<cont;j++)
       {
       
           for(int i=0; i<anIndex;i++)
       {
           if(aDay.equals(aturn[i].getDay()))
           {
              borrar=i; 
           }
        }
        for(int i=borrar;i<anIndex;i++)
        {
            if(i==6){
            aturn[i].setDay(null);
            aturn[i].setInitHour(0);
            aturn[i].setFinishHour(0);  
            }
            else{
            aturn[i].setDay(aturn[i+1].getDay());
            aturn[i].setInitHour(aturn[i+1].getInitHour());
            aturn[i].setFinishHour(aturn[i+1].getFinishHour());  
            }
        }
        anIndex--;          
       }       
    }
              
    
    
    /**
     * Devuelve el número de turnos introducidos
     * @return 
     */
    public int getTurnCount() {
        
        return anIndex;
    }
    
    /**
     * Devuelve el turno que especifiquemos
     * @param anIndex indice del array que queremos obtener
     * @return 
     */
    public Turn getTurnAt (int anIndex) {  
        try{
        if(anIndex<this.anIndex){
                this.anIndex = anIndex;         
        }
        }catch(Exception e){
            System.out.println("Error:" +e);
        }
        return aturn[this.anIndex];
            }
        
    
    
    /**
     * Devuleve un array de turnos
     * @return 
     */
    public Turn[] getTurns() { 
        int cont=0;
        Turn[] tempturn;
       for(int a=0;a<aturn.length;a++){
           if(aturn[a]==null)
           {
               if(a==6) aturn[a]=null;            
               else aturn[a]=aturn[a+1];
               anIndex--;      
           }       
           else cont++;
        }
     
           tempturn = new Turn[anIndex];
           for(int q=0;q<tempturn.length;q++){
               tempturn[q]=aturn[q];
           }    
        return tempturn;
    }
    
}
