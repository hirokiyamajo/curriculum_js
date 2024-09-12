package member.bean;

public class GeneralUser extends User {

    public GeneralUser(String name, String email) {
        super(name, email);
      
    }
    
    @Override
    public String toString() {
        return "一般ユーザー："  + super.toString();
    }
    
}
