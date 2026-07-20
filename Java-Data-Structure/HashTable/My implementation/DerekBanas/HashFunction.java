package DerekBanas;

import java.util.Arrays;

public class HashFunction{

    String[] theArray;
    int arraySize;
    int itemsInArray = 0;

    public static void main(String[] args){
        HashFunction theFunc = new HashFunction(30);

//        String[] itemsToAdd = {"1","5","17","21","26"};
//        theFunc.hashFunction(itemsToAdd,theFunc.theArray);

        System.out.println(isPrime(2));

        String[] itemsToAdd2 = {"100", "510", "170", "214", "286", "398", "235",
                                "802", "900", "723", "699", "1", "16", "999", "890",
                                "725", "998", "978", "988", "990", "989", "984",
                                "320", "321", "400", "450", "50", "660", "624"};
        theFunc.hashFunction2(itemsToAdd2,theFunc.theArray);
        theFunc.findKey("899");
        theFunc.findKey("998");
    }

    public void hashFunction(String[] stringsForArray, String[] theArray){
        for (int i = 0; i < stringsForArray.length; i++) {
            String newElementValue = stringsForArray[i];
            theArray[Integer.parseInt(newElementValue)] = newElementValue;
        }
    }

    public void hashFunction2(String[] stringsForArray, String[] theArray){
        for (int i = 0; i < stringsForArray.length; i++) {
           String newElementValue = stringsForArray[i];
           int arrayIndex = Integer.parseInt(newElementValue) % arraySize;
           System.out.println("Modulus index= " + arrayIndex + " for value " + newElementValue);

            while(!theArray[arrayIndex].equals("-1")){
                ++arrayIndex;

                System.out.println("Collision try " + arrayIndex + " Instead");

                arrayIndex %= arraySize;
            }
            theArray[arrayIndex] = newElementValue;

        }
    }

    public String findKey(String key){
        int arrayIndexHash = Integer.parseInt(key) % arraySize;
        while(!theArray[arrayIndexHash].equals("-1")){
            if (theArray[arrayIndexHash].equals(key)){
                System.out.println(key + " was found in index " + arrayIndexHash);
                return theArray[arrayIndexHash];
            }
            arrayIndexHash++;
            arrayIndexHash %= arraySize;
        }
        System.out.println(key + " was not found !! ");
        return null;

    }

    HashFunction(int size){
        arraySize = size;
        theArray = new String[size];
        Arrays.fill(theArray, "-1");
    }

    public static boolean isPrime(int number){
        if(number == 2){
            return true;
        }
        if(number % 2 == 0){
            return false;
        }

        for(int i = 3 ; i*i <= number ; i+=2){
            if (number % i == 0){
                return false;
            }
        }

        return true;
    }
}
