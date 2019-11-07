package a.mt.spennernangcao;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

public class AdapterQuocGia2 extends BaseAdapter {
    int myLayout;
    Context context;
    List<QuocGia> arrayList;

    public AdapterQuocGia2(Context context,int myLayout,  List<QuocGia> arrayList) {
        this.myLayout = myLayout;
        this.context = context;
        this.arrayList = arrayList;
    }

    @Override
    public int getCount() {
        return arrayList.size();
    }

    @Override
    public Object getItem(int position) {
        return null;
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        LayoutInflater inflater= (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);

        convertView=inflater.inflate(myLayout,null);

        TextView tvName=convertView.findViewById(R.id.tvName);
        TextView tvToaDo=convertView.findViewById(R.id.tvToaDo);
        ImageView imgHinh=convertView.findViewById(R.id.imgHinh);

        QuocGia quocGia=this.arrayList.get(position);
        tvName.setText(quocGia.getmTen());
        tvToaDo.setText(""+quocGia.getmToaDo());
        imgHinh.setImageResource((int)quocGia.getmHinh());
        return convertView;
    }
}
