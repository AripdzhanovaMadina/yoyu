package com.diploma;

public interface Zaprosy {

        String Zapros1 = "SELECT * FROM dogovor WHERE VS IN ('Медицинское', 'Грузов');\n";
        String Zapros2 = "SELECT * FROM dogovor WHERE Summa BETWEEN 100000 AND 500000;\n";
        String Zapros3 = "SELECT * FROM dogovor WHERE Filial IN ('Омский', 'Томский');\n";
        String Zapros4 = "SELECT * FROM sotrudniki WHERE Filial IN ('Московский');\n";

    }

