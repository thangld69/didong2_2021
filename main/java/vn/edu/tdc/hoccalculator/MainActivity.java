package vn.edu.tdc.hoccalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    Button btn1,btn2,btn3,btn4,btn5,btn6,btn7,btn8,btn9,btn0;
    Button btnCong,btnNhan,btnChia,btnTru,btnXoa,btnBang;
    TextView txtThongTin,txtKetQua;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        addControls();
        addEvents();

    }

    private void addEvents() {
        btn0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                txtThongTin.setText(txtThongTin.getText()+"1");
            }
        });
        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                txtThongTin.setText( txtThongTin.getText()+"1");
            }
        });
        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                txtThongTin.setText( txtThongTin.getText()+"1");
            }
        });
        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                txtThongTin.setText( txtThongTin.getText()+"3");
            }
        });
        btn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                txtThongTin.setText( txtThongTin.getText()+"4");
            }
        });
        btn5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                txtThongTin.setText( txtThongTin.getText()+"5");
            }
        });

        btn6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                txtThongTin.setText( txtThongTin.getText()+"6");
            }
        });
        btn7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                txtThongTin.setText( txtThongTin.getText()+"7");
            }
        });
        btn8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                txtThongTin.setText( txtThongTin.getText()+"8");
            }
        });
        btn9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                txtThongTin.setText( txtThongTin.getText()+"9");
            }
        });
        btnCong.setOnClickListener(new View.OnClickListener() {
            @Override
               public void onClick(View v) {
                String thongTin= txtThongTin.getText().toString();
                if(txtThongTin.getText().toString().isEmpty())
                {
                   txtThongTin.setText(txtThongTin.getText());
                }
                else if(thongTin.indexOf("/",thongTin.length()-1)==-1)
                {
                    if (thongTin.indexOf("*",thongTin.length()-1)==-1)
                    {
                        if (thongTin.indexOf("+",thongTin.length()-1)==-1)
                        {
                            if(thongTin.indexOf("-",thongTin.length()-1)==-1)
                            {
                                txtThongTin.setText(txtThongTin.getText()+"+");
                            }
                        }

                    }

                }

            }
        });
        btnTru.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String thongTin= txtThongTin.getText().toString();
                if(txtThongTin.getText().toString().isEmpty())
                {
                    txtThongTin.setText(txtThongTin.getText().toString());
                }
                else if(thongTin.indexOf("/",thongTin.length()-1)==-1)
                {
                    if (thongTin.indexOf("*",thongTin.length()-1)==-1)
                    {
                        if (thongTin.indexOf("+",thongTin.length()-1)==-1)
                        {
                            if(thongTin.indexOf("-",thongTin.length()-1)==-1)
                            {
                                txtThongTin.setText(txtThongTin.getText()+"-");
                            }
                        }

                    }

                }

            }
        });
        btnNhan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String thongTin= txtThongTin.getText().toString();
                if(txtThongTin.getText().toString().isEmpty())
                {
                    txtThongTin.setText(txtThongTin.getText());
                }
                else if(thongTin.indexOf("/",thongTin.length()-1)==-1)
                {
                    if (thongTin.indexOf("*",thongTin.length()-1)==-1)
                    {
                        if (thongTin.indexOf("+",thongTin.length()-1)==-1)
                        {
                            if(thongTin.indexOf("-",thongTin.length()-1)==-1)
                            {
                                txtThongTin.setText(txtThongTin.getText()+"*");
                            }
                        }

                    }

                }
            }
        });
        btnChia.setOnClickListener(new View.OnClickListener() {
            @Override

            public void onClick(View v) {
                String thongTin= txtThongTin.getText().toString();
                if(thongTin.isEmpty())
                {
                    txtThongTin.setText(txtThongTin.getText());
                }
                else if(thongTin.indexOf("/",thongTin.length()-1)==-1)
                {
                    if (thongTin.indexOf("*",thongTin.length()-1)==-1)
                    {
                        if (thongTin.indexOf("+",thongTin.length()-1)==-1)
                        {
                            if(thongTin.indexOf("-",thongTin.length()-1)==-1)
                            {
                                txtThongTin.setText(txtThongTin.getText()+"/");
                            }
                        }

                    }

                }


            }
        });
        btnXoa.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                StringBuilder thongTin = new StringBuilder(txtThongTin.getText().toString());
                txtThongTin.setText(thongTin.delete(0,thongTin.length()));
            }
        });
        btnBang.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });
    }

    private void addControls() {
        btn0 = findViewById(R.id.btn0);
        btn1 = findViewById(R.id.btn1);
        btn2 = findViewById(R.id.btn2);
        btn3 = findViewById(R.id.btn3);
        btn4 = findViewById(R.id.btn4);
        btn5 = findViewById(R.id.btn5);
        btn6 = findViewById(R.id.btn6);
        btn7 = findViewById(R.id.btn7);
        btn8 = findViewById(R.id.btn8);
        btn9 = findViewById(R.id.btn9);
        btnCong = findViewById(R.id.btnCong);
        btnTru = findViewById(R.id.btnTru);
        btnNhan = findViewById(R.id.btnNhan);
        btnChia = findViewById(R.id.btnChia);
        btnXoa= findViewById(R.id.btnXoa);
        btnBang = findViewById(R.id.btnBang);
        txtThongTin = findViewById(R.id.txtThongTin);
        txtKetQua = findViewById(R.id.txtKetQua);

    }
}