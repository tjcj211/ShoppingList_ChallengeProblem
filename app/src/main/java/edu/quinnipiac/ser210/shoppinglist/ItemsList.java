package edu.quinnipiac.ser210.shoppinglist;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class ItemsList extends AppCompatActivity {
    public static final int RESULT_CODE = 0;
    private Intent data = new Intent();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_items_list);
    }

    public void addCheese(View view){
        data.putExtra("Item", "Cheese");
        setResult(RESULT_CODE, data);
        finish();
    }

    public void addRice(View view) {
        data.putExtra("Item", "Rice");
        setResult(RESULT_CODE, data);
        finish();
    }

    public void addCorn(View view) {
        data.putExtra("Item", "Corn");
        setResult(RESULT_CODE, data);
        finish();
    }

    public void addFlour(View view) {
        data.putExtra("Item", "Flour");
        setResult(RESULT_CODE, data);
        finish();
    }
}
