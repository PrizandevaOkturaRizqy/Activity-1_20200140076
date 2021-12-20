/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tugas.Java.Exercise.Documentation.tugas.praktikum.java;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;



/**
 *
 * @author Prizandeva Oktuar R
 */
@Controller
public class ControllerKtp {
    @RequestMapping("/dataktp")
       public String getTable(Model jerocoding){
           String result ="Data KTP";
           jerocoding.addAttribute("dataktp", result);
           
         ArrayList<List<String>> data = new ArrayList<>();
           data.add(Arrays.asList("ID","Nomer KTP","Nama","Alamat"));
           data.add(Arrays.asList("01","3506230505650001","Paijo","Jawa Tengah"));
           data.add(Arrays.asList("02","3506230505650002","Paidi","Jakarta"));
           data.add(Arrays.asList("03","3506230505650003","Paimen","Jawa Barat"));
           data.add(Arrays.asList("04","3506230505650004","Siti","Surabaya"));
           data.add(Arrays.asList("05","3506230505650005","Sumiten","Bali"));
           data.add(Arrays.asList("06","3506230505650006","Sumini","Lampung"));
           data.add(Arrays.asList("07","3506230505650007","Suterjo","Jawa Timur"));
           data.add(Arrays.asList("08","3506230505650008","Suminah","Padang"));
           data.add(Arrays.asList("09","3506230505650009","Sukijan","Papua"));
           data.add(Arrays.asList("010","3506230505650010","Tumini","Sulawesi Tenggara"));
           data.add(Arrays.asList("011","3506230505650011","Tuminah","Kalimantan"));
           data.add(Arrays.asList("012","3506230505650012","Tumijan","Banten"));
           data.add(Arrays.asList("013","3506230505650013","Suparjo","Yogyakarta"));
           data.add(Arrays.asList("014","3506230505650014","Sumarto","Gunung Kidul"));
           data.add(Arrays.asList("015","3506230505650015","Susanto","Solo"));
           data.add(Arrays.asList("016","3506230505650016","Sumanto","Kulon Progo"));
           data.add(Arrays.asList("017","3506230505650017","Tukijan","Solo Baru"));
           data.add(Arrays.asList("018","3506230505650018","Paijem","Kota Baru"));
           data.add(Arrays.asList("019","3506230505650019","Mail","Bangunjiwo"));
           data.add(Arrays.asList("020","3506230505650020","Jarjit","Bantul"));
           
           
           jerocoding.addAttribute("tabel",data);
           
           return "viewer";
       }
}
