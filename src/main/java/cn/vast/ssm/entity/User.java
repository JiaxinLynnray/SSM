package cn.vast.ssm.entity;

/**
 * @author Lynnray
 * @version 1.0
 * @date 2019/10/28 22:48
 */
public class User {
    /** 主键，用户ID */
    private Integer id;
    /** 用户名 */
    private String userName;
    /** 密码 */
    private String password;
    /** 用户角色名 */
    private String roleName;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getRoleName() {
        return roleName;
    }

    public void setRoleName(String roleName) {
        this.roleName = roleName;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", userName='" + userName + '\'' +
                ", password='" + password + '\'' +
                ", roleName='" + roleName + '\'' +
                '}';
    }
}
