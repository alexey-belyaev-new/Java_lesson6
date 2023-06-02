package org.example;

import java.util.ArrayList;
import java.util.Map;
import java.util.Scanner;

public class InitShop {
    private Scanner sc = new Scanner(System.in);
    public void show() {
        //getShop();
        System.out.println(getShop());
        System.out.println("Введите цифру, соответствующую необходимому критерию:\n" +
                "1 - ОЗУ\n" +
                "2 - Объем ЖД\n" +
                "3 - Операционная система\n" +
                "4 - Цвет  ");
        String choice = sc.nextLine();
        System.out.println("Введите значение критерия: ");
        String volume = sc.nextLine();
        System.out.println(find(choice,volume,getShop()));
    }

    public static ArrayList<Laptop> getShop() {
        ArrayList<Laptop> listL = new ArrayList<>();
        listL.add(new Laptop(8, 512, "Windows", "black"));
        listL.add(new Laptop(16, 512, "Windows", "white"));
        listL.add(new Laptop(16, 256, "Windows", "black"));
        listL.add(new Laptop(8, 128, "Linux", "black"));
        listL.add(new Laptop(4, 256, "linux", "red"));
        return listL;
    }

    public static ArrayList<Laptop> find(String choice, String volume, ArrayList<Laptop> list) {
        ArrayList<Laptop> findList = new ArrayList<>();
        switch (choice) {
            case "1":
                for (int i = 0; i < list.size(); i++) {
                    if (list.get(i).getRAM() >= Integer.parseInt(volume)) {
                        findList.add(list.get(i));
                    }
                }
                break;
            case "2":
                for (int i = 0; i < list.size(); i++) {
                    if (list.get(i).getCapacityDisk() >= Integer.parseInt(volume)) {
                        findList.add(list.get(i));
                    }
                }
                break;
            case "3":
                for (int i = 0; i < list.size(); i++) {
                    if(list.get(i).getOperSystem().equals(volume)){
                        findList.add(list.get(i));
                    }
                }
                break;
            case "4":
                for (int i = 0; i < list.size(); i++) {
                    if(list.get(i).getColor().equals(volume)){
                        findList.add(list.get(i));
                    }
                }
                break;
            default:
                System.out.println("Введено неверное значение");
        }
        return findList;
    }
}
