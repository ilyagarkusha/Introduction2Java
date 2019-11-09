package com.sda.basic;

import java.util.ArrayList;
import java.util.List;

public class Factors {
     static void factorsOf (int val) {

        List<Integer> factors  = new ArrayList<Integer>();
        for(int i=1; i <= val; i++)
        {
            if(val % i == 0)
            {
                factors.add(i);
            }
        }

        boolean x = false;
        for(int i = 0; i < factors.size(); i++){
            if (factors.get(i) == 3) {
                System.out.print("Pling");
                x = true;
            }
            else if (factors.get(i) == 5) {
                System.out.print("Plang");
                x = true;
            }
            else if (factors.get(i) == 7) {
                System.out.print("Plong");
                x = true;
            }



        }
        if (x == false) System.out.println(val);



    }
}
