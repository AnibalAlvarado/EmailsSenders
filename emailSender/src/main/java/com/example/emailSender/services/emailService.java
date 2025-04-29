package com.example.emailSender.services;

import jakarta.mail.MessagingException;
import jakarta.mail.internet.MimeMessage;

import java.util.Random;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.MimeMessageHelper;
import org.springframework.stereotype.Service;

@Service
public class emailService {

    @Autowired
    private JavaMailSender javaMailSender;

    public void basicEmail() {

        try {
        //destinatario
        String addressMail = "anibalalvaradoandrade@gmail.com";
        //asunto
        String subjectMail = "Prueba de envio de correo";
        //cuerpo del mensaje
        String bodyMail = "Hola, este es un mensaje de prueba, pero muy insano";
        emailSender(addressMail, subjectMail, bodyMail);
        }
        catch(Exception e) {

        }
    }

    public void advancedEmail(String addressMail) {
        try {
            // destinatario
            // String addressMail = "cjcs.cadenasarasty8@gmail.com";
            // Asunto
            String subject = "Este es un correo de prueba";
            // Cuerpo Correo
            String bodyMail = ""
                + "<!DOCTYPE html>\n"
                + "<html lang=\"es\">\n"
                + "<head>\n"
                + "    <meta charset=\"UTF-8\">\n"
                + "    <title>Correo de Prueba</title>\n"
                + "    <style>\n"
                + "        body {\n"
                + "            font-family: Arial, sans-serif;\n"
                + "            background-color: #f4f4f4;\n"
                + "            margin: 0;\n"
                + "            padding: 0;\n"
                + "        }\n"
                + "        .correo-container {\n"
                + "            background-color: #ffffff;\n"
                + "            max-width: 600px;\n"
                + "            margin: 40px auto;\n"
                + "            padding: 30px;\n"
                + "            border-radius: 8px;\n"
                + "            box-shadow: 0 0 8px rgba(0, 0, 0, 0.1);\n"
                + "        }\n"
                + "        h2 {\n"
                + "            color: #333333;\n"
                + "        }\n"
                + "        p {\n"
                + "            font-size: 16px;\n"
                + "            color: #555555;\n"
                + "        }\n"
                + "        .btn {\n"
                + "            display: inline-block;\n"
                + "            margin-top: 20px;\n"
                + "            padding: 12px 20px;\n"
                + "            background-color: #007BFF;\n"
                + "            color: white;\n"
                + "            text-decoration: none;\n"
                + "            border-radius: 5px;\n"
                + "        }\n"
                + "        .footer {\n"
                + "            margin-top: 30px;\n"
                + "            font-size: 12px;\n"
                + "            color: #aaaaaa;\n"
                + "            text-align: center;\n"
                + "        }\n"
                + "    </style>\n"
                + "</head>\n"
                + "<body>\n"
                + "    <div class=\"correo-container\">\n"
                + "        <h2>¡Hola, Juan!</h2>\n"
                + "        <p>Este es un correo de prueba enviado desde nuestra aplicación de Spring Boot.</p>\n"
                + "        <p>Haz clic en el botón a continuación para visitar nuestro sitio:</p>\n"
                + "        <a href=\"https://www.ejemplo.com\" class=\"btn\">Ir al sitio</a>\n"
                + "        <div class=\"footer\">\n"
                + "            © 2025 Tu Empresa. Todos los derechos reservados.\n"
                + "        </div>\n"
                + "    </div>\n"
                + "</body>\n"
                + "</html>";

            emailSender(addressMail, subject, bodyMail);
        } catch (Exception e) {

        }
    }

