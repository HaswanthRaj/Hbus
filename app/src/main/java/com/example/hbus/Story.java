package com.example.hbus;

public class Story {

    public String title, story, userid,date,language;
    public int likes, views;

    public Story(){

    }

    public Story(String title, String story, String userid,String date) {
        this.title = title;
        this.story = story;
        this.userid = userid;
        this.date = date;
    }

    public String getTitle() {
        return title;
    }




}
