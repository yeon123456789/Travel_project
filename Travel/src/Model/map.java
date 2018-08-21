package Model;

//map table의 하나의 row값과 매핑되는 데이터 용 클래스
public class map {
	String name;// 컬럼과 매핑되는 자바 변수
	float lat,lon;
	
	public map() {}
	public map(String name, float lat, float lon) {
		super();
		this.name = name;
		this.lat= lat;
		this.lon= lon;
	}
	
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public float getLat() {
		return lat;
	}
	public void setLat(float lat) {
		this.lat = lat;
	}
	public float getLon() {
		return lon;
	}
	public void setLon(float lon) {
		this.lon = lon;
	}
	
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("map [name=");
		builder.append(name);
		builder.append(", lat=");
		builder.append(lat);
		builder.append(", lon=");
		builder.append(lon);
		builder.append("]");
		return builder.toString();
	}
	
	
}