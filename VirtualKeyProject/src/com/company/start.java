package com.company;

import java.io.*;
import java.lang.reflect.Array;
import java.util.Scanner;

public class start {
    public static void menu() {


        Scanner scan = new Scanner(System.in);
        System.out.println("Main menu:");
        System.out.println("Press 1 to view files in the main folder");
        System.out.println("Press 2 to Edit files in the main folder");
        System.out.println("Press 3 to exit the program");
        boolean flag = true;
        while (flag) {
            File ob = new File("KeyFolder");
            ob.mkdir();
            File array[] = ob.listFiles();
            int switchValue1 = scan.nextInt();
            switch (switchValue1) {
                case 1:
                    for (int i = 0; i < array.length; i++) {
                        System.out.println(array[i]);
                    }
                    break;
                case 2:
                    System.out.println("File editing menu: ");
                    System.out.println("Press 1 to ADD file ");
                    System.out.println("Press 2 to DELETE a file ");
                    System.out.println("Press 3 to SEARCH for a file ");
                    System.out.println("Press 4 to return to the main menu ");
                    System.out.println("Press 5 to exit the program");
                    boolean flag2 = true;
                    while (flag2) {
                        File array2[];
                        int switchValue2 = scan.nextInt();
                        Scanner scan2 = new Scanner(System.in);
                        switch (switchValue2) {
                            case 1:
                                System.out.println("Please enter the name of the new File you want to add: ");
                                String newName = scan2.nextLine();
                                File folder = new File("KeyFolder\\"+newName);
                                folder.mkdirs();
                                System.out.println("Press 0 to see menu options");
                                break;
                            case 2:
                                System.out.println("Please enter the name of the file you want to delete: ");
                                String name = scan2.nextLine();
                                File delete = new File("KeyFolder\\"+name);
                                for (int i = 0; i < array.length; i++) {
                                    if (array[i].getName().startsWith(name)) {
                                        delete.delete();
                                    }
                                    else {
                                        System.out.println("File not found");
                                    }
                                }
                                System.out.println("Press 0 to see menu options");
                                break;
                            case 3:
                                System.out.println("Please enter the name of the file: ");
                                String name2 = scan2.nextLine();
                                for (int i = 0; i < array.length; i++) {
                                    if (array[i].getName().startsWith(name2)) {
                                        System.out.println(array[i]);
                                    }
                                    else {
                                        System.out.println("File not found");
                                    }
                                }
                                System.out.println("Press 0 to see menu options");
                                break;
                            case 4:
                                System.out.println("Returning to main menu");
                                flag2 = false;
                                System.out.println("Main menu:");
                                System.out.println("Press 1 to view files in the main folder");
                                System.out.println("Press 2 to Edit files in the main folder");
                                System.out.println("Press 3 to exit the program");
                                break;
                            case 5:
                                System.out.println("Exiting program");
                                flag = false;
                                flag2 = false;
                                break;
                            case 6: case 0:
                                System.out.println("File editing menu: ");
                                System.out.println("Press 1 to ADD file ");
                                System.out.println("Press 2 to DELETE a file ");
                                System.out.println("Press 2 to SEARCH for a file ");
                                System.out.println("Press 4 to return to the main menu ");
                                System.out.println("Press 5 to exit the program");
                                break;
                            default:
                                System.out.println("Please select a valid option");
                                break;
                        }
                    }
                    break;

                case 3:
                    System.out.println("Exiting Program");
                    flag = false;
                    break;

                default:
                    System.out.println("Please enter a valid option");
                    break;
            }
        }
    }
}
