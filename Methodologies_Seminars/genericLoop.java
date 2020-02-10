public class genericLoop {

    public static void main(String[] args) {
        int[] arr = new int[10];
        arr[1] = 5;
        // System.out.println();
        getMaxLength(arr);
    }

    private static int getMaxLength(int[] arr) {
        int index = 0;
        int max = 1;
        while (index < arr.length) {
            nextIndex = getNextIndex(arr, index);
            int length = nextIndex - index;
            if (length > max) {
                max = length;
            }
            index = nextIndex;
        }
        return max;
    }   
    private static int getNextIndex(int[] arr, int i) {
        while (i < arr.length -1 && arr[i] > arr[i + 1]) {
            i++;
        }
        return i;
    }
}