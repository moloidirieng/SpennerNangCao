package a.mt.spennernangcao;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.Spinner;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    Spinner spnQuocGia;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        addControls();
    }

    private void addControls() {
        spnQuocGia=findViewById(R.id.spnQuocGia);

        ArrayList<QuocGia> dsQuocGia=new ArrayList<>();
        dsQuocGia.add(new QuocGia(R.drawable.aud,"Úc",1000));
        dsQuocGia.add(new QuocGia(R.drawable.cad,"Canada",2000));
        dsQuocGia.add(new QuocGia(R.drawable.chn,"China",1000));
        dsQuocGia.add(new QuocGia(R.drawable.eur,"EU",1000));
        dsQuocGia.add(new QuocGia(R.drawable.usa,"Mý",1000));
        dsQuocGia.add(new QuocGia(R.drawable.jap,"Nhật",1000));


       AdapterQuocGia2 adapterQuocGia=new AdapterQuocGia2(this,R.layout.dong_quoc_gia,dsQuocGia);
       spnQuocGia.setAdapter(adapterQuocGia);

    }
}
