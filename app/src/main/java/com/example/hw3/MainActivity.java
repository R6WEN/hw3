package com.example.hw3;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button btn_cal = (Button)findViewById(R.id.translate);
        btn_cal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {   // OnClick 所要做的事件寫在下面區塊中
                EditText dc = (EditText)findViewById(R.id.editText);
                PassValue(dc.getText().toString());
                // 我把計算 BMI 的動作抽出去到  PassVaule Function 去處理
            }
        });  // 注意這個右括弧是對應 setOnClickListener
    }
    public void PassValue( String degreec){

        //  轉換型別的時候有時可以簡單使用 (type) 的方式轉，但這個傳過來的 String 就需要以 Type.valueOf （如 Float.valueOf）來轉換
        float DEG = Float.valueOf(degreec) ;  // 雖然某些計算值可以為 int 例如體重，但如果體重 weight 你給 int 型別會導致計算上的錯誤
        float degf;
        degf = (DEG/9)*5+32;
        TextView txv_r = (TextView)findViewById(R.id.textView);

        txv_r.setText("華式"+degf+"度"  );
    }

    }

