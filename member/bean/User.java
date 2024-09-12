package member.bean;

public class User {
	// ここに作成
    private String name;
	private String email;
	
	public User(String name, String email) {
	    this.name = name;
	    this.email = email;
	}
	
	@Override
	public String toString() {
	    return "名前：" + name + ", メールアドレス：" + email;
	}
	// ここまで
}
