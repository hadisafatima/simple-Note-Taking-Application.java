package com.example.noteapp;

public class NoteTakingApp {
    private String title ;
    private String date ;
    private String note ;

    public NoteTakingApp(String t , String d , String n){
        title = t ;
        date = d ;
        note = n ;
    }

    public String getTitle(){ return  title ; }
    public String getDate(){ return date ; }
    public String getNote(){ return note ; }
}
