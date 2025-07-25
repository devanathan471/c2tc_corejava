package Day2.entity1;

public class Customer {
 private int cid;
 private String city;
 private String customername;
 public Customer() {
	 this.cid=101;
	 this.customername="unknown";
	 this.city="puducherry";
 }
 
 
 public int getCid() {
	return cid;
 }
 public void setCid(int cid) {
	this.cid = cid;
 }
 public String getCity() {
	return city;
 }
 public void setCity(String city) {
	this.city = city;
 }
 public String getCustomername() {
	return customername;
 }
 public void setCustomername(String customername) {
	this.customername = customername;
 }
 @Override
 public String toString() {
	return "Customer [cid=" + cid + ", city=" + city + ", customername=" + customername + ", getCid()=" + getCid()
			+" ]";
 }


 public void setCustomerName(String name) {
	// TODO Auto-generated method stub
	
 }

 }
 