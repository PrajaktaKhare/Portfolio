package com.prajakta.Portfolio.Controller;


import java.util.logging.Logger;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.prajakta.Portfolio.Model.ContactForm;


@Controller
public class ContactController {

    Logger logger = Logger.getLogger(ContactController.class.getName());

    private final JavaMailSender mailSender;

    @Value("${portfolio.contact.recipient}")
    private String recipientEmail;

    public ContactController(JavaMailSender mailSender) {
        this.mailSender = mailSender;
    }

     // 👇 This handles GET (visiting /contact in browser)
    @GetMapping("/contact")
    public String showContactForm(Model model) {
        model.addAttribute("contactForm", new ContactForm());
        return "contact"; // contact.html
    }
    
    @PostMapping("/contact")
    public String sendMessage(@ModelAttribute ContactForm contactForm, Model model) {
    try {
        SimpleMailMessage mailMessage = new SimpleMailMessage();

        mailMessage.setTo(recipientEmail);
        mailMessage.setSubject("Portfolio Contact Form: " + contactForm.getName());
        mailMessage.setText("From: " + contactForm.getName() + " <" + contactForm.getEmail() + ">\n\n" + contactForm.getMessage());
                logger.info(logger.getName()+"  ContactController>>>>>>>> " + contactForm.getEmail());

        mailSender.send(mailMessage);

        model.addAttribute("success", "Message sent successfully!");
    } catch (Exception e) {
        model.addAttribute("error", "Failed to send message. Try again later.");
    }

    // Make sure contactForm is added back to the model
    model.addAttribute("contactForm", new ContactForm());
    return "contact";
}
}
