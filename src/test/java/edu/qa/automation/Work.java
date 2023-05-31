package edu.qa.automation;

public class Work {
    public static void main(String[] args) {
        String s = "ABCCBA1111";
        s = s.toUpperCase().replaceAll("[^a-zA-Z]", "");
        String reverse = "";

        for(int i = s.length()-1;i >=0; i--){
            reverse += s.charAt(i);
        }
        if(reverse.equals(s)){
            System.out.println("Is palindrome");
        } else{
            System.out.println("Not a palindrome");
        }


    }
}
