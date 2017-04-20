
import java.util.ArrayList;
import javax.swing.ImageIcon;


/**
 *
 * @author sarahgardiner
 */
public class Post {
    
    private ImageIcon Pic;
    private String comment;
    private ArrayList<String> hashes;
    private int likes;
    private String user;
    
    public void Post(ImageIcon P, String c, ArrayList h, int l, String u){
        this.Pic = P;
        this.comment = c;
        this.hashes = h;
        this.likes = l;
        this.user = u;
    }
    
    public void setPic(ImageIcon p){
        this.Pic = p;
    }
    
    public void setComment(String c){
        this.comment = c;
    }
    
    public void setHashes(ArrayList h){
        this.hashes = h;
    }
    
    public void setLikes(int l){
        this.likes = l;
    }
    
    public void setUser(String u){
        this.user = u;
    }
    
    public ImageIcon getPic(){
        return Pic;
    }
    
    public String getComment(){
        return comment;
    }
    
    public ArrayList<String> getHashes(){
        return hashes;
    }
    
    public int getLikes(){
        return likes;
    }
    
    public String getUser(){
        return user;
    }
    
}
