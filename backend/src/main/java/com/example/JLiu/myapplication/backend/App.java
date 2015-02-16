package com.example.JLiu.myapplication.backend;

public class App {
    public static void main(String[] args) {
        System.out.println("Sending POST to GCM");

        String apiKey = "AIzaSyCe56VTRyFNul0QdY5b0RoRNk28570LP_s";
        Content content = createContent();

        Post2Gcm.post(apiKey, content);
    }

    public static Content createContent() {

        Content c = new Content();
        c.addRegId("APA91bGaNcVCioQsqkT09sHCHtiSNLvvkcwQwtqYXhWfm9pRX9hnJQVGxuZMwdFMN7xzse15VShNL3Wegx4tmJKA6xjDG5qFrO0YZZhRjzt0AjA_zODR3x_i87sSExh6TciO4sfDgZqogcRbn9cKEq_uWvOXbvgv_1zAz8Y4kYThIkD3bCn0Lzs");
        c.createData("Test title", "SUP??");
        return c;
    }
}
