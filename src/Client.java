import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Scanner;

public class Client {
private String name;
private String data;
private short count;
private double sum;

public Client( Scanner a)  {
	
	name= a.nextLine();
	data=a.nextLine();
	count = a.nextShort();
	sum = a.nextDouble();
	
	a.nextLine();
}

public String getName() {
	return name;
}

public void setName(String n) {
	name = n;
}

public String getData() {
	return data;
}

public void setData(String d) {
	data = d;
}
public String getYear() {
	return data.substring(7, data.length());
}

public int getCount() {
	return count;
}

public void setCount(short c) {
	count = c;
}

public double getSum() {
	return sum;
}

public void setSum(double s) {
	sum = s;
}

public  int setRating() {
	if( count <100 ) return 1 ;
	else if( count <300) return 2 ;
	else if( count < 500 ) return 3 ;
	else if( count <1000 ) return 4 ;
	else  return 5 ;
	
}
public String convert(int n) {
	String s="";
	for( int i = 0  ; i<n ;i++ ) {
		s+="*";
	}
	return s;
}



@Override
public String toString() {
	return  name + ", " + count + ", " + sum + ", " +data +", "+ convert( setRating()) ;
	
}


}
