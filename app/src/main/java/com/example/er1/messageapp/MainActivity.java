package com.example.er1.messageapp;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.example.er1.keisanapp.R;

public class MainActivity extends Activity {
    private EditText text0;
    private String letter = "";
    private Button change;
    private EditText input_text = "";
    private String[] input_text_splitted = "";
    private String output_text = "";
    private TextView output;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        input_text=(EditText)findViewById(R.id.text0);
        output_text=(TextView)findViewById(R.id.output);

        // String letter[1] = ".,!?";

        input_text = text0.getText().toString();
        input_text_splitted = input_text.split("0");
        for(i=0,i < input_text_splitted.length(),i++){
            output_text += get_text_from_nums(input_text_splitted[i]);
        }


    }

    public String get_text_from_nums(String num_text){
        int num = 0;
        int length = 0;
        num = num_text.substring(0,1);
        length = num_text.length();
        String letters[];
        letters =new String[10];
        letters = [".,!?","abc","def","ghi","jkl","mno","pqrs","tuv","wxyz",''"];
        switch(num.toInteger()){
            case 1:
                return letters[0].substring(length%4,length%4+1);
            case 2:
                return letters[1].substring(length%3,length%3+1);
            case 3:
                return letters[2].substring(length%3,length%3+1);
            case 4:
                return letters[3].substring(length%3,length%3+1);
            case 5:
                return letters[4].substring(length%3,length%3+1);
            case 6:
                return letters[5].substring(length%3,length%3+1);
            case 7:
                return letters[6].substring(length%4,length%4+1);
            case 8:
                return letters[7].substring(length%3,length%3+1);
            case 9:
                return letters[8].substring(length%4,length%4+1);
            case 0:
                return "";
        }

        @Override
        public boolean onCreateOptionsMenu(Menu menu) {
            // Inflate the menu; this adds items to the action bar if it is present.
            getMenuInflater().inflate(R.menu.menu_main, menu);
            return true;
        }

        @Override
        public boolean onOptionsItemSelected(MenuItem item) {
            // Handle action bar item clicks here. The action bar will
            // automatically handle clicks on the Home/Up button, so long
            // as you specify a parent activity in AndroidManifest.xml.
            int id = item.getItemId();

            //noinspection SimplifiableIfStatement
            if (id == R.id.action_settings) {
                return true;
            }

            return super.onOptionsItemSelected(item);
        }
    }