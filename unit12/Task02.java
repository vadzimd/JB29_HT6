package jb29.unit12;

import java.time.LocalDate;
import java.time.Month;
import java.time.MonthDay;

public class Task02 {

	public static void main(String[] args) {

		final Calendar ch = new Calendar();

		ch.addHoliday(MonthDay.of(Month.MAY, 1));
		ch.addHoliday(MonthDay.of(Month.JULY, 3));
		ch.addHoliday(MonthDay.of(Month.MARCH, 8));

		Boolean isHoliday1 = ch.isHoliday(LocalDate.of(2019, 10, 5));
		Boolean isHoliday2 = ch.isHoliday(LocalDate.of(2019, 5, 1));
		Boolean isHoliday3 = ch.isHoliday(LocalDate.of(2019, 5, 9));
		Boolean isHoliday4 = ch.isHoliday(LocalDate.of(2019, 7, 3));

		System.out.println(isHoliday1);
		System.out.println(isHoliday2);
		System.out.println(isHoliday3);
		System.out.println(isHoliday4);

	}

}
