package reviews.reviews3.Review29;

import java.io.*;

public class Review29 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("宛先を入力＞");
        String to = br.readLine();
        System.out.print("件名を入力＞");
        String subject = br.readLine();
        System.out.print("本文を入力＞");
        String body = br.readLine();
        System.out.println(to + "に以下のメールを送信しました。");
        System.out.println("件名: " + subject);
        System.out.println("本文: " + body);
    }
}

