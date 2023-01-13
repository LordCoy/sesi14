class  NumberFormat
{
    public static void main(String args[])
    {
        try {
            // "akki" is not a number
            int num = Integer.parseInt ("test") ;
 
            System.out.println(num);
        } catch(NumberFormatException e) {
            System.out.println("Bukan format Nomer");
        }
    }
}