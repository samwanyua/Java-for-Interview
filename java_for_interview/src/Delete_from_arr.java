public class Delete_from_arr {
    /* Delete an element from an array */
    public static void main(String[] args) {
        int[] originalArray = {2, 4, 5, 6, 7, 8, 9};
        int elementToRemove = 5;

        int[] newArray = remove(originalArray, elementToRemove);

        // Print the new array
        for (int num : newArray) {
            System.out.print(num + " ");
        }
    }

    public static int[] remove(int[] array, int element) {
        int[] newArray = new int[array.length - 1];

        int index = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] != element) {
                newArray[index] = array[i];
                index++;
            }
        }
        return newArray;
    }
}
