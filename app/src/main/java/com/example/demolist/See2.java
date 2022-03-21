package com.example.demolist;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.RadioButton;
import android.widget.TextView;

public class See2 extends AppCompatActivity {
    private TextView txtten;
    private TextView txttuoi;
    private ImageView imganh;
    private RadioButton radnam,radnu;
    private Button btnthem,btnsua;
    private String Gioitinh;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_see2);

        Intent intent=getIntent();
        SinhVien sv=(SinhVien)intent.getSerializableExtra("Sinhvien");

        txtten=findViewById(R.id.txtten2);
        txttuoi=findViewById(R.id.txttuoi2);
        imganh=findViewById(R.id.imglogo2);
        radnam=findViewById(R.id.radnam2);
        radnu=findViewById(R.id.radnu2);

        txtten.setText(sv.getTen());
        txttuoi.setText(sv.getTuoi());
        imganh.setImageResource(sv.getId());
        if(sv.getPhai().equals("Nam"))
        {
            radnam.setChecked(true);
        }
        else
        {
            radnu.setChecked(true);
        }
        btnthem=findViewById(R.id.btnthem2);
        btnsua=findViewById(R.id.btnsua2);

        btnthem.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                SinhVien sv1=new SinhVien();
                String ten=txtten.getText().toString();
                String tuoi=txttuoi.getText().toString();

                if(radnam.isChecked())
                {
                    Gioitinh="nam";
                    sv1=new SinhVien(R.drawable.man,ten,tuoi,Gioitinh);
                }
                else
                {
                    Gioitinh="nu";
                    sv1=new SinhVien(R.drawable.femalestudent,ten,tuoi,Gioitinh);
                }
                Intent intent1 = new Intent(See2.this,MainActivity.class);
                Bundle bundle = new Bundle();
                bundle.putSerializable("SinhVien1", sv1);
                intent1.putExtra("add", bundle);
                finish();
            }
        });


    }
}