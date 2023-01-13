class ArrayIndexOutOfBound
{
    public static void main(String args[])
    {
        try{
            int a[] = new int[6];
            a[7] =10; 
        }
        catch(ArrayIndexOutOfBoundsException e){
            System.out.println ("Pemanggilan Tidak Valid");
        }
    }
}