    public void newAccountEmail(String addressMail) {
        try {
            String subject = "¡Tu cuenta ha sido creada exitosamente!";
            String bodyMail = ""
                + "<!DOCTYPE html>\n"
                + "<html lang=\"es\">\n"
                + "<head>\n"
                + "    <meta charset=\"UTF-8\">\n"
                + "    <title>Cuenta Creada</title>\n"
                + "    <style>\n"
                + "        body {\n"
                + "            font-family: Arial, sans-serif;\n"
                + "            background-color: #f2f2f2;\n"
                + "            margin: 0;\n"
                + "            padding: 0;\n"
                + "        }\n"
                + "        .container {\n"
                + "            background-color: #ffffff;\n"
                + "            max-width: 600px;\n"
                + "            margin: 50px auto;\n"
                + "            padding: 30px;\n"
                + "            border-radius: 10px;\n"
                + "            box-shadow: 0 4px 8px rgba(0, 0, 0, 0.1);\n"
                + "        }\n"
                + "        h2 {\n"
                + "            color: #2c3e50;\n"
                + "        }\n"
                + "        p {\n"
                + "            font-size: 16px;\n"
                + "            color: #555;\n"
                + "        }\n"
                + "        .btn {\n"
                + "            display: inline-block;\n"
                + "            margin-top: 20px;\n"
                + "            padding: 12px 25px;\n"
                + "            background-color: #28a745;\n"
                + "            color: #fff;\n"
                + "            text-decoration: none;\n"
                + "            border-radius: 5px;\n"
                + "        }\n"
                + "        .footer {\n"
                + "            margin-top: 30px;\n"
                + "            font-size: 12px;\n"
                + "            color: #999999;\n"
                + "            text-align: center;\n"
                + "        }\n"
                + "    </style>\n"
                + "</head>\n"
                + "<body>\n"
                + "    <div class=\"container\">\n"
                + "        <h2>¡Bienvenido a nuestra plataforma!</h2>\n"
                + "        <p>Nos alegra informarte que tu cuenta ha sido creada correctamente.</p>\n"
                + "        <p>Puedes iniciar sesión en cualquier momento usando tus credenciales.</p>\n"
                + "        <a href=\"https://www.tu-plataforma.com/login\" class=\"btn\">Iniciar Sesión</a>\n"
                + "        <div class=\"footer\">\n"
                + "            © 2025 Tu Empresa. Todos los derechos reservados.\n"
                + "        </div>\n"
                + "    </div>\n"
                + "</body>\n"
                + "</html>";
    
            emailSender(addressMail, subject, bodyMail);
        } catch (Exception e) {
            
        }
    }
    
    public void forgotPasswordEmail(String addressMail) {
        try {
            String subject = "Recupera tu contraseña";
            String bodyMail = ""
                + "<!DOCTYPE html>\n"
                + "<html lang=\"es\">\n"
                + "<head>\n"
                + "    <meta charset=\"UTF-8\">\n"
                + "    <title>Recuperación de Contraseña</title>\n"
                + "    <style>\n"
                + "        body {\n"
                + "            font-family: Arial, sans-serif;\n"
                + "            background-color: #f2f2f2;\n"
                + "            margin: 0;\n"
                + "            padding: 0;\n"
                + "        }\n"
                + "        .container {\n"
                + "            background-color: #ffffff;\n"
                + "            max-width: 600px;\n"
                + "            margin: 50px auto;\n"
                + "            padding: 30px;\n"
                + "            border-radius: 10px;\n"
                + "            box-shadow: 0 4px 8px rgba(0, 0, 0, 0.1);\n"
                + "        }\n"
                + "        h2 {\n"
                + "            color: #2c3e50;\n"
                + "        }\n"
                + "        p {\n"
                + "            font-size: 16px;\n"
                + "            color: #555;\n"
                + "        }\n"
                + "        .btn {\n"
                + "            display: inline-block;\n"
                + "            margin-top: 20px;\n"
                + "            padding: 12px 25px;\n"
                + "            background-color: #dc3545;\n"
                + "            color: #fff;\n"
                + "            text-decoration: none;\n"
                + "            border-radius: 5px;\n"
                + "        }\n"
                + "        .footer {\n"
                + "            margin-top: 30px;\n"
                + "            font-size: 12px;\n"
                + "            color: #999999;\n"
                + "            text-align: center;\n"
                + "        }\n"
                + "    </style>\n"
                + "</head>\n"
                + "<body>\n"
                + "    <div class=\"container\">\n"
                + "        <h2>¿Olvidaste tu contraseña?</h2>\n"
                + "        <p>No te preocupes, estamos aquí para ayudarte a recuperarla.</p>\n"
                + "        <p>Haz clic en el botón a continuación para restablecer tu contraseña:</p>\n"
                + "        <a href=\"https://www.tu-plataforma.com/reset-password\" class=\"btn\">Restablecer Contraseña</a>\n"
                + "        <div class=\"footer\">\n"
                + "            © 2025 Tu Empresa. Todos los derechos reservados.\n"
                + "        </div>\n"
                + "    </div>\n"
                + "</body>\n"
                + "</html>";
    
            emailSender(addressMail, subject, bodyMail);
        } catch (Exception e) {
            
        }
    }
    
