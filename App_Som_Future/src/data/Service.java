package data;

public class Service extends COMMONDATA {

    //Attributes
    String category, businessName, date;
    //Builder
    public Service(String category, String businessName,String description,String date, double price) {
        
        this.category = category;
        this.businessName = businessName;
        this.date = date;
        this.description = description;
        this.price = price;
    }
    //Methods
    public String getCategory() {return category;}
    public String getBusinessName() {return businessName;}
    public String getDate() {return date;}
}
