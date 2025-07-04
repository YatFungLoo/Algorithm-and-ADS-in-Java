class array {
    public static void main(String argc[]) {
        // array literal
        int[] array = new int[]{1, 2, 3, 4, 5};
        int array_size = array.length;

        for (int i = 0; i < array_size; i++) {
            System.out.print(array[i]);
        }
    }
}