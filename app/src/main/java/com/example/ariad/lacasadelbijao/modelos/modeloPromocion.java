package com.example.ariad.lacasadelbijao.modelos;

import com.example.ariad.lacasadelbijao.entidades.Platos;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.NodeList;

import java.io.BufferedReader;
import java.io.DataOutputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.ArrayList;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;

public class modeloPromocion {

    ArrayList<Platos> listap = new ArrayList<>();

    public ArrayList<Platos> listarPlatos(){
        listap.clear();
        try{
            String url="http://192.168.1.92:2080/bijao/listar.php";
            URL dir = new URL(url);
            DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
            DocumentBuilder db = dbf.newDocumentBuilder();
            Document doc = db.parse(dir.openStream());

            NodeList nodeList = doc.getElementsByTagName("nom");
            for (int i=0; i<nodeList.getLength(); i++){
                Element element = (Element) nodeList.item(i);
                String nom = element.getFirstChild().getTextContent();

                NodeList nodeList2 = doc.getElementsByTagName("decri");
                Element element2 = (Element) nodeList2.item(i);
                String decri = element2.getFirstChild().getTextContent();

                NodeList nodeList3 = doc.getElementsByTagName("pre");
                Element element3 = (Element) nodeList3.item(i);
                String pre = element3.getFirstChild().getTextContent();

                listap.add(new Platos(0,nom,decri,Double.parseDouble(pre)));
            }
        }
        catch (Exception ex){ }
        return listap;
    }

}
