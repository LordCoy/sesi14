class StringIndexOutOfBound
{
    public static void main(String args[])
    {
        try {
            String a = "Fakhriyal Riyandi Yasin "; 
            char c = a.charAt(29); 
            System.out.println(c);
        }
        catch(StringIndexOutOfBoundsException e) {
            System.out.println("Tidak dapat melakukan pemanggilan");
        }
    }
}