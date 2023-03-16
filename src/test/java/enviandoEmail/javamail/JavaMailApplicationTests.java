package enviandoEmail.javamail;

import java.util.Properties;

import javax.mail.Address;
import javax.mail.Authenticator;
import javax.mail.Message;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;

import org.junit.Test;



class JavaMailApplicationTests {

    private String userName = "testjavagn@gmail.com";
    private String senha = "@Gns231201";

    @Test
    public void testeEmail() {


        try {

            Properties properties = new Properties();
            properties.put("mail.smtp.auth", "true"); /*Autorização*/
            properties.put("mail.smtp.startls", "true"); /*Autenticação*/
            properties.put("mail.smtp.host", "stmp.gmail.com"); /*Servidor gmail Google*/
            properties.put("mail.smtp.port", "465"); /*Porta do servidor*/
            properties.put("mail.smtp.socketFactory.port", "465"); /*Especifica a porta a ser conectada pelo socket*/
            properties.put("mail.smtp.socketFactory.class", "javax.net.ssl.SSLSocketFactory"); /*Classe socket da conexão ao SMTP*/

            Session session = Session.getInstance(properties, new Authenticator() {
                @Override
                protected PasswordAuthentication getPasswordAuthentication() {
                    return new PasswordAuthentication(userName, senha);
                }
            });



        } catch (Exception e) {
            e.printStackTrace();
        }
    }


}
