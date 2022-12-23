package Homework.JAVA_HW6;

import java.io.*;
import java.util.*;
import java.util.Map.Entry;

public class Java_HW6_Example001 {

    private static void clearConsole() throws IOException, InterruptedException {
        new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor(); // Очистка консоли

    }

    static String searchData(TreeMap<String, String> listLepTop, String textWelcome) {

        System.out.println(textWelcome);
        String text1 = "Будем осуществлять выбор, y - да, любой другой символ и, или Enter нет: ";
        String choice = inString(text1);
        Map<Integer, String> mapTemp = new TreeMap<>();
        if (choice.equals("y")) {

            int tempIndex1 = 0;

            for (Entry<String, String> entry : listLepTop.entrySet()) {

                mapTemp.put(tempIndex1, entry.getValue());
                System.out.printf("%d - %s\n", tempIndex1, entry.getKey());
                tempIndex1++;

            }
            int getManu = inIntMinMax("Введите цифру выбора: ", 0, tempIndex1 - 1);
            // mapTemp.clear();
            return mapTemp.get(getManu);
        } else {
            StringBuilder builder = new StringBuilder();
            for (Map.Entry<String, String> entry : listLepTop.entrySet()) {

                builder.append(entry.getValue() + " ");
            }
            return builder.toString();
        }

    }

    static String searchDataFloat(TreeMap<Float, String> listLepTop, String textWelcome) {

        System.out.println(textWelcome);
        String text1 = "Будем осуществлять выбор, y - да, любой другой символ и, или Enter нет: ";
        String choice = inString(text1);
        if (choice.equals("y")) {

            String text2 = "Введите минимальное значение для поиска: ";
            Float getMaMinDF = inFloat(text2);
            StringBuilder builder = new StringBuilder();

            for (Map.Entry<Float, String> entry : listLepTop.entrySet()) {

                if (entry.getKey() >= getMaMinDF) {
                    builder.append(entry.getValue() + " ");
                }

            }

            return builder.toString();
        } else {
            StringBuilder builder = new StringBuilder();
            for (Map.Entry<Float, String> entry : listLepTop.entrySet()) {

                builder.append(entry.getValue() + " ");
            }
            return builder.toString();
        }

    }

    static String inString(String text) // Ввод данных в формате String
    {
        System.out.print(text);
        Scanner scanner = new Scanner(System.in, "cp866");
        String data = scanner.nextLine();
        // scanner.close();
        return data;
    }

    static int inInt(String text) // Ввод числа в формате Int
    {
        System.out.print(text);
        while (true) {
            try {
                Scanner scanner = new Scanner(System.in, "cp866");
                int data = scanner.nextInt();
                scanner.close();
                return data;
            } catch (Exception e) {
                System.out.println("Число введено неправильно, введите его заново: ");
                continue;
            }
        }

    }

    static int inIntMax(String text, int max) // Ввод числа в формате Int, больше максимального
    {
        System.out.print(text);
        while (true) {
            try {
                Scanner scanner = new Scanner(System.in, "cp866");
                int data = scanner.nextInt();
                if (data > max) {
                    System.out.print("Введённое число больше максимального,"
                            + "введите число заново: ");
                    continue;
                }
                scanner.close();
                return data;
            } catch (Exception e) {
                System.out.print("Число введено неправильно, введите его заново: ");
                continue;
            }
        }

    }

    static int inIntMinMax(String text, int min, int max) // Ввод числа в формате Int, больше максимального
    {
        System.out.print(text);
        while (true) {
            try {
                Scanner scanner = new Scanner(System.in, "cp866");
                int data = scanner.nextInt();
                if (data > max) {
                    System.out.print("Введённое число больше максимального,"
                            + "введите число заново: ");
                    continue;
                } else if (data < min) {
                    System.out.print("Введённое число меньше минимального,"
                            + "введите число заново: ");
                    continue;
                }
                // scanner.close();
                return data;
            } catch (Exception e) {
                System.out.print("Число введено неправильно, введите его заново: ");
                continue;
            }
        }

    }

