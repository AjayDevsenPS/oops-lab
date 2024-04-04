import java.util.Scanner;

class array {
    Scanner s = new Scanner(System.in);
    String[] arr;
    int size;

    array() {
        System.out.println("Enter the size of the array:");
        size = s.nextInt();
        s.nextLine();
        arr = new String[size];

        System.out.println("Enter the elements of the string array:");
        for (int i = 0; i < size; i++) {
            arr[i] = s.nextLine();
        }
    }

    void search() {
        System.out.println("Enter the item to be searched:");
        String str = s.nextLine();
        boolean found = false;
        for (int i = 0; i < size; i++) {
            if (arr[i].equals(str)) {
                System.out.println("The string is found within the array.");
                found = true;
                break;
            }
        }
        if (!found) {
            System.out.println("The string was not found.");
        }
    }

    void sort() {
        String temp;
        for (int i = 0; i < size; i++) {
            for (int j = i + 1; j < size; j++) {
                if (arr[j].compareTo(arr[i]) < 0) {
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
	System.out.println("The sorted array is:");
        for (int i = 0; i < size; i++)
            System.out.println(arr[i]);
    }
}

public class arraydemo {
    public static void main(String[] args) {
        array a1 = new array();
        a1.search();
        a1.sort();
    }
}

