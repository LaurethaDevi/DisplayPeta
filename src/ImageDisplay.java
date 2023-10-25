/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Devi -  BOE
 */
import javafx.application.Application;
import static javafx.application.Application.launch;
import javafx.scene.Scene;
import javafx.scene.control.Tooltip;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.Pane;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;
import javafx.scene.shape.Circle;
import javafx.scene.paint.Color;
import javafx.util.Duration;


public class ImageDisplay extends Application {


    @Override
    public void start(Stage primaryStage) {
        primaryStage.setTitle("Peta BBPPMPV Bidang Otomotif dan Elektronika");

        // Membuat gambar peta BBPPMPV BOE
        Image boe = new Image("file:C:/Users/Devi -  BOE/JavaFX_Peta/src/GambarPeta/bbppmpvboe.png"); // Ganti dengan path ke gambar peta kampus Anda
        ImageView boeView = new ImageView(boe);
        
        
        // Membuat elemen-elemen gedung
        
        
        Rectangle terminal = new Rectangle(40, 92, 20,75);
        terminal.setFill(Color.GOLDENROD);
        Circle gedungadmin = new Circle(260, 100, 7);
        gedungadmin.setFill(Color.GOLDENROD);
        Circle aula = new Circle(170, 50, 7);
        aula.setFill(Color.GOLDENROD);
        Circle otomotif = new Circle(315, 152, 7);
        otomotif.setFill(Color.GOLDENROD);
        Circle mesin = new Circle(315, 250, 7);
        mesin.setFill(Color.GOLDENROD);
        Circle bangunan = new Circle(315, 336, 7);
        bangunan.setFill(Color.GOLDENROD);
        Circle elektronika = new Circle(185, 147, 7);
        elektronika.setFill(Color.GOLDENROD);
        Circle edukasi = new Circle(170, 226, 7);
        edukasi.setFill(Color.GOLDENROD);
        Circle ti = new Circle(170, 315, 7);
        ti.setFill(Color.GOLDENROD);

        // Membuat tooltip untuk informasi gedung
        Tooltip tooltipterminal = new Tooltip("Terminal Arjsari Malang");
        Tooltip tooltipgedungadmin = new Tooltip("Gedung Administrasi BBPPMPV Bidang Otomotif dan Elektronika");
        Tooltip tooltipaula = new Tooltip("AULA Menara Teknika");
        Tooltip tooltipotomotif = new Tooltip("Program Keahlian Teknik Otomotif ");
        Tooltip tooltipmesin = new Tooltip("Program Keahlian Teknik Mesin");
        Tooltip tooltipbangunan = new Tooltip("Program Keahlian Konstruksi, Properti, dan Geomatika");
        Tooltip tooltipelektronika = new Tooltip("Program Keahlian Listrik dan Elektronika");
        Tooltip tooltipedukasi = new Tooltip("Program Keahlian Manajemen Pendidikan Vokasi ");
        Tooltip tooltipti = new Tooltip("Program Keahlian Teknologi Informasi ");
       
        //Set Durasi
        tooltipterminal.setShowDelay(Duration.ZERO);
        tooltipgedungadmin.setShowDelay(Duration.ZERO);
        tooltipaula.setShowDelay(Duration.ZERO);
        tooltipotomotif.setShowDelay(Duration.ZERO);
        tooltipmesin.setShowDelay(Duration.ZERO);
        tooltipbangunan.setShowDelay(Duration.ZERO);
        tooltipelektronika.setShowDelay(Duration.ZERO);
        tooltipedukasi.setShowDelay(Duration.ZERO);
        tooltipti.setShowDelay(Duration.ZERO);


        // Menambahkan tooltip ke elemen gedung
        Tooltip.install(terminal, tooltipterminal);
        Tooltip.install(gedungadmin, tooltipgedungadmin);
        Tooltip.install(aula, tooltipaula);
        Tooltip.install(otomotif, tooltipotomotif);
        Tooltip.install(mesin, tooltipmesin);
        Tooltip.install(bangunan, tooltipbangunan);
        Tooltip.install(elektronika, tooltipelektronika);
        Tooltip.install(edukasi, tooltipedukasi);
        Tooltip.install(ti, tooltipti);


        // Membuat root pane dan menambahkan elemen-elemen ke dalamnya
        Pane root = new Pane();
        root.getChildren().add(boeView);
        root.getChildren().add(terminal);
        root.getChildren().add(gedungadmin);
        root.getChildren().add(aula);
        root.getChildren().add(otomotif);
        root.getChildren().add(mesin);
        root.getChildren().add(bangunan);
        root.getChildren().add(elektronika);
        root.getChildren().add(edukasi);
        root.getChildren().add(ti);

        
        double width = boe.getWidth();
        double height = boe.getHeight();
        
        Scene scene = new Scene(root, width, height);
        primaryStage.setScene(scene);
        primaryStage.show();
    }
        public static void main(String[] args) {
        launch(args);
    }
}
