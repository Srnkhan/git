package BubleSort;

public class BubleSortTest {
    public static void main(String[] args){
        int[] x = {2, 9, 5, 4, 8, 1};

        BubleSort data = new BubleSort(x);
        System.out.println(data.toString());
        data.Sort();
        System.out.println(data.toString());

    }
}
