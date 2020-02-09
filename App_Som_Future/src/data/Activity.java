package data;

/*this imports were originally used for setting the date of an activity, but we had to modifify /the code because we didn’t have the time to implement all the methods.
*/
import java.sql.Date;
import java.time.LocalDate;

public class Activity extends COMMONDATA{
 
 String date;
 String category;
 int capacity;


 final int CATE_CULTURE=0;
 final int CATE_TRAVELS=1;
 final int CATE_FOOTBALL=2;
 final int CATE_SPORTS=3;
 final int CATE_SOCIAL=4;
 
 public Activity (String date, String nameEvent, String description, String category, int capacity, double price) {
	 this.date=date;
	 name=nameEvent;
	 this.description=description;
	 this.category=category;
	 this.capacity=capacity;
	 disponibility=true;
 }
//GETS
public String getDate() {
	return date;
}
public String getNameEvent() {
	return name;
}
public String getDescription() {
	return description;
}
public String getCategory() {
	return category;
}

public int getCapacity() {
	return capacity;
}
}
