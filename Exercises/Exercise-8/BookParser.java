import org.w3c.dom.*;
import javax.xml.parsers.*;
import org.json.*;
import java.io.File;
import java.nio.file.Files;
import java.nio.file.Paths;

public class BookParser {

    public static void main(String[] args) throws Exception {
        System.out.println("========== XML Parser ==========");
        File xmlFile = new File("Exercises/Exercise-8/books.xml");
        DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
        DocumentBuilder builder = factory.newDocumentBuilder();
        Document doc = builder.parse(xmlFile);

        NodeList books = doc.getElementsByTagName("Book");
        for (int i = 0; i < books.getLength(); i++) {
            Element book = (Element) books.item(i);
            printBookXML(book);
        }

        System.out.println("\n--- Adding new book to XML ---");
        Element newBook = doc.createElement("Book");
        createXMLElement(doc, newBook, "title", "Algorithms");
        createXMLElement(doc, newBook, "publishedYear", "2022");
        createXMLElement(doc, newBook, "numberOfPages", "600");
        Element authors = doc.createElement("authors");
        createXMLElement(doc, authors, "author", "Charlie Black");
        newBook.appendChild(authors);
        doc.getDocumentElement().appendChild(newBook);

        System.out.println("--- XML after adding new book ---");
        NodeList updatedBooks = doc.getElementsByTagName("Book");
        for (int i = 0; i < updatedBooks.getLength(); i++) {
            Element book = (Element) updatedBooks.item(i);
            printBookXML(book);
        }

        System.out.println("\n========== JSON Parser ==========");
        String jsonContent = new String(Files.readAllBytes(Paths.get("Exercises/Exercise-8/books.json")));
        JSONObject jsonObj = new JSONObject(jsonContent);
        JSONArray jsonBooks = jsonObj.getJSONArray("BookShelf");

        for (int i = 0; i < jsonBooks.length(); i++) {
            printBookJSON(jsonBooks.getJSONObject(i));
        }

        System.out.println("\n--- Adding new book to JSON ---");
        JSONObject newJsonBook = new JSONObject();
        newJsonBook.put("title", "Algorithms");
        newJsonBook.put("publishedYear", 2022);
        newJsonBook.put("numberOfPages", 600);
        newJsonBook.put("authors", new JSONArray().put("Charlie Black"));
        jsonBooks.put(newJsonBook);

        System.out.println("--- JSON after adding new book ---");
        for (int i = 0; i < jsonBooks.length(); i++) {
            printBookJSON(jsonBooks.getJSONObject(i));
        }
    }

    private static void printBookXML(Element book) {
        String title = book.getElementsByTagName("title").item(0).getTextContent();
        String year = book.getElementsByTagName("publishedYear").item(0).getTextContent();
        String pages = book.getElementsByTagName("numberOfPages").item(0).getTextContent();
        NodeList authors = book.getElementsByTagName("author");
        System.out.print("Title: " + title + ", Year: " + year + ", Pages: " + pages + ", Authors: ");
        for (int j = 0; j < authors.getLength(); j++) {
            System.out.print(authors.item(j).getTextContent());
            if (j < authors.getLength() - 1) System.out.print(", ");
        }
        System.out.println();
    }

    private static void createXMLElement(Document doc, Element parent, String tag, String value) {
        Element elem = doc.createElement(tag);
        elem.setTextContent(value);
        parent.appendChild(elem);
    }

    private static void printBookJSON(JSONObject book) {
        System.out.print("Title: " + book.getString("title"));
        System.out.print(", Year: " + book.getInt("publishedYear"));
        System.out.print(", Pages: " + book.getInt("numberOfPages"));
        JSONArray authors = book.getJSONArray("authors");
        System.out.print(", Authors: ");
        for (int j = 0; j < authors.length(); j++) {
            System.out.print(authors.getString(j));
            if (j < authors.length() - 1) System.out.print(", ");
        }
        System.out.println();
    }
}