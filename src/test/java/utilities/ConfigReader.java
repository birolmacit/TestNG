package utilities;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class ConfigReader {
    public static Properties properties ;

    static {
        String dosyayolu="configuration.properties";
        try {
            FileInputStream fis=new FileInputStream(dosyayolu );
            //fis dosyayolunu tanımladıgımız configuration . properties dosyasını okudu
            properties =new Properties();
            properties .load(fis );//fis in okudugu bilgileri yukledi

        } catch (FileNotFoundException e) {

        } catch (IOException e) {

        }
    }



    public static String getProperty(String key){

        /*test methodundan yolladıgımız string key degerini alıp properties class ından
        getproperty methodunu kullanarak by key e ait value yu bize getirdi*/
        return properties.getProperty(key);
    }

}
