
import javax.swing.ImageIcon;

/**
 *
 * @author sarahgardiner
 */
public class User {

    private String userName;
    private String fullName;
    private String password;
    private ImageIcon profilePicture;

    public void user(String un, String fn, String pass, ImageIcon pp) {
        this.password = pass;
        this.fullName = fn;
        this.profilePicture = pp;
        this.userName = un;

    }
    /**
     * 
     * @param p 
     */
    public void setPass(String p) {
        this.password = p;
        
    }
    public void setFn(String n) {
        this.fullName = n;
    }
    public void setPp(ImageIcon pp) {
        this.profilePicture = pp;
    }
    public void setUn(String u) {
        this.userName = u;
    }
    public String getPass() {
        return password;
    }
    public String getFn() {
        return fullName;
    }
    public ImageIcon getPp() {
        return profilePicture;
    }
    public String getUn() {
        return userName;
    }
    
    
}
