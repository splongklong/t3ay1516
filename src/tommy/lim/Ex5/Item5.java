package tommy.lim.Ex5;

/**
 * Created by IE on 6/28/2016.
 */
public class Item5 {
    private int itemid;
    private String itemdescription;
    private String itemtype;
    private float price;

    public Item5(int itemid, String itemdescription, String itemtype, float price) {
        this.itemid = itemid;
        this.itemdescription = itemdescription;
        this.itemtype = itemtype;
        this.price = price;
    }

    public int getItemid() {
        return itemid;
    }

    public void setItemid(int itemid) {
        this.itemid = itemid;
    }

    public String getItemdescription() {
        return itemdescription;
    }

    public void setItemdescription(String itemdescription) {
        this.itemdescription = itemdescription;
    }

    public String getItemtype() {
        return itemtype;
    }

    public void setItemtype(String itemtype) {
        this.itemtype = itemtype;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }
}
