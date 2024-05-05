class program1 {
    public static void main(String[] args) {
        int[] a = {1, 2, 3, 4, 5};
        try{
            int element = a[10];
            System.out.println("Element at index 10: " + element);
        }catch (ArrayIndexOutOfBoundsException e)
        {
            System.out.println("Error: Array index is out of bounds!");
        }
    }    
}


