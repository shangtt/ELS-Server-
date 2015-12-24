package po.userPO;
import java.io.*;

@SuppressWarnings("serial")
public class LoginUser implements Serializable {
 private String username;
 private String passwd;
 public String getUsername() {
  return username;
 }
 public void setUsername(String username) {
  this.username = username;
 }
 public String getPasswd() {
  return passwd;
 }
 public void setPasswd(String passwd) {
  this.passwd = passwd;
 }
 
 public static void main(String[] args){   
  LoginUser loginUser = new LoginUser();   
  loginUser.setUsername("50");   
        loginUser.setPasswd("30");   
   
        try{   
            FileOutputStream fs = new FileOutputStream("foo.ser");   
            ObjectOutputStream os =  new ObjectOutputStream(fs);   
            os.writeObject(loginUser);   
            os.close();   
        }catch(Exception ex){   
            ex.printStackTrace();   
        }   
    }   

}
