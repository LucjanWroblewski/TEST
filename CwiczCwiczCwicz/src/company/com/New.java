package company.com;

public class New {
    public static void main(String[] args) {
        String m1 = new String("Swieci slonko");
        String m2 = new String("wieje wiaterek");
        String m3 = new String("nie ma deszczu");

        System.out.println(m1);
        System.out.println(m2);
        System.out.println(m3);
        int allSigns = (m1.length() + m2.length() + m3.length());
        System.out.println(allSigns);
    }

}
