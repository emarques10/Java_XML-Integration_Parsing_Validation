package br.com.emarques.test;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.NodeList;

import br.com.emarques.Model.Product;

public class SystemXML {
	public static void main(String[] args) throws Exception {
		
		DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
		DocumentBuilder builder = factory.newDocumentBuilder();
		Document document = builder.parse("sales.xml");
		
		Element sale = document.getDocumentElement();
		String currency = sale.getAttribute("currency");
		System.out.println(currency);
		
		NodeList products = document.getElementsByTagName("product");
		for(int i=0;i<products.getLength();i++) {
			Element product = (Element) products.item(i);
			String name = product.getElementsByTagName("name").item(0).getTextContent();
			double price = Double.parseDouble(product.getElementsByTagName("price").item(0).getTextContent());
			Product prod = new Product(name,price);
			
			System.out.println(prod);
			
		}
		
		
		
		
	}

}
