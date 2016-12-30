package com.example.nabhiraj.sudoko;

import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Vector;
/*this amazing app is created by nabhiraj jain*/
public class MainActivity extends AppCompatActivity {
    TextView[][] t = new TextView[9][9];
    boolean colomat[][]=new boolean[9][9];
    boolean noteditable[][]=new boolean[9][9];
    TextView[] tu = new TextView[9];
    int row=-1;
    int coloum=-1;
    int data;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        t[0][0] = (TextView) findViewById(R.id.t11);
        t[0][1] = (TextView) findViewById(R.id.t12);
        t[0][2] = (TextView) findViewById(R.id.t13);
        t[0][3] = (TextView) findViewById(R.id.t14);
        t[0][4] = (TextView) findViewById(R.id.t15);
        t[0][5] = (TextView) findViewById(R.id.t16);
        t[0][6] = (TextView) findViewById(R.id.t17);
        t[0][7] = (TextView) findViewById(R.id.t18);
        t[0][8] = (TextView) findViewById(R.id.t19);
        t[1][0] = (TextView) findViewById(R.id.t21);
        t[1][1] = (TextView) findViewById(R.id.t22);
        t[1][2] = (TextView) findViewById(R.id.t23);
        t[1][3] = (TextView) findViewById(R.id.t24);
        t[1][4] = (TextView) findViewById(R.id.t25);
        t[1][5] = (TextView) findViewById(R.id.t26);
        t[1][6] = (TextView) findViewById(R.id.t27);
        t[1][7] = (TextView) findViewById(R.id.t28);
        t[1][8] = (TextView) findViewById(R.id.t29);

        t[2][0] = (TextView) findViewById(R.id.t31);
        t[2][1] = (TextView) findViewById(R.id.t32);
        t[2][2] = (TextView) findViewById(R.id.t33);
        t[2][3] = (TextView) findViewById(R.id.t34);
        t[2][4] = (TextView) findViewById(R.id.t35);
        t[2][5] = (TextView) findViewById(R.id.t36);
        t[2][6] = (TextView) findViewById(R.id.t37);
        t[2][7] = (TextView) findViewById(R.id.t38);
        t[2][8] = (TextView) findViewById(R.id.t39);

        t[3][0] = (TextView) findViewById(R.id.t41);
        t[3][1] = (TextView) findViewById(R.id.t42);
        t[3][2] = (TextView) findViewById(R.id.t43);
        t[3][3] = (TextView) findViewById(R.id.t44);
        t[3][4] = (TextView) findViewById(R.id.t45);
        t[3][5] = (TextView) findViewById(R.id.t46);
        t[3][6] = (TextView) findViewById(R.id.t47);
        t[3][7] = (TextView) findViewById(R.id.t48);
        t[3][8] = (TextView) findViewById(R.id.t49);

        t[4][0] = (TextView) findViewById(R.id.t51);
        t[4][1] = (TextView) findViewById(R.id.t52);
        t[4][2] = (TextView) findViewById(R.id.t53);
        t[4][3] = (TextView) findViewById(R.id.t54);
        t[4][4] = (TextView) findViewById(R.id.t55);
        t[4][5] = (TextView) findViewById(R.id.t56);
        t[4][6] = (TextView) findViewById(R.id.t57);
        t[4][7] = (TextView) findViewById(R.id.t58);
        t[4][8] = (TextView) findViewById(R.id.t59);

        t[5][0] = (TextView) findViewById(R.id.t61);
        t[5][1] = (TextView) findViewById(R.id.t62);
        t[5][2] = (TextView) findViewById(R.id.t63);
        t[5][3] = (TextView) findViewById(R.id.t64);
        t[5][4] = (TextView) findViewById(R.id.t65);
        t[5][5] = (TextView) findViewById(R.id.t66);
        t[5][6] = (TextView) findViewById(R.id.t67);
        t[5][7] = (TextView) findViewById(R.id.t68);
        t[5][8] = (TextView) findViewById(R.id.t69);


        t[6][0] = (TextView) findViewById(R.id.t71);
        t[6][1] = (TextView) findViewById(R.id.t72);
        t[6][2] = (TextView) findViewById(R.id.t73);
        t[6][3] = (TextView) findViewById(R.id.t74);
        t[6][4] = (TextView) findViewById(R.id.t75);
        t[6][5] = (TextView) findViewById(R.id.t76);
        t[6][6] = (TextView) findViewById(R.id.t77);
        t[6][7] = (TextView) findViewById(R.id.t78);
        t[6][8] = (TextView) findViewById(R.id.t79);

        t[7][0] = (TextView) findViewById(R.id.t81);
        t[7][1] = (TextView) findViewById(R.id.t82);
        t[7][2] = (TextView) findViewById(R.id.t83);
        t[7][3] = (TextView) findViewById(R.id.t84);
        t[7][4] = (TextView) findViewById(R.id.t85);
        t[7][5] = (TextView) findViewById(R.id.t86);
        t[7][6] = (TextView) findViewById(R.id.t87);
        t[7][7] = (TextView) findViewById(R.id.t88);
        t[7][8] = (TextView) findViewById(R.id.t89);

        t[8][0] = (TextView) findViewById(R.id.t91);
        t[8][1] = (TextView) findViewById(R.id.t92);
        t[8][2] = (TextView) findViewById(R.id.t93);
        t[8][3] = (TextView) findViewById(R.id.t94);
        t[8][4] = (TextView) findViewById(R.id.t95);
        t[8][5] = (TextView) findViewById(R.id.t96);
        t[8][6] = (TextView) findViewById(R.id.t97);
        t[8][7] = (TextView) findViewById(R.id.t98);
        t[8][8] = (TextView) findViewById(R.id.t99);
        //now we will patch the user input area.
        tu[0] = (TextView) findViewById(R.id.t1);
        tu[1] = (TextView) findViewById(R.id.t2);
        tu[2] = (TextView) findViewById(R.id.t3);
        tu[3] = (TextView) findViewById(R.id.t4);
        tu[4] = (TextView) findViewById(R.id.t5);
        tu[5] = (TextView) findViewById(R.id.t6);
        tu[6] = (TextView) findViewById(R.id.t7);
        tu[7] = (TextView) findViewById(R.id.t8);
        tu[8] = (TextView) findViewById(R.id.t9);


