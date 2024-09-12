package member;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import member.bean.User;

public class Main {
    private static List<User> users = new ArrayList<>();

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean keepRunning = true;

        while (keepRunning) {
            System.out.println("1. 一般ユーザーを登録");
            System.out.println("2. 管理者ユーザーを登録");
            System.out.println("3. ユーザー情報を表示");
            System.out.println("4. 終了");
            System.out.print("選択してください: ");
            int choice = scanner.nextInt();
            scanner.nextLine();  // 改行文字を消費

            switch (choice) {
                case 1:
                    registerGeneralUser(scanner);
                    break;
                case 2:
                    registerAdminUser(scanner);
                    break;
                case 3:
                    findUsers();
                    break;
                case 4:
                    keepRunning = false;
                    break;
                default:
                    System.out.println("無効な選択です。");
            }
        }

        scanner.close();
    }

    // 一般ユーザーを登録するメソッド
    public static void registerGeneralUser(Scanner scanner) {
        
    }

    // 管理者ユーザーを登録するメソッド
    public static void registerAdminUser(Scanner scanner) {
        
    }
    // メールアドレスが既に登録されているか確認するメソッド
    public static boolean isEmailRegistered() {
        return false;
        
    }
    // 登録されたユーザーを表示するメソッド
    public static void findUsers() {
        
    }
}
