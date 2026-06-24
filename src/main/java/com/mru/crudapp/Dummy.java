package com.mru.crudapp;

import java.util.ArrayList;
import java.util.List;

public class Dummy {
    

    public static void main(String[] args) {
        System.out.println("Hello World");


        int[] arr = new int[10];

        Trainer trainer = new Trainer();
        Trainer t1 = new Trainer();

        MRU mru = new MRU();

        List<Trainer> list = new ArrayList<>();
        list.add(trainer);
        // list.add(t1);
        // list.add(mru);

        // list.add(mru);
        // list.add(t1);


    }
}


class Trainer{

}

class MRU{

}
