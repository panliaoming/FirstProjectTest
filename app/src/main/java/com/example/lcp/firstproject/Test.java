package com.example.lcp.firstproject;

/**
 * @author plm date:2016年6月7日16:52:39
 
 */
public class Test {
    private String ni;
    private String userName;
    private String userId;//用户名称，
    public String getNi() {

        return ni;
    }

    @Override
    public String toString() {
        return "Test{" +
                "ni='" + ni + '\'' +
                ", userName='" + userName + '\'' +
                ", userId='" + userId + '\'' +
                '}';
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    /**
     * @param ni
     */
    public void setNi(String ni) {

        this.ni = ni;
    }

}
