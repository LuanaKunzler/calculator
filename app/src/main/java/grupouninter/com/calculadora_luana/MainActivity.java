package grupouninter.com.calculadora_luana;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    int operacao;
    float numero1, numero2;


    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Declaração dos Botões
        final TextView display1 = findViewById(R.id.display1);
        final TextView display2 = findViewById(R.id.display2);

        final Button n0 = findViewById(R.id.n0);
        final Button n1 = findViewById(R.id.n1);
        final Button n2 = findViewById(R.id.n2);
        final Button n3 = findViewById(R.id.n3);
        final Button n4 = findViewById(R.id.n4);
        final Button n5 = findViewById(R.id.n5);
        final Button n6 = findViewById(R.id.n6);
        final Button n7 = findViewById(R.id.n7);
        final Button n8 = findViewById(R.id.n8);
        final Button n9 = findViewById(R.id.n9);
        final Button ponto = findViewById(R.id.ponto);
        final Button igual = findViewById(R.id.igual);
        final Button adicao = findViewById(R.id.adicao);
        final Button subtracao = findViewById(R.id.subtracao);
        final Button multiplicacao = findViewById(R.id.multiplicacao);
        final Button divisao = findViewById(R.id.divisao);

        //Criação dos ClickListeners
        n0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                CharSequence aux = display1.getText();
                display1.setText(aux + "0");
            }
        });

        n1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                CharSequence aux = display1.getText();
                display1.setText(aux + "1");
            }
        });

        n2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                CharSequence aux = display1.getText();
                display1.setText(aux + "2");
            }
        });

        n3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                CharSequence aux = display1.getText();
                display1.setText(aux + "3");
            }
        });

        n4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                CharSequence aux = display1.getText();
                display1.setText(aux + "4");
            }
        });

        n5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                CharSequence aux = display1.getText();
                display1.setText(aux + "5");
            }
        });

        n6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                CharSequence aux = display1.getText();
                display1.setText(aux + "6");
            }
        });

        n7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                CharSequence aux = display1.getText();
                display1.setText(aux + "7");
            }
        });

        n8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                CharSequence aux = display1.getText();
                display1.setText(aux + "8");
            }
        });

        n9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                CharSequence aux = display1.getText();
                display1.setText(aux + "9");
            }
        });

        ponto.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                CharSequence aux = display1.getText();
                display1.setText(aux + ".");
            }
        });



        //Operações
        adicao.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                operacao = 1;
                numero1 = Float.parseFloat((String) display1.getText());
                display2.setText(display1.getText() + " + ");
                display1.setText("");
            }
        });

        subtracao.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                operacao = 2;
                numero1 = Float.parseFloat((String) display1.getText());
                display2.setText(display1.getText() + " - ");
                display1.setText("");
            }
        });

        multiplicacao.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                operacao = 3;
                numero1 = Float.parseFloat((String) display1.getText());
                display2.setText(display1.getText() + " * ");
                display1.setText("");
            }
        });

        divisao.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                operacao = 4;
                numero1 = Float.parseFloat((String) display1.getText());
                display2.setText(display1.getText() + " / ");
                display1.setText("");
            }
        });

        igual.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                numero2 = Float.parseFloat((String) display1.getText());
                    display2.setText("");

                    switch (operacao) {
                        case 1:
                            display1.setText(String.valueOf(numero1 + numero2));
                            break;
                        case 2:
                            display1.setText(String.valueOf(numero1 - numero2));
                            break;
                        case 3:
                            display1.setText(String.valueOf(numero1 * numero2));
                            break;
                        case 4:
                            display1.setText(String.valueOf(numero1 / numero2));
                            break;
                        default:
                            break;
                    }
            }
        });

        //Configurando o Botão "C" para excluir apenas um elemento por vez
        final Button C = findViewById(R.id.C);
        C.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String elementos = display1.getText().toString();
                int lenght = elementos.length();
                if (lenght > 0){
                    elementos = elementos.substring(0,lenght-2);
                    display1.setText(elementos);
                }
            }
        });

        //Configurando o Botão "CE" para excluir todos os elementos existentes na tela
        final Button CE = findViewById(R.id.ce);
        CE.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                display1.setText("");
                display2.setText("");
            }
        });
    }
}