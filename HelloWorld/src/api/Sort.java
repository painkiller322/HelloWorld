package api;

public class Sort implements Comparable<Sort> {
	String name;

	Sort(String name) {
		this.name = name;
	}

	@Override
	public int compareTo(Sort o) {
		return name.compareTo(o.name);
	}
}
