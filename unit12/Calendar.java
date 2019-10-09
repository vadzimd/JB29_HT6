package jb29.unit12;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.Month;
import java.time.MonthDay;
import java.util.HashSet;
import java.util.Set;

public class Calendar {

	private final Set<MonthDay> holidays = new HashSet<>();	

	public void addHoliday(final MonthDay monthDay) {
		holidays.add(monthDay);
	}

	public boolean isHoliday(final LocalDate localDate) {
		return isWeekend(localDate) || holidays.contains(toMonthDay(localDate));
	}

	private boolean isWeekend(final LocalDate localDate) {
		final DayOfWeek dow = localDate.getDayOfWeek();
		return dow == DayOfWeek.SATURDAY || dow == DayOfWeek.SUNDAY;
	}

	private static MonthDay toMonthDay(final LocalDate localDate) {
		return MonthDay.of(localDate.getMonth(), localDate.getDayOfMonth());
	}

	@Override
	public String toString() {
		return "Calendar [holidays=" + holidays + "]";
	}
	
	public static void main(String[] args) {

		final Calendar ch = new Calendar();

		ch.addHoliday(MonthDay.of(Month.MAY, 1));
		ch.addHoliday(MonthDay.of(Month.JULY, 3));
		ch.addHoliday(MonthDay.of(Month.MARCH, 8));		
	

	}

}
