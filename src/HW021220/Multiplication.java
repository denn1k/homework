package HW021220;

public class Multiplication {
    public static void main(String[] args) {
        int i,j;
        for(i=1; i<10; i++)
        {
            System.out.printf("%2d |", i);
            for(j=1; j<6; j++)
                System.out.printf("%2d ", i*j);
            System.out.println("\n");
        }

    }




}
