import java.util.Random;

public class NetproLabMember {
    public static void main(String[] args) {
        final int years = 15;
        final int colms = 3;
        final int DendaiAllNumber = 0;
        final int DendaiWomanNumber = 1;
        final int IwaiLabNumber = 2;
        int [][] DendaiNumbers = new int[years][colms];
        for(int i = 0; i < DendaiNumbers.length; i ++) {
            Random random = new Random();
            DendaiNumbers[i][DendaiAllNumber] = 100 + random.nextInt(21);
            DendaiNumbers[i][DendaiWomanNumber] = (DendaiNumbers[i][DendaiAllNumber] * (20 + i)) / 100;
            DendaiNumbers[i][IwaiLabNumber] = 7 + random.nextInt(7);
        }
        for(int i = 0; i < DendaiNumbers.length; i ++) {
            System.out.println((i+1) + "年目");
            System.out.println("学生総数:" + DendaiNumbers[i][DendaiAllNumber]);
            System.out.println("女子総数:" + DendaiNumbers[i][DendaiWomanNumber]);
            System.out.println("研究室配属人数:" + DendaiNumbers[i][IwaiLabNumber]);
        }
        double probability = 1;
    }

    public double Combi(int A, int B) {
        double result = 0;
        for(int i = 1; i <= B; i ++) {
            
        }
        return result;
    }
}