    public void activationEmailWithCode(String addressMail) {
    try {
        String subject = "Activa tu cuenta";

        // Generar código aleatorio de 6 dígitos
        String activationCode = String.format("%06d", new Random().nextInt(999999));

        String bodyMail = ""
            + "<!DOCTYPE html>\n"
            + "<html lang=\"es\">\n"
            + "<head>\n"
            + "    <meta charset=\"UTF-8\">\n"
            + "    <title>Activación de Cuenta</title>\n"
            + "    <style>\n"
            + "        body {\n"
            + "            font-family: Arial, sans-serif;\n"
            + "            background-color: #f2f2f2;\n"
            + "            margin: 0;\n"
            + "            padding: 0;\n"
            + "        }\n"
            + "        .container {\n"
            + "            background-color: #ffffff;\n"
            + "            max-width: 600px;\n"
            + "            margin: 50px auto;\n"
            + "            padding: 30px;\n"
            + "            border-radius: 10px;\n"
            + "            box-shadow: 0 4px 8px rgba(0, 0, 0, 0.1);\n"
            + "        }\n"
            + "        h2 {\n"
            + "            color: #2c3e50;\n"
            + "        }\n"
            + "        p {\n"
            + "            font-size: 16px;\n"
            + "            color: #555;\n"
            + "        }\n"
            + "        .code-box {\n"
            + "            margin: 20px 0;\n"
            + "            padding: 15px;\n"
            + "            background-color: #eaf4ff;\n"
            + "            border: 1px dashed #007BFF;\n"
            + "            font-size: 20px;\n"
            + "            font-weight: bold;\n"
            + "            text-align: center;\n"
            + "            letter-spacing: 2px;\n"
            + "            color: #007BFF;\n"
            + "        }\n"
            + "        .footer {\n"
            + "            margin-top: 30px;\n"
            + "            font-size: 12px;\n"
            + "            color: #999999;\n"
            + "            text-align: center;\n"
            + "        }\n"
            + "    </style>\n"
            + "</head>\n"
            + "<body>\n"
            + "    <div class=\"container\">\n"
            + "        <h2>¡Bienvenido!</h2>\n"
            + "        <p>Gracias por registrarte. Para activar tu cuenta, ingresa el siguiente código en la plataforma:</p>\n"
            + "        <div class=\"code-box\">" + activationCode + "</div>\n"
            + "        <p>Si no solicitaste este registro, puedes ignorar este correo.</p>\n"
            + "        <div class=\"footer\">\n"
            + "            © 2025 Tu Empresa. Todos los derechos reservados.\n"
            + "        </div>\n"
            + "    </div>\n"
            + "</body>\n"
            + "</html>";

        emailSender(addressMail, subject, bodyMail);
    } catch (Exception e) {
    }
}
    
