package com.gdgandroidbolivia.calculadora;

import android.content.Intent;
import android.provider.Settings;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    private double operador1;
    private double operador2;
    private double operadores;

    private boolean mAdicion,mResta,mMultiplicacion,mDivision;

    private EditText txt_visor;

    private Button n1;
    private Button n2;
    private Button n3;
    private Button n4;
    private Button n5;
    private Button n6;
    private Button n7;
    private Button n8;
    private Button n9;
    private Button n0;

    private Button Punto;

    private Button Suma;
    private Button Resta;
    private Button Multiplicacion;
    private Button Division;

    private Button Igual;
    private Button Limpiar;
    private Button Salir;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        txt_visor=(EditText) findViewById(R.id.cajaResultado);

        n1=(Button) findViewById(R.id.uno);
        n2=(Button) findViewById(R.id.dos);
        n3=(Button) findViewById(R.id.tres);
        n4=(Button) findViewById(R.id.cuatro);
        n5=(Button) findViewById(R.id.cinco);
        n6=(Button) findViewById(R.id.seis);
        n7=(Button) findViewById(R.id.siete);
        n8=(Button) findViewById(R.id.ocho);
        n9=(Button) findViewById(R.id.nueve);
        n0=(Button) findViewById(R.id.cero);

        Punto=(Button) findViewById(R.id.punto);

        Suma=(Button) findViewById(R.id.suma);
        Resta=(Button) findViewById(R.id.resta);
        Multiplicacion=(Button) findViewById(R.id.multiplicacion);
        Division=(Button) findViewById(R.id.division);

        Igual=(Button) findViewById(R.id.igual);

        Limpiar=(Button) findViewById(R.id.limpiar);
        Salir=(Button) findViewById(R.id.salir);


        n1.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                txt_visor.setText(txt_visor.getText()+"1");
            }
        });
        n2.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                txt_visor.setText(txt_visor.getText()+"2");
            }
        });
        n3.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                txt_visor.setText(txt_visor.getText()+"3");
            }
        });
        n4.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                txt_visor.setText(txt_visor.getText()+"4");
            }
        });
        n5.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                txt_visor.setText(txt_visor.getText()+"5");
            }
        });
        n6.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                txt_visor.setText(txt_visor.getText()+"6");
            }
        });
        n7.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                txt_visor.setText(txt_visor.getText()+"7");
            }
        });
        n8.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                txt_visor.setText(txt_visor.getText()+"8");
            }
        });
        n9.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                txt_visor.setText(txt_visor.getText()+"9");
            }
        });
        n0.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                txt_visor.setText(txt_visor.getText()+"0");
            }
        });

        Suma.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                if(txt_visor==null){
                    txt_visor.setText("");
                }
                else{
                    operador1=Double.parseDouble(txt_visor.getText()+"");
                    mAdicion=true;
                    txt_visor.setText(null);
                }
            }
        });
        Resta.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                if(txt_visor==null){
                    txt_visor.setText("");
                }
                else{
                    operador1=Double.parseDouble(txt_visor.getText()+"");
                    mResta=true;
                    txt_visor.setText(null);
                }
            }
        });
        Multiplicacion.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                if(txt_visor==null){
                    txt_visor.setText("");
                }
                else{
                    operador1=Double.parseDouble(txt_visor.getText()+"");
                    mMultiplicacion=true;
                    txt_visor.setText(null);
                }
            }
        });
        Division.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                if(txt_visor==null){
                    txt_visor.setText("");
                }
                else{
                    operador1=Double.parseDouble(txt_visor.getText()+"");
                    mDivision=true;
                    txt_visor.setText(null);
                }
            }
        });
        Igual.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                operador2=Double.parseDouble(txt_visor.getText()+"");
                if(mAdicion==true){
                    txt_visor.setText(operador1+operador2+"");
                }
                if(mResta==true){
                    txt_visor.setText(operador1-operador2+"");
                }
                if(mMultiplicacion==true){
                    txt_visor.setText(operador1*operador2+"");
                }
                if(mDivision==true){
                    txt_visor.setText(operador1/operador2+"");
                }
            }
        });
        Limpiar.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                if(txt_visor==null){
                    txt_visor.setText("");
                }
                else{
                    txt_visor.setText(null);
                }
            }
        });
        Salir.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                finish();
                System.runFinalization();
                System.exit(0);
            }
        });

    }
}
