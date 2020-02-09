package data;

import java.sql.Date;
import java.time.LocalDate;
import java.util.Scanner;

public class ActivityData extends COMMONDATA{
	
	final int MINCAPACITY=5; 
	final int MAXCAPACITY=50;
	 String datep;
	 int capacityp;
	 final int CATE_CULTURE=0;
	 final int CATE_TRAVELS=1;
	 final int CATE_FOOTBALL=2;
	 final int CATE_SPORTS=3;
	 final int CATE_SOCIAL=4;
	 Scanner keyboard=new Scanner(System.in);;
	 
	 public ActivityData(){
		
		//Our artificial database 
			Activity a1= new Activity ("05/03/2020", "Partido Madrid-Segovia", "Se retransmitirá el partido en la calle Balmes nª17", "FÚTBOL", 20, 10.0);
			Activity a2= new Activity ("10/02/2020", "Club de lectura", "Se celebrará una sesión de lectura del autor Shakespeare", "CULTURA",5,2.0);
			Activity a3 = new Activity ("29/02/2020", "Cine pelicula 1917", "Género: Bélica - Drama - Historia", "CULTURA", 10, 10);
			Activity a4 = new Activity ("02/03/2020", "Torneo de petanca", "El Club de Petanca Mataró comienza este fin de semana un ciclo de tres torneos con motivo de las fiestas de las Santas.", "DEPORTE", 30, 0.0);
			//we have to incorpore it to the program
			Activity [] examplesActivities= {a1,a2,a3,a4};
			
	 }
	 
	 //METHODS of validating
	 public boolean ValidateDate (LocalDate date) {//because we had a problem using Date we had to changed to a String, also the original method for validating is this one
		 LocalDate current = LocalDate.now(); 
		 
		return date.isAfter(current) && date.isBefore(current.plusMonths(1));
			
		}
		
	public boolean ValidateCapacity(int capacity) {//ok
		return !(capacity<=MINCAPACITY || capacity>=MAXCAPACITY);
}
		public boolean ValidateCategory(int category) {//ok
			return category>CATE_CULTURE && category<CATE_SOCIAL;
		}
		
	
}
