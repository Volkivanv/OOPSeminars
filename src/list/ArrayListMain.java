package list;

import list.core.GBList;
import list.core.impl.GBArrayList;
import list.core.impl.GBLinkedList;

import java.util.Iterator;

public class ArrayListMain {
    public static void main(String[] args) {
        GBList<Integer> list = new GBArrayList<>();
        list.add(3);
        list.add(5);
        list.add(6);
        list.addFirst(0);
        System.out.println(list);
        System.out.println(list.get(1));
        list.remove(2);
        System.out.println(list);
        System.out.println(list.size());

         GBList<Integer> lnkd = new GBLinkedList<>();
         lnkd.add(1);
         lnkd.add(2);
         lnkd.add(3);
         lnkd.add(4);
         lnkd.add(5);
         lnkd.add(6);
        System.out.println(lnkd);
        lnkd.remove(5);
        System.out.println(lnkd);
        System.out.println(lnkd.size());
        System.out.println(lnkd.get(2));

        lnkd.addFirst(0);

        for(Integer item: lnkd){
            System.out.println(item + " |");
        }

    }
}
