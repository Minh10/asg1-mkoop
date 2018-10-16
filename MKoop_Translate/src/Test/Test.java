/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Test;
import com.rmtheis.yandtran.language.Language;
import com.rmtheis.yandtran.translate.Translate;

public class Test {
    public static void main(String[] args) throws Exception {
        Translate.setKey("trnsl.1.1.20181014T033757Z.cfbfed91ebc01435.7350980a041fd32e9130e192c1a14ec564ed3587");
        String tex = "hello ";
        String translatedText = Translate.execute( tex, Language.ENGLISH, Language.VIETNAMESE);
        
        System.out.println(translatedText);
    }
}