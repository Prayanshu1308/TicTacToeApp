package com.example.tictactoe;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;


public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    Button button1,button2,button3,button4,button5,button6,button7,button8,button9;
    int[] positions = {2,2,2,2,2,2,2,2,2};
    int current = 0;
    LinearLayout mainLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button1 = findViewById(R.id.button1);
        button2 = findViewById(R.id.button2);
        button3 = findViewById(R.id.button3);
        button4 = findViewById(R.id.button4);
        button5 = findViewById(R.id.button5);
        button6 = findViewById(R.id.button6);
        button7 = findViewById(R.id.button7);
        button8 = findViewById(R.id.button8);
        button9 = findViewById(R.id.button9);

        mainLayout = findViewById(R.id.mainLayout);

        button1.setOnClickListener(this);
        button2.setOnClickListener(this);
        button3.setOnClickListener(this);
        button4.setOnClickListener(this);
        button5.setOnClickListener(this);
        button6.setOnClickListener(this);
        button7.setOnClickListener(this);
        button8.setOnClickListener(this);
        button9.setOnClickListener(this);

    }

    @Override
    public void onClick(View view) {
        if(view.getId()==R.id.button1){
            if(current==0){ button1.setText("O"); }else{ button1.setText("X"); }
            button1.setClickable(false);
            buttonClicked(0);
        }else if(view.getId()==R.id.button2){
            if(current==0){ button2.setText("O"); }else{ button2.setText("X"); }
            button2.setClickable(false);
            buttonClicked(1);
        }else if(view.getId()==R.id.button3){
            if(current==0){ button3.setText("O"); }else{ button3.setText("X"); }
            button3.setClickable(false);
            buttonClicked(2);
        }else if(view.getId()==R.id.button4){
            if(current==0){ button4.setText("O"); }else{ button4.setText("X"); }
            button4.setClickable(false);
            buttonClicked(3);
        }else if(view.getId()==R.id.button5){
            if(current==0){ button5.setText("O"); }else{ button5.setText("X"); }
            button5.setClickable(false);
            buttonClicked(4);
        }else if(view.getId()==R.id.button6){
            if(current==0){ button6.setText("O"); }else{ button6.setText("X"); }
            button6.setClickable(false);
            buttonClicked(5);
        }else if(view.getId()==R.id.button7){
            if(current==0){ button7.setText("O"); }else{ button7.setText("X"); }
            button7.setClickable(false);
            buttonClicked(6);
        }else if(view.getId()==R.id.button8){
            if(current==0){ button8.setText("O"); }else{ button8.setText("X"); }
            button8.setClickable(false);
            buttonClicked(7);
        }else if(view.getId()==R.id.button9){
            if(current==0){ button9.setText("O"); }else{ button9.setText("X"); }
            button9.setClickable(false);
            buttonClicked(8);
        }

    }

    public void buttonClicked(int pos){

        if(current==0){
            positions[pos] = current;
            if((positions[0]==positions[1] && positions[1]==positions[2] && positions[2]==0) ||
                    (positions[3]==positions[4] && positions[4]==positions[5] && positions[5]==0) ||
                    (positions[6]==positions[7] && positions[7]==positions[8] && positions[8]==0) ||
                    (positions[0]==positions[3] && positions[3]==positions[6] && positions[6]==0) ||
                    (positions[1]==positions[4] && positions[4]==positions[7] && positions[7]==0) ||
                    (positions[2]==positions[5] && positions[5]==positions[8] && positions[8]==0) ||
                    (positions[0]==positions[4] && positions[4]==positions[8] && positions[8]==0) ||
                    (positions[2]==positions[4] && positions[4]==positions[6] && positions[6]==0)){

                new AlertDialog.Builder(this)
                        .setIcon(android.R.drawable.ic_dialog_alert)
                        .setTitle("Player O has won!!")
                        .setMessage("Do you want to play Again?")
                        .setPositiveButton("Yes,play again", new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialogInterface, int i) {
                                current = 0;
                                positions = new int[]{2, 2, 2, 2, 2, 2, 2, 2, 2};
                                button1.setClickable(true);button2.setClickable(true);button3.setClickable(true);button4.setClickable(true);
                                button5.setClickable(true);button6.setClickable(true);button7.setClickable(true);button8.setClickable(true);
                                button9.setClickable(true);
                                button1.setText("");button2.setText("");button3.setText("");button4.setText("");button5.setText("");
                                button6.setText("");button7.setText("");button8.setText("");button9.setText("");
                            }
                        })
                        .setNegativeButton("No, exit app", new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialogInterface, int i) {
                                finish();
                                System.exit(0);
                            }
                        })
                        .setCancelable(false)
                        .show();
            }
            current = 1;

        }else{
            positions[pos] = current;
            if((positions[0]==positions[1] && positions[1]==positions[2] && positions[2]==1) ||
                    (positions[3]==positions[4] && positions[4]==positions[5] && positions[5]==1) ||
                    (positions[6]==positions[7] && positions[7]==positions[8] && positions[8]==1) ||
                    (positions[0]==positions[3] && positions[3]==positions[6] && positions[6]==1) ||
                    (positions[1]==positions[4] && positions[4]==positions[7] && positions[7]==1) ||
                    (positions[2]==positions[5] && positions[5]==positions[8] && positions[8]==1) ||
                    (positions[0]==positions[4] && positions[4]==positions[8] && positions[8]==1) ||
                    (positions[2]==positions[4] && positions[4]==positions[6] && positions[6]==1)){

                new AlertDialog.Builder(this)
                        .setIcon(android.R.drawable.ic_dialog_alert)
                        .setTitle("Player X has won!!")
                        .setMessage("Do you want to play Again?")
                        .setPositiveButton("Yes, play again", new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialogInterface, int i) {
                                current = 0;
                                button1.setClickable(true);button2.setClickable(true);button3.setClickable(true);button4.setClickable(true);
                                button5.setClickable(true);button6.setClickable(true);button7.setClickable(true);button8.setClickable(true);
                                button9.setClickable(true);
                                positions = new int[]{2, 2, 2, 2, 2, 2, 2, 2, 2};
                                button1.setText("");button2.setText("");button3.setText("");button4.setText("");button5.setText("");
                                button6.setText("");button7.setText("");button8.setText("");button9.setText("");
                            }
                        })
                        .setNegativeButton("No, exit app", new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialogInterface, int i) {
                                finish();
                                System.exit(0);
                            }
                        })
                        .setCancelable(false)
                        .show();
            }
            current = 0;
        }
        int a = 0;
        for(int i=0;i<9;++i){
            if(positions[i]==2){
                ++a;
            }
        }
        if(a==0){
            new AlertDialog.Builder(this)
                    .setIcon(android.R.drawable.ic_dialog_alert)
                    .setTitle("It is a draw match!!")
                    .setMessage("Do you want to play Again?  ")
                    .setPositiveButton("Yes, play again", new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialogInterface, int i) {
                            current = 0;
                            positions = new int[]{2, 2, 2, 2, 2, 2, 2, 2, 2};
                            button1.setClickable(true);button2.setClickable(true);button3.setClickable(true);button4.setClickable(true);
                            button5.setClickable(true);button6.setClickable(true);button7.setClickable(true);button8.setClickable(true);
                            button9.setClickable(true);
                            button1.setText("");button2.setText("");button3.setText("");button4.setText("");button5.setText("");
                            button6.setText("");button7.setText("");button8.setText("");button9.setText("");
                        }
                    })
                    .setNegativeButton("No, exit app", new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialogInterface, int i) {
                            finish();
                            System.exit(0);
                        }
                    })
                    .setCancelable(false)
                    .show();
        }
    }
}