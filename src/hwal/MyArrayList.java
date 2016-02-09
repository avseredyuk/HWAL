/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hwal;

import java.util.Arrays;
import java.util.Iterator;

/**
 *
 * @author lenfer
 */
public class MyArrayList implements Iterable{
    private Object[] array = new Object[10];
    private int size = 0;
    
    private boolean isLast(int index){
        return (size == array.length);
    }
    
    private boolean isIndexInRange(int index){
        return (index < size);
    }
    
    private boolean isArrayIsFull(){
        return (size >= array.length);
    }
    
    private void reallocArray(){
        Object tempArray[] = new Object[(int)(array.length * 1.5) + 1];
        System.arraycopy(array, 0, tempArray, 0, array.length);
        array = tempArray;
    }
        
    public void add(Object o){
        if(isArrayIsFull()){
            reallocArray();
        }
        array[size++] = o;
    }
    
    public Object get(int index){
        if (isIndexInRange(index)){
            return array[index];
        } else {
            // throw
            return null;
        }
    }
    
    public void set(int index, Object o){
        if (isIndexInRange(index)){
            array[index] = o;
        } else {
            // throw
        }
    }
    
    public void remove(int index){
        if (isIndexInRange(index)){
            if(!isLast(index)){
                System.arraycopy(array, index + 1, array, index, size - index);
            }
            size--;
        } else {
            // throw
        }
    }
    
    @Override
    public Iterator iterator() {
        Iterator it = new Iterator(){
            private int index = 0;
            
            @Override
            public boolean hasNext() {
                return (index < size);
            }

            @Override
            public Object next() {
                return array[index++];
            }
        };
        return it;
    }
    
    public int getSize() {
        return size;
    }
    
    @Override
    public String toString() {
        return "MyArrayList{" + Arrays.toString(Arrays.copyOf(array, size)) + '}';
    }
    
    
}
