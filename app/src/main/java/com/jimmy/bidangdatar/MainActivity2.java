package com.jimmy.bidangdatar;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity2 extends AppCompatActivity {
    EditText s;
    Button hitung;
    TextView luas;
    TextView keliling;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        s = (EditText)findViewById(R.id.sisi);
        hitung = (Button) findViewById(R.id.button);
        luas = (TextView)findViewById(R.id.hasilluas);
        keliling = (TextView) findViewById(R.id.hasilkeliling);

        hitung.setOnClickListener (new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                //jika tidak mengisi sisi maka akan tampil notifikasi
                if (s.length() == 0) {
                    Toast.makeText(getApplication(), "Sisi tidak boleh Kosong", Toast.LENGTH_LONG).show();
                }
                else {
                    String sisi = s.getText().toString();

                    double s = Double.parseDouble(sisi);
                    double hs = (s*s);
                    double hs2 = (s*4);

                    String output = String.valueOf(hs);
                    luas.setText(output.toString());

                    output = String.valueOf(hs2);
                    keliling.setText(output.toString());
                }
            }
        });
    }
    public double LuasPersegi(double s) {return s*s;}
    public double KelilingPersegi (double s) {return 4*s;}
}