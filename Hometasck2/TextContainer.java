package Hometasck2;


import java.io.FileWriter;
import java.io.IOException;

@SaveTo(path = "c:\\file.txt")
public class TextContainer {
    String text = "Рефлексия (от позднелат. reflexio - обращение назад) - это механизм исследования данных о программе во время её выполнения. Рефлексия позволяет исследовать информацию о полях, методах и конструкторах классов. Можно также выполнять операции над полями и методами которые исследуются. Рефлексия в Java осуществляется с помощью Java Reflection API. Этот интерфейс API состоит из классов пакетов java.lang и java.lang.reflect.";

    @Saver
    public void save(String path) throws IOException {
        FileWriter fw = new FileWriter(path);
        try {
            fw.write(text);

            fw.close();
        } catch (IOException e) {
            System.out.println(e);
        }
    }
}
