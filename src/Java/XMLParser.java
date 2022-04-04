//package Java;
//
//import java.io.File;
//import javax.xml.parsers.DocumentBuilderFactory;
//import javax.xml.parsers.DocumentBuilder;
//import org.w3c.dom.Document;
//import org.w3c.dom.NodeList;
//import org.w3c.dom.Node;
//import org.w3c.dom.Element;
//
//public class XMLParser {
//
//   public static void main(String[] args) {
//      try {
//         File inputFile = new File("File.xml");
//         DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
//         DocumentBuilder dBuilder = dbFactory.newDocumentBuilder();
//         Document doc = dBuilder.parse(inputFile);
//         doc.getDocumentElement().normalize();
//         System.out.println("Root element :" + doc.getDocumentElement().getNodeName());
//         NodeList nList = doc.getElementsByTagName("details");
//                
//         for (int temp = 0; temp < nList.getLength(); temp++) {
//            Node nNode = nList.item(temp);
//            System.out.println("\nCurrent Element :" + nNode.getNodeName());
//            
//            if (nNode.getNodeType() == Node.ELEMENT_NODE) {
//               Element eElement = (Element) nNode;
//               System.out.println("Name : " 
//               + eElement.getElementsByTagName("trainerName").item(0).getTextContent());
//               System.out.println("Location : " 
//               + eElement.getElementsByTagName("location").item(0).getTextContent());
//            }
//        }
//      } catch (Exception e) {
//         e.printStackTrace();
//      }
//   }
//}
