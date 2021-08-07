package eg2;

public class Train {
	private int id;
	private String code;
	private String station;
	private String Arr;
	private String dep;
	public Train() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Train(int id, String code, String station, String arr, String dep) {
		super();
		this.id = id;
		this.code = code;
		this.station = station;
		Arr = arr;
		this.dep = dep;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getCode() {
		return code;
	}
	public void setCode(String code) {
		this.code = code;
	}
	public String getStation() {
		return station;
	}
	public void setStation(String station) {
		this.station = station;
	}
	public String getArr() {
		return Arr;
	}
	public void setArr(String arr) {
		Arr = arr;
	}
	public String getDep() {
		return dep;
	}
	public void setDep(String dep) {
		this.dep = dep;
	}

	
	

}