    static Float inFloat(String text) // Ввод числа в формате Int
    {
        System.out.print(text);
        while (true) {
            try {
                Scanner scanner = new Scanner(System.in, "cp866");
                Float data = scanner.nextFloat();
                // scanner.close();
                return data;
            } catch (Exception e) {
                System.out.println("Число введено неправильно, введите его заново: ");
                continue;
            }
        }

    }

    private static void breaking(List<LaptopBase> listArray) {
        List<LaptopBase> newListArray = new ArrayList<>();
        TreeMap<Integer, LaptopBase> listLepTop = new TreeMap<>();
        TreeMap<String, String> manufacturerTM = new TreeMap<>();
        TreeMap<String, String> operatingSystemTM = new TreeMap<>();
        TreeMap<Float, String> rAMTM = new TreeMap<>(); // Нет
        TreeMap<Float, String> hDDTM = new TreeMap<>(); // нет
        TreeMap<String, String> processorTM = new TreeMap<>();// Yes
        TreeMap<String, String> videoCardTM = new TreeMap<>(); // Yes
        TreeMap<String, String> colorTM = new TreeMap<>(); // Yes

        newListArray.addAll(listArray);

        int i = 0;
        // Разбитие на MAP

        for (LaptopBase DB : newListArray) {

            listLepTop.put(i, DB);
            if (manufacturerTM.containsKey(DB.getManufacturer()) == false) {
                manufacturerTM.put(DB.getManufacturer(), Integer.toString(i));
            } else {
                manufacturerTM.put(DB.getManufacturer(),
                        manufacturerTM.get(DB.getManufacturer()) + " " + Integer.toString(i));
            }

            if (operatingSystemTM.containsKey(DB.getOperatingSystem()) == false) {
                operatingSystemTM.put(DB.getOperatingSystem(), Integer.toString(i));
            } else {
                operatingSystemTM.put(DB.getOperatingSystem(),
                        operatingSystemTM.get(DB.getOperatingSystem()) + " " + Integer.toString(i));
            }

            if (processorTM.containsKey(DB.getProcessor()) == false) {
                processorTM.put(DB.getProcessor(), Integer.toString(i));
            } else {
                processorTM.put(DB.getProcessor(),
                        processorTM.get(DB.getProcessor()) + " " + Integer.toString(i));
            }

            if (videoCardTM.containsKey(DB.getVideoCard()) == false) {
                videoCardTM.put(DB.getVideoCard(), Integer.toString(i));
            } else {
                videoCardTM.put(DB.getVideoCard(),
                        videoCardTM.get(DB.getVideoCard()) + " " + Integer.toString(i));
            }

            if (colorTM.containsKey(DB.getColor()) == false) {
                colorTM.put(DB.getColor(), Integer.toString(i));
            } else {
                colorTM.put(DB.getColor(),
                        colorTM.get(DB.getColor()) + " " + Integer.toString(i));
            }

            if (rAMTM.containsKey(DB.getRAM()) == false) {
                rAMTM.put(DB.getRAM(), Integer.toString(i));
            } else {
                rAMTM.put(DB.getRAM(),
                        rAMTM.get(DB.getRAM()) + " " + Integer.toString(i));
            }

            if (hDDTM.containsKey(DB.getHDD()) == false) {
                hDDTM.put(DB.getHDD(), Integer.toString(i));
            } else {
                hDDTM.put(DB.getHDD(),
                        hDDTM.get(DB.getHDD()) + " " + Integer.toString(i));
            }

            i++;
        }
        // Система запросов
        ArrayList<String> sorArrList = new ArrayList<>();

        sorArrList.add(searchDataFloat(rAMTM, "Введите минимальное объём оперативной памяти в ГБ:"));
        sorArrList.add(searchDataFloat(hDDTM, "Введите минимальное объём жёсткого диска в ГБ:"));
        sorArrList.add(searchData(manufacturerTM, "Выбор производителя ноутбука:"));
        sorArrList.add(searchData(operatingSystemTM, "Выбор операционной системы: "));
        sorArrList.add(searchData(processorTM, "Выбор процессора: "));
        sorArrList.add(searchData(videoCardTM, "Выбор видеокарты: "));
        sorArrList.add(searchData(colorTM, "Выбор цвета: "));
        // Выбор подходящих под запрос ноутбуков
        Set<Integer> setTemp1 = new HashSet<>();
        Set<Integer> setTemp2 = new HashSet<>();
        Integer index = 0;
        for (String data : sorArrList) {
            String[] tempData = data.split(" ");
            if (index == 0) {
                for (int j = 0; j < tempData.length; j++) {
                    setTemp1.add(Integer.parseInt(tempData[j]));
                }

            } else if (index == 1) {
                for (int j = 0; j < tempData.length; j++) {
                    setTemp2.add(Integer.parseInt(tempData[j]));
                }
                setTemp1.retainAll(setTemp2);

            } else {
                setTemp2.clear();
                for (int j = 0; j < tempData.length; j++) {
                    setTemp2.add(Integer.parseInt(tempData[j]));
                }
                setTemp1.retainAll(setTemp2);

            }
            index++;
        }

        // Вывод в консоль подходящих под запрос ноутбуков с их характеристиками.

        for (Integer key : setTemp1) {

            System.out.println(listLepTop.get(key));
        }

    }

