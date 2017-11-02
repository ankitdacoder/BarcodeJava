package pdf;

import java.io.FileNotFoundException;

import java.io.FileOutputStream;
import java.util.ArrayList;
import java.util.UUID;

import com.lowagie.text.Document;
import com.lowagie.text.DocumentException;
import com.lowagie.text.PageSize;
import com.lowagie.text.Paragraph;
import com.lowagie.text.Rectangle;
import com.lowagie.text.pdf.Barcode128;
import com.lowagie.text.pdf.PdfWriter;

import com.lowagie.text.Image;


public class BarCode128 {

 public static void main(String[] args) throws FileNotFoundException, DocumentException {

    Document document = new Document(new Rectangle(PageSize.A4));
    String uuid = UUID.randomUUID().toString();
    PdfWriter writer = PdfWriter.getInstance(document, new FileOutputStream("src/"+uuid+".pdf"));    

    
    //bar code array list
    ArrayList<String> barcode = new ArrayList<String>();
    barcode.add("1234554321");
    barcode.add("9876543212");
    barcode.add("9876543212");
    
   // barcode.add("7876567876");
    

    document.open();
	//document.add(new Paragraph("Code_128 Format_Java4s.com"));

	Barcode128 code128 = new Barcode128();
    
   	  int x=450;
	  int y=300;
	 
	  Integer j=34;
	  int L=34;
	  
	  if(j.equals(L))
	  {
		  System.out.println("true");
		  
	  }else
	  {
		  System.out.println("false");
	  }
	  
	  
	   
    // Print all the array elements
    for (int i = 0; i < barcode.size(); i++) {
      

    	
    	if(i==1)
    	{ 
    	   System.out.println(barcode.get(i));
    	   x=500;
    	   y=350;
    	}
    	
    	code128.setGenerateChecksum(true);
    	code128.setCode(barcode.get(i));
    	
    	code128.setBarHeight(40f);
    	code128.setX(1f);
    	
    	
    	Image img1=code128.createImageWithBarcode(writer.getDirectContent(), null, null);
    	System.out.println(x+"*****"+y);
    	img1.setAbsolutePosition(x, y);
    	document.add(img1);
    	
    }
    
    document.close();
	
	
//	Barcode128 code129 = new Barcode128();
//	code129.setGenerateChecksum(true);
//	code129.setCode("1234554321");
//
//	Image img2=code129.createImageWithBarcode(writer.getDirectContent(), null, null);
//	img2.setAbsolutePosition(450, 350);
//	document.add(img2);
	
    
	

    
    System.out.println("Document Generated...!!!!!!");
  }

}