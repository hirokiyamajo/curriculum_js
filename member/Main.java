package member;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import member.bean.AdminUser;
import member.bean.GeneralUser;
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
        //一般ユーザーの情報(名前、メールアドレス)を取得する
        System.out.println("名前を入力してください：");
        String userName = scanner.next();
        System.out.println("メールアドレスを入力してください：");
        String email = scanner.next();
        
        //取得した情報をもとに一般ユーザーを作成する
        User newUser = new GeneralUser(userName, email);
        
        //一般ユーザーをリスト(保管場所)に格納する
        users.add(newUser);
        
        System.out.println("一般ユーザーの登録をしました");
    }

    // 管理者ユーザーを登録するメソッド
    public static void registerAdminUser(Scanner scanner) {
        System.out.println("名前を入力してください：");
        String adminName = scanner.next();
        System.out.println("メールアドレスを入力してください：");
        String email = scanner.next();
        System.out.println("管理者コードを入力してください：");
        String adminCode = scanner.next();
        
        User newUser1 = new AdminUser(adminName, email,adminCode);
        
        users.add(newUser1);
        
    }
    // メールアドレスが既に登録されているか確認するメソッド
    public static boolean isEmailRegistered() {
        
        //登録されているメールアドレスを取得
        users.getEmail();
        //取得されたメールアドレスが登録されているかを確認する
        
        
        return false;
        
    }
    // 登録されたユーザーを表示するメソッド
    public static void findUsers() {
        
        
       for (User user : users) {
            System.out.println(users);
       } 
       
    }
}
