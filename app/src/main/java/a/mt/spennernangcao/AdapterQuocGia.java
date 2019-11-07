package a.mt.spennernangcao;

import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import java.util.List;

public class AdapterQuocGia extends ArrayAdapter<QuocGia>{
    Activity context;
    int resource;
    List <QuocGia> objects;

    public AdapterQuocGia(@NonNull Activity context, int resource, @NonNull List<QuocGia> objects) {
        super(context, resource, objects);
        this.context=context;
        this.resource=resource;
        this.objects=objects;
    }

    // trả về số dòng trong list
 //   @Override
//    public int getCount() {
//        return objects.size();
//    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {

        LayoutInflater inflater=this.context.getLayoutInflater();

        convertView=inflater.inflate(resource,null);

        TextView tvName=convertView.findViewById(R.id.tvName);
        TextView tvToaDo=convertView.findViewById(R.id.tvToaDo);
        ImageView imgHinh=convertView.findViewById(R.id.imgHinh);

        QuocGia quocGia=this.objects.get(position);
        tvName.setText(quocGia.getmTen());
        tvToaDo.setText(""+quocGia.getmToaDo());
        imgHinh.setImageResource((int)quocGia.getmHinh());
        return convertView;

    }
//   // @Override
//    public View getView2(int position, View convertView, ViewGroup parent) {
//        LayoutInflater inflater= (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
//
//        // Tạo View -- chính là view của dòng trong list
//        convertView=inflater.inflate(resource,null);
//
//        TextView tvName=convertView.findViewById(R.id.tvName);
//        TextView tvToaDo=convertView.findViewById(R.id.tvToaDo);
//        ImageView imgHinh=convertView.findViewById(R.id.imgHinh);
//
//
//       tvName.setText(arrayListQuocGia.get(position).getmTen());
//       tvToaDo.setText(String.valueOf(arrayListQuocGia.get(position).getmToaDo()));
//       imgHinh.setImageResource(arrayListQuocGia.get(position).getmHinh());
//
//       return convertView;
//    }
}
