package beans;

public enum Number {
	ZERO(0, "zero"),
	ONE(1, "one"),
	TWO(2, "two"),
	THREE(3, "three"),
	FOUR(4, "four"),
	FIVE(5, "five"),
	SIX(6, "six"),
	SEVEN(7, "seven"),
	EIGHT(8, "eight"),
	NINE(9, "nine"),
	TEN(10, "ten"),
	ELEVEN(11, "eleven"),
	TWELVE(12, "twelve"),
	THIRTEEN(13, "thirteen"),
	FOURTEEN(14, "fourteen"),
	FIFTEEN(15, "fifteen"),
	SIXTEEN(16, "sixteen"),
	SEVENTEEN(17, "seventeen"),
	EIGHTTEEN(18, "eighteen"),
	NINETEEN(19, "nineteen"),
	TWENTY(20, "twenty"),
	THIRTY(30, "thirty"),
	FORTY(40, "forty"),
	FIFTY(50, "fifty"),
	SIXTY(60, "sixty"),
	SEVENTY(70, "seventy"),
	EIGHTY(80, "eighty"),
	NINETY(90, "ninety"),
	HUNDRED(100, "hundred"),
	THOUSAND(1_000, "thousand"),
	MILLION(1_000_000, "million"),
	BILLION(1_000_000_000, "billion");
	
	private long numericValue;
	private String stringValue;
	
	private Number(long numericValue, String stringValue) {
		this.numericValue = numericValue;
		this.stringValue = stringValue;
	}
	
	public long getNumericValue() {
		return numericValue;
	}
	
	public String getStringValue() {
		return stringValue;
	}
}
