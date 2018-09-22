package com.dmt.xuanbach.event2;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private EditText mEditA, mEditB;
    private TextView mTvResult;
    private Button mBtnCalculate;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mEditA= (EditText) findViewById(R.id.edit_a);
        mEditB= (EditText) findViewById(R.id.edit_b);
        mTvResult = (TextView) findViewById(R.id.tv_result);
        mBtnCalculate = (Button) findViewById(R.id.btn_calculate);
         /*
    Cach2: anonymous listener
     */
        mBtnCalculate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int a = Integer.parseInt(mEditA.getText().toString());
                int b = Integer.parseInt(mEditB.getText().toString());
                mTvResult.setText("a + b = "+(a+b));
            }
        });
    }
}