    public void changedPasswordNotification(String addressMail) {
    try {
        String subject = "Tu contraseña ha sido cambiada";

        String bodyMail = ""
            + "<!DOCTYPE html>\n"
            + "<html lang=\"es\">\n"
            + "<head>\n"
            + "    <meta charset=\"UTF-8\">\n"
            + "    <title>Cambio de Contraseña</title>\n"
            + "    <style>\n"
            + "        body {\n"
            + "            font-family: Arial, sans-serif;\n"
            + "            background-color: #f2f2f2;\n"
            + "            margin: 0;\n"
            + "            padding: 0;\n"
            + "        }\n"
            + "        .container {\n"
            + "            background-color: #ffffff;\n"
            + "            max-width: 600px;\n"
            + "            margin: 50px auto;\n"
            + "            padding: 30px;\n"
            + "            border-radius: 10px;\n"
            + "            box-shadow: 0 4px 8px rgba(0, 0, 0, 0.1);\n"
            + "        }\n"
            + "        h2 {\n"
            + "            color: #2c3e50;\n"
            + "        }\n"
            + "        p {\n"
            + "            font-size: 16px;\n"
            + "            color: #555;\n"
            + "        }\n"
            + "        .alert {\n"
            + "            background-color: #fff3cd;\n"
            + "            color: #856404;\n"
            + "            border: 1px solid #ffeeba;\n"
            + "            padding: 15px;\n"
            + "            border-radius: 5px;\n"
            + "            margin-top: 20px;\n"
            + "            font-weight: bold;\n"
            + "        }\n"
            + "        .footer {\n"
            + "            margin-top: 30px;\n"
            + "            font-size: 12px;\n"
            + "            color: #999999;\n"
            + "            text-align: center;\n"
            + "        }\n"
            + "    </style>\n"
            + "</head>\n"
            + "<body>\n"
            + "    <div class=\"container\">\n"
            + "        <h2>Notificación de Seguridad</h2>\n"
            + "        <p>Queremos informarte que la contraseña de tu cuenta ha sido cambiada recientemente.</p>\n"
            + "        <div class=\"alert\">Si no realizaste este cambio, por favor restablece tu contraseña inmediatamente o contacta con soporte.</div>\n"
            + "        <p>Gracias por confiar en nosotros.</p>\n"
            + "        <div class=\"footer\">\n"
            + "            © 2025 Tu Empresa. Todos los derechos reservados.\n"
            + "        </div>\n"
            + "    </div>\n"
            + "</body>\n"
            + "</html>";

        emailSender(addressMail, subject, bodyMail);
    } catch (Exception e) {
        
    }
}

    public void lockStockNotification(String addressMail) {
    try {
        // Array con nombres de productos
        String[] productos = {
            "Laptop HP Pavilion 15",
            "Monitor Samsung 24\" Curvo",
            "Mouse Logitech G502",
            "Teclado Mecánico Redragon",
            "Disco Duro Externo Seagate 1TB"
        };

        // Seleccionar producto aleatorio
        Random random = new Random();
        String productName = productos[random.nextInt(productos.length)];

        String subject = "Notificación de Stock Bloqueado";

        String bodyMail = ""
            + "<!DOCTYPE html>\n"
            + "<html lang=\"es\">\n"
            + "<head>\n"
            + "    <meta charset=\"UTF-8\">\n"
            + "    <title>Stock Bloqueado</title>\n"
            + "    <style>\n"
            + "        body {\n"
            + "            font-family: Arial, sans-serif;\n"
            + "            background-color: #f2f2f2;\n"
            + "            margin: 0;\n"
            + "            padding: 0;\n"
            + "        }\n"
            + "        .container {\n"
            + "            background-color: #ffffff;\n"
            + "            max-width: 600px;\n"
            + "            margin: 50px auto;\n"
            + "            padding: 30px;\n"
            + "            border-radius: 10px;\n"
            + "            box-shadow: 0 4px 8px rgba(0, 0, 0, 0.1);\n"
            + "        }\n"
            + "        h2 {\n"
            + "            color: #c0392b;\n"
            + "        }\n"
            + "        p {\n"
            + "            font-size: 16px;\n"
            + "            color: #555;\n"
            + "        }\n"
            + "        .alert {\n"
            + "            background-color: #fdecea;\n"
            + "            color: #c0392b;\n"
            + "            border: 1px solid #f5c6cb;\n"
            + "            padding: 15px;\n"
            + "            border-radius: 5px;\n"
            + "            margin-top: 20px;\n"
            + "            font-weight: bold;\n"
            + "        }\n"
            + "        .footer {\n"
            + "            margin-top: 30px;\n"
            + "            font-size: 12px;\n"
            + "            color: #999999;\n"
            + "            text-align: center;\n"
            + "        }\n"
            + "    </style>\n"
            + "</head>\n"
            + "<body>\n"
            + "    <div class=\"container\">\n"
            + "        <h2>Producto con Stock Bloqueado</h2>\n"
            + "        <p>Se ha detectado que el siguiente producto tiene su stock bloqueado o agotado:</p>\n"
            + "        <div class=\"alert\">Producto: <strong>" + productName + "</strong></div>\n"
            + "        <p>Por favor revisa el inventario o contacta con el área correspondiente para tomar acción.</p>\n"
            + "        <div class=\"footer\">\n"
            + "            © 2025 Tu Empresa. Todos los derechos reservados.\n"
            + "        </div>\n"
            + "    </div>\n"
            + "</body>\n"
            + "</html>";

        emailSender(addressMail, subject, bodyMail);
    } catch (Exception e) {
       
    }
}

