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
                    Toast.makeText(MainActivity.this,"Правильно",Toast.LENGTH_SHORT).show();
                    YoYo.with(Techniques.Tada)
                            .duration(300)
                            .repeat(1)
                            .withListener(new Animator.AnimatorListener() {
                                @Override
                                public void onAnimationStart(Animator animator) {
                                    btnCadillac.setBackgroundColor(Color.GREEN);
                                }

                                @Override
                                public void onAnimationEnd(Animator animator) {
                                    btnCadillac.setBackgroundColor(Color.BLUE);
                                }

                                @Override
                                public void onAnimationCancel(Animator animator) {

                                }

                                @Override
                                public void onAnimationRepeat(Animator animator) {

                                }
                            })
                            .playOn(findViewById(R.id.btn_cadillac));
                }else {
                    Toast.makeText(MainActivity.this,"Неправильно",Toast.LENGTH_SHORT).show();
                    YoYo.with(Techniques.Tada)
                            .duration(300)
                            .repeat(1)
                            .withListener(new Animator.AnimatorListener() {
                                @Override
                                public void onAnimationStart(Animator animator) {
                                    btnCadillac.setBackgroundColor(Color.RED);
                                }

                                @Override
                                public void onAnimationEnd(Animator animator) {
                                    btnCadillac.setBackgroundColor(Color.BLUE);
                                }

                                @Override
                                public void onAnimationCancel(Animator animator) {

                                }

                                @Override
                                public void onAnimationRepeat(Animator animator) {

                                }
                            })
                            .playOn(btnCadillac);
                }
            }
        });
        btnMustang.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (isMustang) {
                    Toast.makeText(MainActivity.this,"Правильно",Toast.LENGTH_SHORT).show();
                    YoYo.with(Techniques.Tada)
                            .duration(300)
                            .repeat(1)
                            .withListener(new Animator.AnimatorListener() {
                                @Override
                                public void onAnimationStart(Animator animator) {
                                    btnMustang.setBackgroundColor(Color.GREEN);
                                }

                                @Override
                                public void onAnimationEnd(Animator animator) {
                                    btnMustang.setBackgroundColor(Color.BLUE);
                                }

                                @Override
                                public void onAnimationCancel(Animator animator) {

                                }

                                @Override
                                public void onAnimationRepeat(Animator animator) {

                                }
                            })
                            .playOn(btnMustang);
                }else {
                    Toast.makeText(MainActivity.this,"Неправильно",Toast.LENGTH_SHORT).show();
                    YoYo.with(Techniques.Tada)
                            .duration(300)
                            .repeat(1)
                            .withListener(new Animator.AnimatorListener() {
                                @Override
                                public void onAnimationStart(Animator animator) {
                                    btnMustang.setBackgroundColor(Color.RED);
                                }

                                @Override
                                public void onAnimationEnd(Animator animator) {
                                    btnMustang.setBackgroundColor(Color.BLUE);
                                }

                                @Override
                                public void onAnimationCancel(Animator animator) {

                                }

                                @Override
                                public void onAnimationRepeat(Animator animator) {

                                }
                            })
                            .playOn(btnMustang);
                }
            }
        });
        btnPeugeot.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (isPeugeot) {
                    Toast.makeText(MainActivity.this,"Правильно",Toast.LENGTH_SHORT).show();
                    YoYo.with(Techniques.Tada)
                            .duration(300)
                            .repeat(1)
                            .withListener(new Animator.AnimatorListener() {
                                @Override
                                public void onAnimationStart(Animator animator) {
                                    btnPeugeot.setBackgroundColor(Color.GREEN);
                                }

                                @Override
                                public void onAnimationEnd(Animator animator) {
                                    btnPeugeot.setBackgroundColor(Color.BLUE);
                                }

                                @Override
                                public void onAnimationCancel(Animator animator) {

                                }

                                @Override
                                public void onAnimationRepeat(Animator animator) {

                                }
                            })
                            .playOn(btnPeugeot);
                } else {
                    Toast.makeText(MainActivity.this,"Неправильно",Toast.LENGTH_SHORT).show();
                    YoYo.with(Techniques.Tada)
                            .duration(300)
                            .repeat(1)
                            .withListener(new Animator.AnimatorListener() {
                                @Override
                                public void onAnimationStart(Animator animator) {
                                    btnPeugeot.setBackgroundColor(Color.RED);
                                }

                                @Override
                                public void onAnimationEnd(Animator animator) {
                                    btnPeugeot.setBackgroundColor(Color.BLUE);
                                }

                                @Override
                                public void onAnimationCancel(Animator animator) {

                                }

                                @Override
                                public void onAnimationRepeat(Animator animator) {

                                }
                            })
                            .playOn(btnPeugeot);

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