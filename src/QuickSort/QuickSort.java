package QuickSort;

public class QuickSort {
    static int x = 0;
    public static void quickSort(int[] list){
        quickSort(list , 0 , list.length -1 );
    }

    private static void quickSort(int[] list, int first, int last) {

        if (last > first){
            int pivotIndex = partion(list , first , last);
            System.out.println("İlk");
            quickSort(list , first , pivotIndex - 1);
            System.out.println("İki");

            quickSort(list , pivotIndex + 1 , last);
        }
        else {
            System.out.println("First " + first + "Last " + last);
        }
    }


    private static int partion(int[] list, int first, int last) {
        int pivot = list[first];
        int low = first + 1;
        int high = last;

        while(high > low){
            while (low <= high && list[low] <= pivot)
                low++;
            while (low <= high && list[high] > pivot)
                high--;
            if (high > low){
                int temp = list[high];
                list[high] = list[low];
                list[low] = temp;
            }
        }
        while(high > first && list[high] >= pivot)
            high--;
        if (pivot > list[high]){


            list[first] = list[high];
            list[high] = pivot;

            System.out.println(high);
            Show(list);
            return  high;
        }
        else{
            System.out.println(first);
            Show(list);
            return first;
        }

}

    private static void Show(int[] list) {
        for (int i = 0 ; i < list.length;i++){
            System.out.print(list[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args){
        /*int [] list = {2 , 3 , 2 , 5 , 6 , 1 , -2 , 3 , 14 , 12};
        quickSort(list);

        for ( int i = 0 ; i < list.length; i++)
            System.out.print(list[i] + " " );*/

        int [] list2 = {5 , 2 , 9 , 3 , 8 , 4 , 0 , 1 , 6 , 7};
        System.out.println();
        quickSort(list2);

        for ( int i = 0 ; i < list2.length; i++)
            System.out.print(list2[i] + " " );
    }
}
