package com.example.android1_lesson1_dz;

import androidx.appcompat.app.AppCompatActivity;

import android.animation.Animator;
import android.graphics.Color;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Toast;

import com.daimajia.androidanimations.library.Techniques;
import com.daimajia.androidanimations.library.YoYo;

public class MainActivity extends AppCompatActivity {

    ImageView imImage;
    Button btnCadillac, btnMustang, btnPeugeot;
    boolean isCadillac, isMustang, isPeugeot;
    CountDownTimer countDownTimer;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initView();
        initClick();
    }

    private void initView() {
        imImage = findViewById(R.id.im_image);
        btnCadillac = findViewById(R.id.btn_cadillac);
        btnMustang = findViewById(R.id.btn_mustang);
        btnPeugeot = findViewById(R.id.btn_peugeot);
    }

    private void initClick() {
        btnCadillac.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (isCadillac) {
                    countDownTimer = new CountDownTimer(1000, 1000) {
                        @Override
                        public void onTick(long l) {
                            YoYo.with(Techniques.Tada)
                                    .duration(300)
                                    .repeat(1)
                                    .playOn(findViewById(R.id.btn_cadillac));
                            btnCadillac.setBackgroundResource(R.drawable.corectk);
                        }

                        @Override
                        public void onFinish() {
                            btnCadillac.setBackgroundResource(R.drawable.deffault);
                            Toast.makeText(MainActivity.this, "Верно", Toast.LENGTH_SHORT).show();
                        }
                    }.start();
                } else
                    countDownTimer = new CountDownTimer(1000, 1000) {
                        @Override
                        public void onTick(long l) {
                            YoYo.with(Techniques.Tada)
                                    .duration(300)
                                    .repeat(1)
                                    .playOn(findViewById(R.id.btn_cadillac));
                            btnCadillac.setBackgroundResource(R.color.inCorrect);
                        }

                        @Override
                        public void onFinish() {
                            btnCadillac.setBackgroundResource(R.drawable.deffault);
                            Toast.makeText(MainActivity.this, "Неверно", Toast.LENGTH_SHORT).show();
                        }
                    }.start();
//                                                btnCadillac.setBackgroundResource(R.drawable.deffault);
            }
        });

        btnMustang.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (isMustang) {
                    countDownTimer = new CountDownTimer(1000, 1000) {
                        @Override
                        public void onTick(long l) {
                            Log.e("tag", "corretc");
                            YoYo.with(Techniques.Tada)
                                    .duration(300)
                                    .repeat(1)
                                    .playOn(findViewById(R.id.btn_mustang));
                            btnMustang.setBackgroundResource(R.drawable.corectk);
                        }

                        @Override
                        public void onFinish() {
                            btnMustang.setBackgroundResource(R.drawable.deffault);
                            Toast.makeText(MainActivity.this, "Верно", Toast.LENGTH_SHORT).show();
                        }
                    }.start();

                } else {
                    countDownTimer = new CountDownTimer(1000, 1000) {
                        @Override
                        public void onTick(long l) {
                            YoYo.with(Techniques.Tada)
                                    .duration(300)
                                    .repeat(1)
                                    .playOn(findViewById(R.id.btn_mustang));
                            btnMustang.setBackgroundResource(R.color.inCorrect);
                        }

                        @Override
                        public void onFinish() {
                            btnMustang.setBackgroundResource(R.drawable.deffault);
                            Toast.makeText(MainActivity.this, "Неверно", Toast.LENGTH_SHORT).show();
                        }
                    }.start();
                }
            }
        });

        btnPeugeot.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (isPeugeot) {
                    countDownTimer = new CountDownTimer(1000, 1000) {
                        @Override
                        public void onTick(long l) {
                            Log.e("tag", "corretc");
                            YoYo.with(Techniques.Tada)
                                    .duration(300)
                                    .repeat(1)
                                    .playOn(findViewById(R.id.btn_peugeot));
                            btnPeugeot.setBackgroundResource(R.drawable.corectk);
                        }

                        @Override
                        public void onFinish() {
                            btnPeugeot.setBackgroundResource(R.drawable.deffault);
                            Toast.makeText(MainActivity.this, "Верно", Toast.LENGTH_SHORT).show();
                        }
                    }.start();

                } else {
                    countDownTimer = new CountDownTimer(1000, 1000) {
                        @Override
                        public void onTick(long l) {
                            YoYo.with(Techniques.Tada)
                                    .duration(300)
                                    .repeat(1)
                                    .playOn(findViewById(R.id.btn_peugeot));
                            btnPeugeot.setBackgroundResource(R.color.inCorrect);
                        }

                        @Override
                        public void onFinish() {
                            btnPeugeot.setBackgroundResource(R.drawable.deffault);
                            Toast.makeText(MainActivity.this, "Неверно", Toast.LENGTH_SHORT).show();
                        }
                    }.start();
                }
            }
        });
    }

    public void checkChoose(View view) {
        switch (view.getId()) {
            case R.id.btn_one:
                imImage.setImageResource(R.drawable.cadillac);
                isCadillac = true;
                isMustang = false;
                isPeugeot = false;
                break;
            case R.id.btn_two:
                imImage.setImageResource(R.drawable.mustang);
                isCadillac = false;
                isMustang = true;
                isPeugeot = false;
                break;
            case R.id.btn_three:
                imImage.setImageResource(R.drawable.peugeot);
                isCadillac = false;
                isMustang = false;
                isPeugeot = true;
                break;
        }
    }
}