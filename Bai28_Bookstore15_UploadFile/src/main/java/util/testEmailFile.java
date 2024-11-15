package util;

import java.io.File;
import java.util.Date;
import java.util.Properties;

import javax.activation.DataHandler;
import javax.activation.DataSource;
import javax.activation.FileDataSource;
import javax.mail.Authenticator;
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

public class testEmailFile {

    // Email: nptuyen121314@gmail.com
    // Password: ohmyxuononqjtzcl

    static final String from = "nptuyen121314@gmail.com";
    static final String to = "nguyenphamtuyen2003@gmail.com";
    static final String password = "ohmyxuononqjtzcl";
    static final String tieuDe = "Test Gui Email";

    public static boolean sendEmail(String to, String tieuDe, String noiDung, String filePath) {
        // Properties : khai báo các thuộc tính
        Properties props = new Properties();
        props.put("mail.smtp.host", "smtp.gmail.com"); // SMTP HOST
        props.put("mail.smtp.port", "587"); // TLS 587 SSL 465
        props.put("mail.smtp.auth", "true"); // Buoc dang nhap
        props.put("mail.smtp.starttls.enable", "true");

        // create Authenticator
        Authenticator auth = new Authenticator() {
            @Override
            protected PasswordAuthentication getPasswordAuthentication() {
                return new PasswordAuthentication(from, password);
            }
        };
        // Phiên làm việc
        Session session = Session.getInstance(props, auth);
        try {

            // Tạo một tin nhắn mới
            MimeMessage msg = new MimeMessage(session);

            // Kiểu nội dung
            msg.addHeader("Content-type", "text/HTML; charset=UTF-8");

            // Người gửi
            msg.setFrom(from);

            // Người nhận
            msg.setRecipients(Message.RecipientType.TO, InternetAddress.parse(to, false));

            // Thiết lập tiêu đề
            msg.setSubject(tieuDe);

            // Quy định ngày gửi
            msg.setSentDate(new Date());

            // Tạo phần thân của email
            MimeBodyPart messageBodyPart = new MimeBodyPart();
            messageBodyPart.setContent(noiDung, "text/html");

            // Tạo multipart để đính kèm file và ảnh
            Multipart multipart = new MimeMultipart();
            multipart.addBodyPart(messageBodyPart);

            // Đính kèm file
            if (filePath != null && !filePath.isEmpty()) {
                MimeBodyPart attachmentPart = new MimeBodyPart();
                DataSource source = new FileDataSource(filePath);
                attachmentPart.setDataHandler(new DataHandler(source));
                attachmentPart.setFileName(new File(filePath).getName());
                multipart.addBodyPart(attachmentPart);
            }

            // Thiết lập nội dung của email
            msg.setContent(multipart);

            // Gửi email
            Transport.send(msg);

            System.out.println("Email sent successfully.");
            return true;
        } catch (MessagingException e) {
            System.out.println("Email sent failed.");
            e.printStackTrace();
            return false;
        }
    }

    public static void main(String[] args) {
    	String path_to_file ="D:\\Documents_D\\TITV\\worlspace_JSP\\Bai26_Bookstore12_GuiEmail\\src\\main\\webapp\\docThemTITV\\README.txt";
    	
        if (testEmailFile.sendEmail(to, tieuDe, "Day la phan noi dung!", path_to_file)) {
            System.out.println("Success");
        }

    }
}
