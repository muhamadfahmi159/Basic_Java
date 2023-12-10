package com.javaprogram;

public class Runner {
    public static void main(String[] args) {
//        constructor
        //Class1 class1 = new Class1(9, "Gavi", "Barcelona");

        //
        Class1 class1 = new Class1();
        class1.setName("Neymar");
        class1.setNumber(10);
        class1.setClub("Barcelona");
        System.out.println(class1.getName());
        System.out.println(class1.getNumber());
        System.out.println(class1.getClub());

        Child child = new Child();
        Parent parent = new Parent();
        //child bisa memanggil function dari parent
        System.out.println(child.parentName());
        //child bisa memanggil function milik sendiri
        System.out.println(child.namaAnak());
        //parent bisa memanggil functionnya sendiri
        System.out.println(parent.umurAyah());
    }
}
