package cz.davsoncze;

import java.util.*;
import java.util.stream.Collectors;

public class SP_VIISimple {
    private static Random rnd =  new Random(); //chybi razeni
    private final String[] sortBy = {"ascending", "descending"}; // chybi dodělat

    public static void GeneratedHashSet(int size){
        Set<Integer> hashPool = new HashSet<Integer>();
        long start = System.currentTimeMillis();
        for (int i = 0; i < size; i++) {
            hashPool.add(rnd.nextInt());
        }
        long finish = System.currentTimeMillis();
        long duration = finish - start;

        double avg = 0;
        for (Integer el : hashPool) {
            avg += el;
        }
        avg /= hashPool.size();

        hashPool.stream().collect(Collectors.toCollection(TreeSet::new)).forEach(el -> System.out.println(el)); //musim seradit HashMap + maze duplicity
        System.out.println("PRINT DATA FROM HASHSET (" + duration +" ms)");
        System.out.println("-------------------------------");
        System.out.println("Průměr: " + avg);
    }

    public static void GeneratedTreeSet(int size){
        Set<Integer> treePool =  new TreeSet<Integer>();
        long start = System.currentTimeMillis();
        for (int i = 0; i < size; i++) {
            treePool.add(rnd.nextInt());
        }

        long finish = System.currentTimeMillis();
        long duration = finish - start;

        double avg = 0;
        for (Integer el : treePool) {
            avg += el;
        }
        avg /= treePool.size();

        treePool.forEach( el -> System.out.println(el)); //radi se automaticky TreeSet  + maze duplicity
        System.out.println("# PRINT DATA FROM TREESET (" + duration +" ms)");
        System.out.println("# -------------------------------");
        System.out.println("# Průměr: " + avg);
    }

    public static void GeneratedArrayList(int Size){
        List<Integer> arrayPool =  new ArrayList<Integer>();
        long start = System.currentTimeMillis();
        for (int i = 0; i < Size; i++) {
            arrayPool.add(rnd.nextInt());
        }
        long finish = System.currentTimeMillis();
        long duration = finish - start;

        double avg = 0;
        for (Integer el : arrayPool) {
            avg += el;
        }
        avg /= arrayPool.size();

        Collections.sort(arrayPool);
        arrayPool.forEach( el -> System.out.println(el));   //neradi se sam ArrayList  + nemaze duplicity
        System.out.println("# PRINT DATA FROM ARRAYLIST (" + duration +" ms)");
        System.out.println("# -------------------------------");
        System.out.println("# Průměr: " + avg);
    }

    public static void GeneratedLinkedList(int size){
        List<Integer> linkedPool =  new LinkedList<Integer>();
        long start = System.currentTimeMillis();
        for (int i = 0; i < size; i++) {
            linkedPool.add(rnd.nextInt());
        }
        long finish = System.currentTimeMillis();
        long duration = finish - start;

        double avg = 0;
        for (Integer el : linkedPool) {
            avg += el;
        }
        avg /= linkedPool.size();

        Collections.sort(linkedPool);
        linkedPool.forEach( el -> System.out.println(el)); //neradi se sam LinkedList + nemaze duplicity
        System.out.println("# PRINT DATA FROM lINKlIST (" + duration +" ms)");
        System.out.println("# -------------------------------");
        System.out.println("# Průměr: " + avg);
    }
}
