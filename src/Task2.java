import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;

public class Task2 {
    //Дана строка (получение через обычный текстовый файл!!!)
    //
    //"фамилия":"Иванов","оценка":"5","предмет":"Математика"
//    "фамилия":"Петрова","оценка":"4","предмет":"Информатика"
    //
    //Написать метод(ы), который распарсит строку и, используя StringBuilder, создаст строки вида:
    //Студент [фамилия] получил [оценка] по предмету [предмет].
    //
    //Пример вывода в консоль:
    //Студент Иванов получил 5 по предмету Математика.
    //Студент Петрова получил 4 по предмету Информатика.
    //Студент Краснов получил 5 по предмету Физика.

    public static void main(String[] args)  throws Exception{
        BufferedReader br = new BufferedReader(new FileReader("ForTask2.txt"));
        strParsing(br);

    }

    static void  strParsing ( BufferedReader br)throws Exception {

        String str;
        StringBuilder str2 = new StringBuilder();
        ArrayList<String> list = new ArrayList<>();
        while ((str = br.readLine()) != null) {
            String arr[] = list.toArray(str.split("\""));
            for (String item : arr) {
            }
            str2.append("Студент " + arr[3] + " получил " + arr[7] + " по предмету " + arr[11] + ".\n");
        }
        System.out.println(str2);
    }
}

