import java.util.Scanner;

public class Binary_search {
    public static void main(String[] args) {
        int[] numbers = new int[100];
        for(int i = 0; i < numbers.length; i++){
            numbers[i] = i + i*i;
        }
        Scanner scan = new Scanner(System.in);
        System.out.println(" введите число от 1 до 9900");
        int value = scan.nextInt();
        int result = search(numbers, value);
        if (result < 0)
            System.out.println("данного числа нет в списке");
        else
            System.out.println("число находится на " +( result + 1) + " позиции в списке");
    }

    public static int search(int[] array, int a) {
        int low = array[0];
        int high = array.length - 1;
        int mid;
        while (low <= high) {
            if ( (low + high) % 2 != 0 ) {
                mid = 1 + (low + high) / 2;
            } else
                mid = (low + high) / 2;
            int guess = array[mid];
            if (guess == a)
                return mid;
            if ( guess < a)
                low = mid + 1;
            else
                high = mid - 1;
        }
        return -1;
    }
}
