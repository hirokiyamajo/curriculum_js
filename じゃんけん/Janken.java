public class Janken {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Random random = new Random();

		System.out.println("じゃんけんゲーム！");
		System.out.println("選択肢: 0: グー, 1: チョキ, 2: パー");
		System.out.print("あなたの手を選んでください: ");
		int userChoice = scanner.nextInt();

		int computerChoice = random.nextInt(3);
		
		//ここから作成
		String[] hands = {"グー","チョキ","パー"};
	        String userHand = hands[userChoice];
	        String computerHand = hands[computerChoice];

	        String result;
	        
	        if(userChoice == computerChoice) {
	            result = "あいこ";
	        } else if ((userChoice == 0 && computerChoice == 1) ||
                         (userChoice == 1 && computerChoice == 2) ||
                         (userChoice == 2 && computerChoice == 0)) {
	           result = "勝ち";
	        } else {
	            result = "負け";
	        }
	        
	        System.out.println("コンピュータの手：" + computerChoice);
                System.out.println("結果：" + result);

		//ここまで
		scanner.close();
	}
}