package Task3.sweetGift;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

/**
 * Формируется сладкий подарок.
 * - Он может включать в себя разные сладости (Candy, Jellybean, etc.)
 * - У каждой сладости есть название, вес, цена и свой уникальный параметр
 * - Необходимо собрать подарок из сладостей
 * - Найти общий вес подарка, общую стоимость подарка
 * - Вывести на консоль информацию о всех сладостях в подарке
 */

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<Sweets> sweets = new ArrayList<>();
        boolean making = true;
        int totalPrice = 0;
        int totalWeight = 0;
        int count = 0;

        Candy inspiration = new Candy("Конфеты \"Вдохновение\"", 257, 240,
                "С миндальным кремом и целым миндалем");
        Candy dovePromises = new Candy("Конфеты \"Dove promises\"", 269, 118,
                "Внутри находится небольшое послание с приятными словами");
        Jellybean jellybean = new Jellybean("Мармеладные бобы \"Jellybean\"", 55, 75,
                "Ассорти желейных бобов из вселенной Гарри-Поттера");

        System.out.println("Нажмите соответствующую цифру, чтобы добавить сладость в подарок:");
        System.out.printf("'1' - %s\n", inspiration.getName());
        System.out.printf("'2' - %s\n", dovePromises.getName());
        System.out.printf("'3' - %s\n", jellybean.getName());
        System.out.println("'4' - закончить выбор");

        while (making) {
            String choice = reader.readLine();

            switch (choice) {
                case "1":
                    sweets.add(inspiration);
                    totalPrice += inspiration.getPrice();
                    totalWeight += inspiration.getWeight();
                    System.out.printf("%s добавлены в подарок\n", inspiration.getName());
                    break;
                case "2":
                    sweets.add(dovePromises);
                    totalPrice += dovePromises.getPrice();
                    totalWeight += dovePromises.getWeight();
                    System.out.printf("%s добавлены в подарок\n", dovePromises.getName());
                    break;
                case "3":
                    sweets.add(jellybean);
                    totalPrice += jellybean.getPrice();
                    totalWeight += jellybean.getWeight();
                    System.out.printf("%s добавлены в подарок\n", jellybean.getName());
                    break;
                case "4":
                    making = false;
                    break;
            }
        }
        reader.close();

        System.out.println("\nВ подарок были добавлены сладости:");
        for (Sweets sweet : sweets) {
            count++;
            System.out.printf("%d. %s - %s\n", count, sweet.getName(), sweet.getUniqueParameter());
        }

        System.out.printf("\nОбщий вес подарка: %s гр.\nОбщая цена подарка: %s руб.", totalWeight, totalPrice);
    }
}
