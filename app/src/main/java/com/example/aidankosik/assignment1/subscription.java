package com.example.aidankosik.assignment1;

/**
 * Created by aidankosik on 2018-01-11.
 */

public class subscription {
    private String title;
    private String cost;
    private String comments;
    private String date;

    public subscription(String c_title, String c_cost, String c_comments, String c_date) {
        title = c_title;
        cost = c_cost;
        comments = c_comments;
        date = c_date;
    }

    public String getTitle() {
        return title;
    }

    public String getCost() {
        return cost;
    }

    public String getComments() {
        return comments;
    }

    public String getDate() {
        return date;
    }

    public void setTitle(String t) {
        title = t;
    }

    public void setCost(String c) {
        cost = c;
    }

    public void setComments(String c) {
        comments = c;
    }

    public void setDate(String d) {
        date = d;
    }

}
