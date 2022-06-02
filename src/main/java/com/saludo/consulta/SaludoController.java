package com.saludo.consulta;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SaludoController {

    @RequestMapping("/")
    public String index(@RequestParam(value = "name", required = false) String searchQuery,
                        @RequestParam(value="last_name", required = false) String searchQuery2) {
        if(searchQuery == null) {
            return "Hola: Humano";
        } else {
            return "Hola: "+searchQuery+ " " +searchQuery2;
        }
    }
    @RequestMapping("/personalizado")
    public String index2(@RequestParam(value = "name", required = false) String searchQuery,
                        @RequestParam(value="times", required = false) int nroVeces) {
        if(searchQuery == null) {
                return "Hola: Personalizado";
        } else {
            return "Hola: "+searchQuery;
        }
    }
}
