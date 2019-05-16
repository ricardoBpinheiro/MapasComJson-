package com.example.mapascomjson;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.util.ArrayList;
import java.util.List;

public class leContatosDeJSONString {
    public List<Contato> transformaContatosDeJSONString(String resposta) { // coloca os contatos na lista
        List<Contato> listaContatos = new ArrayList<>();
        try {
            JSONObject json = new JSONObject(resposta);
            JSONArray contatos = json.getJSONArray("pessoas");
            for (int i = 0; i < contatos.length(); i++) {
                JSONObject contato = contatos.getJSONObject(i);
                Contato f = new Contato( // pega o contato do json
                        contato.getString("nome"),
                        contato.getString("email"),
                        contato.getDouble("longitude"),
                        contato.getDouble("latitude")
                );
                listaContatos.add(f); // adiciona o contato a  lista
            }
        } catch (JSONException e) {
            System.err.println("Erro fazendo parse de String JSON: " + e.getMessage());
        }
        return listaContatos; //retorna a lista de contatos
    }
}