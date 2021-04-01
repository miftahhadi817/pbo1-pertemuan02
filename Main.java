import koneksi.Database;
import model.Mahasiswa;
import model.Dosen;
import model.Matakuliah;

public class Main{
 public static void main(String[]args){
  System.out.println("Ini program main");
  Database.hubungkan();
  Mahasiswa.info();
  Dosen.info();
  Matakuliah.info();
 }
}