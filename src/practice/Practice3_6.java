package practice;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Practice3_6 {
    public static void main(String[] args) throws IOException {
        final BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("【数当てゲーム】");
        final int ans = (int) (Math.random() * 10);
        for(int i = 0; i < 5; i++) {
            System.out.println("0~9の数字を入力してください");
            int num = Integer.parseInt(br.readLine());
            if(num == ans) {
                System.out.println("アタリ！");
                break;
            } else {
                System.out.println("違います");
            }
        }
        System.out.println("ゲームを終了します");
    }
}
