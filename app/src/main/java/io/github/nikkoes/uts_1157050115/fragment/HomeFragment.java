package io.github.nikkoes.uts_1157050115.fragment;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;

import butterknife.BindView;
import butterknife.ButterKnife;
import io.github.nikkoes.uts_1157050115.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class HomeFragment extends Fragment {

    @BindView(R.id.txt_nama)
    TextView txtNama;
    @BindView(R.id.txt_nim)
    TextView txtNim;
    @BindView(R.id.txt_tanggal_lahir)
    TextView txtTanggalLahir;
    @BindView(R.id.txt_alamat)
    TextView txtAlamat;

    public HomeFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.fragment_home, container, false);
        ButterKnife.bind(this, v);

        initUI();

        return v;
    }

    private void initUI() {
        txtNama.setText("Nikko Eka Saputra");
        txtNim.setText("1157050115");
        txtTanggalLahir.setText("Jakarta, 04 Oktober 1997");
        txtAlamat.setText("Pondok Pesantren Mahasiswa Universal, Cipadung, Cibiru, Bandung");
    }

}
