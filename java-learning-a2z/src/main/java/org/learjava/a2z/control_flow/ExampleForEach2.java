package org.learjava.a2z.control_flow;

import java.util.List;

public class ExampleForEach2 {
    public static void main(String[] args) {
        List<String> fruitsList = List.of("Apple","Banana","Grape","Orange");
        for(String fruit : fruitsList){
            System.out.println("I am eating :: "+fruit);
        }
    }
}
