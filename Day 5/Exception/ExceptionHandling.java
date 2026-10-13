package Exception;

public class ExceptionHandling {
    public static void main(String[] args){
        int a = 10;
        int b = 0;
        try{
            System.out.println(a/b);
        }
        catch (ArithmeticException e){
            System.out.println(e.getMessage());
        }
        finally{
            System.out.println("Finally Block");
        }
    }
}
