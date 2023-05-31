package edu.qa.automation;

public class Prjct implements Comparable {

    public int wheels;
    public String color = "Blue";
    Prjct(int wheels){
       this.wheels = wheels;
    }
    static void printSome(String text){
        System.out.println(text);
    }
    public void snowInfo(){
        System.out.println( wheels + color);
    }

    public static void main(String[] args) {

        Prjct obj = new Prjct(4);
        System.out.println(obj.wheels);
        obj.snowInfo();
        Prjct.printSome("Say hello to the bitches");
    }


    @Override
    public int compareTo(Object o) {
        return 0;
    }
}

