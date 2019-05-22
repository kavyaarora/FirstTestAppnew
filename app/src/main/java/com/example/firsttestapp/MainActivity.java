package com.example.firsttestapp;

import android.graphics.Color;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity {
    Button login;
    EditText username,pass;
    String uname,upass;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        this.getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);

        setContentView(R.layout.activity_main);

        login=(Button)findViewById(R.id.login);
        username=(EditText)findViewById(R.id.username);
        pass=(EditText)findViewById(R.id.pass);




        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                uname=username.getText().toString();
                upass=pass.getText().toString();

                if(uname.length()>0 && upass.length()>0){
                    System.out.println("HELLO 1"+uname+" and "+upass);

                    if(uname.contains("@gc.ca")){
                        System.out.println("HELLO 3");
                       /* Snackbar.make(v, "WELCOME", Snackbar.LENGTH_LONG)
                                .setAction("Action", null).show();*/


                        Snackbar.make(v,"WELCOME",Snackbar.LENGTH_LONG).setAction("CLOSE", new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {


                            }
                        }).show();

                        /*Snackbar snackbar = Snackbar
                                .make(coordinatorLayout, "Had a snack at Snackbar", Snackbar.LENGTH_LONG)
                                .setAction("Undo", mOnClickListener);
                        snackbar.setActionTextColor(Color.RED);
                        View snackbarView = snackbar.getView();
                        snackbarView.setBackgroundColor(Color.DKGRAY);
                        TextView textView = (TextView) snackbarView.findViewById(android.support.design.R.id.snackbar_text);
                        textView.setTextColor(Color.YELLOW);
                        snackbar.show();
*/

                    }
                    else{
                        System.out.println("HELLO 4");
                        Snackbar.make(v,"Username or Password is incorrect",Snackbar.LENGTH_LONG).setAction("Try Again", new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {


                            }
                        }).show();
                    }

                }
                else{
                    System.out.println("HELLO 2");
                    /*Snackbar.make(v,"Please Enter",Snackbar.LENGTH_LONG).setAction("CLOSE", new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {


                        }
                    }).show();*/
                    Snackbar snackbar = Snackbar
                            .make(v, "Please Enter", Snackbar.LENGTH_LONG)
                            .setAction("Close", new View.OnClickListener() {
                                @Override
                                public void onClick(View v) {

                                }
                            });
                    snackbar.setActionTextColor(Color.GRAY);
                    View snackbarView = snackbar.getView();
                    snackbarView.setBackgroundColor(Color.WHITE);
                    TextView textView = (TextView) snackbarView.findViewById(android.support.design.R.id.snackbar_text);
                    textView.setTextColor(getColor(R.color.colorPrimary));
                    snackbar.show();


                }



            }
        });

        /*Snackbar snackbar = Snackbar
                .make(coordinatorLayout, "www.journaldev.com", Snackbar.LENGTH_LONG);
        snackbar.show();*/
    }
}
