import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Task1 {

    //Реализуйте алгоритм сортировки пузырьком числового массива (введён вами),
    //результат после каждой итерации запишите в лог-файл.
    public static void main(String[] args) {

        File file = new File("Log.txt");
        StringBuilder sb = new StringBuilder();
        int[] arr = new int[]{134, 23, 0, 62, 452, 67, 68};
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = arr.length - 1; j > i; j--) {
                if (arr[j - 1] > arr[j]) {
                    int tmp = arr[j - 1];
                    arr[j - 1] = arr[j];
                    arr[j] = tmp;
                }
                for (int item : arr) {
                    sb.append(item + " ");
                }

                try {
                    FileWriter fr = new FileWriter(file, true);
                    fr.append(sb + "\n");
                    fr.close();
                    sb.delete(0, sb.length());
                } catch (IOException e) {
                    System.out.println("ERROR  ");
                }
            }
        }
        for (int item : arr) {
            System.out.printf("%d ", item);
        }
    }
}
