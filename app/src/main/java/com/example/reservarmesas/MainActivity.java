package com.example.reservarmesas;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.SharedPreferences;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    public final String DEFAUT = "defaut";


    //LinerarLayouts

    private LinearLayout linear01;
    private LinearLayout linear02;
    private LinearLayout linear03;
    private LinearLayout linear04;
    private LinearLayout linear05;
    private LinearLayout linear06;
    private LinearLayout linear07;
    private LinearLayout linear08;
    private LinearLayout linear09;

    //Buttons

    private Button button01;
    private Button button02;
    private Button button03;
    private Button button04;
    private Button button05;
    private Button button06;
    private Button button07;
    private Button button08;
    private Button button09;
    private Button buttonLiberarMesa;
    private Button buttonSave;
    private Button buttonReservarTodas;

    //EditTexts

    private EditText editNumeroMesa;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //LinerarLayouts

        linear01 = findViewById(R.id.linear01);
        linear02 = findViewById(R.id.linear02);
        linear03 = findViewById(R.id.linear03);
        linear04 = findViewById(R.id.linear04);
        linear05 = findViewById(R.id.linear05);
        linear06 = findViewById(R.id.linear06);
        linear07 = findViewById(R.id.linear07);
        linear08 = findViewById(R.id.linear08);
        linear09 = findViewById(R.id.linear09);

        //Buttons and functions

        button01 = findViewById(R.id.button01);
        button01.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                reservarMesa("1");

            }
        });

        button02 = findViewById(R.id.button02);
        button02.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                reservarMesa("2");
            }
        });

        button03 = findViewById(R.id.button03);
        button03.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                reservarMesa("3");
            }
        });

        button04 = findViewById(R.id.button04);
        button04.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                reservarMesa("4");
            }
        });

        button05 = findViewById(R.id.button05);
        button05.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                reservarMesa("5");
            }
        });

        button06 = findViewById(R.id.button06);
        button06.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                reservarMesa("6");
            }
        });

        button07 = findViewById(R.id.button07);
        button07.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                reservarMesa("7");
            }
        });

        button08 = findViewById(R.id.button08);
        button08.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                reservarMesa("8");
            }
        });

        button09 = findViewById(R.id.button09);
        button09.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                reservarMesa("9");
            }
        });


        //Button LiberarMesa

        buttonLiberarMesa = findViewById(R.id.buttonLiberarMesa);
        buttonLiberarMesa.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                //retorna numero da mesa
                String numeroMesa = editNumeroMesa.getText().toString();

                //chama metodo de liberar mesa.
                liberarMesa(numeroMesa);

            }
        });


        //Button SalvarEstado - implementação tá bugada e eu n sei pq

        buttonSave = findViewById(R.id.buttonSave);
        buttonSave.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                salvarEstado();
            }
        });

        buttonReservarTodas = findViewById(R.id.buttonReservarTodas);
        buttonReservarTodas.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                reservarTodasMesas();

            }
        });

        //EditTexts

        editNumeroMesa = findViewById(R.id.editNumeroMesa);
        editNumeroMesa.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                //Limpa o texto ao clicar dentro da caixa.

                editNumeroMesa.getText().clear();
            }
        });

    }

    //metodo para liberar mesas, libera a emsa recebida por parametro

    protected void liberarMesa(String numeroMesa){

        AlertDialog alertaMesaDisponivel = new AlertDialog.Builder(this).create();
        alertaMesaDisponivel.setTitle("Mesa não reservada!");
        alertaMesaDisponivel.setMessage("A Mesa " +numeroMesa+ " encontra-se habilitada para reserva!");

        AlertDialog alertaNumero = new AlertDialog.Builder(this).create();
        alertaNumero.setTitle("Atenção!");
        alertaNumero.setMessage("Número da mesa inválido!");


        if(numeroMesa.equals("1")){

            if(!button01.isEnabled()) {

                linear01.setBackgroundColor(getResources().getColor(R.color.colorBlue));
                button01.setEnabled(true);

            }else {

                alertaMesaDisponivel.show();

            }
        }else if(numeroMesa.equals("2")){

            if(!button02.isEnabled()) {

                linear02.setBackgroundColor(getResources().getColor(R.color.colorBlue));
                button02.setEnabled(true);

            }else {

                alertaMesaDisponivel.show();

            }

        }else if(numeroMesa.equals("3")){

            if(!button03.isEnabled()) {

                linear03.setBackgroundColor(getResources().getColor(R.color.colorBlue));
                button03.setEnabled(true);

            }else {

                alertaMesaDisponivel.show();

            }

        }else if(numeroMesa.equals("4")){

            if(!button04.isEnabled()) {

                linear04.setBackgroundColor(getResources().getColor(R.color.colorBlue));
                button04.setEnabled(true);

            }else {

                alertaMesaDisponivel.show();

            }

        }else if(numeroMesa.equals("5")){

            if(!button05.isEnabled()) {

                linear05.setBackgroundColor(getResources().getColor(R.color.colorBlue));
                button05.setEnabled(true);

            }else {

                alertaMesaDisponivel.show();

            }

        }else if(numeroMesa.equals("6")){

            if(!button06.isEnabled()) {

                linear06.setBackgroundColor(getResources().getColor(R.color.colorBlue));
                button06.setEnabled(true);

            }else {

                alertaMesaDisponivel.show();

            }

        }else if(numeroMesa.equals("7")){

            if(!button07.isEnabled()) {

                linear07.setBackgroundColor(getResources().getColor(R.color.colorBlue));
                button07.setEnabled(true);

            }else {

                alertaMesaDisponivel.show();

            }

        }else if(numeroMesa.equals("8")){

            if(!button08.isEnabled()) {

                linear08.setBackgroundColor(getResources().getColor(R.color.colorBlue));
                button08.setEnabled(true);

            }else {

                alertaMesaDisponivel.show();

            }

        }else if(numeroMesa.equals("9")){

            if(!button09.isEnabled()) {

                linear09.setBackgroundColor(getResources().getColor(R.color.colorBlue));
                button09.setEnabled(true);

            }else {

                alertaMesaDisponivel.show();

            }

        }else {

            alertaNumero.show();

        }

    }

    protected void salvarEstado(){



        //verificando as cores dos layouts

        ColorDrawable viewColor01 = (ColorDrawable) linear01.getBackground();
        if(viewColor01.getColor() == getResources().getColor(R.color.colorRed)){
            setlayout("1","Red");

        }else{

            setlayout("1","Blue");
        }


        ColorDrawable viewColor02 = (ColorDrawable) linear02.getBackground();
        if(viewColor01.getColor() == getResources().getColor(R.color.colorRed)){
            setlayout("2","Red");

        }else{

           setlayout("2","Blue");
        }

        ColorDrawable viewColor03 = (ColorDrawable) linear03.getBackground();
        if(viewColor01.getColor() == getResources().getColor(R.color.colorRed)){
            setlayout("3","Red");

        }
        else{

           setlayout("3","Blue");
        }


        ColorDrawable viewColor04 = (ColorDrawable) linear04.getBackground();
        if(viewColor01.getColor() == getResources().getColor(R.color.colorRed)){
            setlayout("4","Red");

        }else{

            setlayout("4","Blue");
        }


        ColorDrawable viewColor05 = (ColorDrawable) linear05.getBackground();
        if(viewColor01.getColor() == getResources().getColor(R.color.colorRed)){
            setlayout("5","Red");

        }else{

            setlayout("5","Blue");
        }


        ColorDrawable viewColor06 = (ColorDrawable) linear06.getBackground();
        if(viewColor01.getColor() == getResources().getColor(R.color.colorRed)){
            //setlayout("6","Red");

        }else{
            setlayout("6","Blue");
        }


        ColorDrawable viewColor07 = (ColorDrawable) linear07.getBackground();
        if(viewColor01.getColor() == getResources().getColor(R.color.colorRed)){
           setlayout("7","Red");

        }else{

            setlayout("7","Blue");
        }


        ColorDrawable viewColor08 = (ColorDrawable) linear08.getBackground();
        if(viewColor01.getColor() == getResources().getColor(R.color.colorRed)){
            setlayout("8","Red");

        }else{

            setlayout("8","Blue");
        }


        ColorDrawable viewColor09 = (ColorDrawable) linear09.getBackground();
        if(viewColor01.getColor() == getResources().getColor(R.color.colorRed)){
            setlayout("9","Red");

        }else{

            setlayout("9","Blue");
        }




    }

    protected void reservarMesa(String numeroMesa){

        if(numeroMesa.equals("1")){

            if(button01.isEnabled()) {

                linear01.setBackgroundColor(getResources().getColor(R.color.colorRed));
                button01.setEnabled(false);

            }
        }else if(numeroMesa.equals("2")){

            if(button02.isEnabled()) {

                linear02.setBackgroundColor(getResources().getColor(R.color.colorRed));
                button02.setEnabled(false);

            }

        }else if(numeroMesa.equals("3")){

            if(button03.isEnabled()) {

                linear03.setBackgroundColor(getResources().getColor(R.color.colorRed));
                button03.setEnabled(false);

            }

        }else if(numeroMesa.equals("4")){

            if(button04.isEnabled()) {

                linear04.setBackgroundColor(getResources().getColor(R.color.colorRed));
                button04.setEnabled(false);

            }

        }else if(numeroMesa.equals("5")){

            if(button05.isEnabled()) {

                linear05.setBackgroundColor(getResources().getColor(R.color.colorRed));
                button05.setEnabled(false);

            }

        }else if(numeroMesa.equals("6")){

            if(button06.isEnabled()) {

                linear06.setBackgroundColor(getResources().getColor(R.color.colorRed));
                button06.setEnabled(false);

            }

        }else if(numeroMesa.equals("7")){

            if(button07.isEnabled()) {

                linear07.setBackgroundColor(getResources().getColor(R.color.colorRed));
                button07.setEnabled(false);

            }

        }else if(numeroMesa.equals("8")){

            if(button08.isEnabled()) {

                linear08.setBackgroundColor(getResources().getColor(R.color.colorRed));
                button08.setEnabled(false);

            }

        }else if(numeroMesa.equals("9")){

            if(button09.isEnabled()) {

                linear09.setBackgroundColor(getResources().getColor(R.color.colorRed));
                button09.setEnabled(false);

            }

        }

    }

    protected void reservarTodasMesas(){

        //Alertas

        AlertDialog alertaTodasReservadas = new AlertDialog.Builder(this).create();
        alertaTodasReservadas.setTitle("Operação invalida!");
        alertaTodasReservadas.setMessage("Todas as mesas ja possuem reservas!");

        int verificaMesas = 0;

        ColorDrawable viewColor01 = (ColorDrawable) linear01.getBackground();
        if(viewColor01.getColor() == getResources().getColor(R.color.colorBlue) ){

            linear01.setBackgroundColor(getResources().getColor(R.color.colorRed));
            button01.setEnabled(false);

        }else {

            verificaMesas++;

        }
        ColorDrawable viewColor02 = (ColorDrawable) linear02.getBackground();
        if(viewColor02.getColor() == getResources().getColor(R.color.colorBlue)){

            linear02.setBackgroundColor(getResources().getColor(R.color.colorRed));
            button02.setEnabled(false);
        }else {

            verificaMesas++;

        }

        ColorDrawable viewColor03 = (ColorDrawable) linear03.getBackground();
        if(viewColor03.getColor() == getResources().getColor(R.color.colorBlue)){

            linear03.setBackgroundColor(getResources().getColor(R.color.colorRed));
            button03.setEnabled(false);
        }else {

            verificaMesas++;

        }

        ColorDrawable viewColor04 = (ColorDrawable) linear04.getBackground();
        if(viewColor04.getColor() == getResources().getColor(R.color.colorBlue)){

            linear04.setBackgroundColor(getResources().getColor(R.color.colorRed));
            button04.setEnabled(false);
        }else {

            verificaMesas++;

        }

        ColorDrawable viewColor05 = (ColorDrawable) linear05.getBackground();
        if(viewColor05.getColor() == getResources().getColor(R.color.colorBlue)){

            linear05.setBackgroundColor(getResources().getColor(R.color.colorRed));
            button05.setEnabled(false);
        }else {

            verificaMesas++;

        }


        ColorDrawable viewColor06 = (ColorDrawable) linear06.getBackground();
        if(viewColor06.getColor() == getResources().getColor(R.color.colorBlue)){

            linear06.setBackgroundColor(getResources().getColor(R.color.colorRed));
            button06.setEnabled(false);
        }else {

            verificaMesas++;

        }

        ColorDrawable viewColor07 = (ColorDrawable) linear07.getBackground();
        if(viewColor07.getColor() == getResources().getColor(R.color.colorBlue)){

            linear07.setBackgroundColor(getResources().getColor(R.color.colorRed));
            button07.setEnabled(false);
        }else {

            verificaMesas++;

        }

        ColorDrawable viewColor08 = (ColorDrawable) linear08.getBackground();
        if(viewColor08.getColor() == getResources().getColor(R.color.colorBlue)){

            linear08.setBackgroundColor(getResources().getColor(R.color.colorRed));
            button08.setEnabled(false);
        }else {

            verificaMesas++;

        }

        ColorDrawable viewColor09 = (ColorDrawable) linear09.getBackground();
        if(viewColor09.getColor() == getResources().getColor(R.color.colorBlue)){

            linear09.setBackgroundColor(getResources().getColor(R.color.colorRed));
            button09.setEnabled(false);

        }else {

            verificaMesas++;

        }

        if(verificaMesas == 9){

            alertaTodasReservadas.show();

        }

    }

    //não tá rolando
    protected void setlayout(String layoutKey, String layoutColor){

        SharedPreferences defautLayout = getSharedPreferences(DEFAUT, 0);
        SharedPreferences.Editor editor = defautLayout.edit();
        editor.putString(layoutKey, layoutColor);
        editor.commit();

    }

}
