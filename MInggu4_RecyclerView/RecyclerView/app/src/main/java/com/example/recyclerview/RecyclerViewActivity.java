package com.example.recyclerview;

import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class RecyclerViewActivity extends AppCompatActivity {

    private MahasiswaAdapter mAdapter;
    private RecyclerView rvMahasiswa;
    private ArrayList<Mahasiswa> mahasiswaArrayList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recycler_view);

        addData();

        rvMahasiswa = findViewById(R.id.rv_mahasiswa);

        mAdapter = new MahasiswaAdapter(mahasiswaArrayList);
        rvMahasiswa.setLayoutManager(new LinearLayoutManager(this));
        rvMahasiswa.setAdapter(mAdapter);
    }

    private void addData() {
        mahasiswaArrayList = new ArrayList<>();
        mahasiswaArrayList.add(new Mahasiswa("Nurico", "E41190321", "1234567890"));
        mahasiswaArrayList.add(new Mahasiswa("Bagas", "E4119000", "1234567890"));
        mahasiswaArrayList.add(new Mahasiswa("Bagus", "E41190780", "1234567890"));
        mahasiswaArrayList.add(new Mahasiswa("Mamat", "E41190980", "1234567890"));
        mahasiswaArrayList.add(new Mahasiswa("Cindy", "E41190970", "1234567890"));
        mahasiswaArrayList.add(new Mahasiswa("Via", "E41193000", "1234567890"));
        mahasiswaArrayList.add(new Mahasiswa("Vita", "E41191909", "1234567890"));
        mahasiswaArrayList.add(new Mahasiswa("Lita", "E40091909", "1234567890"));
    }
}
