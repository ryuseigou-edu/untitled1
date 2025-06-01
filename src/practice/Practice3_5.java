package practice;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Practice3_5  {
    public static void main(String[] args) throws IOException {
        final BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("[メニュー]1:検索 2:登録 3:削除 4:変更＞");

        int selected = Integer.parseInt(br.readLine());
        switch (selected) {
            case 1:
                System.out.println("検索します");
                break;
            case 2:
                System.out.println("登録します");
                break;
            case 3:
                System.out.println("削除します");
                break;
            case 4:
                System.out.println("変更します");
                break;
        }
    }
}
