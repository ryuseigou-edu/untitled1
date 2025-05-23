package reviews.reviews3;

import java.io.*;
public class Review28 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("宛先を入力＞");
        String to = br.readLine();
        System.out.print("件名を入力＞");
        String subject = br.readLine();
        System.out.print("本文を入力＞");
        String body = br.readLine();
        Review28 inst = new Review28();
        if(subject.isEmpty()){
            inst.send(to, body);
        } else {
            inst.send(to, subject, body);
        }
    }
    public void send(String to, String body){
        System.out.println(to + "に以下のメールを送信しました。");
        System.out.println("件名: 【件名なし】");
        System.out.println("本文: " + body);
    }
    public void send(String to, String subject, String body) {
        System.out.println(to + "に以下のメールを送信しました。");
        System.out.println("件名: " + subject);
        System.out.println("本文: " + body);
    }
}