    public void purchaseNotification(String addressMail) {
    try {
        // Lista simulada de productos comprados
        String[] productos = {
            "Audífonos Bluetooth JBL Tune 510BT",
            "Smartwatch Amazfit Bip U Pro",
            "Cargador Rápido USB-C 25W",
            "Tablet Samsung Galaxy Tab A8",
            "Cámara Web Logitech C920 HD"
        };

        // Generar lista HTML
        StringBuilder productListHtml = new StringBuilder();
        productListHtml.append("<ul style='padding-left:20px;'>");
        for (String producto : productos) {
            productListHtml.append("<li>").append(producto).append("</li>");
        }
        productListHtml.append("</ul>");

        String subject = "¡Compra Realizada con Éxito!";

        String bodyMail = ""
            + "<!DOCTYPE html>\n"
            + "<html lang=\"es\">\n"
            + "<head>\n"
            + "    <meta charset=\"UTF-8\">\n"
            + "    <title>Notificación de Compra</title>\n"
            + "    <style>\n"
            + "        body {\n"
            + "            font-family: Arial, sans-serif;\n"
            + "            background-color: #f2f2f2;\n"
            + "            margin: 0;\n"
            + "            padding: 0;\n"
            + "        }\n"
            + "        .container {\n"
            + "            background-color: #ffffff;\n"
            + "            max-width: 600px;\n"
            + "            margin: 50px auto;\n"
            + "            padding: 30px;\n"
            + "            border-radius: 10px;\n"
            + "            box-shadow: 0 4px 8px rgba(0, 0, 0, 0.1);\n"
            + "        }\n"
            + "        h2 {\n"
            + "            color: #28a745;\n"
            + "        }\n"
            + "        p {\n"
            + "            font-size: 16px;\n"
            + "            color: #555;\n"
            + "        }\n"
            + "        .footer {\n"
            + "            margin-top: 30px;\n"
            + "            font-size: 12px;\n"
            + "            color: #999999;\n"
            + "            text-align: center;\n"
            + "        }\n"
            + "    </style>\n"
            + "</head>\n"
            + "<body>\n"
            + "    <div class=\"container\">\n"
            + "        <h2>¡Gracias por tu compra!</h2>\n"
            + "        <p>Tu pedido se ha procesado correctamente. Estos son los productos que has adquirido:</p>\n"
            + productListHtml.toString() + "\n"
            + "        <p>Recibirás otro correo cuando tu pedido esté en camino.</p>\n"
            + "        <div class=\"footer\">\n"
            + "            © 2025 Tu Empresa. Todos los derechos reservados.\n"
            + "        </div>\n"
            + "    </div>\n"
            + "</body>\n"
            + "</html>";

        emailSender(addressMail, subject, bodyMail);
    } catch (Exception e) {
        
    }
}

    public boolean emailSender(String addressMail, String subjectMail, String bodyMail) throws MessagingException{
        try {
            // creación del correo
            MimeMessage message = javaMailSender.createMimeMessage();
            MimeMessageHelper helper = new MimeMessageHelper(message, true);
            helper.setTo(addressMail);
            helper.setSubject(subjectMail);
            helper.setText(bodyMail,true);
            javaMailSender.send(message);
            ;
            return true;

        } catch (Exception e) {
            
        }
        return false;
    }
}
