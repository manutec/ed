package tresenraya;

/**
 * Esta es una version del tres en raya. La diferencia con el juego original es 
 * que el tablero empieza ya con todas las fichas en el tablero y mueven las rojas.
 * Las fichas se representan con una R las rojas, con una B las blancas, y con 
 * una V la casilla vacía
 * El tablero empieza así:
 * R  V  B
 * B  R  V
 * R  V  B
 */
class NoughtsAndCrossesBoardImplementation implements NoughtsAndCrossesBoard {
    Color[][] tablero = new Color[3][3]; //Creamos un array bidimensional para el tablero
    
    
    NoughtsAndCrossesBoardImplementation(){ //Constructor vacio que inicializa el tablero
        tablero[0][0] = Color.RED;
        tablero[1][0] = Color.VOID;
        tablero[2][0] = Color.WHITE;
        tablero[0][1] = Color.WHITE;
        tablero[1][1] = Color.RED;
        tablero[2][1] = Color.VOID;
        tablero[0][2] = Color.RED;
        tablero[1][2] = Color.VOID;
        tablero[2][2] = Color.WHITE;    
    
    }
    @Override
    public boolean isGameOver() {   //Comprueba el metodo comprobar para ver si hay linea 
        boolean game= false;
        if(Comprobar("RED"))game=true;
        else if(Comprobar("WHITE")) game=true;
        else game=false;
        return game;
      
    }

    @Override
    public boolean movePiece(int fromX, int fromY, int toX, int toY) {  //Mueve pieza si el hueco esta vacio
        boolean ret = false;
        String tab;
        if(getPieceAt(toX,toY)==Color.VOID)
        { 
            tablero[toX][toY]=getPieceAt(fromX,fromY);
            tablero[fromX][fromY]=Color.VOID;          
            ret=true ;
        }

     return ret;
        }

    @Override   //Devuelve el color de la pieza seleccionada
    public Color getPieceAt(int x, int y) {
        Color color=null;
        if(x>=0 && x<=2 && y>=0 && y<=2)
        {
            String col= tablero[x][y].toString();
            if(col=="RED")color= Color.RED;
            else if(col=="WHITE") color= Color.WHITE;
            else color= Color.VOID;
                    
        } 
        return color;
    }

    @Override   //Devuelve true si la pieza se puede mover
    public boolean canMovePieceAt(int x, int y) {
        boolean si= true;
        if(getPieceAt(x,y)==Color.VOID)si= false;
       
        return si;
           }
  
    
private boolean Comprobar(String color){ //Comprueba si hay linea segun el color introducido en el string 
    boolean game= false;
    if(color.equals(tablero[0][0].toString()) && color.equals(tablero[1][0].toString()) && color.equals(tablero[2][0].toString())) game=true;
    else if(color.equals(tablero[0][1].toString()) && color.equals(tablero[1][1].toString()) && color.equals(tablero[2][1].toString())) game=true;
    else if(color.equals(tablero[0][2].toString()) && color.equals(tablero[1][2].toString()) && color.equals(tablero[2][2].toString())) game=true;
    else if(color.equals(tablero[0][0].toString()) && color.equals(tablero[0][1].toString()) && color.equals(tablero[0][2].toString())) game=true;
    else if(color.equals(tablero[1][0].toString()) && color.equals(tablero[1][1].toString()) && color.equals(tablero[1][2].toString())) game=true;
    else if(color.equals(tablero[2][0].toString()) && color.equals(tablero[2][1].toString()) && color.equals(tablero[2][2].toString())) game=true;
    else if(color.equals(tablero[0][0].toString()) && color.equals(tablero[1][1].toString()) && color.equals(tablero[2][2].toString())) game=true;
    else if(color.equals(tablero[2][0].toString()) && color.equals(tablero[1][1].toString()) && color.equals(tablero[0][2].toString())) game=true;
    else game=false;  
        return game;
}
    
}

 