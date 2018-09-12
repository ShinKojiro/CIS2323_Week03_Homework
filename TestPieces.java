public class TestPieces{
    public static void main(String[] args){
        System.out.println("This will be a pawn.");
        ChessPiece pawn1 = new ChessPiece();
        ChessPiece knight1 = new ChessPiece();

        pawn1.setColor("White");
        pawn1.setPieceType("Pawn");
        pawn1.setPosition(2, 1);

        System.out.println(pawn1.printInfo());
        
        System.out.println("This will be a knight.");
        knight1.setColor("White");
        knight1.setPieceType("Knight");
        knight1.setPosition(1, 2);

        System.out.println(knight1.printInfo());
    }
}