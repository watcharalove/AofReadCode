package aof.th.ac.rvs.aofreadcode.utility;

/**
 * Created by Student on 22/3/2561.
 */

public class MyConstant {

    //    About URL
    private String urlGetAllUserString = "http://androidthai.in.th/mar/getAllUser.php";
    private String urlPostUserString = "http://androidthai.in.th/mar/postUser.php";

    // About Array
    private String[] loginString = new String[]{"id", "Name", "User", "Password"};


    public String[] getLoginString() {
        return loginString;
    }

    public String getUrlGetAllUserString() {
        return urlGetAllUserString;
    }

    public String getUrlPostUserString() {
        return urlPostUserString;
    }
} // Main Class
