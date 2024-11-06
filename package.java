//package bank;
class Account {
    public String name;
    protected String email;
    private String password;
    //the private variables and methods are accessed by the getters(for gettin the information) and setters(for setting the information)
    public String getpassword() {
        return password;
    }
    public void setpassword(String pass) {
        this.password = pass;
    }


}
public class bank {

    public static void main(String args[]) {
        Account a1 = new Account();
        a1.name = "myname";
        a1.email = "mymail.com";
        a1.setpassword("mp15r6684");
        System.out.println(a1.getpassword());
    }

}


