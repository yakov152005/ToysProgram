public class Toy {
	private int code;
	private String group;
	private String manuFact;
	private int year;

	public Toy(int code, String group, String manuFact, int year){
		this.code = code;
		this.group = group;
		this.manuFact = manuFact;
		this.year = year;
	}
	public Toy(){
		this.code = 0;
		this.group = "NA";
		this.manuFact = "NA";
		this.year = 0;
	}
	public int getCode(){
		return  code;
	}
	public String getGroup(){
		return group;
	}
	public String getManuFact(){
		return manuFact;
	}

	public int getYear() {
		return year;
	}

	public void setData(int code, String group, String manuFact, int year){
		this.code = code;
		this.group = group;
		this.manuFact = manuFact;
		this.year = year;
	}
	public String toString(){
		return "The code toy is: " +code + "\nThe group is: " +group +
				"\nThe Manu Fact is: " +manuFact +"\nThe toy is designed for age:" +year;
	}

}
