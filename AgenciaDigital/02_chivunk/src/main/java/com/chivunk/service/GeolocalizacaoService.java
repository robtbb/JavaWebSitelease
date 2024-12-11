package com.chivunk.service;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import org.json.JSONObject;

    public class GeolocalizacaoService {

        public void mostrarLocalizacaoAtual() {
            try {
                String apiUrl = "http://ip-api.com/json";
                URL url = new URL(apiUrl);
                HttpURLConnection conn = (HttpURLConnection) url.openConnection();
                conn.setRequestMethod("GET");

                // Lê a resposta da API
                BufferedReader in = new BufferedReader(new InputStreamReader(conn.getInputStream()));
                String inputLine;
                StringBuilder content = new StringBuilder();
                while ((inputLine = in.readLine()) != null) {
                    content.append(inputLine);
                }

                // Fecha as conexões
                in.close();
                conn.disconnect();

                // Parseia o JSON para extrair os dados de localização
                JSONObject json = new JSONObject(content.toString());
                String cidade = json.getString("city");
                String pais = json.getString("country");
                double latitude = json.getDouble("lat");
                double longitude = json.getDouble("lon");

                // Exibe a localização
                System.out.println("Cidade: " + cidade);
                System.out.println("País: " + pais);
                System.out.println("Latitude: " + latitude);
                System.out.println("Longitude: " + longitude);

            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
