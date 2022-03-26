package yuhan.mvc.teamproject.dto;

public class UserInfo {

    private String user_id;
    private String user_name;
    private String user_email;
    private String user_phone;

    public UserInfo(String user_id, String user_name, String user_email, String user_phone){
        this.user_id = user_id;
        this.user_name = user_name;
        this.user_email = user_email;
        this.user_phone = user_phone;
    }

    public String getUser_id() {
        return user_id;
    }
    public void setUser_id(String user_id) {
        this.user_id = user_id;
    }
    public String getUser_name() {
        return user_name;
    }
    public void setUser_name(String user_name) {
        this.user_name = user_name;
    }
    public String getUser_email() {
        return user_email;
    }
    public void setUser_email(String user_email) {
        this.user_email = user_email;
    }
    public String getUser_Phone() {
        return user_phone;
    }
    public void setUser_Phone(String user_phone) {
        this.user_phone = user_phone;
    }
}