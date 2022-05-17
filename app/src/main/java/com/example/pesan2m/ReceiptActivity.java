package com.example.pesan2m;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;

public class ReceiptActivity extends AppCompatActivity {

    TextView rDate, rId, rName, rCashier;
    TextView rItem1, rItem2, rItem3, rItem4, rItem5, rItem6;
    String strDate, strId, strName, strCashier;
    String fs1, fs2, fs3, dr1, dr2, dr3;
    String n1, n2, n3, n4, n5, n6;
    String pc1, pc2, pc3, pc4, pc5, pc6;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.receipt);


        rDate = findViewById(R.id.r_dateVal);
        rId = findViewById(R.id.r_idVal);
        rName = findViewById(R.id.r_nameVal);
        rCashier = findViewById(R.id.r_cashierVal);

        rItem1 = findViewById(R.id.r_food1Val);
        rItem2 = findViewById(R.id.r_food2Val);
        rItem3 = findViewById(R.id.r_food3Val);
        rItem4 = findViewById(R.id.r_drink1Val);
        rItem5 = findViewById(R.id.r_drink2Val);
        rItem6 = findViewById(R.id.r_drink3Val);


        if (getIntent().getStringExtra("fDate") != null){
            strDate = getIntent().getStringExtra("fDate");
            rDate.setText(strDate);
        }
        if (getIntent().getStringExtra("fName") != null){
            strName = getIntent().getStringExtra("fName");
            rName.setText(strName);
        }

        //food&drinks name acc
        if (getIntent().getStringExtra("fItem1") != null){
            fs1 = getIntent().getStringExtra("fItem1");
            rItem1.setText(fs1);
        }
        if (getIntent().getStringExtra("fItem2") != null){
            fs2 = getIntent().getStringExtra("fItem2");
            rItem2.setText(fs2);
        }
        if (getIntent().getStringExtra("fItem3") != null){
            fs3 = getIntent().getStringExtra("fItem3");
            rItem3.setText(fs3);
        }
        if (getIntent().getStringExtra("fItem4") != null){
            dr1 = getIntent().getStringExtra("fItem4");
            rItem4.setText(dr1);
        }
        if (getIntent().getStringExtra("fItem5") != null){
            dr2 = getIntent().getStringExtra("fItem5");
            rItem5.setText(dr2);
        }
        if (getIntent().getStringExtra("fItem6") != null){
            dr3 = getIntent().getStringExtra("fItem6");
            rItem6.setText(dr3);
        }

        //amount acc
        if (getIntent().getStringExtra("fAmount1") != null){
            n1 = getIntent().getStringExtra("fAmount1");
            rDate.setText(strDate);
        }

    }

    public void openAlertDialogCancel(View view){
        new AlertDialog.Builder(this)
                .setIcon(R.drawable.ic_baseline_error_24)
                .setTitle("Konfirmasi Kembali")
                .setMessage("Data akan dihapus. Apakah anda ingin melanjutkan?")
                .setPositiveButton("OK", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int which) {
                        Intent intent = new Intent(ReceiptActivity.this, MainActivity.class);
                        startActivity(intent);
                    }
                })
                .setNegativeButton("Cancel", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        dialogInterface.cancel();
                    }
                })
                .show();
    }
}
