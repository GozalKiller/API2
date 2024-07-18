package org.example;

import java.util.List;

public class Resonse {
    private int response_code;
    private List<Qusetion> results; //רשימה של שאלות!
    //במחלקת Qusetion יש לנו את כל שאר השדות שנמצאות תחת result

//צריך לטעון ב-POM את הספרייה הבאה:
    /*  Maven jackson!
    <!-- https://mvnrepository.com/artifact/com.fasterxml.jackson.core/jackson-databind -->
<dependency>
    <groupId>com.fasterxml.jackson.core</groupId>
    <artifactId>jackson-databind</artifactId>
    <version>2.17.2</version>
</dependency>

     */




    public int getResponse_code() {
        return response_code;
    }

    public void setResponse_code(int response_code) {
        this.response_code = response_code;
    }

    public List<Qusetion> getResults() {
        return results;
    }

    public void setResults(List<Qusetion> results) {
        this.results = results;
    }
}


//לדוגמא:
/*
{
        "response_code": 0,
        "results": [
        {{
        "response_code": 0,
        "results": [
       {

 */