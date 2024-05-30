package controlador;

import java.awt.Desktop;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

import javax.swing.JOptionPane;

import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.Element;
import com.itextpdf.text.Font;
import com.itextpdf.text.FontFactory;
import com.itextpdf.text.Image;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.Phrase;
import com.itextpdf.text.Rectangle;
import com.itextpdf.text.pdf.PdfPCell;
import com.itextpdf.text.pdf.PdfPTable;
import com.itextpdf.text.pdf.PdfWriter;

public class TicketPDFGenerator {

    public void generateTicketPDF(String nombreEvento, String fechaHoraEvento, String direccionEvento,
            int cantidadBoletas, String nombreLocalidad, String nombreUsuario, String apellidoUsuario,
            float montoTotal) {
        String pdfFilePath = "ticket_evento.pdf";

        Document document = new Document();
        try {
            PdfWriter.getInstance(document, new FileOutputStream(pdfFilePath));
            document.open();

            // Add logo
            PdfPTable logoTable = new PdfPTable(1);
            logoTable.setWidthPercentage(20);
            Image logo = Image.getInstance(getClass().getResource("/img/logo.png"));
            logo.scaleToFit(40, 38);
            PdfPCell logoCell = new PdfPCell(logo, true);
            logoCell.setBorder(Rectangle.NO_BORDER);
            logoCell.setHorizontalAlignment(Element.ALIGN_CENTER);
            logoTable.addCell(logoCell);
            document.add(logoTable);

            // Add title
            Font titleFont = FontFactory.getFont(FontFactory.HELVETICA_BOLD, 24);
            Paragraph title = new Paragraph("Ticket de Evento", titleFont);
            title.setAlignment(Element.ALIGN_CENTER);
            title.setSpacingAfter(20f);
            document.add(title);

            // Add event details
            Font textFont = FontFactory.getFont(FontFactory.HELVETICA, 12);

            PdfPTable detailsTable = new PdfPTable(2);
            detailsTable.setWidthPercentage(100);

            addTableRow(detailsTable, "Nombre del Evento:", nombreEvento);
            addTableRow(detailsTable, "Fecha y Hora del Evento:", fechaHoraEvento);
            addTableRow(detailsTable, "Dirección del Evento:", direccionEvento);
            addTableRow(detailsTable, "Cantidad de Boletas:", String.valueOf(cantidadBoletas));
            addTableRow(detailsTable, "Localidad:", nombreLocalidad);
            addTableRow(detailsTable, "Comprador:", nombreUsuario + " " + apellidoUsuario);
            addTableRow(detailsTable, "Total:", "$" + montoTotal);

            document.add(detailsTable);

            // Add footer
            Font footerFont = FontFactory.getFont(FontFactory.HELVETICA_BOLD, 12);
            Paragraph footer = new Paragraph("¡Gracias por su compra!", footerFont);
            footer.setAlignment(Element.ALIGN_CENTER);
            footer.setSpacingBefore(20f);
            document.add(footer);

            document.close();

            JOptionPane.showMessageDialog(null, "PDF del ticket generado exitosamente en " + pdfFilePath, "Éxito",
                    JOptionPane.INFORMATION_MESSAGE);

            // Open the PDF automatically
            File pdfFile = new File(pdfFilePath);
            if (pdfFile.exists()) {
                if (Desktop.isDesktopSupported()) {
                    Desktop.getDesktop().open(pdfFile);
                } else {
                    JOptionPane.showMessageDialog(null,
                            "No se puede abrir el PDF automáticamente en este sistema.", "Error",
                            JOptionPane.ERROR_MESSAGE);
                }
            }

        } catch (DocumentException | IOException e) {
            JOptionPane.showMessageDialog(null, "Error al generar el PDF del ticket.", "Error",
                    JOptionPane.ERROR_MESSAGE);
            e.printStackTrace();
        }
    }

    private void addTableRow(PdfPTable table, String label, String value) {
        PdfPCell cellLabel = new PdfPCell(new Phrase(label));
        cellLabel.setBorder(Rectangle.NO_BORDER);
        cellLabel.setPaddingBottom(5f);
        cellLabel.setHorizontalAlignment(Element.ALIGN_RIGHT);

        PdfPCell cellValue = new PdfPCell(new Phrase(value));
        cellValue.setBorder(Rectangle.NO_BORDER);
        cellValue.setPaddingBottom(5f);
        cellValue.setHorizontalAlignment(Element.ALIGN_LEFT);

        table.addCell(cellLabel);
        table.addCell(cellValue);
    }
}
