package com.example.demolist;

import android.content.Context;
import android.content.Intent;
import android.text.Layout;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

public class SinhVienAdapter extends BaseAdapter {
    private List<SinhVien> listsv;
    private Context context;
    private int Idlayout;
    public SinhVienAdapter(Context context,int idlayout,List<SinhVien> listsv ) {
        this.listsv = listsv;
        this.context = context;
        this.Idlayout= idlayout;
    }



    @Override
    public int getCount() {
        if(listsv.size()!=0 && !listsv.isEmpty())
        {
            return listsv.size();
        }
        return 0;
    }

    @Override
    public Object getItem(int i) {
        return null;
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }

    @Override
    public View getView(int i, View view, ViewGroup parent) {
        if(view==null)
        {
            view= LayoutInflater.from(parent.getContext()).inflate(Idlayout,parent,false);
        }
//anh xa
        TextView txtten=(TextView)view.findViewById(R.id.txtiten);
        TextView txttuoi=(TextView)view.findViewById(R.id.txtituoi);
        TextView txtphai=(TextView)view.findViewById(R.id.txtiphai);
        ImageView imglogo=(ImageView) view.findViewById(R.id.imgilogo);

        final SinhVien sv= listsv.get(i);

        if(listsv.size()!=0 && !listsv.isEmpty())
        {
            txtten.setText(sv.getTen());
            txttuoi.setText(sv.getTuoi());
            txtphai.setText(sv.getPhai());
            imglogo.setImageResource(sv.getId());
        }
        view.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(context,See2.class);
                intent.putExtra("Sinhvien",sv);
                context.startActivity(intent);
            }
        });


        return view;
    }
}
