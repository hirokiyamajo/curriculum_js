package member.bean;

public class AdminUser extends User {
    private String adminCode;
    
    public AdminUser(String name, String email, String adminCode) {
        super(name, email);
        this.adminCode = adminCode;
    }
    
    @Override
    public String toString() {
        return "管理者ユーザー: " + super.toString() + ", 管理者コード: " + adminCode;
    }

}
