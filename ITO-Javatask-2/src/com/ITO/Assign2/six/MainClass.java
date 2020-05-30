package com.ITO.Assign2.six;

import java.time.LocalDate;
import java.time.Month;

public class MainClass {

	public static void main(String[] args) throws CustomException {
		DateBand db1 = new DateBand(LocalDate.of(2020, Month.NOVEMBER, 1), LocalDate.of(2020, Month.NOVEMBER, 30));
		DateBand db2 = new DateBand(LocalDate.of(2020, Month.NOVEMBER, 20), LocalDate.of(2020, Month.DECEMBER, 20));
		DateBand db = new DateBand();
		DateBand db4 = db.findOverlappingBand(db1, db2);
		System.out.println(db4);

	}

}
