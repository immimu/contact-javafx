package sample;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ListView;
import javafx.scene.control.TextField;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.text.Text;
import javafx.stage.Stage;
import sample.model.Contact;

import java.util.ArrayList;
import java.util.List;

public class Main extends Application {

    private final List<Scene> scenes = new ArrayList<>();

    @Override
    public void start(Stage stage) throws Exception {

        scenes.add(createMainScene(stage));
        scenes.add(createContactScene(stage));

        stage.setTitle("My Contact");
        stage.setScene(scenes.get(0));
        stage.show();
    }

    private Scene createMainScene(Stage stage) {
        ListView<Contact> contactList = new ListView<>();
        contactList.getItems().add(new Contact("Miftah", "0822122", "Bandung", "email@gmail.com"));
        contactList.getItems().add(new Contact("Miftah", "0822122", "Bandung", "email@gmail.com"));

        Button tambahButton = new Button("Tambah");
        tambahButton.setOnAction(event -> stage.setScene(scenes.get(1)));
        VBox vBox = new VBox(contactList, tambahButton);
        Scene sceneUtama = new Scene(vBox, 320, 420);
        return sceneUtama;
    }

    private Scene createContactScene(Stage stage) {

        // ini bagina nama
        Text namaText = new Text("Nama : ");
        TextField namaField = new TextField();

        // ini bagian no
        Text noText = new Text("No Telepon : ");
        TextField noField = new TextField();

        // ini bagian alamat
        Text alamatText = new Text("Alamat : ");
        TextField alamatField = new TextField();

        // ini bagian email
        Text emaiText = new Text("Email : ");
        TextField emailField = new TextField();

        Button simpanButton = new Button("Simpan");
        simpanButton.setOnAction(event -> {
            String nama = namaField.getText();
            String no = noField.getText();
            String alamat = alamatField.getText();
            String email = emailField.getText();

            System.out.println(nama);
            System.out.println(no);
            System.out.println(alamat);
            System.out.println(email);

            //  Contact kontakBaru = new Contact(nama,no,alamat,email);
            stage.setScene(scenes.get(0));

        });
        Button kembaliButton = new Button("Kembali");
        kembaliButton.setOnAction(event -> stage.setScene(scenes.get(0)));


        HBox wadahButton = new HBox(kembaliButton, simpanButton);

        VBox wadah = new VBox(namaText, namaField, noText, noField, alamatText, alamatField, emaiText, emailField, wadahButton);
        wadah.setSpacing(10);
        wadah.setPadding(new Insets(10));

        Scene contactForm = new Scene(wadah, 310, 300);
        return contactForm;
    }


    public static void main(String[] args) {
        launch(args);
    }
}
