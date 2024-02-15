import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws NullPointerException {
        Map<String, String> userMap = new HashMap<>();
        userMap.put("田中", "島根県出身。20歳です");
        userMap.put("鈴木", "東京都出身。22歳です");
        userMap.put("山田", "大阪府出身。19歳です");
        try {
            Scanner sc = new Scanner(System.in);

            System.out.println("名前を入力して下さい");
            String names = sc.next();
            //名前がキーと一致すれば、値を返す
            System.out.println(userMap.get(names));
            System.out.println(userMap.get(names).length());

        } catch (NullPointerException names) {
            System.out.println("文字列数を取得できませんでした。");
        } finally {
            System.out.println("実行を終了します。");
        }
    }
}
