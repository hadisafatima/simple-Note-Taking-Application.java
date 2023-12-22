package com.example.noteapp;

import java.util.ArrayList;
import java.util.Scanner;

public class NotesManagement {
    ArrayList<NoteTakingApp> allNotes = new ArrayList<>() ;

    public void addNotes(NoteTakingApp notes){
        allNotes.add(notes) ;
    }

    public void displayNotes(){
        System.out.println("\n\n");
        for (int i=0 ; i<allNotes.size() ; i++){
            System.out.println((i+1) + ") " + "\t\t\t\t\tTitle: " + allNotes.get(i).getTitle() + "\t\t\t\tDate: "
                    + allNotes.get(i).getDate());
            System.out.println("-----------------------------------------------------------------------------");
        }
        System.out.println("\n\n");
    }

    public void printNote(){
//        displayNotes();
        Scanner sc = new Scanner(System.in);
        System.out.println("\n\nDo you want to access note? (y/n)");
        String ans = sc.next();

        do {

            while (ans.equalsIgnoreCase("y")){

                displayNotes();
                System.out.print("Enter the note number that you want to access: ");

                byte noteNum = sc.nextByte(); //2
                for (int i = 0; i < allNotes.size(); i++) {
                    if(noteNum-1 == i && noteNum >= 1 && noteNum <= allNotes.size() ){
                        System.out.println("\n\n\nTitle: " + allNotes.get(i).getTitle().toUpperCase() +
                                "\t\t\t\t\tDate: " + allNotes.get(i).getDate());
                        System.out.println("\n" + allNotes.get(i).getNote() + "\n\n\n");
                    } else if (noteNum < 1 || noteNum > allNotes.size()) {
                        System.out.println("Provide correct note number ! ! !\n\n\n");
                    }
                } // for loop ends

                System.out.println("Do you want access another Note? (y/n)");
                ans = sc.next() ;

                if (ans.equalsIgnoreCase("n")) {
                    System.out.println("THANK YOU FOR VISITING THE APP");;
                } else if (!ans.equalsIgnoreCase("y") && !ans.equalsIgnoreCase("n")) {
                    System.out.println("Provide either \"y\" or \"n\" !!");
                    ans = sc.next() ;
                }

            }  //while ends

        } while (ans.equalsIgnoreCase("y")); // do while loop ends


    } // printNote() ends
} // NotesManagement class ends

