package com.example.pesan2m;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.SeekBar;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Locale;

public class MainActivity extends AppCompatActivity {

    CheckBox food1, food2, food3, drink1, drink2, drink3;
    String str_date, str_name, str_sub, str_tax, str_total, str_cash, str_change, str_amount;
    int f1val = 35000;
    int f2val = 30000;
    int f3val = 25000;
    int d1val = 10000;
    int d2val = 18000;
    int d3val = 15000;

    String item1, item2, item3, item4, item5, item6;
    String jml1, jml2, jml3, jml4, jml5, jml6;
    String pr1, pr2, pr3, pr4, pr5, pr6;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        EditText autoDate = findViewById(R.id.ixAutoDate);
        EditText onBehalfOf = findViewById(R.id.ixName);
        EditText autoSub = findViewById(R.id.ixAutoSub);
        EditText autoTax = findViewById(R.id.ixAutoTax);
        EditText autoTotal = findViewById(R.id.ixTotal);
        EditText paid = findViewById(R.id.ixCash);
        EditText autoChange = findViewById(R.id.ixChange);

        SimpleDateFormat dateF = new SimpleDateFormat("EEE, d - MMM - yyyy HH:mm", Locale.getDefault());
        String date = dateF.format(Calendar.getInstance().getTime());
        autoDate.setText(date);
        autoDate.setFocusable(false);
        autoDate.setEnabled(false);

        food1 = findViewById(R.id.foodMenu1);
//        food1.setOnClickListener((View.OnClickListener) this);
        food2 = findViewById(R.id.foodMenu2);
//        food2.setOnClickListener((View.OnClickListener) this);
        food3 = findViewById(R.id.foodMenu3);
//        food3.setOnClickListener((View.OnClickListener) this);
        drink1 = findViewById(R.id.drinkMenu1);
//        drink1.setOnClickListener((View.OnClickListener) this);
        drink2 = findViewById(R.id.drinkMenu2);
//        drink2.setOnClickListener((View.OnClickListener) this);
        drink3 = findViewById(R.id.drinkMenu3);
//        drink3.setOnClickListener((View.OnClickListener) this);

        final TextView txtSeekBar1 = findViewById(R.id.strSeekBar1);
        final TextView txtSeekBar2 = findViewById(R.id.strSeekBar2);
        final TextView txtSeekBar3 = findViewById(R.id.strSeekBar3);
        final TextView txtSeekBar4 = findViewById(R.id.strSeekBar4);
        final TextView txtSeekBar5 = findViewById(R.id.strSeekBar5);
        final TextView txtSeekBar6 = findViewById(R.id.strSeekBar6);
        SeekBar seekBar1 = findViewById(R.id.seekBar1);
        SeekBar seekBar2 = findViewById(R.id.seekBar2);
        SeekBar seekBar3 = findViewById(R.id.seekBar3);
        SeekBar seekBar4 = findViewById(R.id.seekBar4);
        SeekBar seekBar5 = findViewById(R.id.seekBar5);
        SeekBar seekBar6 = findViewById(R.id.seekBar6);

        Button btn_check = findViewById(R.id.checkBtn);
        Button btn_order = findViewById(R.id.submitBtn);

        if (food1.isChecked()){
            item1 = getString(R.string.food1);
            jml1 = getString(seekBar1.getProgress());
            pr1 = getString(R.string.foodPrice1);
        }
        if (food2.isChecked()){
            item2 = getString(R.string.food2);
            jml2 = getString(seekBar2.getProgress());
            pr2 = getString(R.string.foodPrice2);
        }
        if (food3.isChecked()){
            item3 = getString(R.string.food3);
            jml3 = getString(seekBar3.getProgress());
            pr3 = getString(R.string.foodPrice3);
        }
        if (drink1.isChecked()){
            item4 = getString(R.string.drink1);
            jml4 = getString(seekBar4.getProgress());
            pr4 = getString(R.string.drinkPrice1);
        }
        if (drink2.isChecked()){
            item5 = getString(R.string.drink2);
            jml5 = getString(seekBar5.getProgress());
            pr5 = getString(R.string.drinkPrice2);
        }
        if (drink3.isChecked()){
            item6 = getString(R.string.drink3);
            jml6 = getString(seekBar6.getProgress());
            pr6 = getString(R.string.drinkPrice3);
        }
        seekBar1.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
                txtSeekBar1.setText(String.valueOf(progress));
                txtSeekBar1.setTextColor(0xFFFFFFFF);
                food1.setChecked(true);
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {

            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {

            }
        });
