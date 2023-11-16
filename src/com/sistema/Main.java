package com.sistema;
import java.util.ArrayList;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

import com.sistema.paginas.Tela_Inicial;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Main {
	private static ArrayList<Cliente> clienteList = new ArrayList<>();
	private static Core core = new Core();
	
    public static void main(String[] args) {
    	core.iniciar();         
        
    }
    
    public static Core getCore() {
    	return core;
    }
}