    public static void main(String[] args) throws IOException, InterruptedException {
        clearConsole();

        List<LaptopBase> listLaptop = new ArrayList<>();

        LaptopBase laptop_1 = new LaptopBase(
                "HP",
                "HP 250 G7",
                "Windows 10",
                4,
                250,
                "Intel Celeron N4020",
                "Intel UHD Graphics 600",
                "Серый");
        listLaptop.add(laptop_1);

        LaptopBase laptop_2 = new LaptopBase(
                "Lenovo", // "Lenovo"
                "IdeaPad 3 15ADA05",
                "Windows 7",
                8,
                1000,
                "AMD Athlon Silver 3050U",
                "AMD Radeon Graphics",
                "Чёрный");
        listLaptop.add(laptop_2);

        LaptopBase laptop_3 = new LaptopBase(
                "ASUS",
                "Laptop 14 F415MA-EK582W",
                "Windows 11",
                4,
                128,
                "Intel Celeron N4020",
                "Нет",
                "Чёрный");
        listLaptop.add(laptop_3);

        LaptopBase laptop_4 = new LaptopBase(
                "MSI",
                "MSI Modern 15 B12M-209RU",
                "Windows 11",
                16,
                512,
                "Intel Core i5-1235U",
                "Intel Iris Xe Graphics",
                "Чёрный");
        listLaptop.add(laptop_4);

        LaptopBase laptop_5 = new LaptopBase(
                "Lenovo",
                "Lenovo IdeaPad 3 15ALC6",
                "Без ОС",
                8,
                512,
                "AMD Ryzen 5 5500U",
                "AMD Radeon Graphics",
                "Красный");
        listLaptop.add(laptop_5);

        LaptopBase laptop_6 = new LaptopBase(
                "Apple",
                "Apple MacBook Air",
                "macOS",
                8,
                256,
                "Apple M1",
                "Apple M1 7-core",
                "Серый");
        listLaptop.add(laptop_6);

        LaptopBase laptop_7 = new LaptopBase(
                "ASUS",
                "ASUS VivoBook S14 S433EA-EB449T",
                "Windows 10",
                16,
                512,
                "Intel Core i7-1165G7",
                "Intel Iris Xe Graphics",
                "Серый");
        listLaptop.add(laptop_7);

        breaking(listLaptop);

    }
}
