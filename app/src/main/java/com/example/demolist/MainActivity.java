package com.example.demolist;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.RadioButton;
import android.widget.RadioGroup;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private SinhVienAdapter adapter;
    private List<SinhVien> listsv;
    private ListView lvwsv;
    private Button btnthem,btnsua,btnxoa;
    private EditText txtten,txttuoi;
    private RadioGroup radgv;
    private RadioButton radnam,radnu;
    private String Gioitinh;
    private SinhVien sv;
    private ImageView anh;
    private  int vitri=-1;

    @Override

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        lvwsv=(ListView)findViewById(R.id.listviewitem);
        listsv=new ArrayList<>();
        listsv.add(new SinhVien(R.drawable.man,"Tran Hoang Long","22","Nam"));
        listsv.add(new SinhVien(R.drawable.femalestudent,"Tran Ling","23","Nu"));
        listsv.add(new SinhVien(R.drawable.man,"Tran Hoang Minh","20","Nam"));
        listsv.add(new SinhVien(R.drawable.man,"Tran Van Tai","12","Nam"));

        SinhVienAdapter adapter=new SinhVienAdapter(MainActivity.this,R.layout.itemlistview,listsv);
        lvwsv.setAdapter(adapter);

        btnthem=findViewById(R.id.btnthem2);
        btnsua=findViewById(R.id.btnsua2);
        btnxoa=findViewById(R.id.btnxoa);
        btnthem=findViewById(R.id.btnthem2);
        txtten=findViewById(R.id.txtten2);
        txttuoi=findViewById(R.id.txttuoi2);
        radnam=findViewById(R.id.radnam2);
        radnu=findViewById(R.id.radnu2);
        anh=findViewById(R.id.imglogo2);
    /*    btnthem.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String ten=txtten.getText().toString();
                String tuoi=txttuoi.getText().toString();

                if(radnam.isChecked())
                {
                    Gioitinh="nam";
                    sv=new SinhVien(R.drawable.man,ten,tuoi,Gioitinh);
                }
                else
                {
                    Gioitinh="nu";
                    sv=new SinhVien(R.drawable.femalestudent,ten,tuoi,Gioitinh);
                }
                listsv.add(sv);

                adapter.notifyDataSetChanged();

            }
        });
        lvwsv.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                txtten.setText(listsv.get(i).getTen());
                txttuoi.setText(listsv.get(i).getTuoi());
                if(listsv.get(i).getPhai().equals("Nam"))
                {
                    radnam.setChecked(true);
                }
                else
                {
                    radnu.setChecked(true);
                }
                anh.setImageResource(listsv.get(i).getId());
                vitri=i;
            }
        });

        btnsua.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                SinhVien svs=new SinhVien();
                svs.setTen(txtten.getText().toString());
                svs.setTuoi(txttuoi.getText().toString());
                if(radnam.isChecked())
                {
                    svs.setPhai("Nam");
                    svs.setId(R.drawable.man);
                }
                else
                {
                    svs.setPhai("Nu");
                    svs.setId(R.drawable.femalestudent);

                }
                listsv.set(vitri,svs);
                adapter.notifyDataSetChanged();
            }
        });
        Intent intent=getIntent();
        btnxoa.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Bundle bundle = intent.getBundleExtra("add");
                SinhVien sv1 = (SinhVien) bundle.getSerializable("SinhVien1");
                txtten.setText(sv1.getTen());
                txttuoi.setText(sv1.getTuoi());
                if(sv1.getPhai().equals("Nam"))
                {
                    radnam.setChecked(true);
                }
                else
                {
                    radnu.setChecked(true);
                }
                anh.setImageResource(sv1.getId());

            }
        });



     */
        processOnclick(btnthem,btnsua,btnxoa);
btnthem.setOnClickListener(new View.OnClickListener() {
    @Override
    public void onClick(View view) {
        processOnclick(btnthem,btnsua,btnxoa);
    }
});
      btnsua.setOnClickListener(new View.OnClickListener() {
          @Override
          public void onClick(View view) {
              processOnclick(btnsua,btnthem,btnxoa);
          }
      });
        btnxoa.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                processOnclick(btnxoa,btnthem,btnsua);
            }
        });

    }
    private void processOnclick(Button btn1, Button btn2, Button btn3){
        btn1.setBackgroundColor(Color.parseColor("#FF9800"));
        btn2.setBackgroundColor(Color.parseColor("#DDD4D4"));
        btn3.setBackgroundColor(Color.parseColor("#DDD4D4"));


    }
}