//        if (seekValue1 == 0){
//            food1.setChecked(false);
//        }
        seekBar2.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
                txtSeekBar2.setText(String.valueOf(progress));
                txtSeekBar2.setTextColor(0xFFFFFFFF);
                food2.setChecked(true);
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {

            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {

            }
        });
        seekBar3.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
                txtSeekBar3.setText(String.valueOf(progress));
                txtSeekBar3.setTextColor(0xFFFFFFFF);
                food3.setChecked(true);
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {

            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {

            }
        });
        seekBar4.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
                txtSeekBar4.setText(String.valueOf(progress));
                txtSeekBar4.setTextColor(0xFFFFFFFF);
                drink1.setChecked(true);
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {

            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {

            }
        });
        seekBar5.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
                txtSeekBar5.setText(String.valueOf(progress));
                txtSeekBar5.setTextColor(0xFFFFFFFF);
                drink2.setChecked(true);
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {

            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {

            }
        });
        seekBar6.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
                txtSeekBar6.setText(String.valueOf(progress));
                txtSeekBar6.setTextColor(0xFFFFFFFF);
                drink3.setChecked(true);
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {

            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {

            }
        });

        btn_check.setOnClickListener((v) -> {
            String atasNama = onBehalfOf.getText().toString();
            if (!food1.isChecked() && !food2.isChecked() && !food3.isChecked() && !drink1.isChecked() && !drink2.isChecked() && drink3.isChecked()){
                String emptySub = getString(R.string.emptySubtotal);
                autoSub.setText(emptySub);
                autoTax.setText(R.string.emptyTax);
                autoTotal.setText(R.string.emptyTotal);
                autoChange.setText(R.string.emptyChange);
            } else {
                String subs = "";
                int sub, sub1 = 0, sub2 = 0, sub3 = 0, sub4 = 0, sub5 = 0, sub6 = 0;
                int Total;
                int pajak;
                int tunai = 0;
                int jumlah;
                String TotalS;
                String kembalianS;
                int kembalian;
                if (food1.isChecked()){
                    int jumlah1;
                    jumlah1 = seekBar1.getProgress();
                    sub1 = jumlah1 * f1val;
                }
                if (food2.isChecked()){
                    int jumlah2;
                    jumlah2 = seekBar2.getProgress();
                    sub2 = jumlah2 * f2val;
                }
                if (food3.isChecked()){
                    int jumlah3;
                    jumlah3 = seekBar3.getProgress();
                    sub3 = jumlah3 * f3val;
                }
                if (drink1.isChecked()){
                    int jumlah4;
                    jumlah4 = seekBar4.getProgress();
                    sub4 = jumlah4 * d1val;
                }
                if (drink2.isChecked()){
                    int jumlah5;
                    jumlah5 = seekBar5.getProgress();
                    sub5 = jumlah5 * d2val;
                }
                if (drink3.isChecked()){
                    int jumlah6;
                    jumlah6 = seekBar6.getProgress();
                    sub6 = jumlah6 * d3val;
                }
                sub = sub1 + sub2 + sub3 + sub4 + sub5 + sub6;
                pajak = sub / 10;
                Total = sub + pajak;
                kembalian = tunai - Total;
            }
        });

        autoSub.setFocusable(false);
        autoSub.setEnabled(false);

        btn_order.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                str_date = autoDate.getText().toString();
                str_name = onBehalfOf.getText().toString();
                str_sub = autoSub.getText().toString();
                str_tax = autoTax.getText().toString();
                str_total = autoTotal.getText().toString();
//                jml2 = seekBar2.getProgress();
//                jml3 = seekBar3.getProgress();
//                jml4 = seekBar4.getProgress();
//                jml5 = seekBar5.getProgress();
//                jml6 = seekBar6.getProgress();

                Intent intent = new Intent(MainActivity.this, ReceiptActivity.class);

                if (!food1.isChecked() && !food2.isChecked() && !food3.isChecked() && !drink1.isChecked() && !drink2.isChecked() && drink3.isChecked()){
                    Toast.makeText(MainActivity.this, "Pilih Menu Terlebih Dahulu", Toast.LENGTH_LONG).show();
                } else {
                    intent.putExtra("fDate", str_date);
                    intent.putExtra("fName", str_name);

                    intent.putExtra("fItem1", item1);
                    intent.putExtra("fItem2", item2);
                    intent.putExtra("fItem3", item3);
                    intent.putExtra("fItem4", item4);
                    intent.putExtra("fItem5", item5);
                    intent.putExtra("fItem6", item6);

                    intent.putExtra("fAmount1", jml1);
                    intent.putExtra("fAmount2", jml2);
                    intent.putExtra("fAmount3", jml3);
                    intent.putExtra("fAmount4", jml4);
                    intent.putExtra("fAmount5", jml5);
                    intent.putExtra("fAmount6", jml6);

                    intent.putExtra("fPrice1", pr1);
                    intent.putExtra("fPrice2", pr2);
                    intent.putExtra("fPrice3", pr3);
                    intent.putExtra("fPrice4", pr4);
                    intent.putExtra("fPrice5", pr5);
                    intent.putExtra("fPrice6", pr6);

                    intent.putExtra("fSub", str_sub);
                    intent.putExtra("fTax", str_tax);
                    intent.putExtra("fTotal", str_total);
                    startActivity(intent);
                }
            }
        });
    }

    @Override
    public void onBackPressed() {
        new AlertDialog.Builder(this)
                .setIcon(R.drawable.ic_baseline_error_24)
                .setTitle(R.string.app_name)
                .setMessage("Apakah anda ingin keluar?")
                .setPositiveButton("OK", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        finish();
                    }
                })
                .setNegativeButton("Cancel", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        dialog.cancel();
                    }
                })
                .show();
    }
}