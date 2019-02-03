package org.sando.wwtbm;

import android.os.Build;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

import java.lang.ref.Reference;
import java.util.Random;

import groups.GroupA;
import groups.GroupB;
import groups.GroupC;

public class MainActivity extends AppCompatActivity {

    private GroupA groupA;
    private GroupB groupB;
    private GroupC groupC;

    private LinearLayout L_Game;
    private TextView question, money, answer;
    private Button button1, button2, button3, button4;

    private int countA, countB, countC, moneyWin;
    private String win;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (Build.VERSION.SDK_INT > 16) {
            getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
                    WindowManager.LayoutParams.FLAG_FULLSCREEN);
        }//desaparece la barra de notificaciones
        setContentView(R.layout.activity_main);

        ReferenceComponents();
        StarGame();
    }

    public void ViewRunnigGame() {
        L_Game.setVisibility(View.VISIBLE);
    }

    public void ToAsk_A() {
        if (countA >= 5) {
            ToAsk_B();
        } else {
            String questions[] = groupA.GenerateQuestion();
            question.setText(questions[0]);
            win = questions[1];
            int ans = new Random().nextInt(4);
            if (ans == 0) {
                button1.setText("A: " + questions[1]);
                //button1.append(questions[1]);
                button2.setText("B: " + questions[2]);
                button3.setText("C: " + questions[3]);
                button4.setText("D: " + questions[4]);
            } else if (ans == 1) {
                button1.setText("A: " + questions[2]);
                button2.setText("B: " + questions[1]);
                button3.setText("C: " + questions[3]);
                button4.setText("D: " + questions[4]);
            } else if (ans == 2) {
                button1.setText("A: " + questions[3]);
                button2.setText("B: " + questions[2]);
                button3.setText("C: " + questions[1]);
                button4.setText("D: " + questions[4]);
            } else if (ans == 3) {
                button1.setText("A: " + questions[4]);
                button2.setText("B: " + questions[2]);
                button3.setText("C: " + questions[3]);
                button4.setText("D: " + questions[1]);
            }
            countA++;
        }
    }

    public void ToAsk_B() {
        if (countB >= 5) {
            ToAsk_C();
        } else {
            String questions[] = groupB.GenerateQuestion();
            question.setText(questions[0]);
            win = questions[1];
            int ans = new Random().nextInt(4);
            if (ans == 0) {
                button1.setText("A: " + questions[1]);
                //button1.append(questions[1]);
                button2.setText("B: " + questions[2]);
                button3.setText("C: " + questions[3]);
                button4.setText("D: " + questions[4]);
            } else if (ans == 1) {
                button1.setText("A: " + questions[2]);
                button2.setText("B: " + questions[1]);
                button3.setText("C: " + questions[3]);
                button4.setText("D: " + questions[4]);
            } else if (ans == 2) {
                button1.setText("A: " + questions[3]);
                button2.setText("B: " + questions[2]);
                button3.setText("C: " + questions[1]);
                button4.setText("D: " + questions[4]);
            } else if (ans == 3) {
                button1.setText("A: " + questions[4]);
                button2.setText("B: " + questions[2]);
                button3.setText("C: " + questions[3]);
                button4.setText("D: " + questions[1]);
            }
            countB++;
        }
    }

    public void ToAsk_C() {
        if (countC >= 5) {
            ToAsk_A();
        } else {
            String questions[] = groupC.GenerateQuestion();
            question.setText(questions[0]);
            win = questions[1];
            int ans = new Random().nextInt(4);
            if (ans == 0) {
                button1.setText("A: " + questions[1]);
                //button1.append(questions[1]);
                button2.setText("B: " + questions[2]);
                button3.setText("C: " + questions[3]);
                button4.setText("D: " + questions[4]);
            } else if (ans == 1) {
                button1.setText("A: " + questions[2]);
                button2.setText("B: " + questions[1]);
                button3.setText("C: " + questions[3]);
                button4.setText("D: " + questions[4]);
            } else if (ans == 2) {
                button1.setText("A: " + questions[3]);
                button2.setText("B: " + questions[2]);
                button3.setText("C: " + questions[1]);
                button4.setText("D: " + questions[4]);
            } else if (ans == 3) {
                button1.setText("A: " + questions[4]);
                button2.setText("B: " + questions[2]);
                button3.setText("C: " + questions[3]);
                button4.setText("D: " + questions[1]);
            }
            countC++;
        }
    }

    private void ReferenceComponents() {
        this.L_Game = findViewById(R.id.L_Game);

        this.question = findViewById(R.id.question);
        this.answer = findViewById(R.id.answer);
        this.money = findViewById(R.id.money);

        this.button1 = findViewById(R.id.button1);
        this.button2 = findViewById(R.id.button2);
        this.button3 = findViewById(R.id.button3);
        this.button4 = findViewById(R.id.button4);
    }//Los componentes son referenciados a los del activity

    private void InitializeComponents() {

        groupA = new GroupA();
        groupB = new GroupB();
        groupC = new GroupC();

        countA = countB = countC = moneyWin = 0;

        win = "";
    }//Los componentes son inicializados

    private void StarGame() {
        InitializeComponents();
        ViewRunnigGame();
        ToAsk_A();
    }

    private void ThreadButton(View button, int answer) {

        /*if (answer == 1) {//segun el valor que reciba pintara el boton de un color
            button.setBackgroundColor(getResources().getColor(R.color.colorAccent));
        } else if (answer == 2) {
            button.setBackgroundColor(getResources().getColor(R.color.colorAccent));
        }

        jugador1.setEnabled(false);//se desabilitan botones
        jugador2.setEnabled(false);

        new Thread(new Runnable() {
            public void run() {

                Tiempo(1500);//dormimos medio segundo

                runOnUiThread(new Runnable() {
                    @Override
                    public void run() {
                        jugador1.setEnabled(true);//habilitamos botones
                        jugador2.setEnabled(true);
                        //volvemos a los colores originales
                        jugador1.setBackgroundColor(getResources().getColor(R.color.colorPrimaryDark));
                        jugador2.setBackgroundColor(getResources().getColor(R.color.colorPrimary));
                    }
                });
            }
        }).start();*/
    }//Funcion para el hilo de los botones

    private void Verify(String data) {
        String data2 = data.substring(3, data.length());
        if (win.equals(data2)) {
            answer.setText("Correcto");
            moneyWin++;
            money.setText("" + moneyWin);
            ToAsk_A();
        } else {
            answer.setText("Incorrecto");
            ToAsk_A();
        }
    }//Verifica la respuesta

    private void Time(int time) {
        try {
            Thread.sleep(time);
        } catch (InterruptedException e) {
            Toast.makeText(this, "Error en el tiempo del main: " + e.toString(), Toast.LENGTH_SHORT).show();
        }
    }//Funcion para dormir un hilo

    public void onClick(View view) {
        if (view.getId() == R.id.button1) {
            String data = button1.getText().toString();
            Verify(data);
        } else if (view.getId() == R.id.button2) {
            String data = button2.getText().toString();
            Verify(data);
        } else if (view.getId() == R.id.button3) {
            String data = button3.getText().toString();
            Verify(data);
        } else if (view.getId() == R.id.button4) {
            String data = button4.getText().toString();
            Verify(data);
        }
    }//Funcion para el click del boton
}
