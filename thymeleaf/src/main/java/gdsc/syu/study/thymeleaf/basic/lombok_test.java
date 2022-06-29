package gdsc.syu.study.thymeleaf.basic;

public class lombok_test {
    private String username;
    private String userDept;
    private int userID;
    public String getUsername(){
        return username;
    }

    public void setUserDept(String userDept) {
        this.userDept = userDept;
    }

    public int getUserID() {
        return userID;
    }
}
