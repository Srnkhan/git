package MergeSort;

public class MergeSort {



    public static void mergeSort(int[] list ){
        if (list.length > 1){
            int[] firstHalf = new int[list.length / 2];
            System.arraycopy(list , 0 , firstHalf , 0 , list.length / 2);

            mergeSort(firstHalf);
            System.out.println("firstHalf:");
            show(firstHalf);
            int secondHalfLength = list.length - list.length/2;
            int[] secondHalf = new int[secondHalfLength];
            System.arraycopy(list,list.length/2,secondHalf , 0 , secondHalfLength);
            mergeSort(secondHalf);
            System.out.println("secondHalf:");
            show(secondHalf);
            int[] temp = merge(firstHalf , secondHalf);
            System.out.println("Result");
            show(temp);
            System.arraycopy(temp , 0 , list , 0 , temp.length);
        }
    }
    public static void show(int[] list){
        for (int i = 0 ; i < list.length; i++){
            System.out.print(list[i] + " ");

        }
        System.out.println("");
    }
    private static int[] merge(int[] list1 , int[] list2){
        int[] temp = new int[list1.length + list2.length];
        int current1 = 0 ;
        int curren2 = 0;
        int current3 = 0;
        while (current1 < list1.length && curren2 <list2.length){
            if (list1[current1] < list2[curren2]){
                temp[current3++] = list1[current1++];
            }
            else {
                temp[current3++] = list2[curren2++];
            }
        }
        while (current1 < list1.length){
            temp[current3++] = list1[current1++];
        }
        while (curren2 < list2.length){
            temp[current3++] = list2[curren2++];
        }
        return temp;
    }
    public static void main(String[] args){
        int[] x = {2 , 3 , 2 , 5 , 6 , 1 , -2 , 3 , 14 , 12};
        MergeSort.mergeSort(x);
        for (int i = 0 ; i < x.length;i++){
            System.out.print(x[i] + " ");
        }
    }
}
