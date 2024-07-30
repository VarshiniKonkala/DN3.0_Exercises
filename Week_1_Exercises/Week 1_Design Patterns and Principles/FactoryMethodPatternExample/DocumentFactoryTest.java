package factoryMethodPattern;

public class DocumentFactoryTest {
    public static void main(String[] args) {
        // Create a Word document
        DocumentFactory Word = new WordDocumentFactory();
        Document word = Word.createDocument();
        word.open();
        word.close();

        // Create a PDF document
        DocumentFactory Pdf = new PdfDocumentFactory();
        Document pdf = Pdf.createDocument();
        pdf.open();
        pdf.close();

        // Create an Excel document
        DocumentFactory Excel = new ExcelDocumentFactory();
        Document excel = Excel.createDocument();
        excel.open();
        excel.close();
    }
}

