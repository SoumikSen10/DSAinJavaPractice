package datastructures.hashtable;

public class Main
{
    public static void main(String[] args)
    {
        HashTable myHashTable=new HashTable();

        myHashTable.set("nails",100);
        myHashTable.set("tile",50);
        myHashTable.set("lumber",80);
        myHashTable.set("bolts",200);
        myHashTable.set("screws",140);
        myHashTable.printTable();

        System.out.println(myHashTable.get("lumber"));
        System.out.println(myHashTable.get("bolts"));

        System.out.println("All the keys in the hashtable are: "+myHashTable.keys());
    }
}

/*
Time Complexity
Getting an item:O(1)
Setting an item:O(1)
 */