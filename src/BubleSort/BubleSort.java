package BubleSort;

import java.util.Arrays;

public class BubleSort {
    private int[] data = null;

    public BubleSort(int[] data2) {
        data = new int[data2.length];

        for (int i = 0  ; i < data2.length ; i++){
           this.data[i] = data2[i];
        }
    }

    public void Sort(){
        for (int k = 1 ; k < data.length ; k++){
            for (int i = 0; i < data.length - k ; i++ ){
                if (data[i] > data[i + 1]){
                    swap(i,i+1);
                }
            }
        }
    }

    private void swap(int i, int i1) {
        int tmp = data[i];
        data[i] = data[i1];
        data[i1] = tmp;
    }

    @Override
    public String toString() {
        return "BubleSort{" +
                "data=" + Arrays.toString(data) +
                '}';
    }
}
