/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package operaciones;

import java.util.Arrays;

/**
 *
 * @author rmmedina
 */
public class MetodosOrdenamientos {
    
    public void OrdenarInserSortArreglos(int[] array){
        System.out.println("\nInicio ordenamiento InserSort Arreglos\n");
        for (int outer = 1; outer < array.length; outer++) {
            for (int inner = 0; inner < outer; inner++) {
                System.out.println(Arrays.toString(array));
                if (array[outer] < array[inner]) {
                    int element = array[outer];
                    for (int i = outer; i > inner; i--) {
                        array[i] = array[i - 1];
                    }
                    array[inner] = element;
                }
            }
        }
        System.out.println("\nSalida ordenado InserSort Arreglos:\n"+Arrays.toString(array)+"\n");
    }
    
    public int[] OrdenarQuickSortArreglos(int[] array){
        if (array.length < 2) {
            return array;
        }
        
        int chosenIndex = array.length - 1;
        int chosen = array[chosenIndex];
        int[] a = new int[chosenIndex];
        int[] b = new int[chosenIndex];
        int aIndex = 0;
        int bIndex = 0;

        for (int i = 0; i < chosenIndex; i++) {
            int temp = array[i];
            if (temp < chosen) {
                a[aIndex++] = temp;
            } else {
                b[bIndex++] = temp;
            }
        }

        int[] aSorted = Arrays.copyOf(OrdenarQuickSortArreglos(Arrays.copyOf(a, aIndex)), aIndex);
        int[] bSorted = Arrays.copyOf(OrdenarQuickSortArreglos(Arrays.copyOf(b, bIndex)), bIndex);

        int[] output = new int[array.length];
        System.arraycopy(aSorted, 0, output, 0, aSorted.length);
        output[aSorted.length] = chosen;
        System.arraycopy(bSorted, 0, output, aSorted.length + 1, bSorted.length);
        
        System.out.println("\nSalida ordenado QuickSort Arreglos:\n"+Arrays.toString(output)+"\n");
        return output;
    }
    
    public void BucketSort(int m){
        
    }
    
}
