package edu.quinnipiac.ser210.shoppinglist;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    public static final int REQUEST_CODE = 1;
    public static final int RESULT_CODE = 0;
    private Intent data = new Intent();

    private TextView item1;
    private TextView item2;
    private TextView item3;
    private TextView item4;
    private TextView item5;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void goToItems(View view) {
        Intent intent = new Intent(this, ItemsList.class);
        startActivityForResult(intent, REQUEST_CODE);
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        String item = data.getStringExtra("Item");
        placeItem(item);
    }

    private void placeItem(String item) {
        //String item = "Test";
        item1 = findViewById(R.id.txtItem1);
        item2 = findViewById(R.id.txtItem2);
        item3 = findViewById(R.id.txtItem3);
        item4 = findViewById(R.id.txtItem4);
        item5 = findViewById(R.id.txtItem5);

        if (item1.getText().toString().equals("-")){
            item1.setText(item);
        }else if (item2.getText().toString().equals("-")) {
            item2.setText(item);
        }else if (item3.getText().toString().equals("-")){
            item3.setText(item);
        }else if (item4.getText().toString().equals("-")){
            item4.setText(item);
        }else if (item5.getText().toString().equals("-")){
            item5.setText(item);
        }
    }
}
