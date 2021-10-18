package com.jimmy.bidangdatar;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity4 extends AppCompatActivity {
    EditText r;
    Button hitung;
    TextView luas;
    TextView keliling;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main4);

        r = (EditText)findViewById(R.id.jari);
        hitung = (Button) findViewById(R.id.button);
        luas = (TextView)findViewById(R.id.hasilluas);
        keliling = (TextView) findViewById(R.id.hasilkeliling);

        hitung.setOnClickListener (new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                //jika tidak mengisi jari-jari maka akan tampil notifikasi
                if (r.length() == 0) {
                    Toast.makeText(getApplication(), "Jari-Jari tidak boleh Kosong", Toast.LENGTH_LONG).show();
                }
                else {
                    String jari = r.getText().toString();

                    double r = Double.parseDouble(jari);
                    double hs = (3.14*r*r);
                    double hs2 = (2*3.14*r);

                    String output = String.valueOf(hs);
                    luas.setText(output.toString());

                    output = String.valueOf(hs2);
                    keliling.setText(output.toString());
                }
            }
        });
    }
    public double LuasLingkaran(double r) {return 3.14*r*r;}
    public double KelilingLingkaran (double r) {return 2*3.14*r;}
}