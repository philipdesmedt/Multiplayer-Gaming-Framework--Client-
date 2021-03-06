package be.tbs.mgf.xml;

import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Locale;
import java.util.TimeZone;

/**
 * GregorianCalendar with some edits to conform to the xml datetime specification.
 * It will also only generate UTC dates.
 * @author Gino
 */
public class XMLGregorianCalendar extends GregorianCalendar {
	
	
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 8668500182842732497L;

	/**
	 * 
	 */
	public XMLGregorianCalendar() {
		super(TimeZone.getTimeZone("UTC"));
	}

	/**
	 * @param year
	 * @param month
	 * @param day
	 * @param hour
	 * @param minute
	 * @param second
	 */
	public XMLGregorianCalendar(int year, int month, int day, int hour,
			int minute, int second) {
		super(year, month, day, hour, minute, second);
	}

	/**
	 * @param year
	 * @param month
	 * @param day
	 * @param hour
	 * @param minute
	 */
	public XMLGregorianCalendar(int year, int month, int day, int hour,
			int minute) {
		super(year, month, day, hour, minute);
	}

	/**
	 * @param year
	 * @param month
	 * @param day
	 */
	public XMLGregorianCalendar(int year, int month, int day) {
		super(year, month, day);
	}

	/**
	 * @param locale
	 */
	public XMLGregorianCalendar(Locale locale) {
		super(locale);
	}

	/**
	 * @param timezone
	 * @param locale
	 */
	public XMLGregorianCalendar(TimeZone timezone, Locale locale) {
		super(timezone, locale);
	}

	/**
	 * @param timezone
	 */
	public XMLGregorianCalendar(TimeZone timezone) {
		super(timezone);
	}

	public String toXML() {
		int m = this.get(Calendar.MONTH)+1;
		int d = this.get(Calendar.DAY_OF_MONTH);
		int h = this.get(Calendar.HOUR_OF_DAY);
		int mn = this.get(Calendar.MINUTE);
		int s = this.get(Calendar.SECOND);
		int ms = this.get(Calendar.MILLISECOND);
		return this.get(Calendar.YEAR)+"-"
				+((m<10)?"0"+m:m)+"-"
				+((d<10)?"0"+d:d)+"T"
				+((h<10)?"0"+h:h)+":"
				+((mn<10)?"0"+mn:mn)+":"
				+((s<10)?"0"+s:s)+"."
				+((ms<100)?"0"+((ms<10)?"0"+ms:ms):ms);
	}
	

}
