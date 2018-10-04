package raymond.report;

import java.util.Properties;
 
import javax.mail.Authenticator;
import javax.mail.BodyPart;
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.Multipart;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeBodyPart;
import javax.mail.internet.MimeMessage;
import javax.mail.internet.MimeMultipart;
import javax.activation.*;
 
public class SendFileEmail
{
   public static void main()
   {
      //receiver
      String to = "ccv5f@missouri.edu";
 
      //sender
      String from = "ccv5f@missouri.edu";
 
      String host = "smtpinternal.missouri.edu";
      
      // acquire system properties
      Properties properties = System.getProperties();
 
      // set mail server
      properties.setProperty("mail.smtp.host", host);
 
      properties.put("mail.smtp.auth", "true");
      // acquire default session
      Session session = Session.getDefaultInstance(properties,new Authenticator(){
        public PasswordAuthentication getPasswordAuthentication()
        {
         return new PasswordAuthentication("ccv5f@missouri.edu", "8888Bjayh"); //发件人邮件用户名、密码
        }
       });
 
      try{
         //create default MimeMessage
         MimeMessage message = new MimeMessage(session);
 
         // Set From: header
         message.setFrom(new InternetAddress(from));
 
         // Set To: header
         message.addRecipient(Message.RecipientType.TO,
                                  new InternetAddress(to));
 
         // Set Subject: header
         message.setSubject("This is the Subject Line!");
 
         // create message part
         BodyPart messageBodyPart = new MimeBodyPart();
 
         // message
         messageBodyPart.setText("This is message body");
         
         // create multi message
         Multipart multipart = new MimeMultipart();
 
         // set text message part
         multipart.addBodyPart(messageBodyPart);
 
         // attachment part
         messageBodyPart = new MimeBodyPart();
         String filename = "C:\\Users\\ccv5f\\Desktop\\bind.txt";
         DataSource source = new FileDataSource(filename);
         messageBodyPart.setDataHandler(new DataHandler(source));
         messageBodyPart.setFileName(filename);
         multipart.addBodyPart(messageBodyPart);
 
         // send complete message
         message.setContent(multipart );
 
         // send message
         Transport.send(message);
         System.out.println("Sent message successfully....from runoob.com");
      }catch (MessagingException mex) {
         mex.printStackTrace();
      }
   }
}