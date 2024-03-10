package devandroid.ssg.appgaseta.controller;

import android.content.SharedPreferences;
import android.util.Log;

import androidx.annotation.NonNull;

import devandroid.ssg.appgaseta.model.Pessoa;
import devandroid.ssg.appgaseta.view.MainActivity;

public class PessoaController {

    public static final String NOME_PREFERENCES = "pref_listavip";
    SharedPreferences preferences;
    SharedPreferences.Editor listaVip;
    public PessoaController(MainActivity mainActivity) {
        preferences = mainActivity.getSharedPreferences(NOME_PREFERENCES,0);
        listaVip = preferences.edit();

    }

    @NonNull
    @Override
    public String toString() {

        Log.d("MVC_Controller","Controller Iniciada...");

        return super.toString();
    }

    public void salvar(Pessoa pessoa) {
        Log.i("MVC_Controller","Salvo :   "+pessoa.toString());

        listaVip.putString("primeiroNome",pessoa.getPrimeiroNome());
        listaVip.putString("sobreNome",pessoa.getSobreNome());
        listaVip.putString("nomeDoCurso",pessoa.getCursoDesejado());
        listaVip.putString("telefoneContato",pessoa.getTelefoneContato());
        listaVip.apply();
    }

    public Pessoa buscar(Pessoa pessoa){

        pessoa.setPrimeiroNome(preferences.getString("primeiroNome", ""));
        pessoa.setSobreNome(preferences.getString("sobreNome", ""));
        pessoa.setCursoDesejado(preferences.getString("nomeDoCurso", ""));
        pessoa.setTelefoneContato(preferences.getString("telefoneContato", ""));

        return pessoa;

    }

    public void limpar(){
        listaVip.clear();
        listaVip.apply();
    }

}
