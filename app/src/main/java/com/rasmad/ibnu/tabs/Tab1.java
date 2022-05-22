package com.rasmad.ibnu.tabs;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.widget.TextView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.List;

import com.rasmad.ibnu.R;
import com.rasmad.ibnu.adapters.AdapterJadwal;
import com.rasmad.ibnu.items.ItemJadwal;

public class Tab1 extends Fragment {

	public Tab1() {

	}
	private ArrayList<ItemJadwal> datajadwal;
	private LinearLayoutManager llm;
	private RecyclerView recyclerview;
	private AdapterJadwal rvAdapter;

	private ArrayList<ItemJadwal> getJadwal() {
		ArrayList<ItemJadwal> itemJadwal = new ArrayList<ItemJadwal>();
		/* ###### UBAH, TAMBAH, HAPUS, EDIT JADWAL DISINI ######

		 Gunakan ItemJadwal.MAPEL_MODEL untuk menambahkan tipe jadwal
		 Contoh:
		 itemJadwal.add(new ItemJadwal(ItemJadwal.MAPEL_MODEL, "","Nama Mapel", "Jam Mulai - Jam Selesai", "Nama Guru", "Ruangan", "Seragam yang digunakan"));
		 &
		 Gunakan ItemJadwal.ISTIRAHAT_MODEL untuk menambah tipe istirahat
		 Contoh:
		 itemJadwal.add(new ItemJadwal(ItemJadwal.ISTIRAHAT_MODEL, "Jam Istirahat dimulai - Jam Istirahat Selesai (Total Waktu Istirahat)", "", "", "", "", ""));

		 Kosongkan function ini jika tidak ada kegiatan di hari tsb

		 Jika kurang jelas bisa liat di bawah ini
		 */
		itemJadwal.add(new ItemJadwal(ItemJadwal.MAPEL_MODEL, "","Upacara / Pembinaan Wali Kelas", "07:30 - 08:00"));
                itemJadwal.add(new ItemJadwal(ItemJadwal.MAPEL_MODEL, "", "Sosiologi", "08:00 - 10:15", "Nurlela, S.Pd")); 
		itemJadwal.add(new ItemJadwal(ItemJadwal.ISTIRAHAT_MODEL, "10:15 - 10:30 (15 Menit)", "", "", "", "", ""));
		itemJadwal.add(new ItemJadwal(ItemJadwal.MAPEL_MODEL, "", "Bahasa Indonesia", "10:30 - 12:45", "Eny Sulistyowati S.Pd"));
		return itemJadwal;
	}

	@Override
	public void onCreate(Bundle var1) {
		super.onCreate(var1);
	}

	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
		View view = inflater.inflate(R.layout.frag_tab, container, false);

		datajadwal = getJadwal();
		TextView emptyText = view.findViewById(R.id.jadwalNotFound);
	    llm = new LinearLayoutManager(this.getActivity());
		recyclerview = view.findViewById(R.id.recyclerview);

		if (getJadwal().isEmpty()) {
			recyclerview.setVisibility(View.GONE);
			emptyText.setVisibility(View.VISIBLE);
		}
		else {
			recyclerview.setVisibility(View.VISIBLE);
			emptyText.setVisibility(View.GONE);
		}

		recyclerview.setLayoutManager(llm);
		rvAdapter = new AdapterJadwal(getActivity(), datajadwal);
		recyclerview.setAdapter(rvAdapter);

		return view;
	}
}
