//package org.example.entities;
//
////import lombok.AllArgsConstructor;
//import lombok.AllArgsConstructor;
//import lombok.Data;
//
//@Data
//@AllArgsConstructor
//public  class Person {
//    private String name;
//}

package org.example.entities;

import lombok.Getter;

@Getter
public class Person {
    private String name;

    public Person(String name) {
        this.name = name;
    }

}