        Log.d("nanu", "all the value are inisialised");
        //first of all lets change the color so as to make clearity.

        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j = j + 2) {
                if (i % 2 == 0 || i == 0) {
                    Log.d("nanu", "is the main loop running and the value of i and j is " + j);
                    t[i][j].setTextColor(Color.parseColor("#ffffff"));
                    t[i][j].setBackgroundColor(Color.parseColor("#000000"));
                    colomat[i][j]=false;
                    if (j < 8) {
                        t[i][j + 1].setTextColor(Color.parseColor("#000000"));
                        t[i][j + 1].setBackgroundColor(Color.parseColor("#ffffff"));
                        colomat[i][j+1]=true;
                    }
                } else {
                    t[i][j].setTextColor(Color.parseColor("#000000"));
                    t[i][j].setBackgroundColor(Color.parseColor("#ffffff"));
                    colomat[i][j]=true;
                    if (j < 8) {
                        t[i][j + 1].setTextColor(Color.parseColor("#ffffff"));
                        t[i][j + 1].setBackgroundColor(Color.parseColor("#000000"));
                        colomat[i][j+1]=false;
                    }
                }
            }
        }

        //now we will fill this 9*9 matrix with the problem to be solved.

        for(int i=0;i<9;i++){
            for(int j=0;j<9;j++){
                if(Model.data[i][j]!=0){
                    noteditable[i][j]=true;
                    t[i][j].setText("" + Model.data[i][j]);
                    if(colomat[i][j]==true)
                    t[i][j].setBackgroundColor(Color.parseColor("#00ffff"));
                    if(colomat[i][j]==false)
                        t[i][j].setBackgroundColor(Color.parseColor("#0000ff"));
                }

            }


        }





        //now lets make array of ellement whilch we cant change this will come from the model class.
for(int i=0;i<9;i++){
    for(int j=0;j<9;j++){
        final int ii=i;
        final int jj=j;
     t[i][j].setOnClickListener(new View.OnClickListener() {
        // final int ii=i;
         //final int jj=j;
         @Override
         public void onClick(View v) {
             if(!noteditable[ii][jj]) {
                 if (row<9&&row>-1&&coloum<9&&coloum>-1) {
                     if (colomat[row][coloum] == true)
                         t[row][coloum].setBackgroundColor(Color.parseColor("#ffffff"));
                     if (colomat[row][coloum] == false)
                         t[row][coloum].setBackgroundColor(Color.parseColor("#000000"));
                 }
                 row = ii;
                 coloum = jj;
                 t[ii][jj].setBackgroundColor(Color.parseColor("#ff0000"));
             }}
     });

    }

}

    }





    public void Insertor(View view) throws InterruptedException {
        if (row<9&&row>-1&&coloum<9&&coloum>-1) {
            if (colomat[row][coloum] == false) {
                t[row][coloum].setBackgroundColor(Color.parseColor("#000000"));
            } else {

                t[row][coloum].setBackgroundColor(Color.parseColor("#ffffff"));

            }
            //Toast.makeText(MainActivity.this,"insertor is called",Toast.LENGTH_SHORT).show();
            if (view.equals(findViewById(R.id.t1))) {
                data = 1;
                t[row][coloum].setText("" + data);
                if (Model.enter(row, coloum, data)) {
                    //enter the code here if you win.
                    finish();

                }

            } else if (view.equals(findViewById(R.id.t2))) {
                data = 2;
                t[row][coloum].setText("" + data);
                if (Model.enter(row, coloum, data)) {
                    //enter the code here if you win.
                    finish();

                }

            } else if (view.equals(findViewById(R.id.t3))) {
                data = 3;
                t[row][coloum].setText("" + data);
                if (Model.enter(row, coloum, data)) {
                    //enter the code here if you win.

                    finish();
                }

            } else if (view.equals(findViewById(R.id.t4))) {
                data = 4;
                t[row][coloum].setText("" + data);
                if (Model.enter(row, coloum, data)) {
                    //enter the code here if you win.
                    finish();

                }

            } else if (view.equals(findViewById(R.id.t5))) {
                data = 5;
                t[row][coloum].setText("" + data);
                if (Model.enter(row, coloum, data)) {
                    //enter the code here if you win.
                    finish();

                }

            } else if (view.equals(findViewById(R.id.t6))) {
                data = 6;
                t[row][coloum].setText("" + data);
                if (Model.enter(row, coloum, data)) {
                    //enter the code here if you win.

                    finish();
                }

            } else if (view.equals(findViewById(R.id.t7))) {
                data = 7;
                t[row][coloum].setText("" + data);
                if (Model.enter(row, coloum, data)) {
                    //enter the code here if you win.

                    finish();
                }

            } else if (view.equals(findViewById(R.id.t8))) {
                data = 8;
                t[row][coloum].setText("" + data);
                if (Model.enter(row, coloum, data)) {
                    //enter the code here if you win.
                    finish();

                }

            } else if (view.equals(findViewById(R.id.t9))) {
                data = 9;
                t[row][coloum].setText("" + data);
                if (Model.enter(row, coloum, data)) {
                    //enter the code here if you win.
                    finish();

                }

            }


        }


    }




}