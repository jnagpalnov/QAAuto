package bdd;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Created by jatin on 11/10/15.
 */

@XmlRootElement (name = "Product")
public class HomePageBdd {
    private String name;
    private String price;
    @XmlElement(name="ProductName")
    public void setProductName(String name){
        this.name=name;
    }
    public String getProductName(){
        return name;
    }
    @XmlElement(name="Price")
    public void setProductPrice(String price){
        this.price=price;
    }
    public String getProductPrice(){
        return price;
    }
}
