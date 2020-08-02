package com.hongdroid.viewpagerexample.MyWritings_recycler;

public class MyWritingsData {

    private String title, content, date, writer;

    public MyWritingsData(String title, String content, String date, String writer) {
        this.title = title;
        this.content = content;
        this.date = date;
        this.writer = writer;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getWriter() {
        return writer;
    }

    public void setWriter(String writer) {
        this.writer = writer;
    }
}
