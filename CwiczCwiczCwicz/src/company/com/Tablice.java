package company.com;

public class Tablice {
    public static void main(String[] args) {
        int[] arrayOne= new int[]{-30,5};
        int a =arrayOne[0] + arrayOne[1];
        System.out.println(a);

        int[] arrayTwo = new int[] {1,56,32,5};
        int max = arrayTwo[0];
        for (int i = 1; i < arrayTwo.length ; i++) {
            if (arrayTwo[i]>max){
            max = arrayTwo[i];}
            }
        System.out.println(max);
        
        

    }
}
