package toolbar.scroll.reign.com.scrollabletoolbar;

/**
 * Created by Abhishek on 1/26/2019.
 */

public class Item {


    private String name;
private int image;
    public Item(int image,String name) {
        this.name = name;
        this.image=image;
    }


    public void setImage(int image) {
        this.image = image;
    }

    public int getImage() {
        return image;
    }
}
