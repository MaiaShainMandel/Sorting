import java.util.*;
import javax.swing.*;

public class Example {
    public int getNextGap(int gap) {
        gap = (gap*10)/13;
        if (gap < 1)
            gap = 1;
        return gap;
    }

    public void printArrayAllCoolAndStuff(int[] arr, int i, int gap) {
        System.out.println(Arrays.toString(arr));
        System.out.print(" ");
        for (int j = 0; j < arr.length; j++) {
            if (j==i) {
                System.out.print("|");
                for (int k = 0; k < Integer.toString(arr[j]).length()+1; k++)
                    System.out.print("_");
            }
            else if (j==i+gap) {
                System.out.print("|");
                break;
            }
            else if (j>i) {
                for (int k = 0; k < Integer.toString(arr[j]).length() + 2; k++)
                    System.out.print("_");
            }
            else
                for (int k = 0; k < Integer.toString(arr[j]).length() + 2; k++)
                    System.out.print(" ");
        }
        System.out.println();
    }

    public void printArrayAllCoolAndStuff(String[] arr, int i, int gap) {
        System.out.println(Arrays.toString(arr));
        System.out.print(" ");
        for (int j = 0; j < arr.length; j++) {
            if (j==i) {
                System.out.print("|");
                for (int k = 0; k < arr[j].length()+1; k++)
                    System.out.print("_");
            }
            else if (j==i+gap) {
                System.out.print("|");
                break;
            }
            else if (j>i) {
                for (int k = 0; k < arr[j].length() + 2; k++)
                    System.out.print("_");
            }
            else
                for (int k = 0; k < arr[j].length() + 2; k++)
                    System.out.print(" ");
        }
        System.out.println();
    }

    public void sort(int arr[]) {
        int gap = arr.length;
        boolean swapped = true;

        while(gap != 1 || swapped) {
            gap = getNextGap(gap);
            swapped = false;

            for (int i = 0; i < arr.length-gap; i++) {
                if (arr[i] > arr[i+gap]) {
                    printArrayAllCoolAndStuff(arr, i, gap);
                    int tmp = arr[i];
                    arr[i] = arr[i+gap];
                    arr[i+gap] = tmp;
                    swapped = true;
                }
            }
        }
    }

    public void sort(String arr[]) {
        int gap = arr.length;
        boolean swapped = true;

        while(gap != 1 || swapped) {
            gap = getNextGap(gap);
            swapped = false;

            for (int i = 0; i < arr.length-gap; i++) {
                if (arr[i].compareTo(arr[i+gap]) > 0) {
                    printArrayAllCoolAndStuff(arr, i, gap);
                    String tmp = arr[i];
                    arr[i] = arr[i+gap];
                    arr[i+gap] = tmp;
                    swapped = true;
                }
            }
        }
    }

    public void sort(ArrayList<Integer> arr) {
        int gap = arr.size();
        boolean swapped = true;

        while(gap != 1 || swapped) {
            gap = getNextGap(gap);
            swapped = false;

            for (int i = 0; i < arr.size()-gap; i++) {
                if (arr.get(i) > arr.get(i+gap)) {
                    int tmp = arr.get(i);
                    //arr[i] = arr[i+gap];
                    arr.set(i, arr.get(i+gap));
                    //arr[i+gap] = tmp;
                    arr.set(i+gap, tmp);
                    swapped = true;
                }
            }
        }
    }

    public void sort(ArrayList<String> arr, boolean b) {
        int gap = arr.size();
        boolean swapped = true;

        while(gap != 1 || swapped) {
            gap = getNextGap(gap);
            swapped = false;

            for (int i = 0; i < arr.size()-gap; i++) {
                if (arr.get(i).compareTo(arr.get(i+gap)) > 0) {
                    String tmp = arr.get(i);
                    //arr[i] = arr[i+gap];
                    arr.set(i, arr.get(i+gap));
                    //arr[i+gap] = tmp;
                    arr.set(i+gap, tmp);
                    swapped = true;
                }
            }
        }
    }

    public static void main(String[] args) {
        Example e= new Example();

        System.out.println("int Array:");
        int[] arr = {5, -4, 62, 6, -5, 0, 10, 3, -45, 123};
        e.sort(arr);
        System.out.println(Arrays.toString(arr));
        System.out.println();

        System.out.println("String Array:");
        String[] arr2 = {"John", "Freddy", "Brian", "Roger", "Josh", "Megan", "Maia", "Maya"};
        e.sort(arr2);
        System.out.println(Arrays.toString(arr2));
        System.out.println();
    }
}
