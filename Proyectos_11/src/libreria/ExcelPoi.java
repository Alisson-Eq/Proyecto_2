package libreria;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;

class ExcelPoi {

	public static void main(String[] args) {
		// Creando objeto libro de Excel
		HSSFWorkbook libro = new HSSFWorkbook();
		HSSFSheet sheet = libro.createSheet("Reporte de productos");

		// Se crea un archivo nuevo
		File archivo = new File("ejemplo.xls");

		// Se crean las filas
		Row fila = sheet.createRow(0);
		// Las celdas
		Cell celda;

		// Cabecera de excel
		String[] titulos = { "id", "Cantidad", "Precio" };
		// Se introducen datos
		int[] datos = { 1, 30, 145 };

		int i;

		// Creamos el encabezado

		for (i = 0; i < titulos.length; i++) {
			celda = fila.createCell(i);
			celda.setCellValue(titulos[i]);
		}

		// Nueva fila

		fila = sheet.createRow(1);

		for (i = 0; i < datos.length; i++) {
			celda = fila.createCell(i);
			celda.setCellValue(datos[i]);
		}

		// Escribimos el archivo
		try {
			FileOutputStream out = new FileOutputStream(archivo);
			libro.write(out);
			out.close();

			System.out.println("Archivo creado exitosamente!");

		} catch (IOException e) {
			System.out.println("Error de escritura");
			e.printStackTrace();
		}
	}
	

}
