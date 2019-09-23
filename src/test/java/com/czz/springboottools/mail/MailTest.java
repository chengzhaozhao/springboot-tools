package com.czz.springboottools.mail;

import lombok.SneakyThrows;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.MimeMessageHelper;
import org.springframework.test.context.junit4.SpringRunner;

import javax.mail.internet.MimeMessage;
import java.io.File;

/**
 * @author chengzhzh@datangmobile.com
 * @create 2019-09-23 20:11
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class MailTest {
    @Autowired
    private JavaMailSender javaMailSender;

    @Test
    public void contextLoads(){
        SimpleMailMessage simpleMailMessage = new SimpleMailMessage();
        simpleMailMessage.setSubject("通知今晚开会");
        simpleMailMessage.setText("今晚七点开会");
        simpleMailMessage.setTo("czz1990520@163.com");
        simpleMailMessage.setFrom("1092729712@qq.com");

        javaMailSender.send(simpleMailMessage);
    }


    @Test
    @SneakyThrows
    public void contextLoads2(){
        MimeMessage mimeMessage = javaMailSender.createMimeMessage();
        MimeMessageHelper mimeMessageHelper = new MimeMessageHelper(mimeMessage);
        mimeMessageHelper.setSubject("通知今晚开会");
        // 这段内容是 html
        mimeMessageHelper.setText("<b style='color:red'>今晚七点开会</>",true);
        mimeMessageHelper.setTo("czz1990520@163.com");
        mimeMessageHelper.setFrom("1092729712@qq.com");
        mimeMessageHelper.addAttachment("1.jpg",new File(""));
        mimeMessageHelper.addAttachment("1.jpg",new File(""));
    }
}
