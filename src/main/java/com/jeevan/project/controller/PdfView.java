package com.jeevan.project.controller;

import java.awt.Color;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.hibernate.dialect.FirebirdDialect;
import org.springframework.web.servlet.view.document.AbstractPdfView;

import com.lowagie.text.Cell;
import com.lowagie.text.Chunk;
import com.lowagie.text.Document;
import com.lowagie.text.Element;
import com.lowagie.text.Font;
import com.lowagie.text.FontFactory;
import com.lowagie.text.Paragraph;
import com.lowagie.text.Phrase;
import com.lowagie.text.Rectangle;
import com.lowagie.text.Table;
import com.lowagie.text.pdf.PdfWriter;
import com.jeevan.project.pojo.CustomerDetails;
import com.jeevan.project.pojo.OrderItem;

public class PdfView extends AbstractPdfView{
	
	@Override
	protected void buildPdfDocument(Map<String, Object> map, Document document,
	PdfWriter arg2, HttpServletRequest request, HttpServletResponse response)
	throws Exception {

		HttpSession session = request.getSession(true);
		response.setContentType("application/pdf");
		
	    Font titleFont = FontFactory.getFont(FontFactory.TIMES_BOLDITALIC, 18, Font.BOLD, new Color(200,12,46));
	    Font chapterFont = FontFactory.getFont(FontFactory.TIMES_ITALIC, 14, Font.NORMAL, new Color(12,46,143));
	    String newLine = System.getProperty("line.separator");  
	    Paragraph space = new Paragraph(newLine+newLine);
	    String newLine1= System.getProperty("line.separator");
	    Paragraph firstline = new Paragraph("Thank you for Shopping with us !!!!! ",chapterFont);
	    Paragraph secondLine = new Paragraph("See Below For your Order Details",chapterFont);
	    
	    Paragraph title = new Paragraph("Your Amazon.com! - Invoice ",titleFont);
	    
	    Set<OrderItem> productList = (Set<OrderItem>)map.get("orderItem");
		float totalAmount = (Float)map.get("totalAmount");
		String orderStatus = String.valueOf(map.get("orderStatus"));
		CustomerDetails c = (CustomerDetails)map.get("customerDetails");
		
	    Table table2= new Table(2);
        
        table2.setWidth(100.0f);
        table2.setWidths(new float[] {2.0f, 2.0f});
        table2.setSpacing(5);		
		
        Cell cell2= new Cell("Customer Name ");
        cell2.disableBorderSide(Rectangle.BOX);
        
        Cell cell3 = new Cell(String.valueOf(session.getAttribute("userName")));
        cell3.disableBorderSide(Rectangle.BOX);
        
        Cell cell4 = new Cell("Order Date:  ");
        cell4.disableBorderSide(Rectangle.BOX);
        Cell cell5= new Cell(String.valueOf(new Date().toLocaleString()));
        cell5.disableBorderSide(Rectangle.BOX);
        Cell cell6 = new Cell("Total Amount: ");
        cell6.disableBorderSide(Rectangle.BOX);
        Cell cell7 = new Cell(String.valueOf(totalAmount));
        cell7.disableBorderSide(Rectangle.BOX);	        
        Cell cell8 = new Cell("Order Status ");
        cell8.disableBorderSide(Rectangle.BOX);
        Cell cell9 = new Cell(orderStatus);
        cell9.disableBorderSide(Rectangle.BOX);
        
        Cell cell10 = new Cell("Order Delivered to");
        cell10.disableBorderSide(Rectangle.BOX);
        
        Cell cell11 = new Cell(c.getFirstName()+ c.getLastName() +newLine1  +c.getAddress() + newLine +c.getCity()+c.getState());
        cell11.disableBorderSide(Rectangle.BOX);
        
        Table table3= new Table(2);
        table3.setWidth(80.0f);
        
        Cell cell12 = new Cell("	Product Name: ");
        Cell cell14 = new Cell("   Price: ");
        table3.addCell(cell12);
        table3.addCell(cell14);
        
        
        for(OrderItem product: productList)
        {
        	 Cell cell15 = new Cell("   " +product.getProductName());
        	 table3.addCell(cell15);
        	
        	 Cell cell17 = new Cell("   "+String.valueOf(product.getProductPrice()));
        	 table3.addCell(cell17);
        } 
        
        table2.addCell(cell2);
    	table2.addCell(cell3);
    	table2.addCell(cell4);
    	table2.addCell(cell5);
    	table2.addCell(cell6);
    	table2.addCell(cell7);
    	table2.addCell(cell8);
    	table2.addCell(cell9);
    	table2.addCell(cell10);
    	table2.addCell(cell11);
    	
    	table2.setBorderColor(Color.white);
    	table2.setAlignment(Element.ALIGN_LEFT);  
    	      
    	     document.add(title);
    	     document.add(table2);
    	     document.add(space);
    	     document.add(firstline);
    	     document.add(secondLine);
    	     document.add(space);
    	     document.add(table3);
    	     
    	     document.close();

	}
}
