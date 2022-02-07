package com.example.android1_lesson1_dz;

import androidx.appcompat.app.AppCompatActivity;

import android.animation.Animator;
import android.graphics.Color;
import android.os.Bundle;
import android.os.CountDownTimer;
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
//        checkChoose();
//        countDownForCustomAnimation();
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
                            Toast.makeText(MainActivity.this, "Верно", Toast.LENGTH_SHORT).show();
                        }
                    }.start();
                    };
                    Toast.makeText(MainActivity.this, "Верно", Toast.LENGTH_SHORT).show();
                } else {
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
            }
        });

        btnMustang.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (isMustang) {
                    countDownTimer = new CountDownTimer(1000, 1000) {
                        @Override
                        public void onTick(long l) {
                            YoYo.with(Techniques.Tada)
                                    .duration(300)
                                    .repeat(1)
                                    .playOn(findViewById(R.id.btn_cadillac));
                            btnMustang.setBackgroundResource(R.drawable.corectk);
                        }

                        @Override
                        public void onFinish() {
                            btnMustang.setBackgroundResource(R.drawable.deffault);
                        }
                    }.start();
                    Toast.makeText(MainActivity.this, "Верно", Toast.LENGTH_SHORT).show();
                } else {
                    countDownTimer = new CountDownTimer(1000, 1000) {
                        @Override
                        public void onTick(long l) {
                            YoYo.with(Techniques.Tada)
                                    .duration(300)
                                    .repeat(1)
                                    .playOn(findViewById(R.id.btn_cadillac));
                            btnMustang.setBackgroundResource(R.color.inCorrect);
                        }

                        @Override
                        public void onFinish() {
                            btnMustang.setBackgroundResource(R.drawable.deffault);
                        }
                    }.start();

                    Toast.makeText(MainActivity.this, "Неверно", Toast.LENGTH_SHORT).show();
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


//    public void changeImage(View view) {
//        switch (view.getId()) {
//            case btnCadillac:
//                imImage.setImageResource(R.drawable.cadillac);
//                isCadillac = true;
//                isMustang = false;
//                isPeugeot = false;
//                break;
//            case R.id.btn_two:
//                imImage.setImageResource(R.drawable.mustang);
//                isCadillac = false;
//                isMustang = true;
//                isPeugeot = false;
//                break;
//            case R.id.btn_three:
//                imImage.setImageResource(R.drawable.peugeot);
//                isCadillac = false;
//                isMustang = false;
//                isPeugeot = true;
//                break;
//        }
//    }
//
//    private void countDownForCustomAnimation() {
//        btnCadillac.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                if (isCadillac){
//                    countDownTimer = new CountDownTimer(2000,2000) {
//                        @Override
//                        public void onTick(long l) {
//                            YoYo.with(Techniques.Tada)
//                                    .duration(200)
//                                    .repeat(2)
//                                    .playOn(btnCadillac);
//                            btnCadillac.setBackgroundResource(R.drawable.corectk);
//                        }
//                        @Override
//                        public void onFinish() {
//                            btnCadillac.setBackgroundResource(R.drawable.deffault);
//                        }
//                    }.start();
//
//                    Toast.makeText(MainActivity.this, "Правельно", Toast.LENGTH_LONG).show();
//                    YoYo.with(Techniques.Shake)
//                            .duration(200)
//                            .repeat(2)
//                            .withListener(new Animator.AnimatorListener() {
//                                @Override
//                                public void onAnimationStart(Animator animator) {
//                                    btnCadillac.setBackgroundColor(Color.GREEN);
//                                }
//
//                                @Override
//                                public void onAnimationEnd(Animator animator) {
//                                    btnCadillac.setBackgroundColor(Color.BLUE);
//
//                                }
//
//                                @Override
//                                public void onAnimationCancel(Animator animator) {
//
//                                }
//
//                                @Override
//                                public void onAnimationRepeat(Animator animator) {
//
//                                }
//                            })
//                            .playOn(btnCadillac);
//                }else {
//                    countDownTimer = new CountDownTimer(2000,2000) {
//                        @Override
//                        public void onTick(long l) {
//                            YoYo.with(Techniques.Shake)
//                                    .duration(200)
//                                    .repeat(2)
//                                    .playOn(findViewById(R.id.btn_cadillac));
//                            btnCadillac.setBackgroundResource(R.drawable.inc_orrectk);
//                        }
//
//                        @Override
//                        public void onFinish() {
//                            btnMustang.setBackgroundResource(R.drawable.deffault);
//                        }
//                    }.start();
//                    Toast.makeText(MainActivity.this, "NO", Toast.LENGTH_SHORT).show();
//                    YoYo.with(Techniques.Shake)
//                            .duration(200)
//                            .repeat(2)
//                            .withListener(new Animator.AnimatorListener() {
//                                @Override
//                                public void onAnimationStart(Animator animator) {
//                                    btnCadillac.setBackgroundColor(Color.RED);
//                                }
//
//                                @Override
//                                public void onAnimationEnd(Animator animator) {
//                                    btnCadillac.setBackgroundColor(Color.BLUE);
//
//                                }
//
//                                @Override
//                                public void onAnimationCancel(Animator animator) {
//
//                                }
//
//                                @Override
//                                public void onAnimationRepeat(Animator animator) {
//
//                                }
//                            })
//                            .playOn(btnCadillac);
//                }
//            }
//        });
//        btnMustang.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                if (isMustang){
//                    countDownTimer = new CountDownTimer(2000,2000) {
//                        @Override
//                        public void onTick(long l) {
//                            YoYo.with(Techniques.Tada)
//                                    .duration(200)
//                                    .repeat(2)
//                                    .playOn(findViewById(R.id.btn_mustang));
//                            btnMustang.setBackgroundResource(R.drawable.corectk);
//                        }
//
//                        @Override
//                        public void onFinish() {
//                            btnMustang.setBackgroundResource(R.drawable.deffault);
//                        }
//                    }.start();
//                    Toast.makeText(MainActivity.this, "Правельно", Toast.LENGTH_LONG).show();
//                    YoYo.with(Techniques.Shake)
//                            .duration(200)
//                            .repeat(2)
//                            .withListener(new Animator.AnimatorListener() {
//                                @Override
//                                public void onAnimationStart(Animator animator) {
//                                    btnMustang.setBackgroundColor(Color.GREEN);
//                                }
//
//                                @Override
//                                public void onAnimationEnd(Animator animator) {
//                                    btnMustang.setBackgroundColor(Color.BLUE);
//
//                                }
//
//                                @Override
//                                public void onAnimationCancel(Animator animator) {
//
//                                }
//
//                                @Override
//                                public void onAnimationRepeat(Animator animator) {
//
//                                }
//                            })
//                            .playOn(btnMustang);
//                }else {
//                    countDownTimer = new CountDownTimer(2000,2000) {
//                        @Override
//                        public void onTick(long l) {
//                            YoYo.with(Techniques.Shake)
//                                    .duration(200)
//                                    .repeat(2)
//                                    .playOn(findViewById(R.id.btn_mustang));
//                            btnMustang.setBackgroundResource(R.drawable.inc_orrectk);
//                        }
//
//                        @Override
//                        public void onFinish() {
//                            btnCadillac.setBackgroundResource(R.drawable.deffault);
//                        }
//                    }.start();
//                    Toast.makeText(MainActivity.this, "NO", Toast.LENGTH_SHORT).show();
//                    YoYo.with(Techniques.Shake)
//                            .duration(200)
//                            .repeat(2)
//                            .withListener(new Animator.AnimatorListener() {
//                                @Override
//                                public void onAnimationStart(Animator animator) {
//                                    btnCadillac.setBackgroundColor(Color.RED);
//                                }
//
//                                @Override
//                                public void onAnimationEnd(Animator animator) {
//                                    btnCadillac.setBackgroundColor(Color.BLUE);
//
//                                }
//
//                                @Override
//                                public void onAnimationCancel(Animator animator) {
//
//                                }
//
//                                @Override
//                                public void onAnimationRepeat(Animator animator) {
//
//                                }
//                            })
//                            .playOn(btnCadillac);
//
//                }
//            }
//        });
//
//        btnPeugeot.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                if (isPeugeot){
//                    countDownTimer = new CountDownTimer(2000,2000) {
//                        @Override
//                        public void onTick(long l) {
//                            YoYo.with(Techniques.Tada)
//                                    .duration(200)
//                                    .repeat(2)
//                                    .playOn(findViewById(R.id.btn_peugeot));
//                            btnPeugeot.setBackgroundResource(R.drawable.corectk);
//                        }
//
//                        @Override
//                        public void onFinish() {
//                            btnPeugeot.setBackgroundResource(R.drawable.deffault);
//                        }
//                    }.start();
//                    Toast.makeText(MainActivity.this, "Правельно", Toast.LENGTH_LONG).show();
//                    YoYo.with(Techniques.Shake)
//                            .duration(200)
//                            .repeat(2)
//                            .withListener(new Animator.AnimatorListener() {
//                                @Override
//                                public void onAnimationStart(Animator animator) {
//                                    btnCadillac.setBackgroundColor(Color.GREEN);
//                                }
//
//                                @Override
//                                public void onAnimationEnd(Animator animator) {
//                                    btnCadillac.setBackgroundColor(Color.BLUE);
//
//                                }
//
//                                @Override
//                                public void onAnimationCancel(Animator animator) {
//
//                                }
//
//                                @Override
//                                public void onAnimationRepeat(Animator animator) {
//
//                                }
//                            })
//                            .playOn(btnPeugeot);
//                }else {
//                    countDownTimer = new CountDownTimer(2000,2000) {
//                        @Override
//                        public void onTick(long l) {
//                            YoYo.with(Techniques.Shake)
//                                    .duration(200)
//                                    .repeat(2)
//                                    .playOn(findViewById(R.id.btn_peugeot));
//                            btnPeugeot.setBackgroundResource(R.drawable.inc_orrectk);
//                        }
//
//                        @Override
//                        public void onFinish() {
//                            btnMustang.setBackgroundResource(R.drawable.deffault);
//                        }
//                    }.start();
//                    Toast.makeText(MainActivity.this, "NO", Toast.LENGTH_SHORT).show();
//                    YoYo.with(Techniques.Shake)
//                            .duration(200)
//                            .repeat(2)
//                            .withListener(new Animator.AnimatorListener() {
//                                @Override
//                                public void onAnimationStart(Animator animator) {
//                                    btnMustang.setBackgroundColor(Color.RED);
//                                }
//
//                                @Override
//                                public void onAnimationEnd(Animator animator) {
//                                    btnMustang.setBackgroundColor(Color.BLUE);
//
//                                }
//
//                                @Override
//                                public void onAnimationCancel(Animator animator) {
//
//                                }
//
//                                @Override
//                                public void onAnimationRepeat(Animator animator) {
//
//                                }
//                            })
//                            .playOn(btnMustang);
//                }
//            }
//        });
//    }
}