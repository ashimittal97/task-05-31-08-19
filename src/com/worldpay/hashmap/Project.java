package com.worldpay.hashmap;

public class Project {
 int pcode, duration;
String ptitle, clientName;

	public Project(int i, String title, int j, String cn) {
		pcode = i;
		ptitle = title;
		duration = j;
		clientName = cn;
	}

	@Override
	public String toString() {
		return "Project [pcode=" + pcode + ", duration=" + duration + ", ptitle=" + ptitle + ", clientName="
				+ clientName + "]";
	}

}
