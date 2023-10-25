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
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;
import javafx.scene.text.Text;

public class KoordinatGambar extends Application {

    @Override
    public void start(Stage primaryStage) {
        // Membuat ImageView dengan gambar
        Image image = new Image("file:C:/Users/Devi -  BOE/JavaFX_Peta/src/GambarPeta/bbppmpvboe.png"); // Ganti "sample.jpg" dengan path ke gambar Anda
        ImageView imageView = new ImageView(image);

        // Membuat Text untuk menampilkan koordinat
        Text coordinateText = new Text();
        coordinateText.setX(10);
        coordinateText.setY(20);

        // Menambahkan ImageView dan Text ke Pane
        Pane root = new Pane();
        root.getChildren().addAll(imageView, coordinateText);

        // Membuat Scene
        Scene scene = new Scene(root, image.getWidth(), image.getHeight());

        // Menambahkan event handler untuk mendapatkan koordinat piksel
        imageView.setOnMouseMoved(event -> {
            double x = event.getX();
            double y = event.getY();

            int pixelX = (int) x;
            int pixelY = (int) y;

            coordinateText.setText("Koordinat: X=" + pixelX + ", Y=" + pixelY);
        });

        primaryStage.setTitle("Pixel Coordinate Example");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}


