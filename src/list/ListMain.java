package list;

import list.core.GBList;
import list.core.impl.GBLinkedList;

public class ListMain {
    public static void main(String[] args) {
//        GBList<Integer> list = new GBArrayList<>();
//        list.add(3);
//        list.add(5);
//        list.add(6);
//        list.addFirst(0);
//        System.out.println(list);
//        System.out.println(list.get(1));
//        list.remove(2);
//        System.out.println(list);
//        System.out.println(list.size());

         GBList<Integer> lnkd = new GBLinkedList<>();
         lnkd.add(1);
         lnkd.add(2);
         lnkd.add(3);
         lnkd.add(4);
         lnkd.add(5);
         lnkd.add(6);
        System.out.println("Показыаем заполненный список: ");
        System.out.println(lnkd);
        System.out.println("Удаляем 5 элемент: ");
        lnkd.remove(5);

        System.out.println(lnkd);
        System.out.println("Удаляем элемент с индексом 1: ");
        lnkd.remove(1);
        System.out.println(lnkd);
        System.out.println("Размер списка: ");
        System.out.println(lnkd.size());
        lnkd.addFirst(-1);
        lnkd.addFirst(10);
        lnkd.addFirst(0);
        System.out.println("Добавляем несколько элементов с начала: ");
        System.out.println(lnkd);
        System.out.println("2 элемент: ");
        System.out.println(lnkd.get(2));
        System.out.println("5 элемент: ");
        System.out.println(lnkd.get(5));
        System.out.println("Итерация: ");



        for(Integer item: lnkd){
            System.out.println(item + " попугай");
        }

    }
}
