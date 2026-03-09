package lab4;

public class datetime {
	private int year;
	private int month;
	private int day;
	
	public datetime(String dt) {
		String[] values = dt.split("[-]");
		if (values.length == 3) {
			this.year = Integer.parseInt(values[0]);
			this.month = Integer.parseInt(values[1]);
			this.day = Integer.parseInt(values[2]);
		}
	}
	private int getyearcode(int year) {
		int y = year % 100;
		return(y+(y / 4)) % 7;
	}
	private int getmonthcode(int month) {
		int [] codes = {0, 3, 6, 1, 4, 6, 2, 5, 0, 3, 5};
		return codes [month - 1];
	}
	private int getcenturycode(int century) {
		switch (century) {
		case 17: return 4;
		case 18: return 2;
		case 19: return 0;
		case 20: return 6;
		case 21: return 4;
		case 22: return 2;
		case 23: return 0;
		default: return 0;
		}
	}
	private int getleapyear(int year, int month) {
		boolean isLeap = (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
		if (isLeap && (month == 1 || month ==2)) {
			return 1;
		}
		return 0;
	}
	private int dayofweek() {
        int yearCode = getyearcode(this.year);
        int monthCode = getmonthcode(this.month);
        int centuryCode = getcenturycode(this.year / 100);
        int leapYearCode = getleapyear(this.year, this.month);
		int result = (yearCode + monthCode+ centuryCode + this.day - leapYearCode) % 7;
		if (result < 0) result+= 7;
		
		return result;
	}
	public void printdayofweek() {
		String[] dayNames = {
				"Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday"
		};
		
		int dayIndex = dayofweek();
		System.out.println(this.year + "onii" + this.month + "-r sariin" + this.day + "bol" + dayNames[dayIndex]);
	}
}
