public class secondlast  {
    public static void main(String args[]) {
        System.out.println (secondlastdigit(6575));
    }
        public static int secondlastdigit( int a)
        {
             a=(a/10)%10;
             return a;
        }
}