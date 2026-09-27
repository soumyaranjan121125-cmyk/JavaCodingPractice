package basics;

//Create a Java program demonstrating four type conversions:

//Convert int to double (widening).

//Convert char to int (widening).

//Convert double to int (narrowing).

//Convert int to byte (narrowing).

public class TypeCasting {
    public static void main(String[] args){
        int score = 100;
        char ch = 'A';
        double amt = 1000.50;
        int id = 50;

        double updateScore = score;
        int updateCh = ch;
        int updateAmt =(int) amt;
        byte updateId = (byte)id;

        System.out.println("After converting from int to double " + updateScore );
        System.out.println("After converting from char to int " + updateCh );
        System.out.println("After converting from double to int " + updateAmt );
        System.out.println("After converting from int to byte " + updateId );
    }
}
