package company.com;
//
//For building the encrypted string:
//Take every 2nd char from the string, then the other chars, that are not every 2nd char, and concat them as new String.
//Do this n times!

public class Codewars {
    public static void main(String[] args) {
        String a = "Fikuiku labradory";
        char c = a.charAt(1);
        System.out.println(c);

    }
}