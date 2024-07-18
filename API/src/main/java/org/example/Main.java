package org.example;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.util.EntityUtils;

import java.io.IOException;


public class Main {
    public static void main(String[] args) {
        try {
            CloseableHttpClient client = HttpClients.createDefault();//יצירת לקוח כדי לשלוח בקשה לשרת(API)
            HttpGet request = new HttpGet("https://opentdb.com/api.php?amount=1&categoty=14&difficulty=medium&type=multiple"); //בקשה לשרת API
            CloseableHttpResponse response = client.execute(request);
            //System.out.println(EntityUtils.toString(response.getEntity()));
            String output = EntityUtils.toString(response.getEntity());
            Resonse resonse1 = new ObjectMapper().readValue(output, Resonse.class);
            //System.out.println(output);
            //System.out.println(resonse1.getResponse_code()); //במידה ונרצה לדעת מהו הResponse code
            //"response_code": 0
            //System.out.println(resonse1.getResults().get(0).getCategory()); //מושך את הערך מהמערך ומציג את הפלט שלcategory
            //System.out.println(resonse1.getResults().get(0).getQusetion());//מוציא לי את השאלה ממערך ה-result
            //"results": [
            //    {
            //      "type": "multiple",
            //      "difficulty": "medium",
            //      "category": "Entertainment: Music",
            //      "question": "Which of these languages was NOT included in the 2016 song &quot;Don&#039;t
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        //דוגמא לגייסון:
        //גייסון הוא מבנה קבוע שמעביר מידע למחשבים
        /*
        {
            "response_code": 0,
                "results": [
            {
                "type": "multiple",
                    "difficulty": "medium",
                    "category": "Entertainment: Music",
                    "question": "EDM record label Monstercat is based in which country?",
                    "correct_answer": "Canada",
                    "incorrect_answers": [
                "United States",
                        "Australia",
                        "United Kingdom"
      ]
            }
  ]
        }

         */

    }
}