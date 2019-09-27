package com.phd.listview;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

public class MainActivity extends Activity {

    private ListView listaitens;
    private String[] ArrItens = {"André Victor Giannotti Begotti",
            "Andrew Victor da Silva",
            "Eduardo de Andrade Lucas",
            "Elidianne Ferreira da Silva",
            "Enio Cleyton de Menezes Filho",
            "Geraldo Mota Ramos Neto",
            "Gustavo Batista da Silva Souza",
            "Gustavo Julião Santana Pimentel",
            "Hemerson Angelo Silva",
            "Iggor Lima de Araújo",
            "Izabel Yale Neves Nascimento",
            "Wikedjhon Deriks Caetano da Silva",
            "José Edmilson Santos Neto",
            "Jose Fernando Ferreira de Lima",
            "Leonardo Matheus Pereira Brainer",
            "Leonardo Víctor Chapoval de Azevedo",
            "Lucas Farias Gonçalves",
            "Lucas Henrique da Silva Ribeiro",
            "Lucas Meyble Ramos de Luna",
            "Lucas Nonato de Sá",
            "Maria Aline Ferreira de Lima",
            "Matheus Pinheiro Bezerra Florencio",
            "Moisés Francisco dos Santos Neto",
            "Raul Gomes Santos Bernardino de Medeiros",
            "Ricardo Augusto Gomes Alves",
            "Roberto Felipe Morais de Souza",
            "Táles Coelho Silva",
            "Thalles Ramos Dantas Vieira da Costa",
            "Thiago Mateus Bezerra Nunes",
            "Thiago Weslley Rocha Barros",
            "Victor José Cavalcante da Silva",
            "Vinicius Gonçalves Silva",
            "Wendson Carvalho de Arruda Sousa"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        listaitens = (ListView) findViewById(R.id.listview_id);

        ArrayAdapter<String> adapter = new ArrayAdapter<String>(
                getApplicationContext(),
                android.R.layout.simple_list_item_1,
                android.R.id.text1,
                ArrItens
        );
        listaitens.setAdapter(adapter);
        listaitens.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                int codpos = i;
                String click = ArrItens[i].toString();
                String clicado = listaitens.getItemAtPosition(codpos).toString();
                Toast.makeText(getApplicationContext(),click, Toast.LENGTH_SHORT).show();
            }
        });
    }
}
