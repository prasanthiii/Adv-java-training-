public class number {
    static void number(int num){
        if(num>0)
        System.out.println("num + is a positive number");
        else if(num<0)
        System.out.println("num + is a negative number");
        else
        System.out.println("num + is zero");
    }
    public static void main(String args[]) {
        int num1=3;
        int num2=-4;
        int num3=0;
        int num4=9;
        // invoke function
        number(num1);
        number(num2);
        number(num3);
        number(num4);
    }
}
        
        