package com.my.cjava;

public class Challenge15 {
	public static void main(String[] args) {
	    // �ӵ�(m/s) = �Ÿ�(m) / �ð�(s)
	    double meter = 100;
	    double sec = 18;
	    
	    // 1 km = 1000m
	    double kilometer = meter / 1000;
	    // 1 hour = 60 x 1 min = 60 x (60 sec)
	    double hour = sec / 60 / 60;
	    
	    // �ӵ�(km/h) = �Ÿ�(km) / �ð�(h)
	    double sisok = kilometer / hour;
	    System.out.println(sisok + "km/h");
	  }
}
//154��