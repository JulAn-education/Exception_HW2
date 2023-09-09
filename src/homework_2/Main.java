package homework_2;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;

public class Main {


    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Введите данные через пробел в формате: " +
                "Фамилия Имя Отчество, Дата рождения: дд.мм.гггг, номер телефона, пол: f/m");

        String info = sc.nextLine();
        String[] array = info.split(" ");
        System.out.println(Arrays.toString(array));

        try {

            arrayCount(array);
            fileWriter(array, info);

        } catch(Exception e){
            System.out.println(e.getMessage());
        }
    }


    public static void arrayCount(String[] array){
        int count = 6;
        try {
            if (array.length < count) {
                throw new CountElementException("Не все данные заполнены. Попробуйте снова.", count);
            }
            System.out.printf("Все данные заполнены верно. Количество элементов %d", count);
        } catch (Exception e){
            System.out.println(e.getMessage());
        }
    }

    public static void fileWriter(String[] array, String info){

        if (array.length == 6) {
            File file = new File(array[0] + ".txt");
            try (BufferedWriter bf = new BufferedWriter(new FileWriter(file, true))) {
                bf.write(info);
                bf.newLine();
                bf.flush();

            } catch (IOException e) {
                System.out.println(e.getMessage());

            }
        }
    }
}