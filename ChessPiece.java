public class ChessPiece{
    private int vPos;
    private int hPos;
    private String pieceColor;
    private String pieceType;
    private String piecePosition;
    private char hPosChar;

    public void setPosition(int x, int y){
        vPos = x;
        hPos = y;
        switch(hPos){
            case 1:
            hPosChar = 'a';
            break;
            case 2:
            hPosChar = 'b';
            break;
            case 3:
            hPosChar = 'c';
            break;
            case 4:
            hPosChar = 'd';
            break;
            case 5:
            hPosChar = 'e';
            break;
            case 6:
            hPosChar = 'f';
            break;
            case 7:
            hPosChar = 'g';
            break;
            case 8:
            hPosChar = 'h';
            break;
        }
    }
    public String getPosition(){
        String piecePosition = (hPosChar + "" + vPos);
        return piecePosition;
    }
    public void setColor(String color){
        pieceColor = color;
    }
    public String getColor(){
        return pieceColor;
    }
    public void setPieceType(String name){
        pieceType = name;
    }
    public String getPieceType(){
        return pieceType;
    }

    public String printInfo(){
        return "This piece is a " + getColor() + " " + getPieceType() + " at " + getPosition();
    }
}

