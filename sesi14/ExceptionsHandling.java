public class ExceptionsHandling{
    public static void main(String[] args) {
        try{
            int[] myNumbers = {1,2,3,4};
            System.out.println(myNumbers[10]);     
        } catch (Exception e){
            System.out.println("Something When Wrong.");
        } finally{
            System.out.println("Print Finally.");
        }
    }
}
