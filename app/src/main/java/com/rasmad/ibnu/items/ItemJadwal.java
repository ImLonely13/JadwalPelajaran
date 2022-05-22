package com.rasmad.ibnu.items;

public class ItemJadwal {
	public int type;
	private String guru;
	private String jam;
	private String mapel;
	private String ket;
	public static final int MAPEL_MODEL=0;
	public static final int ISTIRAHAT_MODEL=1;

	public ItemJadwal(int type, String ket, String mapel, String jam, String guru) {
		this.type = type;
		this.ket = ket;
		this.mapel = mapel;
		this.jam = jam;
		this.guru = guru;
	}

	public String getGuru() {
		return guru;
	}

	public String getJam() {
		return jam;
	}

	public String getMapel() {
		return mapel;
	}
	
	public String getKet() {
		return ket;
	}

	public void setGuru(String guru) {
		this.guru = guru;
	}

	public void setJam(String jam) {
		this.jam = jam;
	}

	public void setMapel(String mapel) {
		this.mapel = mapel;
	}
	
	public void setKet(String ket) {
		this.ket = ket;
	}
}
