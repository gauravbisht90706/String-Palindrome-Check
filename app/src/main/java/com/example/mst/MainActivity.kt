package com.example.mst


import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var input1 = findViewById<EditText>(R.id.input);
        val btn1 = findViewById<Button>(R.id.btn1);
        val btn2 = findViewById<Button>(R.id.btn2);
        var ans = findViewById<EditText>(R.id.answer)
        var check = findViewById<EditText>(R.id.check);

        btn1.setOnClickListener() {
            ans.setText(reverseString(input1.text.toString()));
        }

        btn2.setOnClickListener(){
            if(checkPalindrome(input1.text.toString()) == 1)
                check.setText("Palindrome");
            else
                check.setText("Not Palindrome");

    }}

        fun reverseString(input1 : String): String {
            if(input1.isEmpty()) {
                var msg = "please enter String";
                return msg;
            }
            else{
                var result = input1.reversed();
                return result;
            }
        }
        fun checkPalindrome(input1:String): Int{
            var reverse = input1.reversed();
            if(reverse == input1)
                return 1;
            else return 0;
        }



}


