package groups;

import android.widget.Toast;

import java.util.ArrayList;
import java.util.Random;

public class GroupA {

    private int count, money, count2;
    private ArrayList<String[]> questions;

    //El formato del array es: pregunta, respuesta ganadora, 3 respuestas falsas
    private String question0[] = {"¿Cuál es la capital de Colombia?", "Bogotá", "Caracas", "Quito", "Medellín"};
    private String question1[] = {"¿Qué pintor se arrancó una oreja?", "Van Gogh", "Picasso", "Dalí", "Monet"};
    private String question2[] = {"¿Quién pintaba objetos de aspecto robusto e inflado?", "Botero", "Da Vinci", "Picasso", "Caravaggio"};
    private String question3[] = {"La cría de la rana recibe el nombre de:", "Renacuajo", "Ranica", "Ranacuajo", "Ranita"};
    private String question4[] = {"¿Cuántos grados tiene un ángulo llano?", "180", "45", "120", "90"};
    private String question5[] = {"¿Cuántas regiones conforman la geografía colombiana?", "Seis", "Cinco", "Cuatro", "Siete"};
    private String question6[] = {"¿Cuál fue el sistema político predominante en la Europa occidental de la Edad Media?", "Feudalismo", "Democracia", "Dictadura", "Capitalismo"};
    private String question7[] = {"¿Cómo murió Juana de Arco?", "Quemada en la hoguera", "Decapitada", "Envenenada", "Ahogada"};
    private String question8[] = {"¿Cuál de las siguientes palabras no se encuentra escrita correctamente?", "Jeneroso", "Jefe", "Gentío", "Germen"};
    private String question9[] = {"¿Cuál es la onomatopeya de la oveja?", "Bee", "Miau", "Pío", "Cuac"};
    private String question10[] = {"Así dice el trabalenguas: 'Un burro comía berros y el perro se los...'", "Robo", "Quito", "Escondio", "Llevo"};
    private String question11[] = {"Uno de ellos es el 'Hombre mono':", "Tarzan", "Dracula", "Hercules", "Frankenstein"};
    private String question12[] = {"Según el refrán, entre ellos no se pisan la manguera:", "Los bomberos", "Los policías", "Los mecánicos", "Los toreros"};
    private String question13[] = {"Es el paso del agua del estado líquido al estado gaseoso:", "Evaporación", "Licuefacción", "Infiltración", "Sublimación"};
    private String question14[] = {"El animal que come carne de otros de su misma especie se llama:", "Canibal", "Vandalo", "Miserable", "Sofista"};
    private String question15[] = {"La hormiga es un:", "Insecto", "Mamífero", "Ave", "Reptil"};
    private String question16[] = {"En la oración: 'Una viejita vende las manzanas', la palabra 'vende' es:", "Verbo", "Adjetivo", "Conjuncion", "Sustantivo"};
    private String question17[] = {"Según el refrán, 'Cuando la limosna es grande, hasta el santo...'", "Desconfía", "Se queja", "Se burla", "Llora"};
    private String question18[] = {"Son las membranas movibles cubiertas de piel que resguardan los ojos:", "Parpados", "Anteojos", "Pupilas", "Cejas"};
    private String question19[] = {"Complete el siguiente trabalenguas: 'Me han dicho que has dicho un dicho, un dicho que he...'", "Dicho", "Contado", "Escuchado", "Aprendido"};
    private String question20[] = {"Según el refran, quien es ciego?", "El amor", "La envidia", "El odio", "La esperanza"};
    private String question21[] = {"Es el título de una película de Disney: 'La Bella...'", "Durmiente", "Dálmata", "Bruja", "Fiestera"};
    private String question22[] = {"Es el nombre de uno de los Tres Reyes Magos:", "Melchor", "Jonas", "Barrabas", "Judas"};
    private String question23[] = {"Generalmente, con que se rellenan las piñatas?", "Caramelos", "Tierra", "Algodón", "Pure de papas"};
    private String question24[] = {"El Tour de Francia es una famosa competencia de:", "Ciclismo", "Golf", "Fútbol", "Automovilismo"};


    public GroupA() {
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
        questions.remove(index);
        count--;
        return data;
    }

    public int GenerateMoney() {
        count2++;
        if (count2 == 1) {
            money = 100;
        } else if (count2 == 2) {
            money = 200;
        } else if (count2 == 3) {
            money = 300;
        } else if (count2 == 4) {
            money = 500;
        } else if (count2 == 5) {
            money = 1000;
        }
        return money;
    }
}
