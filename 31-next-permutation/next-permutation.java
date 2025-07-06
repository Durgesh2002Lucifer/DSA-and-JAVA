class Solution {
    public void nextPermutation(int[] arr) {
        int n = arr.length;
        int gola_index = -1;  

        for (int i = n - 1; i > 0; i--) {
            if (arr[i - 1] < arr[i]) {
                gola_index = i - 1;   
                break;
            }
        }

        int swap_index = gola_index;
        if (gola_index != -1) {
            for (int i = n - 1; i >= gola_index + 1; i--) {
                if (arr[i] > arr[gola_index]) {
                    swap_index = i;
                    break;
                }
            }
            int temp = arr[gola_index];
            arr[gola_index] = arr[swap_index];
            arr[swap_index] = temp;
        }
        reverse(arr, gola_index + 1, n - 1);
    }

    void reverse(int arr[], int i, int j) {
        while (i < j) {
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;

            i++;
            j--;
        }
    }
}