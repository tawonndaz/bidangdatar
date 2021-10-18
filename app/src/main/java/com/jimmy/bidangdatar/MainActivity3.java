package com.jimmy.bidangdatar;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity3 extends AppCompatActivity {
    EditText a;
    EditText t;
    Button hitung;
    TextView luas;
    TextView keliling;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);

        a = (EditText)findViewById(R.id.alas);
        t = (EditText)findViewById(R.id.tinggi);
        hitung = (Button) findViewById(R.id.button);
        luas = (TextView)findViewById(R.id.hasilluas);
        keliling = (TextView) findViewById(R.id.hasilkeliling);

        hitung.setOnClickListener (new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                //jika tidak mengisi alas dan tinggi maka akan tampil notifikasi
                if (a.length() == 0) {
                    Toast.makeText(getApplication(), "Alas tidak boleh Kosong", Toast.LENGTH_LONG).show();
                }
                else if (t.length() == 0) {
                    Toast.makeText(getApplication(), "Tinggi tidak boleh Kosong", Toast.LENGTH_LONG).show();
                }
                else {
                    String alas = a.getText().toString();
                    String tinggi = t.getText().toString();

                    double a = Double.parseDouble(alas);
                    double t = Double.parseDouble(tinggi);
                    double hs = (0.5*a*t);
                    double hs2 = (a+2*t);

                    String output = String.valueOf(hs);
                    luas.setText(output.toString());

                    output = String.valueOf(hs2);
                    keliling.setText(output.toString());
                }
            }
        });
    }
    public double LuasSegitiga(double a,double t) {return 0.5*a*t;}
    public double KelilingSegitiga (double a,double t) {return a+2*t;}
}