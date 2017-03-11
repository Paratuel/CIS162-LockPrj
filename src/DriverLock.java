//package week1;

/**
 * Write a description of class DriverLocik here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */

import javax.swing.*;

public class DriverLock {

    public static void main(String[] args) {
        Lock myLock1 = new Lock("345");
        Lock myLock2 = new Lock();


        myLock1.enterCode("123");
        if (myLock1.isUnlock())
            System.out.println("Yes my lock 1");
        else
            System.out.println("No my lock 1");


        myLock2.enterCode("123");
        if (myLock2.isUnlock())
            System.out.println("Yes my lock 2");
        else
            System.out.println("No my lock 2");

        myLock2.enterCode("145");
        if (myLock2.isUnlock())
            System.out.println("Yes my lock 2");
        else
            System.out.println("No my lock 2");

        myLock1.enterCode("345");
        if (myLock1.isUnlock())
            System.out.println("Yes my lock 1");
        else
            System.out.println("No my lock 1");

        Lock.setMasterCode("888");
        myLock1.enterCode("999");
        if (myLock1.isUnlock())
            System.out.println("Yes my lock 1");
        else
            System.out.println("No my lock 1");

        myLock2.enterCode("999");
        if (myLock2.isUnlock())
            System.out.println("Yes my lock 2");
        else
            System.out.println("No my lock 2");


        if (myLock1.equals(myLock2))
            System.out.println("Yes they are equal");
        else
            System.out.println("No they are not equal");

    }


}
