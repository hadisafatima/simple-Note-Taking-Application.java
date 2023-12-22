package com.example.noteapp;

import java.util.Scanner;

public class MainMethodOfNoteConsoleApp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        NotesManagement notesManagement = new NotesManagement();

        System.out.println("DO you want type a note? (y/n)");
        String ans = sc.nextLine();

        do {

            while (ans.equalsIgnoreCase("y")) {
                System.out.print("Enter \"TITLE\" for your note: ");
//            sc.next();
                String title = sc.nextLine();
                System.out.print("\nEnter date: ");
                String date = sc.nextLine();
                System.out.print("\nEnter note: ");
//                sc.nextLine();
                String note = sc.nextLine();
                NoteTakingApp note1 = new NoteTakingApp(title, date, note);
                notesManagement.addNotes(note1);

                System.out.println("\n\nDo you want to add another note? (y/n)");
                ans = sc.nextLine();

                if (ans.equalsIgnoreCase("n")) {
                    break;
                } else if (!ans.equalsIgnoreCase("y") && !ans.equalsIgnoreCase("n")) {
                    System.out.println("Provide either \"y\" or \"n\"");
                    ans = sc.nextLine();
//                break;
                } else if (ans.equalsIgnoreCase("y")) {
                    continue;
                }

            } // inner while ends

            if (!ans.equalsIgnoreCase("y") && !ans.equalsIgnoreCase("n")) {
                System.out.println("Provide either \"y\" or \"n\"");
                ans = sc.nextLine();
            }

            if (ans.equalsIgnoreCase("n")) {
                System.out.println(" ");
                break;
            }

        } while (ans.equalsIgnoreCase("y"));

        if (notesManagement.allNotes.size() > 0) {
            notesManagement.printNote();
        }
    }
}
