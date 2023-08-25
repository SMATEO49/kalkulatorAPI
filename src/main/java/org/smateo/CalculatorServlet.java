package org.smateo;

import com.google.gson.Gson;
import org.json.JSONObject;
import org.json.JSONTokener;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/kalkulator")
public class CalculatorServlet extends HttpServlet {
    Reimbursement allowance = new Reimbursement("Allowance", "15","-1","true","$/day");
    Reimbursement mileage = new Reimbursement("Mileage","0.3", "-1", "true","$/km");
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        try {
            String[] reimbursements = {new Gson().toJson(allowance), new Gson().toJson(mileage)};
            PrintWriter out = response.getWriter();
            response.addHeader("Access-Control-Allow-Origin", "*");
            response.setContentType("application/json");
            out.print("["+reimbursements[0]+","+reimbursements[1]+"]");


            //BufferedReader reader = request.getReader();
            //JSONTokener token = new JSONTokener(reader);
            //JSONObject json = new JSONObject(token);

        }catch (Exception err){
            System.out.println("Error");
        }

    }
}


