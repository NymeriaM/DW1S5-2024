package br.edu.ifsp.arq.dw1s5.exercicioFixacao2;

import java.io.IOException;
import java.io.PrintWriter;
import java.time.LocalDate;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/register")
public class RegisterServlet extends HttpServlet {

    private static final long serialVersionUID = 1L;

    public RegisterServlet() {
        super();
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        // configurar a codificação de caracteres da requisição
        req.setCharacterEncoding("UTF-8");
        // obter os dados da requisição
        String dateOfBirthStr = req.getParameter("date");
        
        // Converter a string da data de nascimento em um objeto LocalDate
        LocalDate dateOfBirth = LocalDate.parse(dateOfBirthStr);

        // Obter a data atual
        LocalDate currentDate = LocalDate.now();
        
        // Calcular a idade em anos
        int age = currentDate.getYear() - dateOfBirth.getYear();
        
        // Ajustar a idade se a data atual ainda não ocorreu este ano
        if (currentDate.getMonthValue() < dateOfBirth.getMonthValue() || 
            (currentDate.getMonthValue() == dateOfBirth.getMonthValue() && 
             currentDate.getDayOfMonth() < dateOfBirth.getDayOfMonth())) {
            age--;
        }
        
        // escrever a resposta
        resp.setContentType("text/html;charset=UTF-8");
        PrintWriter writer = resp.getWriter();
        writer.println("<!DOCTYPE html>");
        writer.println("<html lang=\"pt-BR\">");
        writer.println("<head>");
        writer.println("\t<meta charset=\"UTF-8\">");
        writer.println("\t<title>Página de Resposta - Calcular Idade</title>");
        writer.println("</head>");
        writer.println("<body>");
        writer.println("\t<h1>Cadastro realizado com sucesso!</h1>");
        writer.println("\t<h2>Data de nascimento: "+ dateOfBirthStr +"</h2>");
        writer.println("\t<h2>Idade: "+ age +" anos</h2>");
        writer.println("</body>");
        writer.println("</html>");
        writer.close();
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        doGet(req, resp);
    }
}
