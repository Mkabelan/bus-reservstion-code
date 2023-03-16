package org.zoho;

public class BusInfo {
  private int busNo;
  private boolean ac;
  
  
 public int getBusNo() {
	return busNo;
}

public void setBusNo(int busNo) {
	this.busNo = busNo; 
}

public boolean isAc() {
	return ac;
}

public void setAc(boolean ac) {
	this.ac = ac;
}

public int getCapacity() {
	return capacity;
}

public void setCapacity(int capacity) {
	this.capacity = capacity;
}
	public int getName(){
		return Name;
	}
	public void setName(int Name){
		this.Name = Name;
	}

public BusInfo(int no,boolean ac,int  capacity) {
	this.ac= ac;
	this.busNo=no;
	this.capacity=capacity;
	
	
	  
	  
	  
}
public void displayBusInfo() {
	System.out.println("Bus No:" + busNo + " Ac:" + ac + " capacity is:"+ capacity);
 
}
  
}
