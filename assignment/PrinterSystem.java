// Parent Class
class Document {
    String documentName;
    Document(String documentName) {
        this.documentName = documentName;
    }
    public void printDocument() {
        System.out.println("Printing a document:");
    }
}
// Child Class 1
class WordDocument extends Document {
    WordDocument(String documentName) {
        super(documentName);
    }
    @Override
    public void printDocument() {
        System.out.println("Printing Word Document: " + documentName);
    }
}
// Child Class 2
class PDFDocument extends Document {
    PDFDocument(String documentName) {
        super(documentName);
    }
    @Override
    public void printDocument() {
        System.out.println("Printing PDF Document: " + documentName);
    }
}
// Child Class 3
class ImageDocument extends Document {
    ImageDocument(String documentName) {
        super(documentName);
    }
    @Override
    public void printDocument() {
        System.out.println("Printing Image Document: " + documentName);
    }
}
// Main Class
public class PrinterSystem {
    public static void main(String[] args) {
        // Runtime Polymorphism
        Document d1 = new WordDocument("ProjectReport.docx");
        Document d2 = new PDFDocument("JavaNotes.pdf");
        Document d3 = new ImageDocument("Nature.jpg");
        print(d1);
        print(d2);
        print(d3);
    }
    // Polymorphic Method
    public static void print(Document doc) {
        // Using instanceof
        if (doc instanceof WordDocument) {
            System.out.println("Document Type: Word Document");
        } else if (doc instanceof PDFDocument) {
            System.out.println("Document Type: PDF Document");
        } else if (doc instanceof ImageDocument) {
            System.out.println("Document Type: Image Document");
        } else {
            System.out.println("Unknown Document Type");
        }
        // Runtime Polymorphism
        doc.printDocument();
        System.out.println(" ");
    }
}