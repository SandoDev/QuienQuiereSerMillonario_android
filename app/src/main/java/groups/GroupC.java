package groups;

import java.util.ArrayList;
import java.util.Random;

public class GroupC {

    private int count, money, count2;
    private ArrayList<String[]> questions;

    //El formato del array es: pregunta, respuesta ganadora, 3 respuestas falsas
    private String question0[] = {"¿A qué estilo arquitectónico pertenece la Torre de Pissa?", "Románico", "Barroco", "Gótico", "Neoclásico"};
    private String question1[] = {"¿Quién pinto 'El nacimiento de Venus'?", "Tizziano", "Miguel Ángel", "Botticelli", "Da Vinci"};
    private String question2[] = {"El aparato digestivo está formado por la boca, estómago, esófago, intestino delgado, intestino grueso y:", "Faringe", "Corazón", "Riñones", "Laringe"};
    private String question3[] = {"¿Cómo se reproduce una estrella de mar?", "Escisión", "Bipartición", "Meiosis", "Ósmosis"};
    private String question4[] = {"El café que se produce en Colombia es el de tipo arábica, que se caracteriza por ser el más:", "Suave", "Acidulado", "Fuerte", "Amargo"};
    private String question5[] = {"El patólogo Manuel Elkin Patarroyo es famoso por los estudios de una vacuna sintética contra el:", "Paludismo o malaria.", "Ébola", "Dengue", "Chikungunya"};
    private String question6[] = {"¿Qué emperador dividió al imperio romano en oriente y occidente?", "Diocleciano", "Cadmo", "Rómulo", "Remo"};
    private String question7[] = {"¿A qué ejército pertenecían los centuriones?", "Romano", "Bizantino", "Ruso", "Griego"};
    private String question8[] = {"¿Cómo se pueden formar palabras?", "Todas son correctas", "Por composición", "Por derivación", "Parasintéticamente"};
    private String question9[] = {"¿Quién fue el maestro del movimiento modernista?", "Rubén Darío", "Francisco Quevedo", "Manuel Machado", "Juan Ramón Jiménez"};
    private String question10[] = {"Una persona que padece polidipsia siente una constante necesidad de:", "Beber","Correr","Dormir", "Hablar"};
    private String question11[] = {"El albinismo se presenta por la carencia de:", "Pigmentación", "Calcio", "Vitamina A", "Oxígeno"};
    private String question12[] = {"Cual de estos instrumentos mide la densidad de los aceites?", "Oleometro", "Dinamometro", "Micrometro", "Holometro"};
    private String question13[] = {"Quien dirigió la película 'El Padrino' en 1972?", "Francis Ford Copolla", "Roman Polanski", "Franco Zeffirelli", "Federico Fellini"};
    private String question14[] = {"Cual es el idioma oficial de Israel?", "Hebreo", "Tamil", "Oromo", "Griego"};
    private String question15[] = {"Cual de los siguientes países limita con Francia?", "Belgica", "Holanda", "Dinamarca", "Suecia"};
    private String question16[] = {"El timbal es un instrumento de", "Percusion", "Viento metal", "Viento madera", "Cuerda"};
    private String question17[] = {"Donde se desarrollo la civilización etrusca?", "Península Itálica", "Caucaso", "Norte de África", "Extremo Oriente"};
    private String question18[] = {"Cual es el significado del prefijo 'epi-'?", "Sobre", "Alrededor", "Episodio", "Inferior"};
    private String question19[] = {"Que parte del cuerpo se examina en una encefalografia?", "Cráneo", "Ovarios", "Pulmones", "Hígado"};
    private String question20[] = {"Es el espacio de tiempo durante el cual un Estado no tiene soberano:", "Interregno", "Internodio", "Internuncio", "Intermezzo"};
    private String question21[] = {"El peltre es una aleación de estaño, cobre, antimonio y:", "Plomo", "Hierro", "Oro", "Plata"};
    private String question22[] = {"¿A qué elemento químico se le nombró como un enano maléfico?", "Cobalto", "Telurio", "Berilio", "Hafnio"};
    private String question23[] = {"¿Cuántos mares tiene la península Balcánica?", "3", "5", "4", "2"};
    private String question24[] = {"¿Qué isla lleva el nombre de un famoso navegante holandés?", "Tasmania", "Kalimantan", "Sumatra", "Madagascar"};

    public GroupC() {
        count = 25;
        money = count2 = 0;
        questions = new ArrayList<>();
        questions.add(question0);
        questions.add(question1);
        questions.add(question2);
        questions.add(question3);
        questions.add(question4);
        questions.add(question5);
        questions.add(question6);
        questions.add(question7);
        questions.add(question8);
        questions.add(question9);
        questions.add(question10);
        questions.add(question11);
        questions.add(question12);
        questions.add(question13);
        questions.add(question14);
        questions.add(question15);
        questions.add(question16);
        questions.add(question17);
        questions.add(question18);
        questions.add(question19);
        questions.add(question20);
        questions.add(question21);
        questions.add(question22);
        questions.add(question23);
        questions.add(question24);
    }

    public String[] GenerateQuestion() {
        int index = new Random().nextInt(count);
        String data[] = questions.get(index);
        questions.remove(index);//remueve del array la pregunta proxima a mostrar
        count--;
        return data;
    }

    public int GenerateMoney() {
        count2++;
        if (count2 == 1) {
            money = 64000;
        } else if (count2 == 2) {
            money = 125000;
        } else if (count2 == 3) {
            money = 250000;
        } else if (count2 == 4) {
            money = 500000;
        } else if (count2 == 5) {
            money = 1000000;
        }
        return money;
    }
}
