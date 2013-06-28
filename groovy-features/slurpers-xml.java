import java.io.*;
import javax.xml.parsers.*;
import org.w3c.dom.*;

public class XMLReader {
  public static void main(String argv[]) throws Exception {
    File file = new File("customers.xml");
    DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
    DocumentBuilder db = dbf.newDocumentBuilder();
    Document doc = db.parse(file);
    doc.getDocumentElement().normalize();
    NodeList nodeLst = doc.getElementsByTagName("customer");
    for (int s = 0; s < nodeLst.getLength(); s++) {
      Element anItem = (Element) nodeLst.item(s);
      System.out.println(anItem.getAttribute("name") + ": " +
                anItem.getChildNodes().item(0).getNodeValue());
    }
  }
}
