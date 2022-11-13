import java.util.*;
import java.util.Scanner;

public class Garbage {

    public String temp = "dsfadfgdfadsgsdfgasg";
    int[] i = new int[1000];

    public static void main(String[] args) {

        Runtime r = Runtime.getRuntime();

        long memoryBeforeObjectCreation= r.freeMemory();

        Garbage g = new Garbage();

        long memoryAfterObjectCreation = r.freeMemory();

        g = null;

        long memoryAfterObjectSetToNull = r.freeMemory();

        r.gc();

        long memoryAfterGarbageCollection = r.freeMemory();

        System.out.println("Memory before object creation: " + memoryBeforeObjectCreation);
        System.out.println("Memory after object creation: " + memoryAfterObjectCreation);
        System.out.println("Memory after object set to null: " + memoryAfterObjectSetToNull);
        System.out.println("Memory after garbage collection: " + memoryAfterGarbageCollection);
    }
} {
    
}
