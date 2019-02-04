package org.sando.wwtbm;

import android.content.DialogInterface;
import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.EditText;
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

    private LinearLayout L_Game, L_start, L_wellcome, L_instructions,L_answer,L_progress,L_end;
    private TextView question, money, accumulated, T_instruc, player,T_progress,T_end;
    private Button button1, button2, button3, button4, call, fivefive, public0, btn_run, btn_run2, btn_back,btn_end,continue0,btn_menu;
    private EditText name;

    private int countA, countB, countC, moneyWin;
    private String win, namePlayer;

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
        player.append(namePlayer);
        L_Game.setVisibility(View.VISIBLE);
        ToAsk_A();
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
        L_answer.setBackgroundColor(Color.MAGENTA);
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
        L_answer.setBackgroundColor(Color.RED);
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

    private void StarGame() {
        InitializeComponents();
        ViewWellcome();
    }

    private void ViewWellcome() {
        L_start.setVisibility(View.VISIBLE);
        L_wellcome.setVisibility(View.VISIBLE);
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
        L_Game.setVisibility(View.GONE);
        L_progress.setVisibility(View.VISIBLE);
        String data2 = data.substring(3, data.length());
        if (win.equals(data2)) {
            moneyWin++;
            money.setText("" + moneyWin);
            T_progress.setText("Respuesta correcta!!\n" +
                    namePlayer+" ha ganado: "+moneyWin);
        } else {
            ViewEnd();
        }
    }//Verifica la respuesta

    private void ViewProgress(){
        L_progress.setVisibility(View.VISIBLE);
    }

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

        if (view.getId() == R.id.fivefive) {
            fivefive.setEnabled(false);
        } else if (view.getId() == R.id.call) {
            call.setEnabled(false);
        } else if (view.getId() == R.id.public0) {
            public0.setEnabled(false);
        }

        if (view.getId() == R.id.btn_run) {
            namePlayer = name.getText().toString();
            L_instructions.setVisibility(View.VISIBLE);
            L_wellcome.setVisibility(View.GONE);
        } else if (view.getId() == R.id.btn_run2) {
            L_start.setVisibility(View.GONE);
            ViewRunnigGame();
        } else if (view.getId() == R.id.btn_back) {
            StarGame();
        }

        if (view.getId() == R.id.btn_end) {
            ViewEnd();
        } else if (view.getId() == R.id.btn_continue) {
            L_Game.setVisibility(View.VISIBLE);
            L_progress.setVisibility(View.GONE);
            ToAsk_A();
        }

        if (view.getId() == R.id.btn_menu) {
            StarGame();
        }
    }//Funcion para el click del boton

    private void ViewEnd(){
        T_end.setText(namePlayer+" ha terminado el juego!!\n" +
                "tus ganancias son: "+moneyWin);
        L_progress.setVisibility(View.GONE);
        L_end.setVisibility(View.VISIBLE);
    }

    private void ReferenceComponents() {
        this.L_Game = findViewById(R.id.L_Game);
        this.L_start = findViewById(R.id.L_start);
        this.L_wellcome = findViewById(R.id.L_wellcome);
        this.L_instructions = findViewById(R.id.L_instructions);
        this.L_answer = findViewById(R.id.L_answer);
        this.L_progress = findViewById(R.id.L_progress);
        this.L_end = findViewById(R.id.L_end);

        this.question = findViewById(R.id.question);
        this.accumulated = findViewById(R.id.accumulated);
        this.money = findViewById(R.id.money);
        this.T_instruc = findViewById(R.id.T_instruc);
        this.player = findViewById(R.id.player);
        this.T_progress = findViewById(R.id.T_progress);
        this.T_end = findViewById(R.id.T_end);

        this.button1 = findViewById(R.id.button1);
        this.button2 = findViewById(R.id.button2);
        this.button3 = findViewById(R.id.button3);
        this.button4 = findViewById(R.id.button4);
        this.call = findViewById(R.id.call);
        this.public0 = findViewById(R.id.public0);
        this.fivefive = findViewById(R.id.fivefive);
        this.btn_run = findViewById(R.id.btn_run);
        this.btn_run2 = findViewById(R.id.btn_run2);
        this.btn_back = findViewById(R.id.btn_back);
        this.btn_end = findViewById(R.id.btn_end);
        this.continue0 = findViewById(R.id.btn_continue);
        this.btn_menu = findViewById(R.id.btn_menu);

        this.name = findViewById(R.id.name);
    }//Los componentes son referenciados a los del activity

    private void InitializeComponents() {

        groupA = new GroupA();
        groupB = new GroupB();
        groupC = new GroupC();

        countA = countB = countC = moneyWin = 0;
        win = namePlayer = "";

        T_instruc.setText("Para jugar:\n" +
                "1) Solo tendrás una oportunidad para jugar, en el primer intento fallido estarás fuera!\n" +
                "2) Aparecerán preguntas en pantalla, solo debes oprimir el botón con la respuesta correcta\n" +
                "3) Tendrás 3 ayudas para usar una única vez: cincuenta cincuenta, llamada a un amigo, ayuda del público\n" +
                "4) Tendrás 2 seguros: cuando llegues a 1000 y cuando llegues a 32000\n" +
                "5) Ganar dinero");

        L_start.setVisibility(View.GONE);
        L_Game.setVisibility(View.GONE);
        L_progress.setVisibility(View.GONE);
        L_end.setVisibility(View.GONE);
        L_answer.setBackgroundColor(Color.YELLOW);
    }//Los componentes son inicializados

    @Override
    public boolean onKeyDown(int keyCode, KeyEvent event) {
        if (keyCode == KeyEvent.KEYCODE_BACK && event.getRepeatCount() == 0) {
            // Esto es lo que hace mi botón al pulsar ir a atrás
            AlertDialog.Builder goMenu = new AlertDialog.Builder(MainActivity.this);
            goMenu.setMessage("Go to menu?")
                    .setCancelable(true)
                    .setPositiveButton("YES", new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialogInterface, int i) {
                            StarGame();
                        }
                    })
                    .setNegativeButton("NO", new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialogInterface, int i) {
                            dialogInterface.cancel();
                        }
                    });
            AlertDialog msg = goMenu.create();
            msg.setTitle("Exit");
            msg.show();
            return true;
        }
        return super.onKeyDown(keyCode, event);
    }
}
