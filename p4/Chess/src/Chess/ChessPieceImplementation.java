package Chess;

public  class  ChessPieceImplementation implements ChessPiece {

    Color col;
    Type typ;
    int movida=0;
    PiecePosition[] positions = new PiecePosition[8*8];
    PiecePosition[] pos = new PiecePosition[8*8];
    
    
    public ChessPieceImplementation(Color color, Type type) {
        col=color;
        typ=type;
        
    }
    
    @Override
    public Color getColor() {
        return col;
       // throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Type getType() {
        return typ;
        }
    
    
    @Override
    public void setType(Type tip){
        typ=tip;
    }

    @Override
    public void notifyMoved() {
     //   throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    movida=1; //Si la pieza ha sido movida se pondrá la variable a 1 para saverlo
    }

    @Override
    public boolean wasMoved() {
        if(movida==1)
       return true;
        else return false;
   
    }

    @Override
    public PiecePosition[] getAvailablePositions(ChessBoard aBoard) {
        
     if(this.typ==ChessPiece.Type.BISHOP){
        pos=  ChessMovementManager.getAvailablePositionsOfBishop(this,aBoard);
     } 
     else if(this.typ==ChessPiece.Type.PAWN){
        pos=  ChessMovementManager.getAvailablePositionsOfPawn(this,aBoard);
     }  
     else if(this.typ==ChessPiece.Type.KNIGHT){
        pos=  ChessMovementManager.getAvailablePositionsOfKnight(this,aBoard);
     }
     else if(this.typ==ChessPiece.Type.ROOK){
        pos=  ChessMovementManager.getAvailablePositionsOfRook(this,aBoard);
     } 
     else if(this.typ==ChessPiece.Type.QUEEN){
        pos=  ChessMovementManager.getAvailablePositionsOfQueen(this,aBoard);
     }
     else if(this.typ==ChessPiece.Type.KING){
        pos=  ChessMovementManager.getAvailablePositionsOfKing(this,aBoard);
     }  
    				
        return pos;
    }

    
}