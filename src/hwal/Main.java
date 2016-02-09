/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hwal;

/**
 *
 * @author lenfer
 */
public class Main {

    /**
     * @param args the command line arguments
     */
            
    public static void main(String[] args) {
        MyArrayList my = new MyArrayList();
        for (int i = 0; i < 8; i++) {
            my.add(i*10);
        }
        System.out.println(my);
        my.set(7, 100500);
        my.add(123);
        my.add(456);
        my.add(789);
        System.out.println(my);
        my.remove(my.getSize() - 1);
        System.out.println(my);
        my.add(200600);
        my.add(300700);
        my.add(400800);
        System.out.println(my);
        for (int i = 0; i < my.getSize(); i++) {
            System.out.println(my.get(i));
        }
        // testing iterator interface
        System.out.println("-----------------");
        for(Object o : my){
            System.out.println(o);
        }
        
    }
    
}
