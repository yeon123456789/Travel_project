package Model;

//map table�� �ϳ��� row���� ���εǴ� ������ �� Ŭ����
public class map {
	String name;// �÷��� ���εǴ� �ڹ� ����
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